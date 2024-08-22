package ui;

import code.JeopardyCreator;
import java.awt.Component;
import javax.swing.JRadioButton;
import javax.swing.JPanel;


public class Mainframe extends javax.swing.JFrame {
    public Mainframe() {
        initComponents();
    }
    
    JeopardyCreator jeopardyCreator = new JeopardyCreator();
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        numberSlider = new javax.swing.JSlider();
        setNumbersButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        createJeopardyButton = new javax.swing.JButton();
        errorLabel = new javax.swing.JLabel();
        categoriesPanel = new javax.swing.JPanel();
        selectScouten = new javax.swing.JRadioButton();
        selectLuxembourg = new javax.swing.JRadioButton();
        selectRandomFacts = new javax.swing.JRadioButton();
        selectMusik = new javax.swing.JRadioButton();
        selectScoutsactivitéit = new javax.swing.JRadioButton();
        selectSpiller = new javax.swing.JRadioButton();
        selectNatur = new javax.swing.JRadioButton();
        selectRätsel = new javax.swing.JRadioButton();
        selectSport = new javax.swing.JRadioButton();
        selectBartreng = new javax.swing.JRadioButton();
        selectGeographieaGeschicht = new javax.swing.JRadioButton();
        setCategoriesButton = new javax.swing.JButton();
        restartButton = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 0, 36)); // NOI18N
        jLabel1.setText("Jeopardy Creator");

        numberSlider.setMajorTickSpacing(1);
        numberSlider.setMaximum(10);
        numberSlider.setMinimum(1);
        numberSlider.setMinorTickSpacing(1);
        numberSlider.setPaintLabels(true);
        numberSlider.setPaintTicks(true);
        numberSlider.setSnapToTicks(true);
        numberSlider.setValue(4);
        numberSlider.setName("categorySlider"); // NOI18N

        setNumbersButton.setText("Set");
        setNumbersButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setNumbersButtonActionPerformed(evt);
            }
        });

        jLabel2.setText("Select the number of categories");

        createJeopardyButton.setText("Create Jeopardy");
        createJeopardyButton.setEnabled(false);
        createJeopardyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createJeopardyButtonActionPerformed(evt);
            }
        });

        errorLabel.setText("errortext");

        selectScouten.setText("Scouten");
        selectScouten.setEnabled(false);

        selectLuxembourg.setText("Lëtzebuerg");
        selectLuxembourg.setEnabled(false);

        selectRandomFacts.setText("Random Facts");
        selectRandomFacts.setEnabled(false);
        selectRandomFacts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectRandomFactsActionPerformed(evt);
            }
        });

        selectMusik.setText("Musik");
        selectMusik.setEnabled(false);

        selectScoutsactivitéit.setText("Scoutsactivitéit");
        selectScoutsactivitéit.setEnabled(false);
        selectScoutsactivitéit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectScoutsactivitéitActionPerformed(evt);
            }
        });

        selectSpiller.setText("Spiller");
        selectSpiller.setEnabled(false);

        selectNatur.setText("Natur");
        selectNatur.setEnabled(false);

        selectRätsel.setText("Rätsel");
        selectRätsel.setEnabled(false);

        selectSport.setText("Sport");
        selectSport.setEnabled(false);

        selectBartreng.setText("Bartreng");
        selectBartreng.setEnabled(false);

        selectGeographieaGeschicht.setText("Geographie a Geschicht");
        selectGeographieaGeschicht.setEnabled(false);

        setCategoriesButton.setText("Set");
        setCategoriesButton.setEnabled(false);
        setCategoriesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setCategoriesButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout categoriesPanelLayout = new javax.swing.GroupLayout(categoriesPanel);
        categoriesPanel.setLayout(categoriesPanelLayout);
        categoriesPanelLayout.setHorizontalGroup(
            categoriesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, categoriesPanelLayout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addGroup(categoriesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(selectGeographieaGeschicht)
                    .addGroup(categoriesPanelLayout.createSequentialGroup()
                        .addGroup(categoriesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(selectRandomFacts)
                            .addComponent(selectLuxembourg)
                            .addComponent(selectScouten)
                            .addComponent(selectNatur)
                            .addComponent(selectSport))
                        .addGap(18, 18, 18)
                        .addGroup(categoriesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(selectBartreng)
                            .addComponent(selectRätsel)
                            .addComponent(selectScoutsactivitéit)
                            .addComponent(selectMusik)
                            .addComponent(selectSpiller))))
                .addGap(31, 31, 31))
            .addGroup(categoriesPanelLayout.createSequentialGroup()
                .addComponent(setCategoriesButton, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        categoriesPanelLayout.setVerticalGroup(
            categoriesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(categoriesPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(categoriesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(selectScouten)
                    .addComponent(selectScoutsactivitéit))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(categoriesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(selectLuxembourg)
                    .addComponent(selectSpiller))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(categoriesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(selectRandomFacts)
                    .addComponent(selectMusik))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(categoriesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(selectNatur)
                    .addComponent(selectRätsel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(categoriesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(selectSport)
                    .addComponent(selectBartreng))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(selectGeographieaGeschicht)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(setCategoriesButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        restartButton.setText("Restart");
        restartButton.setEnabled(false);
        restartButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                restartButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(errorLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(categoriesPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(createJeopardyButton)
                                        .addGap(18, 18, 18)
                                        .addComponent(restartButton)))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(numberSlider, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(setNumbersButton))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(57, 57, 57)
                                .addComponent(jLabel1)))
                        .addGap(0, 71, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(setNumbersButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(numberSlider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(categoriesPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(createJeopardyButton)
                    .addComponent(restartButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(errorLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void selectRandomFactsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectRandomFactsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_selectRandomFactsActionPerformed

    private void setNumbersButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_setNumbersButtonActionPerformed
        jeopardyCreator.setNumberOfCategories(numberSlider.getValue());
        disableNumberOfCategoriesSelection();
        enableCategoriesSelection();
    }//GEN-LAST:event_setNumbersButtonActionPerformed

    private void setCategoriesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_setCategoriesButtonActionPerformed
        int numberOfCategories = jeopardyCreator.getNumberOfCategories();
        int counter = 0;
        int numberOfCategoriesAvailable = jeopardyCreator.getNumberOfCategoriesAvailable();
        
        for(Component component : categoriesPanel.getComponents()){
            if (component instanceof JRadioButton){
                JRadioButton radioButton = (JRadioButton) component;
                if(radioButton.isEnabled() && radioButton.isSelected()){
                    jeopardyCreator.add(radioButton.getText());
                    counter ++;
                } 
            }
        }

        if(counter == numberOfCategories){
            disableCategoriesSelection();
            enableCreateJeopardy();
            errorLabel.setText("");
        }
        else if (counter > numberOfCategories){
            errorLabel.setText("to much categories");
            enableNumberOfCategoriesSelection();
            disableCategoriesSelection();
        }
        else if (counter < numberOfCategories){
            errorLabel.setText("to few categories");
            enableNumberOfCategoriesSelection();
            disableCategoriesSelection();
        }
        
    }//GEN-LAST:event_setCategoriesButtonActionPerformed

    private void createJeopardyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createJeopardyButtonActionPerformed
       errorLabel.setText("Creating");
       errorLabel.setText(jeopardyCreator.createJeopardy());
       disableCreateJeopardy();
       restartButton.setEnabled(true);
    }//GEN-LAST:event_createJeopardyButtonActionPerformed

    private void selectScoutsactivitéitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectScoutsactivitéitActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_selectScoutsactivitéitActionPerformed

    private void restartButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_restartButtonActionPerformed
        restartButton.setEnabled(false);
        enableNumberOfCategoriesSelection();
    }//GEN-LAST:event_restartButtonActionPerformed

    private void disableNumberOfCategoriesSelection(){
        numberSlider.setEnabled(false);
        setNumbersButton.setEnabled(false);
        jLabel2.setEnabled(false);
    }
    private void enableNumberOfCategoriesSelection(){
        numberSlider.setEnabled(true);
        setNumbersButton.setEnabled(true);
        jLabel2.setEnabled(true);
    }
    private void disableCategoriesSelection(){
        categoriesPanel.setEnabled(false);
        for(Component component : categoriesPanel.getComponents()){
            component.setEnabled(false);
        }
    }
    private void enableCategoriesSelection(){
        categoriesPanel.setEnabled(true);
        for (Component component : categoriesPanel.getComponents()){
            component.setEnabled(true);
        }
    }
    private void enableCreateJeopardy(){
        createJeopardyButton.setEnabled(true);
    }
    private void disableCreateJeopardy(){
        createJeopardyButton.setEnabled(false);
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Mainframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Mainframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Mainframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Mainframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Mainframe().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.JPanel categoriesPanel;
    private javax.swing.JButton createJeopardyButton;
    private javax.swing.JLabel errorLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSlider numberSlider;
    private javax.swing.JButton restartButton;
    private javax.swing.JRadioButton selectBartreng;
    private javax.swing.JRadioButton selectGeographieaGeschicht;
    private javax.swing.JRadioButton selectLuxembourg;
    private javax.swing.JRadioButton selectMusik;
    private javax.swing.JRadioButton selectNatur;
    private javax.swing.JRadioButton selectRandomFacts;
    private javax.swing.JRadioButton selectRätsel;
    private javax.swing.JRadioButton selectScouten;
    private javax.swing.JRadioButton selectScoutsactivitéit;
    private javax.swing.JRadioButton selectSpiller;
    private javax.swing.JRadioButton selectSport;
    private javax.swing.JButton setCategoriesButton;
    private javax.swing.JButton setNumbersButton;
    // End of variables declaration//GEN-END:variables
}
