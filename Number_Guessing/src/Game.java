
import java.awt.Color;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;

public class Game extends javax.swing.JFrame {

    int xMouse, yMouse;
    int random_Number;
    int attemp = 1;
    randomNumberGenerator randomNumber = new randomNumberGenerator();
    
    public Game() {
        initComponents();
        setBackground(new Color(0,0,0,0));
        run();
        continue_btn.setVisible(false);
    }
    
    public void run()
    {
        random_Number = randomNumber.generate();
        System.out.print(random_Number+" ");
    }
    
    void reset_counter()
    {
        l1.setBackground(new Color(103,111,155));
        l2.setBackground(new Color(103,111,155));
        l3.setBackground(new Color(103,111,155));
        l4.setBackground(new Color(103,111,155));
        l5.setBackground(new Color(103,111,155));
    }
    
    void continue_fn(){
        run();
        number_guess_label.setText("?");
        input_number.setVisible(true);
        enter_btn.setVisible(true);
        message_label.setText("INPUT A NUMBER");
        continue_btn.setVisible(false);
        reset_counter();
    }
    
    void attemp_func()
    {
        if(attemp == 1)
            l1.setBackground(new Color(249,177,122));
        else if(attemp == 2)
            l2.setBackground(new Color(249,177,122));
        else if(attemp == 3)
            l3.setBackground(new Color(249,177,122));
        else if(attemp == 4)
            l4.setBackground(new Color(249,177,122));
        else if(attemp == 5)
            l5.setBackground(new Color(249,177,122));
        ++attemp;
        input_number.setText("");
        input_number.setFocusable(true);
        if(attemp == 6)
            end_game("TRY HARD NEXT TIME");
    }
    
    void end_game(String message)
    {
        number_guess_label.setText(random_Number+"");
        message_label.setText(message);
        input_number.setText("");
        input_number.setVisible(false);
        enter_btn.setVisible(false);
        continue_btn.setVisible(true);
        attemp = 1;
    }
    
    public void number_check()
    {
        if(String.valueOf(random_Number).equals(input_number.getText().trim()))
            {
                end_game("CORRECT");
            }
            else{
                try {       
                            int textToInt = Integer.parseInt(input_number.getText());
                            if(textToInt > 100 || textToInt < 1) {
                                message_label.setText("OUT OF RANGE");
                            } else if (textToInt > random_Number ){
                                message_label.setText("TOO HIGH! TRY AGAIN");
                                attemp_func();
                            } else if(textToInt < random_Number){
                                message_label.setText("TOO LOW! TRY AGAIN");
                                attemp_func();
                            }
                        } catch (NumberFormatException e) {
                            message_label.setText("INVALID INPUT");
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

        body = new javax.swing.JPanel();
        titleBar = new javax.swing.JPanel();
        close = new javax.swing.JPanel();
        close_label = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        enter_btn = new javax.swing.JPanel();
        enter_lb = new javax.swing.JLabel();
        input_number = new javax.swing.JTextField();
        continue_btn = new javax.swing.JPanel();
        continue_lb = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        hidden_num = new javax.swing.JPanel();
        number_guess_label = new javax.swing.JLabel();
        message_label = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        back_menu = new javax.swing.JPanel();
        back_lb = new javax.swing.JLabel();
        l1 = new javax.swing.JPanel();
        l2 = new javax.swing.JPanel();
        l3 = new javax.swing.JPanel();
        l4 = new javax.swing.JPanel();
        l5 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        body.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                bodyKeyPressed(evt);
            }
        });
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

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(66, 71, 105));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("GUESS");
        body.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 50, 110, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(66, 71, 105));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("THE");
        body.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 80, 110, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(66, 71, 105));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("BETWEEN");
        body.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 150, 110, 30));

        enter_btn.setBackground(new java.awt.Color(45, 50, 80));
        enter_btn.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        enter_lb.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        enter_lb.setForeground(new java.awt.Color(103, 111, 155));
        enter_lb.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        enter_lb.setText("ENTER");
        enter_lb.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                enter_lbMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                enter_lbMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                enter_lbMouseExited(evt);
            }
        });
        enter_btn.add(enter_lb, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 140, 50));

        body.add(enter_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 470, 140, 50));

        input_number.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        input_number.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        input_number.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                input_numberActionPerformed(evt);
            }
        });
        input_number.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                input_numberKeyPressed(evt);
            }
        });
        body.add(input_number, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 470, 140, 50));

        continue_btn.setBackground(new java.awt.Color(45, 50, 80));
        continue_btn.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        continue_lb.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        continue_lb.setForeground(new java.awt.Color(103, 111, 155));
        continue_lb.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        continue_lb.setText("CONTINUE");
        continue_lb.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                continue_lbMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                continue_lbMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                continue_lbMouseExited(evt);
            }
        });
        continue_btn.add(continue_lb, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 300, 50));

        body.add(continue_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 470, 300, 50));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(66, 71, 105));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("NUMBER");
        body.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 110, 110, -1));

        hidden_num.setBackground(new java.awt.Color(103, 111, 155));
        hidden_num.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        number_guess_label.setFont(new java.awt.Font("Tahoma", 1, 60)); // NOI18N
        number_guess_label.setForeground(new java.awt.Color(45, 50, 80));
        number_guess_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        number_guess_label.setText("?");
        hidden_num.add(number_guess_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 150, 140));

        body.add(hidden_num, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 240, 150, 140));

        message_label.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        message_label.setForeground(new java.awt.Color(66, 71, 105));
        message_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        message_label.setText("INPUT A NUMBER");
        body.add(message_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 420, 300, 30));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(66, 71, 105));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("1 - 100");
        body.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 170, 110, 30));

        back_menu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        back_lb.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        back_lb.setForeground(new java.awt.Color(103, 111, 155));
        back_lb.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        back_lb.setText("BACK TO MENU");
        back_lb.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                back_lbMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                back_lbMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                back_lbMouseExited(evt);
            }
        });
        back_menu.add(back_lb, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 300, 50));

        body.add(back_menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 530, 300, 50));

        l1.setBackground(new java.awt.Color(103, 111, 155));
        l1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        body.add(l1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 360, 10, 20));

        l2.setBackground(new java.awt.Color(103, 111, 155));
        l2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        body.add(l2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 330, 10, 20));

        l3.setBackground(new java.awt.Color(103, 111, 155));
        l3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        body.add(l3, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 300, 10, 20));

        l4.setBackground(new java.awt.Color(103, 111, 155));
        l4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        body.add(l4, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 270, 10, 20));

        l5.setBackground(new java.awt.Color(103, 111, 155));
        l5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        body.add(l5, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 240, 10, 20));

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
    int dialogResult = JOptionPane.showConfirmDialog(null, "Want to Stop the Game?", "Are You Sure", JOptionPane.YES_NO_OPTION, JOptionPane.ERROR_MESSAGE);
    if(dialogResult == 0) {
        System.exit(0);
    }
    }//GEN-LAST:event_close_labelMouseClicked

    private void close_labelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_close_labelMouseEntered
    color_scheme.close_setcolor(close);
    color_scheme.close_setcolor(close_label);
    }//GEN-LAST:event_close_labelMouseEntered

    private void close_labelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_close_labelMouseExited
    color_scheme.close_resetcolor(close);
    color_scheme.close_resetcolor(close_label);
    }//GEN-LAST:event_close_labelMouseExited

    private void enter_lbMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_enter_lbMouseClicked
    number_check();
    }//GEN-LAST:event_enter_lbMouseClicked

    private void enter_lbMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_enter_lbMouseEntered
