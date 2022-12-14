
import java.awt.Color;

public class Welcome_Screen extends javax.swing.JFrame {

    int xMouse, yMouse;
    
    public Welcome_Screen() {
        initComponents();
        setBackground(new Color(0,0,0,0));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        body = new javax.swing.JPanel();
        titleBar = new javax.swing.JPanel();
        close = new javax.swing.JPanel();
        close_label = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        play = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        body.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        titleBar.setBackground(new java.awt.Color(103, 111, 155));
        titleBar.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                titleBarMouseDragged(evt);
            }
        });
        titleBar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                titleBarMousePressed(evt);
            }
        });
        titleBar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        close.setBackground(new java.awt.Color(66, 71, 105));
        close.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        close_label.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        close_label.setForeground(new java.awt.Color(103, 111, 155));
        close_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        close_label.setText("X");
        close_label.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                close_labelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                close_labelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                close_labelMouseExited(evt);
            }
        });
        close.add(close_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 40, 30));

        titleBar.add(close, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 0, 40, -1));

        body.add(titleBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 410, 30));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(66, 71, 105));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("GUESS");
        body.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 90, 160, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(66, 71, 105));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("THE");
        body.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 130, 160, -1));

        play.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        play.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/playicon.png"))); // NOI18N
        play.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                playMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                playMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                playMouseExited(evt);
            }
        });
        body.add(play, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 260, 170, 180));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(66, 71, 105));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("NUMBER");
        body.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 170, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(66, 71, 105));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("CREATED WITH EXOTIC CODE");
        body.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 570, 410, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(66, 71, 105));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("CLICK TO PLAY");
        body.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 440, 170, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(66, 71, 105));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("CLICK TO PLAY");
        body.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 440, 170, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(66, 71, 105));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("CLICK TO PLAY");
        body.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 440, 170, -1));

        getContentPane().add(body, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 410, 600));

        setSize(new java.awt.Dimension(519, 600));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void titleBarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_titleBarMousePressed
    xMouse = evt.getX();
    yMouse = evt.getY();
    }//GEN-LAST:event_titleBarMousePressed

    private void titleBarMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_titleBarMouseDragged
    int x = evt.getXOnScreen(), y = evt.getYOnScreen();
    this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_titleBarMouseDragged

    private void close_labelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_close_labelMouseClicked
    System.exit(0);
    }//GEN-LAST:event_close_labelMouseClicked

    private void close_labelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_close_labelMouseEntered
    color_scheme.close_setcolor(close);
    color_scheme.close_setcolor(close_label);
    }//GEN-LAST:event_close_labelMouseEntered

    private void close_labelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_close_labelMouseExited
    color_scheme.close_resetcolor(close);
    color_scheme.close_resetcolor(close_label);
    }//GEN-LAST:event_close_labelMouseExited

    private void playMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_playMouseEntered
    play.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/playicon2.png")));
    }//GEN-LAST:event_playMouseEntered

    private void playMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_playMouseExited
    play.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/playicon.png")));
    }//GEN-LAST:event_playMouseExited

    private void playMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_playMouseClicked
    
    Game game = new Game();
    game.setVisible(true);
    this.dispose();
    }//GEN-LAST:event_playMouseClicked

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
            java.util.logging.Logger.getLogger(Welcome_Screen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Welcome_Screen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Welcome_Screen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Welcome_Screen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Welcome_Screen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel body;
    private javax.swing.JPanel close;
    private javax.swing.JLabel close_label;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel play;
    private javax.swing.JPanel titleBar;
    // End of variables declaration//GEN-END:variables
}
