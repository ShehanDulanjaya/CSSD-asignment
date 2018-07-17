/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Classes.Data;
import Classes.Location;
import Classes.Mothership;
import Classes.Sensor;
import Classes.SensorMonitor;
import Classes.SensorStation;
import Classes.emergencyService;
import static File.Map.readmap;
import File.serialize;
import static GUI.HomeStation.globalStationId;
import com.teamdev.jxbrowser.chromium.Browser;
import com.teamdev.jxbrowser.chromium.swing.BrowserView;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import javax.swing.JButton;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.plaf.basic.BasicInternalFrameUI;

/**
 *
 * @author Akila Jayasinghe
 */
public class destinationSelect extends javax.swing.JInternalFrame {
String x[]=null;

    /**
     * Creates new form Home
     */
    public destinationSelect() {

        initComponents();
        
        emergencyService emergency = new emergencyService();
        Location l = new Location();
        l.addObserver(emergency);
        l.setemergency();
        
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
        findRouteButton = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        currentLocationTextBox = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        destinationTextBox = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        setLocationButton = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(680, 480));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel15.setFont(new java.awt.Font("Comic Sans MS", 1, 10)); // NOI18N
        jLabel15.setText("A step towards Smart Sri Lanka");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 450, 171, -1));

        findRouteButton.setBackground(new java.awt.Color(102, 48, 142));
        findRouteButton.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        findRouteButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                findRouteButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                findRouteButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                findRouteButtonMouseExited(evt);
            }
        });
        findRouteButton.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setIcon(new javax.swing.ImageIcon("D:\\CSSD-asignment\\Images\\Waypoint Map_25px.png")); // NOI18N
        findRouteButton.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 30, 50));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Find Best Route");
        findRouteButton.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, -1, -1));

        jPanel1.add(findRouteButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 370, 150, -1));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel1.setText("Current Location");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 80, 120, 30));

        currentLocationTextBox.setEditable(false);
        jPanel1.add(currentLocationTextBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 80, 230, 30));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setText("Set Destination");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 10, -1, -1));

        destinationTextBox.setEditable(false);
        jPanel1.add(destinationTextBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 130, 230, 30));

        jLabel11.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel11.setText("Destination");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 130, 120, 30));

        setLocationButton.setBackground(new java.awt.Color(102, 81, 181));
        setLocationButton.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        setLocationButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                setLocationButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                setLocationButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                setLocationButtonMouseExited(evt);
            }
        });
        setLocationButton.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setIcon(new javax.swing.ImageIcon("D:\\CSSD-asignment\\Images\\Marker_20px.png")); // NOI18N
        jLabel6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jLabel6KeyPressed(evt);
            }
        });
        setLocationButton.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 20, 30));

        jPanel1.add(setLocationButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 80, 20, 30));

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

    private void findRouteButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_findRouteButtonMouseEntered
        evt.getComponent().setBackground(new Color(80, 80, 125));
    }//GEN-LAST:event_findRouteButtonMouseEntered

    private void findRouteButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_findRouteButtonMouseExited
        evt.getComponent().setBackground(new Color(102, 48, 142));
    }//GEN-LAST:event_findRouteButtonMouseExited

    
    private void findRouteButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_findRouteButtonMouseClicked
            bestRouteMap();        
        
    }//GEN-LAST:event_findRouteButtonMouseClicked

    private void setLocationButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_setLocationButtonMouseClicked
        // TODO add your handling code here:
        mapload();
       
    }//GEN-LAST:event_setLocationButtonMouseClicked

    private void setLocationButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_setLocationButtonMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_setLocationButtonMouseEntered

    private void setLocationButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_setLocationButtonMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_setLocationButtonMouseExited

    private void jLabel6KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jLabel6KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel6KeyPressed

public void mapload(){
    Browser browser = new Browser();
    BrowserView view = new BrowserView(browser);

    JFrame m = new JFrame();
        m.add(view).addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                        int y=JOptionPane.showConfirmDialog(null,"Add this Location ?","Location",JOptionPane.YES_NO_OPTION);
                        if(y==0){
                            x=readmap();
                            Location l =new Location(Double.parseDouble(x[0]), Double.parseDouble(x[1]));
                            String s=l.toAdress();
                            currentLocationTextBox.setText(s);
                            m.dispose();
                        }
                        
            }
        });
        
        m.setSize(920,580);
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        m.setLocation(dim.width/2-m.getSize().width/2, dim.height/2-m.getSize().height/2);
        m.setVisible(true);
        

    browser.loadURL("http://localhost:4200/");
}

public void bestRouteMap(){
    Browser browser = new Browser();
    BrowserView view = new BrowserView(browser);

    JFrame m = new JFrame();
        m.add(view);
        m.setSize(920,580);
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        m.setLocation(dim.width/2-m.getSize().width/2, dim.height/2-m.getSize().height/2);
        m.setVisible(true);
        

    browser.loadURL("http://localhost:4200/direction");
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextField currentLocationTextBox;
    private javax.swing.JTextField destinationTextBox;
    private javax.swing.JPanel findRouteButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel setLocationButton;
    // End of variables declaration//GEN-END:variables
}
