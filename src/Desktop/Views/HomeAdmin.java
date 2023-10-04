package Desktop.Views;

import Entities.User;

public class HomeAdmin extends javax.swing.JFrame {

    private final User user;

    public HomeAdmin(User user) {
        this.user = user;
        initComponents();
        this.jLabel1.setText("Olá "+user.getNome());
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnCreateGym = new javax.swing.JButton();
        btnProfile = new javax.swing.JButton();
        btnValidateCheckIn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnUserAdd = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        menuItemProfile = new javax.swing.JMenuItem();
        menuItemCreateGym = new javax.swing.JMenuItem();
        menuItemUserAdd = new javax.swing.JMenuItem();
        menuItemValidateCheckIn = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Home");
        setResizable(false);

        btnCreateGym.setFont(new java.awt.Font("JetBrainsMono NF", 0, 18)); // NOI18N
        btnCreateGym.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Desktop/Assets/gym.png"))); // NOI18N
        btnCreateGym.setText("Cadastrar Academia");
        btnCreateGym.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCreateGym.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnCreateGym.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateGymActionPerformed(evt);
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

        btnValidateCheckIn.setFont(new java.awt.Font("JetBrainsMono NF", 0, 18)); // NOI18N
        btnValidateCheckIn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Desktop/Assets/check-in.png"))); // NOI18N
        btnValidateCheckIn.setText("Validar Check-in");
        btnValidateCheckIn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnValidateCheckIn.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnValidateCheckIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnValidateCheckInActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Fira Sans", 0, 24)); // NOI18N
        jLabel1.setText("Olá, Gustavo");

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Desktop/Assets/logo-smaller.png"))); // NOI18N

        btnUserAdd.setFont(new java.awt.Font("JetBrainsMono NF", 0, 18)); // NOI18N
        btnUserAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Desktop/Assets/user-add.png"))); // NOI18N
        btnUserAdd.setText("Registrar Usuário");
        btnUserAdd.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnUserAdd.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnUserAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUserAddActionPerformed(evt);
            }
        });

        jMenu1.setText("Página incial");

        menuItemProfile.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        menuItemProfile.setText("Perfil");
        menuItemProfile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemProfileActionPerformed(evt);
            }
        });
        jMenu1.add(menuItemProfile);

        menuItemCreateGym.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_W, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        menuItemCreateGym.setText("Cadastrar academia");
        menuItemCreateGym.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemCreateGymActionPerformed(evt);
            }
        });
        jMenu1.add(menuItemCreateGym);

        menuItemUserAdd.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        menuItemUserAdd.setText("Registrar usuario");
        menuItemUserAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemUserAddActionPerformed(evt);
            }
        });
        jMenu1.add(menuItemUserAdd);

        menuItemValidateCheckIn.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_T, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        menuItemValidateCheckIn.setText("Validar check-in");
        menuItemValidateCheckIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemValidateCheckInActionPerformed(evt);
            }
        });
        jMenu1.add(menuItemValidateCheckIn);

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
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btnProfile, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnCreateGym, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 266, Short.MAX_VALUE)
                            .addComponent(btnValidateCheckIn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnUserAdd, javax.swing.GroupLayout.DEFAULT_SIZE, 272, Short.MAX_VALUE)))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnValidateCheckIn, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnUserAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnCreateGym, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnProfile, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCreateGymActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateGymActionPerformed
        new CreateGym().setVisible(true);
    }//GEN-LAST:event_btnCreateGymActionPerformed

    private void btnProfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProfileActionPerformed
        //new Profile(this.userId).setVisible(true);
    }//GEN-LAST:event_btnProfileActionPerformed

    private void btnValidateCheckInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnValidateCheckInActionPerformed
        //new ValidateCheckIn(userId).setVisible(true);
    }//GEN-LAST:event_btnValidateCheckInActionPerformed

    private void btnUserAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUserAddActionPerformed
        new Register().setVisible(true);
    }//GEN-LAST:event_btnUserAddActionPerformed

    private void menuItemProfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemProfileActionPerformed
        //new Profile(this.userId).setVisible(true);
    }//GEN-LAST:event_menuItemProfileActionPerformed

    private void menuItemCreateGymActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemCreateGymActionPerformed
        new CreateGym().setVisible(true);
    }//GEN-LAST:event_menuItemCreateGymActionPerformed

    private void menuItemUserAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemUserAddActionPerformed
        new Register().setVisible(true);
    }//GEN-LAST:event_menuItemUserAddActionPerformed

    private void menuItemValidateCheckInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemValidateCheckInActionPerformed
        //new ValidateCheckIn(userId).setVisible(true);
    }//GEN-LAST:event_menuItemValidateCheckInActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCreateGym;
    private javax.swing.JButton btnProfile;
    private javax.swing.JButton btnUserAdd;
    private javax.swing.JButton btnValidateCheckIn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem menuItemCreateGym;
    private javax.swing.JMenuItem menuItemProfile;
    private javax.swing.JMenuItem menuItemUserAdd;
    private javax.swing.JMenuItem menuItemValidateCheckIn;
    // End of variables declaration//GEN-END:variables
}
