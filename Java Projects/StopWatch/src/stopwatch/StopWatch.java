/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stopwatch;

import java.awt.*;
import static java.lang.Thread.sleep;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.logging.Level;
import java.util.logging.Logger;
//import java.awt.event.ActionListener;
//import javax.swing.Timer;

/**
 *
 * @author 2ndyrGroupA
 */
public class StopWatch extends javax.swing.JFrame {

    static int centi = 0;
    static int sec = 0;
    static int min = 0;
    static boolean state = true;
    static int down = 100;
    static int up = 0;

    /**
     * Creates new form StopWatch
     */
    public StopWatch() {
        initComponents();
//        this.setLayout(new GridBagLayout());
//        add(panel, new GridBagConstraints());
//        GraphicsDevice device = GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice();
//        device.setFullScreenWindow(this);
//        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
//        this.setLocation(dim.width / 2 - this.getSize().width / 2, dim.height / 2 - this.getSize().height / 2);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        minute = new javax.swing.JLabel();
        second = new javax.swing.JLabel();
        centisec = new javax.swing.JLabel();
        btn_start = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btn_stop1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        panel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        cntdwn = new javax.swing.JLabel();
        goCntDwn = new javax.swing.JButton();
        panel2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        cntup = new javax.swing.JLabel();
        goCntUp = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        time = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panel.setBackground(new java.awt.Color(0, 204, 102));
        panel.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                panelComponentShown(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Constantia", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 0, 0));
        jLabel1.setText("Stop Watch");

        minute.setFont(new java.awt.Font("Constantia", 1, 48)); // NOI18N
        minute.setText("00");

        second.setFont(new java.awt.Font("Constantia", 1, 48)); // NOI18N
        second.setText("00");

        centisec.setFont(new java.awt.Font("Constantia", 1, 48)); // NOI18N
        centisec.setText("00");

        btn_start.setBackground(new java.awt.Color(153, 0, 51));
        btn_start.setFont(new java.awt.Font("Constantia", 1, 24)); // NOI18N
        btn_start.setText("START");
        btn_start.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_startMouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Constantia", 1, 48)); // NOI18N
        jLabel2.setText(":");

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Constantia", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 102, 102));

        jLabel7.setFont(new java.awt.Font("Constantia", 1, 48)); // NOI18N
        jLabel7.setText(":");

        btn_stop1.setBackground(new java.awt.Color(153, 0, 0));
        btn_stop1.setFont(new java.awt.Font("Constantia", 1, 24)); // NOI18N
        btn_stop1.setText("STOP");
        btn_stop1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_stop1MouseClicked(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel5.setText("Stopwatch");

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(98, 98, 98))
            .addGroup(panelLayout.createSequentialGroup()
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGap(135, 135, 135)
                        .addComponent(btn_start)
                        .addGap(40, 40, 40)
                        .addComponent(btn_stop1))
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGap(109, 109, 109)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelLayout.createSequentialGroup()
                                .addComponent(minute, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(second, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(centisec, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGap(167, 167, 167)
                        .addComponent(jLabel5)))
                .addContainerGap(227, Short.MAX_VALUE))
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addGap(15, 15, 15)
                .addComponent(jLabel4)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_start)
                            .addComponent(btn_stop1))
                        .addGap(64, 64, 64))
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(minute)
                            .addComponent(second)
                            .addComponent(centisec)
                            .addComponent(jLabel2)
                            .addComponent(jLabel7))
                        .addContainerGap(156, Short.MAX_VALUE))))
        );

        panel1.setBackground(new java.awt.Color(255, 204, 204));

        jLabel3.setFont(new java.awt.Font("Constantia", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Count Down");

        cntdwn.setFont(new java.awt.Font("Constantia", 1, 90)); // NOI18N
        cntdwn.setText("100");

        goCntDwn.setBackground(new java.awt.Color(153, 0, 51));
        goCntDwn.setFont(new java.awt.Font("Constantia", 1, 24)); // NOI18N
        goCntDwn.setText("Go");
        goCntDwn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                goCntDwnMouseClicked(evt);
            }
        });
        goCntDwn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                goCntDwnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cntdwn, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(149, 149, 149))
            .addGroup(panel1Layout.createSequentialGroup()
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGap(128, 128, 128)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGap(201, 201, 201)
                        .addComponent(goCntDwn)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(cntdwn)
                .addGap(18, 18, 18)
                .addComponent(goCntDwn)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panel2.setBackground(new java.awt.Color(204, 0, 153));

        jLabel8.setFont(new java.awt.Font("Constantia", 1, 36)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 0, 0));
        jLabel8.setText("Count Up");

        cntup.setFont(new java.awt.Font("Constantia", 1, 90)); // NOI18N
        cntup.setText("0");

        goCntUp.setBackground(new java.awt.Color(153, 0, 51));
        goCntUp.setFont(new java.awt.Font("Constantia", 1, 24)); // NOI18N
        goCntUp.setText("Go");
        goCntUp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                goCntUpMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panel2Layout = new javax.swing.GroupLayout(panel2);
        panel2.setLayout(panel2Layout);
        panel2Layout.setHorizontalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(98, 98, 98))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cntup, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(goCntUp))
                .addGap(87, 87, 87))
        );
        panel2Layout.setVerticalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(cntup)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(goCntUp)
                .addContainerGap(104, Short.MAX_VALUE))
        );

        jPanel1.setBackground(new java.awt.Color(0, 51, 255));
        jPanel1.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                jPanel1ComponentAdded(evt);
            }
        });
        jPanel1.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jPanel1ComponentShown(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Current Time");

        time.setFont(new java.awt.Font("Constantia", 1, 90)); // NOI18N
        time.setForeground(new java.awt.Color(255, 255, 255));
        time.setText("Time");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addGap(158, 158, 158))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(128, 128, 128)
                .addComponent(time, javax.swing.GroupLayout.PREFERRED_SIZE, 505, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(55, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel9)
                .addGap(18, 18, 18)
                .addComponent(time)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_startMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_startMouseClicked
        state = true;
        Thread start = new Thread() {
            public void run() {
                for (;;) {//infinite loop
                    if (state == true) {
                        try {
                            sleep(10);
                            if (centi < 99) {
                                centi++;
                                centisec.setText("" + centi);
                            } else {
                                centi = 0;
                                centisec.setText("00");

                                if (sec < 59) {
                                    sec++;
                                    second.setText("" + sec);
                                } else {
                                    sec = 0;
                                    second.setText("00");

                                    if (min < 59) {
                                        min++;
                                        minute.setText("" + min);
                                    } else {
                                        min = 0;
                                        minute.setText("00");
                                    }
                                }
                            }
                        } catch (InterruptedException ex) {
                            Logger.getLogger(StopWatch.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    } else {
                        break;
                    }
                }
            }
        };
        start.start();

    }//GEN-LAST:event_btn_startMouseClicked

    private void goCntDwnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_goCntDwnMouseClicked
        state = true;
        Thread start = new Thread() {
            boolean vis = false;

            public void run() {
                while (down > 0) {
                    cntdwn.setText(Integer.toString(down--));
                    try {
                        sleep(1000);
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                }

                while (down == 0) {

                    try {
                            panel1.setBackground(Color.red);
                            panel1.setBackground(Color.white);
                    } catch (Exception ex) {
                        Logger.getLogger(StopWatch.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }

            }
        };
        start.start();
    }//GEN-LAST:event_goCntDwnMouseClicked

    private void goCntUpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_goCntUpMouseClicked
        state = true;

        Thread start = new Thread() {
            boolean vis = false;

            public void run() {
                while (up < 100) {
                    cntup.setText(Integer.toString(up++));
                    try {
                        sleep(1000);
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                }
                while (up == 100) {

                    try {
                            panel2.setBackground(Color.red);
                            panel2.setBackground(Color.white);
                    } catch (Exception ex) {
                        Logger.getLogger(StopWatch.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }

        };
        start.start();
    }//GEN-LAST:event_goCntUpMouseClicked

    private void btn_stop1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_stop1MouseClicked
        state = false;
    }//GEN-LAST:event_btn_stop1MouseClicked

    private void goCntDwnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_goCntDwnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_goCntDwnActionPerformed

    private void jPanel1ComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jPanel1ComponentShown

    }//GEN-LAST:event_jPanel1ComponentShown

    private void panelComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_panelComponentShown


    }//GEN-LAST:event_panelComponentShown

    private void jPanel1ComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_jPanel1ComponentAdded
        state = true;
        Thread start = new Thread() {
            public void run() {
                    LocalTime current = LocalTime.now();
                    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
                    time.setText(formatter.format(current));
                try {
                    sleep(1000);//interval
                    run();//update the current time
                } catch (InterruptedException ex) {
                    Logger.getLogger(StopWatch.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        };
        start.start();
 
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel1ComponentAdded

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
            java.util.logging.Logger.getLogger(StopWatch.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StopWatch.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StopWatch.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StopWatch.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StopWatch().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_start;
    private javax.swing.JButton btn_stop1;
    private javax.swing.JLabel centisec;
    private javax.swing.JLabel cntdwn;
    private javax.swing.JLabel cntup;
    private javax.swing.JButton goCntDwn;
    private javax.swing.JButton goCntUp;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel minute;
    private javax.swing.JPanel panel;
    private javax.swing.JPanel panel1;
    private javax.swing.JPanel panel2;
    private javax.swing.JLabel second;
    private javax.swing.JLabel time;
    // End of variables declaration//GEN-END:variables

}
