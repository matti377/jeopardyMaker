/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package code;
import java.net.URI;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.util.ArrayList;

public class JeopardyCreator {
    
    private int numberOfCategories;
    private ArrayList alcategories = new ArrayList<String>();
    private int numberOfCategoriesAvailable = 3;
    
    public JeopardyCreator(){
        //todo set numberOfCategoriesAvailable
    }
    
    //Getter and Setter
    public int getNumberOfCategories(){
        return numberOfCategories;
    }
    public void setNumberOfCategories(int numberOfCategories){
        this.numberOfCategories = numberOfCategories;
    }
    public void setNumberOfCategoriesAvailable(int numberOfCategoriesAvailable) {
        this.numberOfCategoriesAvailable = numberOfCategoriesAvailable;
    }
    public int getNumberOfCategoriesAvailable() {
        return numberOfCategoriesAvailable;
    }
    

    //Arraylist stuff
    public boolean contains(Object o) {
        return alcategories.contains(o);
    }
    public Object get(int index) {
        return alcategories.get(index);
    }
    public boolean add(Object e) {
        return alcategories.add(e);
    }
    public Object remove(int index) {
        return alcategories.remove(index);
    }
    public void clear() {
        alcategories.clear();
    }
    public int size() {
        return alcategories.size();
    }
    @Override
    public String toString(){
        String temp = "";
        for(int i = 0; i < size(); i++){
            temp = temp + get(i) + ";";
        }
        return temp;
    }
    
    public String createJeopardy() {
        String temp = toString();
        System.out.println(temp);

        try {
            // URL encode the temp variable
            String encodedTemp = URLEncoder.encode(temp, StandardCharsets.UTF_8.toString());

            // Replace '+' with '%20' to ensure spaces are properly encoded
            encodedTemp = encodedTemp.replace("+", "%20");

            // Construct the full URL with the encoded string
            String fileURL = "http://jeopardy.wirtz.click/create/" + encodedTemp;

            // Get the user's home directory and append the Downloads folder
            String userHome = System.getProperty("user.home");
            Path downloadsPath = Paths.get(userHome, "Downloads", "jeopardy.docx");

            // Create an HttpClient instance with redirect policy
            HttpClient client = HttpClient.newBuilder()
                    .followRedirects(HttpClient.Redirect.ALWAYS)
                    .build();

            // Create an HttpRequest instance
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(fileURL))
                    .build();

            // Send the request and get the response
            HttpResponse<InputStream> response = client.send(request, HttpResponse.BodyHandlers.ofInputStream());

            // Check if the response is successful (HTTP 200 OK)
            if (response.statusCode() == 200) {
                // Handle file renaming if the file already exists
                downloadsPath = resolveUniqueFilePath(downloadsPath);

                // Write the InputStream to the file
                Files.copy(response.body(), downloadsPath, StandardCopyOption.REPLACE_EXISTING);
                return "File downloaded to " + downloadsPath.toString();
            } else {
                return "No file to download. Server replied with HTTP code: " + response.statusCode();
            }
        } catch (Exception e) {
            e.printStackTrace();
            return "An error occurred: " + e.getMessage();
        }
    }
    // Method to find a unique file name by appending a number to the file name
    private Path resolveUniqueFilePath(Path initialPath) {
        Path path = initialPath;
        int count = 1;

        // Loop until we find a file name that does not exist
        while (Files.exists(path)) {
            String fileName = "jeopardy" + count + ".docx";
            path = Paths.get(initialPath.getParent().toString(), fileName);
            count++;
        }

        return path;
    }
}