color_scheme.close_setcolor(enter_btn);
color_scheme.close_setcolor(enter_lb);
    }//GEN-LAST:event_enter_lbMouseEntered

    private void enter_lbMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_enter_lbMouseExited
color_scheme.close_resetcolor(enter_btn);        
color_scheme.close_resetcolor(enter_lb);
    }//GEN-LAST:event_enter_lbMouseExited

    private void input_numberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_input_numberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_input_numberActionPerformed

    private void continue_lbMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_continue_lbMouseClicked
    continue_fn();
    }//GEN-LAST:event_continue_lbMouseClicked

    private void continue_lbMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_continue_lbMouseEntered
color_scheme.close_setcolor(continue_btn);
color_scheme.close_setcolor(continue_lb);
    }//GEN-LAST:event_continue_lbMouseEntered

    private void continue_lbMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_continue_lbMouseExited
color_scheme.close_resetcolor(continue_btn);
color_scheme.close_resetcolor(continue_lb);
    }//GEN-LAST:event_continue_lbMouseExited

    private void input_numberKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_input_numberKeyPressed
if(evt.getKeyCode()==KeyEvent.VK_ENTER)
{
    number_check();
}
    }//GEN-LAST:event_input_numberKeyPressed

    private void bodyKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_bodyKeyPressed

    }//GEN-LAST:event_bodyKeyPressed

    private void back_lbMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_back_lbMouseClicked
Welcome_Screen wel = new Welcome_Screen();
wel.setVisible(true);
this.dispose();
    }//GEN-LAST:event_back_lbMouseClicked

    private void back_lbMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_back_lbMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_back_lbMouseEntered

    private void back_lbMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_back_lbMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_back_lbMouseExited

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
                new Game().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel back_lb;
    private javax.swing.JPanel back_menu;
    private javax.swing.JPanel body;
    private javax.swing.JPanel close;
    private javax.swing.JLabel close_label;
    private javax.swing.JPanel continue_btn;
    private javax.swing.JLabel continue_lb;
    private javax.swing.JPanel enter_btn;
    private javax.swing.JLabel enter_lb;
    private javax.swing.JPanel hidden_num;
    private javax.swing.JTextField input_number;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel l1;
    private javax.swing.JPanel l2;
    private javax.swing.JPanel l3;
    private javax.swing.JPanel l4;
    private javax.swing.JPanel l5;
    private javax.swing.JLabel message_label;
    private javax.swing.JLabel number_guess_label;
    private javax.swing.JPanel titleBar;
    // End of variables declaration//GEN-END:variables
}
