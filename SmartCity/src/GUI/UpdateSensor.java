/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Classes.Data;
import Classes.Sensor;
import File.serialize;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JDesktopPane;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicInternalFrameUI;

/**
 *
 * @author Akila Jayasinghe
 */
public class UpdateSensor extends JInternalFrame {
    
ArrayList<Sensor> allsensors = serialize.getAllSensors();
Sensor s;

    /**
     * Creates new form Home
     */
    public UpdateSensor() {

        initComponents();
        
        String x =HomeSensor.globalId;
        
        s =findSensor(x, allsensors);
        
        idTextBox.setText(x);
        typeComboBox.setSelectedItem(s.getSensorType());
        DescriptionTextBox.setText(s.getDescription());
        frequencyTextBox.setText(s.getFrequency());
        
        if(s.getStatus()){
            activeRadioButton.setSelected(true);
        }
        else{
            deactiveRadioButton.setSelected(true);
        }
    }
    
    
    private static Sensor findSensor(String sensorId, ArrayList<Sensor> allsensors){
        for(Sensor sensor:allsensors){
                if(sensorId.equals(sensor.getSensorID())){
                   
                    return sensor;
                }
            }
                        return null;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        updateButton = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        idTextBox = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        DescriptionTextBox = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        frequencyTextBox = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        typeComboBox = new javax.swing.JComboBox<>();
        activeRadioButton = new javax.swing.JRadioButton();
        deactiveRadioButton = new javax.swing.JRadioButton();
        jLabel10 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(680, 480));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel15.setFont(new java.awt.Font("Comic Sans MS", 1, 10)); // NOI18N
        jLabel15.setText("A step towards Smart Sri Lanka");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 450, 171, -1));

        updateButton.setBackground(new java.awt.Color(102, 48, 142));
        updateButton.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        updateButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                updateButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                updateButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                updateButtonMouseExited(evt);
            }
        });
        updateButton.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setIcon(new javax.swing.ImageIcon("D:\\CSSD-asignment\\Images\\Available Updates_25px.png")); // NOI18N
        updateButton.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 30, 50));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Update Sensor");
        updateButton.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, -1, -1));

        jPanel1.add(updateButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 380, 140, -1));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel1.setText("Sensor ID");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 80, 120, 30));

        idTextBox.setEditable(false);
        jPanel1.add(idTextBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 80, 230, 30));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel2.setText("Type");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 130, 120, 30));

        jLabel5.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel5.setText("Status");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 230, 120, 30));
        jPanel1.add(DescriptionTextBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 180, 230, 30));

        jLabel6.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel6.setText("Description");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 180, 120, 30));

        frequencyTextBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                frequencyTextBoxActionPerformed(evt);
            }
        });
        jPanel1.add(frequencyTextBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 280, 230, 30));

        jLabel9.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel9.setText("Freaquency");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 280, 120, 30));

        typeComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "- Select -", "Flood Sensor", "Traffic Sensor", "Bin Sensor" }));
        jPanel1.add(typeComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 130, 230, 30));

        buttonGroup1.add(activeRadioButton);
        activeRadioButton.setText("Active");
        jPanel1.add(activeRadioButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 230, -1, -1));

        buttonGroup1.add(deactiveRadioButton);
        deactiveRadioButton.setText("Deactive");
        jPanel1.add(deactiveRadioButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 230, -1, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setText("Update Sensor");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 10, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void updateButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateButtonMouseEntered
        evt.getComponent().setBackground(new Color(80, 80, 125));
    }//GEN-LAST:event_updateButtonMouseEntered

    private void updateButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateButtonMouseExited
        evt.getComponent().setBackground(new Color(102, 48, 142));
    }//GEN-LAST:event_updateButtonMouseExited

    public void clear(){
        idTextBox.setText("");
        typeComboBox.setSelectedIndex(0);
        DescriptionTextBox.setText("");
        buttonGroup1.clearSelection();
        frequencyTextBox.setText("");      
    }
    
    private void updateButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateButtonMouseClicked
        int y=JOptionPane.showConfirmDialog(null,"Do you really want to Update ?","Update",JOptionPane.YES_NO_OPTION);
            if(y==0){
                
                Boolean status;
                if(activeRadioButton.isSelected()){
                    status=true;
                }
                else{
                    status=false;
                }

                Data data = new Data();
                Sensor sr = new Sensor(idTextBox.getText(), typeComboBox.getSelectedItem().toString(), DescriptionTextBox.getText(), status, frequencyTextBox.getText(),data);

                    allsensors.remove(s);
                    allsensors.add(sr);
                    boolean check =serialize.write("sensor.txt", allsensors);

                    if(check){
                        JOptionPane.showMessageDialog(null,"Sensor Updated");
                        
                    }
                    else{
                        JOptionPane.showMessageDialog(null,"Sensor Update Error");
                    }
        
            }

    }//GEN-LAST:event_updateButtonMouseClicked

    private void frequencyTextBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_frequencyTextBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_frequencyTextBoxActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField DescriptionTextBox;
    private javax.swing.JRadioButton activeRadioButton;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JRadioButton deactiveRadioButton;
    private javax.swing.JTextField frequencyTextBox;
    private javax.swing.JTextField idTextBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JComboBox<String> typeComboBox;
    private javax.swing.JPanel updateButton;
    // End of variables declaration//GEN-END:variables
}
