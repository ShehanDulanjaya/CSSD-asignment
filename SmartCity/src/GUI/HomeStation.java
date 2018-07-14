/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Classes.Mothership;
import Classes.SensorStation;
import File.serialize;

import java.awt.Color;
import javax.swing.JDesktopPane;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Akila Jayaaasinghe
 */
public class HomeStation extends javax.swing.JInternalFrame {
public static String globalStationId;
Mothership mother=new Mothership("Kaduwela", serialize.getAllSensorStations());    
    /**
     * Creates new form Home
     */
    public HomeStation() {
        initComponents();
//       load();
        tableLoad();
    }
    
    public void tableLoad(){
    DefaultTableModel model=(DefaultTableModel) sensorStationTable.getModel();
     model.setRowCount(0);
    
                for(SensorStation station:mother.getSensorStation()){
                        model.addRow(new Object[]{station.getStationID(),station.getName()});
                    }  
    }
//    dsasd
  
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPasswordField1 = new javax.swing.JPasswordField();
        jPanel1 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        sensorStationTable = new javax.swing.JTable();
        viewButton = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        addButton = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        updateButton = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        deleteButton = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        jPasswordField1.setText("jPasswordField1");

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

        sensorStationTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Station ID", "Station Name"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        sensorStationTable.setGridColor(new java.awt.Color(255, 255, 255));
        jScrollPane2.setViewportView(sensorStationTable);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 640, 348));

        viewButton.setBackground(new java.awt.Color(102, 48, 142));
        viewButton.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        viewButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                viewButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                viewButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                viewButtonMouseExited(evt);
            }
        });
        viewButton.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon("D:\\CSSD-asignment\\Images\\View_25px.png")); // NOI18N
        viewButton.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 30, 50));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("View Station");
        viewButton.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, -1, -1));

        jPanel1.add(viewButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, 130, -1));

        addButton.setBackground(new java.awt.Color(102, 48, 142));
        addButton.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        addButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                addButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                addButtonMouseExited(evt);
            }
        });
        addButton.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setIcon(new javax.swing.ImageIcon("D:\\CSSD-asignment\\Images\\Add New_25px.png")); // NOI18N
        addButton.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 30, 50));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Add Station");
        addButton.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, -1, -1));

        jPanel1.add(addButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 370, 130, -1));

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

        jLabel5.setIcon(new javax.swing.ImageIcon("D:\\CSSD-asignment\\Images\\Available Updates_25px.png")); // NOI18N
        updateButton.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 30, 50));

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Update Station");
        updateButton.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, -1, -1));

        jPanel1.add(updateButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 370, 140, -1));

        deleteButton.setBackground(new java.awt.Color(102, 48, 142));
        deleteButton.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        deleteButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deleteButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                deleteButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                deleteButtonMouseExited(evt);
            }
        });
        deleteButton.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setIcon(new javax.swing.ImageIcon("D:\\CSSD-asignment\\Images\\Trash_25px.png")); // NOI18N
        deleteButton.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 30, 50));

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Delete Station");
        deleteButton.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, -1, -1));

        jPanel1.add(deleteButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 370, 140, -1));

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

    private void viewButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewButtonMouseEntered
        evt.getComponent().setBackground(new Color(80, 80, 125));
    }//GEN-LAST:event_viewButtonMouseEntered

    private void viewButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewButtonMouseExited
         evt.getComponent().setBackground(new Color(102,48,142));
    }//GEN-LAST:event_viewButtonMouseExited

    private void addButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addButtonMouseEntered
         evt.getComponent().setBackground(new Color(80, 80, 125));
    }//GEN-LAST:event_addButtonMouseEntered

    private void addButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addButtonMouseExited
         evt.getComponent().setBackground(new Color(102,48,142));
    }//GEN-LAST:event_addButtonMouseExited

    private void updateButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateButtonMouseEntered
        evt.getComponent().setBackground(new Color(80, 80, 125));
    }//GEN-LAST:event_updateButtonMouseEntered

    private void updateButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateButtonMouseExited
         evt.getComponent().setBackground(new Color(102,48,142));
    }//GEN-LAST:event_updateButtonMouseExited

    private void deleteButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteButtonMouseEntered
         evt.getComponent().setBackground(new Color(80, 80, 125));
    }//GEN-LAST:event_deleteButtonMouseEntered

    private void deleteButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteButtonMouseExited
         evt.getComponent().setBackground(new Color(102,48,142));
    }//GEN-LAST:event_deleteButtonMouseExited

    private void viewButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewButtonMouseClicked
        
        if (true == sensorStationTable.getSelectionModel().isSelectionEmpty())
        {
            JOptionPane.showMessageDialog(null,"Select Sensor Monitor from the Table");
        }
        else{
            int x=sensorStationTable.getSelectedRow();
            String id=(String) sensorStationTable.getValueAt(x, 0);
            System.out.println("home"+id);
            globalStationId=id;
            
            MainSensorMonitor m =new MainSensorMonitor();
            m.setVisible(true);
        }
            
    }//GEN-LAST:event_viewButtonMouseClicked

    private void addButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addButtonMouseClicked
        // TODO add your handling code here:fsf
        AddSensorStation a =new AddSensorStation();
            JDesktopPane n =this.getDesktopPane();
            n.removeAll();
            
            n.add(a);
            a.show();
    }//GEN-LAST:event_addButtonMouseClicked

    private void updateButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateButtonMouseClicked
        // TODO add your handling code here:
        if (true == sensorStationTable.getSelectionModel().isSelectionEmpty())
        {
            JOptionPane.showMessageDialog(null,"Select Sensor from the Table");
        }
        else{
            int x=sensorStationTable.getSelectedRow();
            String id=(String) sensorStationTable.getValueAt(x, 0);
            System.out.println("home"+id);
            globalStationId=id;

//        aa   a
            UpdateSensorStation u =new UpdateSensorStation();
            JDesktopPane n =this.getDesktopPane();
            n.removeAll();
            
            n.add(u);
            u.show();
        }
    }//GEN-LAST:event_updateButtonMouseClicked

    private void deleteButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteButtonMouseClicked
        // TODO add your handling code here:
        if (true == sensorStationTable.getSelectionModel().isSelectionEmpty())
        {
            JOptionPane.showMessageDialog(null,"Select Sensor from the Table");
        }
        else{
            int y=JOptionPane.showConfirmDialog(null,"Do you really want to Delete ?","Delete",JOptionPane.YES_NO_OPTION);
            if(y==0){
                
                int x=sensorStationTable.getSelectedRow();
                String id=(String) sensorStationTable.getValueAt(x, 0);
               boolean check= mother.removeSensorStation(id);

               if(check){
                            JOptionPane.showMessageDialog(null,"Sensor Station Deleted");
                            tableLoad();
                        }
                        else{
                            JOptionPane.showMessageDialog(null,"Sensor Station Delete Error");
                        }

            }
            }
    }//GEN-LAST:event_deleteButtonMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel addButton;
    private javax.swing.JPanel deleteButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable sensorStationTable;
    private javax.swing.JPanel updateButton;
    private javax.swing.JPanel viewButton;
    // End of variables declaration//GEN-END:variables
}
