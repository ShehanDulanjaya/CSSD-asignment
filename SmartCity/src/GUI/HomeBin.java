/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Classes.Clock;
import Classes.Location;
import Classes.Mothership;
import Classes.Sensor;
import Classes.SensorMonitor;
import Classes.SensorStation;
import File.serialize;
import static GUI.HomeStation.globalStationId;
import com.teamdev.jxbrowser.chromium.Browser;
import com.teamdev.jxbrowser.chromium.swing.BrowserView;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Akila Jayasinghe
 */
public class HomeBin extends javax.swing.JInternalFrame {
    
public static String globalMonitorId;

    /**
     * Creates new form Home
     */
    public HomeBin() {
        initComponents();
//       load();
//        tableLoad();
        
    }
    
    public void tableLoad(){
    
    }

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
        monitorTable = new javax.swing.JTable();
        viewDirectionButton = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

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

        monitorTable.setModel(new javax.swing.table.DefaultTableModel(
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
                "Monitor Name", "Location"
            }
        ));
        monitorTable.setGridColor(new java.awt.Color(255, 255, 255));
        jScrollPane2.setViewportView(monitorTable);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 640, 348));

        viewDirectionButton.setBackground(new java.awt.Color(102, 48, 142));
        viewDirectionButton.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        viewDirectionButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                viewDirectionButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                viewDirectionButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                viewDirectionButtonMouseExited(evt);
            }
        });
        viewDirectionButton.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setIcon(new javax.swing.ImageIcon("D:\\CSSD-asignment\\Images\\Available Updates_25px.png")); // NOI18N
        viewDirectionButton.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 30, 50));

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("View Direction");
        viewDirectionButton.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 15, -1, 20));

        jPanel1.add(viewDirectionButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 380, 150, -1));

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

    private void viewDirectionButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewDirectionButtonMouseEntered
        evt.getComponent().setBackground(new Color(80, 80, 125));
    }//GEN-LAST:event_viewDirectionButtonMouseEntered

    private void viewDirectionButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewDirectionButtonMouseExited
         evt.getComponent().setBackground(new Color(102,48,142));
    }//GEN-LAST:event_viewDirectionButtonMouseExited

    
    private void viewDirectionButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewDirectionButtonMouseClicked
        bestRouteMap();
    }//GEN-LAST:event_viewDirectionButtonMouseClicked

    public void bestRouteMap(){
        Browser browser = new Browser();
        BrowserView view = new BrowserView(browser);

        JFrame m = new JFrame();
            m.add(view);
            m.setSize(920,580);
            Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
            m.setLocation(dim.width/2-m.getSize().width/2, dim.height/2-m.getSize().height/2);
            m.setVisible(true);


        browser.loadURL("http://localhost:4200/waypoints");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable monitorTable;
    private javax.swing.JPanel viewDirectionButton;
    // End of variables declaration//GEN-END:variables
}
