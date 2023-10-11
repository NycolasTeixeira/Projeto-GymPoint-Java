package Desktop.Views;

import Entities.User;

public class HomeUser extends javax.swing.JFrame {

    private final User user;

    public HomeUser(User user) {
        this.user = user;
        initComponents();
        this.userName.setText("Olá "+user.getNome());
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnCheckIn = new javax.swing.JButton();
        btnProfile = new javax.swing.JButton();
        btnMakeCheckIn = new javax.swing.JButton();
        userName = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        menuItemProfile = new javax.swing.JMenuItem();
        menuItemCheckIns = new javax.swing.JMenuItem();
        menuItemMakeCheckIn = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Home");
        setResizable(false);

        btnCheckIn.setFont(new java.awt.Font("JetBrainsMono NF", 0, 18)); // NOI18N
        btnCheckIn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Desktop/Assets/search.png"))); // NOI18N
        btnCheckIn.setText("Check-ins");
        btnCheckIn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCheckIn.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnCheckIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCheckInActionPerformed(evt);
            }
        });

        btnProfile.setFont(new java.awt.Font("JetBrainsMono NF", 0, 18)); // NOI18N
        btnProfile.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Desktop/Assets/user.png"))); // NOI18N
        btnProfile.setText("Perfil");
        btnProfile.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnProfile.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnProfile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProfileActionPerformed(evt);
            }
        });

        btnMakeCheckIn.setFont(new java.awt.Font("JetBrainsMono NF", 0, 18)); // NOI18N
        btnMakeCheckIn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Desktop/Assets/check-in.png"))); // NOI18N
        btnMakeCheckIn.setText("Fazer Check-in");
        btnMakeCheckIn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnMakeCheckIn.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnMakeCheckIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMakeCheckInActionPerformed(evt);
            }
        });

        userName.setFont(new java.awt.Font("Fira Sans", 0, 24)); // NOI18N
        userName.setText("Olá, Gustavo");

        jLabel2.setFont(new java.awt.Font("Fira Sans", 0, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Nº de Check-ins: 0 ");

        jMenu1.setText("Página incial");

        menuItemProfile.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.CTRL_MASK));
        menuItemProfile.setText("Perfil");
        menuItemProfile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemProfileActionPerformed(evt);
            }
        });
        jMenu1.add(menuItemProfile);

        menuItemCheckIns.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_W, java.awt.event.InputEvent.CTRL_MASK));
        menuItemCheckIns.setText("Check-ins");
        menuItemCheckIns.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemCheckInsActionPerformed(evt);
            }
        });
        jMenu1.add(menuItemCheckIns);

        menuItemMakeCheckIn.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_MASK));
        menuItemMakeCheckIn.setText("Fazer check-in");
        menuItemMakeCheckIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemMakeCheckInActionPerformed(evt);
            }
        });
        jMenu1.add(menuItemMakeCheckIn);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(userName, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnMakeCheckIn, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnCheckIn, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnProfile, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(userName, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnProfile, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMakeCheckIn, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCheckIn, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(44, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCheckInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCheckInActionPerformed
       // new CheckIns(this.userId).setVisible(true);
    }//GEN-LAST:event_btnCheckInActionPerformed

    private void btnProfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProfileActionPerformed
        //new Profile(this.userId).setVisible(true);
    }//GEN-LAST:event_btnProfileActionPerformed

    private void btnMakeCheckInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMakeCheckInActionPerformed
     this.dispose();
     new MakeCheckIn(user.getId()).setVisible(true);
    }//GEN-LAST:event_btnMakeCheckInActionPerformed

    private void menuItemProfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemProfileActionPerformed
       // new Profile(this.userId).setVisible(true);
    }//GEN-LAST:event_menuItemProfileActionPerformed

    private void menuItemCheckInsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemCheckInsActionPerformed
       // new CheckIns(this.userId).setVisible(true);
    }//GEN-LAST:event_menuItemCheckInsActionPerformed

    private void menuItemMakeCheckInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemMakeCheckInActionPerformed
       // new MakeCheckIn(this.userId).setVisible(true);
    }//GEN-LAST:event_menuItemMakeCheckInActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCheckIn;
    private javax.swing.JButton btnMakeCheckIn;
    private javax.swing.JButton btnProfile;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem menuItemCheckIns;
    private javax.swing.JMenuItem menuItemMakeCheckIn;
    private javax.swing.JMenuItem menuItemProfile;
    private javax.swing.JLabel userName;
    // End of variables declaration//GEN-END:variables
}
