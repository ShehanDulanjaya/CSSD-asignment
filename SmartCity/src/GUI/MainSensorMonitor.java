/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Classes.Clock;
import Classes.SensorMonitor;
import Classes.SensorStation;
import File.serialize;
import static GUI.MainSensorStation.waitTime;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.ArrayList;
import javax.swing.JOptionPane;


/**
 *
 * @author Akila Jaaaaaaaaaayasinghea
 */
public class MainSensorMonitor extends javax.swing.JFrame {

    /**
     * Creates new form AddSensor
     */
    public MainSensorMonitor() {
        
        initComponents();
        waitTimeTextBox.setText(Long.toString(waitTime));
        homeUi();
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
        Clock clock=Clock.getInstance();
        clock.waitForTime(waitTime);
    }
    
    public void homeUi(){
        
        bodyPane.removeAll();
        HomeMonitor h =new HomeMonitor();
        h.setVisible(true);
        bodyPane.add(h);

    }
    


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        background = new javax.swing.JPanel();
        sidePanel = new javax.swing.JPanel();
        homePanel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        weatherLabel = new javax.swing.JLabel();
        cityLabel = new javax.swing.JLabel();
        monitorHomePanel = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        waitTimePanel = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        waitTimeTextBox = new javax.swing.JTextField();
        waitTimeButton = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        homePanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        topPanel = new javax.swing.JPanel();
        closeLabel = new javax.swing.JLabel();
        titlePanel = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        bodyPane = new javax.swing.JDesktopPane();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setLocationByPlatform(true);
        setUndecorated(true);

        background.setBackground(new java.awt.Color(255, 255, 255));
        background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        sidePanel.setBackground(new java.awt.Color(54, 33, 89));
        sidePanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        jLabel2.setIcon(new javax.swing.ImageIcon("D:\\CSSD-asignment\\Images\\Log Cabin_25px.png")); // NOI18N

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Sensor Station");

        javax.swing.GroupLayout homePanelLayout = new javax.swing.GroupLayout(homePanel);
        homePanel.setLayout(homePanelLayout);
        homePanelLayout.setHorizontalGroup(
            homePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(homePanelLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(71, Short.MAX_VALUE))
        );
        homePanelLayout.setVerticalGroup(
            homePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, homePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, homePanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(19, 19, 19))
        );

        sidePanel.add(homePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, 230, 60));

        jLabel14.setFont(new java.awt.Font("Comic Sans MS", 1, 30)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("iCity");
        sidePanel.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));

        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator1.setAlignmentY(1.0F);
        jSeparator1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        sidePanel.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 160, 15));
        jSeparator1.getAccessibleContext().setAccessibleName("");

        weatherLabel.setText("Weather");
        sidePanel.add(weatherLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, 100, 40));

        cityLabel.setText("City");
        sidePanel.add(cityLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 60, 90, -1));

        monitorHomePanel.setBackground(new java.awt.Color(85, 65, 118));
        monitorHomePanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                monitorHomePanelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                monitorHomePanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                monitorHomePanelMouseExited(evt);
            }
        });

        jLabel10.setIcon(new javax.swing.ImageIcon("D:\\CSSD-asignment\\Images\\Bungalow_25px.png")); // NOI18N

        jLabel11.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Sensor Monitor");

        javax.swing.GroupLayout monitorHomePanelLayout = new javax.swing.GroupLayout(monitorHomePanel);
        monitorHomePanel.setLayout(monitorHomePanelLayout);
        monitorHomePanelLayout.setHorizontalGroup(
            monitorHomePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(monitorHomePanelLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                .addContainerGap())
        );
        monitorHomePanelLayout.setVerticalGroup(
            monitorHomePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, monitorHomePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, monitorHomePanelLayout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addComponent(jLabel11)
                .addGap(20, 20, 20))
        );

        sidePanel.add(monitorHomePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, 230, -1));

        waitTimePanel.setOpaque(false);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Wait Time");

        waitTimeTextBox.setText("10000");
        waitTimeTextBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                waitTimeTextBoxActionPerformed(evt);
            }
        });
        waitTimeTextBox.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                waitTimeTextBoxKeyTyped(evt);
            }
        });

        waitTimeButton.setBackground(new java.awt.Color(102, 0, 102));
        waitTimeButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                waitTimeButtonMouseClicked(evt);
            }
        });
        waitTimeButton.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Set Wait Time");
        waitTimeButton.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        javax.swing.GroupLayout waitTimePanelLayout = new javax.swing.GroupLayout(waitTimePanel);
        waitTimePanel.setLayout(waitTimePanelLayout);
        waitTimePanelLayout.setHorizontalGroup(
            waitTimePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(waitTimePanelLayout.createSequentialGroup()
                .addGroup(waitTimePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(waitTimePanelLayout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(waitTimeTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(waitTimePanelLayout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(waitTimeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        waitTimePanelLayout.setVerticalGroup(
            waitTimePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(waitTimePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(waitTimePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(waitTimeTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(waitTimeButton, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                .addContainerGap())
        );

        sidePanel.add(waitTimePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 470, 230, -1));

        homePanel1.setBackground(new java.awt.Color(54, 43, 100));
        homePanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                homePanel1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                homePanel1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                homePanel1MouseExited(evt);
            }
        });

        jLabel6.setIcon(new javax.swing.ImageIcon("D:\\CSSD-asignment\\Images\\Home_25px.png")); // NOI18N

        jLabel7.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Home");

        javax.swing.GroupLayout homePanel1Layout = new javax.swing.GroupLayout(homePanel1);
        homePanel1.setLayout(homePanel1Layout);
        homePanel1Layout.setHorizontalGroup(
            homePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(homePanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(71, Short.MAX_VALUE))
        );
        homePanel1Layout.setVerticalGroup(
            homePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, homePanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, homePanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addGap(19, 19, 19))
        );

        sidePanel.add(homePanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 230, 60));

        background.add(sidePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 570));

        topPanel.setBackground(new java.awt.Color(255, 255, 255));

        closeLabel.setIcon(new javax.swing.ImageIcon("D:\\CSSD-asignment\\Images\\icons8-close-window-24.png")); // NOI18N
        closeLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeLabelMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout topPanelLayout = new javax.swing.GroupLayout(topPanel);
        topPanel.setLayout(topPanelLayout);
        topPanelLayout.setHorizontalGroup(
            topPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, topPanelLayout.createSequentialGroup()
                .addContainerGap(656, Short.MAX_VALUE)
                .addComponent(closeLabel))
        );
        topPanelLayout.setVerticalGroup(
            topPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(topPanelLayout.createSequentialGroup()
                .addComponent(closeLabel)
                .addGap(0, 6, Short.MAX_VALUE))
        );

        background.add(topPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 0, 680, 30));

        titlePanel.setBackground(new java.awt.Color(122, 72, 221));

        jLabel16.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("Sensor Monitor");

        javax.swing.GroupLayout titlePanelLayout = new javax.swing.GroupLayout(titlePanel);
        titlePanel.setLayout(titlePanelLayout);
        titlePanelLayout.setHorizontalGroup(
            titlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel16, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 680, Short.MAX_VALUE)
        );
        titlePanelLayout.setVerticalGroup(
            titlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, titlePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                .addContainerGap())
        );

        background.add(titlePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 30, 680, 60));

        javax.swing.GroupLayout bodyPaneLayout = new javax.swing.GroupLayout(bodyPane);
        bodyPane.setLayout(bodyPaneLayout);
        bodyPaneLayout.setHorizontalGroup(
            bodyPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 680, Short.MAX_VALUE)
        );
        bodyPaneLayout.setVerticalGroup(
            bodyPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 480, Short.MAX_VALUE)
        );

        background.add(bodyPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 90, 680, 480));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void closeLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeLabelMouseClicked
        // TODO add your handling code here:
        System.exit(0);
