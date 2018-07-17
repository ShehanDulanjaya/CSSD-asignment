/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;


import Classes.Sensor;

import File.serialize;

import javax.swing.table.DefaultTableModel;
import java.awt.Color;
import javax.swing.JDesktopPane;
import javax.swing.JOptionPane;
/**
 *
 * @author Akila Jayaaasinghe
 */
public class HomeViewData extends javax.swing.JInternalFrame {
public static String globalSensorId;
    /**
     * Creates new form Home
     */
    public HomeViewData() {
        initComponents();
        tableLoad();
        
    }
 
    
    public void tableLoad(){
        DefaultTableModel model=(DefaultTableModel) dataTable.getModel();
        model.setRowCount(0);
        for(Sensor sensor:serialize.getAllSensors()){
            if("".equals(searchTextBox.getText())){
                switch (sensorTypeComboBox.getSelectedIndex()) {
                    case 0:
                        model.addRow(new Object[]{sensor.getSensorID(),sensor.getSensorType(),sensor.getMonitorName(),sensor.getStation()});
                        break;
                    case 1:
                        if("Bin Sensor".equals(sensor.getSensorType())){
                            model.addRow(new Object[]{sensor.getSensorID(),sensor.getSensorType(),sensor.getMonitorName(),sensor.getStation()});
                        }
                        break;
                    case 2:
                        if("Flood Sensor".equals(sensor.getSensorType())){
                            model.addRow(new Object[]{sensor.getSensorID(),sensor.getSensorType(),sensor.getMonitorName(),sensor.getStation()});
                        }
                        break;
                    case 3:
                        if("Traffic Sensor".equals(sensor.getSensorType())){
                            model.addRow(new Object[]{sensor.getSensorID(),sensor.getSensorType(),sensor.getMonitorName(),sensor.getStation()});
                        }
                        break;
                    default:
                        break;
                        }
            }
            else{
                if(monitorRadioButton.isSelected() ){
                    if(searchTextBox.getText().equals(sensor.getMonitorName())){
                        System.out.println("search");
                        switch (sensorTypeComboBox.getSelectedIndex()) {
                        case 0:
                            model.addRow(new Object[]{sensor.getSensorID(),sensor.getSensorType(),sensor.getMonitorName(),sensor.getStation()});
                            break;
                        case 1:
                            if("Bin Sensor".equals(sensor.getSensorType())){
                                model.addRow(new Object[]{sensor.getSensorID(),sensor.getSensorType(),sensor.getMonitorName(),sensor.getStation()});
                            }
                            break;
                        case 2:
                            if("Flood Sensor".equals(sensor.getSensorType())){
                                model.addRow(new Object[]{sensor.getSensorID(),sensor.getSensorType(),sensor.getMonitorName(),sensor.getStation()});
                            }
                            break;
                        case 3:
                            if("Traffic Sensor".equals(sensor.getSensorType())){
                                model.addRow(new Object[]{sensor.getSensorID(),sensor.getSensorType(),sensor.getMonitorName(),sensor.getStation()});
                            }
                            break;
                        default:
                            break;
                            }
                    }
                }
                else if(stationRadioButton.isSelected()){
                    if(searchTextBox.getText().equals(sensor.getStation())){
                        switch (sensorTypeComboBox.getSelectedIndex()) {
                        case 0:
                            model.addRow(new Object[]{sensor.getSensorID(),sensor.getSensorType(),sensor.getMonitorName(),sensor.getStation()});
                            break;
                        case 1:
                            if("Bin Sensor".equals(sensor.getSensorType())){
                                model.addRow(new Object[]{sensor.getSensorID(),sensor.getSensorType(),sensor.getMonitorName(),sensor.getStation()});
                            }
                            break;
                        case 2:
                            if("Flood Sensor".equals(sensor.getSensorType())){
                                model.addRow(new Object[]{sensor.getSensorID(),sensor.getSensorType(),sensor.getMonitorName(),sensor.getStation()});
                            }
                            break;
                        case 3:
                            if("Traffic Sensor".equals(sensor.getSensorType())){
                                model.addRow(new Object[]{sensor.getSensorID(),sensor.getSensorType(),sensor.getMonitorName(),sensor.getStation()});
                            }
                            break;
                        default:
                            break;
                            }
                    }
                }
                
            }
        }
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
        jScrollPane2 = new javax.swing.JScrollPane();
        dataTable = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        searchTextBox = new javax.swing.JTextField();
        homePanel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        sensorTypeComboBox = new javax.swing.JComboBox<>();
        SearchButton = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        stationRadioButton = new javax.swing.JRadioButton();
        monitorRadioButton = new javax.swing.JRadioButton();

        setBorder(null);
        setOpaque(true);
        setPreferredSize(new java.awt.Dimension(680, 480));
        setVisible(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMinimumSize(new java.awt.Dimension(680, 600));
        jPanel1.setPreferredSize(new java.awt.Dimension(680, 480));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel15.setFont(new java.awt.Font("Comic Sans MS", 1, 10)); // NOI18N
        jLabel15.setText("A step towards Smart Sri Lanka");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 430, 171, -1));

        dataTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Sensor ID", "Sensor Type", "Sensor Monitor", "Sensor Station"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        dataTable.setGridColor(new java.awt.Color(255, 255, 255));
        dataTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dataTableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(dataTable);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 640, 300));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setText("Search ");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, -1));

        searchTextBox.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        searchTextBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchTextBoxActionPerformed(evt);
            }
        });
        jPanel1.add(searchTextBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, 190, 30));

        homePanel.setBackground(new java.awt.Color(54, 43, 100));
        homePanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                homePanelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                homePanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                homePanelMouseExited(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon("D:\\CSSD-asignment\\Images\\Database View_25px.png")); // NOI18N

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("View Data");

        javax.swing.GroupLayout homePanelLayout = new javax.swing.GroupLayout(homePanel);
        homePanel.setLayout(homePanelLayout);
        homePanelLayout.setHorizontalGroup(
            homePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(homePanelLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addContainerGap(32, Short.MAX_VALUE))
        );
        homePanelLayout.setVerticalGroup(
            homePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, homePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(homePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(homePanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel3))
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel1.add(homePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 380, 150, 50));

        sensorTypeComboBox.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        sensorTypeComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "All Sensors", "Bin Sensors", "Flood Sensors", "Traffic Sensors" }));
        sensorTypeComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sensorTypeComboBoxActionPerformed(evt);
            }
        });
        jPanel1.add(sensorTypeComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 20, 130, 30));

        SearchButton.setBackground(new java.awt.Color(54, 43, 100));
        SearchButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SearchButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                SearchButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                SearchButtonMouseExited(evt);
            }
        });

        jLabel4.setIcon(new javax.swing.ImageIcon("D:\\CSSD-asignment\\Images\\Search_20px.png")); // NOI18N

        jLabel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Search");

        javax.swing.GroupLayout SearchButtonLayout = new javax.swing.GroupLayout(SearchButton);
        SearchButton.setLayout(SearchButtonLayout);
        SearchButtonLayout.setHorizontalGroup(
            SearchButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SearchButtonLayout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addGap(0, 11, Short.MAX_VALUE))
        );
        SearchButtonLayout.setVerticalGroup(
            SearchButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SearchButtonLayout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(jLabel5)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel1.add(SearchButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 20, 90, 30));

        buttonGroup1.add(stationRadioButton);
        stationRadioButton.setText("By Sensor Station");
        stationRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stationRadioButtonActionPerformed(evt);
            }
        });
        jPanel1.add(stationRadioButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 40, -1, -1));

        buttonGroup1.add(monitorRadioButton);
        monitorRadioButton.setText("By Sensor Monitor ");
        monitorRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                monitorRadioButtonActionPerformed(evt);
            }
        });
        jPanel1.add(monitorRadioButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 10, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void searchTextBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchTextBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchTextBoxActionPerformed

    private void homePanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homePanelMouseClicked
                if (true == dataTable.getSelectionModel().isSelectionEmpty())
        {
            JOptionPane.showMessageDialog(null,"Select Sensor from the Table");
        }
        else{
            int x=dataTable.getSelectedRow();
            String id=(String) dataTable.getValueAt(x, 0);
         
            globalSensorId=id;
            
            ViewSensorData a =new ViewSensorData();
            JDesktopPane n =this.getDesktopPane();
            n.removeAll();
            
            n.add(a);
            a.show();
            
        }
    }//GEN-LAST:event_homePanelMouseClicked

    private void homePanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homePanelMouseEntered
        // TODO add your handling code here:
        evt.getComponent().setBackground(new Color(85,65,118));
    }//GEN-LAST:event_homePanelMouseEntered

    private void homePanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homePanelMouseExited
        // TODO add your handling code here:
        evt.getComponent().setBackground(new Color(54,43,100));
    }//GEN-LAST:event_homePanelMouseExited

    private void dataTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dataTableMouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_dataTableMouseClicked

    private void sensorTypeComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sensorTypeComboBoxActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_sensorTypeComboBoxActionPerformed

    private void SearchButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SearchButtonMouseClicked
        // TODO add your handling code here:
        tableLoad();
    }//GEN-LAST:event_SearchButtonMouseClicked

    private void SearchButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SearchButtonMouseEntered
        // TODO add your handling code here:
        evt.getComponent().setBackground(new Color(85,65,118));
    }//GEN-LAST:event_SearchButtonMouseEntered

    private void SearchButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SearchButtonMouseExited
        // TODO add your handling code here:
        evt.getComponent().setBackground(new Color(54,43,100));
    }//GEN-LAST:event_SearchButtonMouseExited

    private void stationRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stationRadioButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_stationRadioButtonActionPerformed

    private void monitorRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_monitorRadioButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_monitorRadioButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel SearchButton;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTable dataTable;
    private javax.swing.JPanel homePanel;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JRadioButton monitorRadioButton;
    private javax.swing.JTextField searchTextBox;
    private javax.swing.JComboBox<String> sensorTypeComboBox;
    private javax.swing.JRadioButton stationRadioButton;
    // End of variables declaration//GEN-END:variables
}