//            this.dispose();
    }//GEN-LAST:event_closeLabelMouseClicked

    
    private void homePanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homePanelMouseClicked
        MainSensorStation m =new MainSensorStation();
        this.dispose();
        m.setVisible(true);
    }//GEN-LAST:event_homePanelMouseClicked

    private void monitorHomePanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_monitorHomePanelMouseClicked
        // TODO add your handling code here:
        homeUi();
    }//GEN-LAST:event_monitorHomePanelMouseClicked

    private void monitorHomePanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_monitorHomePanelMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_monitorHomePanelMouseEntered

    private void monitorHomePanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_monitorHomePanelMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_monitorHomePanelMouseExited

    private void waitTimeTextBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_waitTimeTextBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_waitTimeTextBoxActionPerformed

    private void waitTimeButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_waitTimeButtonMouseClicked
        // TODO add your handling code here:
        waitTime = Long.parseLong(waitTimeTextBox.getText());
        Clock clock=Clock.getInstance();
        clock.waitForTime(waitTime);
        JOptionPane.showMessageDialog(null,"Wait Time Successfully set");
    }//GEN-LAST:event_waitTimeButtonMouseClicked

    private void homePanel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homePanel1MouseClicked
        MotherShip m = new MotherShip();
        m.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_homePanel1MouseClicked

    private void homePanel1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homePanel1MouseEntered
        // TODO add your handling code here:
         evt.getComponent().setBackground(new Color(85,65,118));
    }//GEN-LAST:event_homePanel1MouseEntered

    private void homePanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homePanelMouseEntered
        // TODO add your handling code here:
         evt.getComponent().setBackground(new Color(85,65,118));
    }//GEN-LAST:event_homePanelMouseEntered

    private void homePanel1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homePanel1MouseExited
        // TODO add your handling code here:
        evt.getComponent().setBackground(new Color(54,43,100));
    }//GEN-LAST:event_homePanel1MouseExited

    private void homePanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homePanelMouseExited
        // TODO add your handling code here:
        evt.getComponent().setBackground(new Color(54,43,100));
    }//GEN-LAST:event_homePanelMouseExited

    private void waitTimeTextBoxKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_waitTimeTextBoxKeyTyped
        // TODO add your handling code here:
        char c=evt.getKeyChar();
        String s=waitTimeTextBox.getText();
         
         if(!(Character.isDigit(c))||(c==com.sun.glass.events.KeyEvent.VK_BACKSPACE) || (c== com.sun.glass.events.KeyEvent.VK_DELETE))
         {
             evt.consume();
         }
    }//GEN-LAST:event_waitTimeTextBoxKeyTyped

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainSensorMonitor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainSensorMonitor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainSensorMonitor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainSensorMonitor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainSensorMonitor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel background;
    private javax.swing.JDesktopPane bodyPane;
    private javax.swing.JLabel cityLabel;
    private javax.swing.JLabel closeLabel;
    private javax.swing.JPanel homePanel;
    private javax.swing.JPanel homePanel1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPanel monitorHomePanel;
    private javax.swing.JPanel sidePanel;
    private javax.swing.JPanel titlePanel;
    private javax.swing.JPanel topPanel;
    private javax.swing.JPanel waitTimeButton;
    private javax.swing.JPanel waitTimePanel;
    private javax.swing.JTextField waitTimeTextBox;
    private javax.swing.JLabel weatherLabel;
    // End of variables declaration//GEN-END:variables
}
