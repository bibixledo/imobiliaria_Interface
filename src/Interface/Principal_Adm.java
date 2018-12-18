package Interface;

/**
 *
 * @author Lêdo
 */
public class Principal_Adm extends javax.swing.JFrame {
    public Principal_Adm() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktop_principal = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        menu_cadastrar = new javax.swing.JMenu();
        menu_cadastrarCorretor = new javax.swing.JMenuItem();
        menu_cadastrarCliente = new javax.swing.JMenuItem();
        menu_cadastrarImovel = new javax.swing.JMenuItem();
        menu_pesquisar = new javax.swing.JMenu();
        menu_editarCorretor = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenu1 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        desktop_principal.setBackground(new java.awt.Color(255, 255, 204));

        javax.swing.GroupLayout desktop_principalLayout = new javax.swing.GroupLayout(desktop_principal);
        desktop_principal.setLayout(desktop_principalLayout);
        desktop_principalLayout.setHorizontalGroup(
            desktop_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 631, Short.MAX_VALUE)
        );
        desktop_principalLayout.setVerticalGroup(
            desktop_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 347, Short.MAX_VALUE)
        );

        menu_cadastrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/group_add.png"))); // NOI18N
        menu_cadastrar.setText("Cadastrar ");

        menu_cadastrarCorretor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/user_add.png"))); // NOI18N
        menu_cadastrarCorretor.setText("Corretor");
        menu_cadastrarCorretor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_cadastrarCorretorActionPerformed(evt);
            }
        });
        menu_cadastrar.add(menu_cadastrarCorretor);

        menu_cadastrarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/user_add.png"))); // NOI18N
        menu_cadastrarCliente.setText("Cliente");
        menu_cadastrarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_cadastrarClienteActionPerformed(evt);
            }
        });
        menu_cadastrar.add(menu_cadastrarCliente);

        menu_cadastrarImovel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/casa1.png"))); // NOI18N
        menu_cadastrarImovel.setText("Imovel");
        menu_cadastrarImovel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_cadastrarImovelActionPerformed(evt);
            }
        });
        menu_cadastrar.add(menu_cadastrarImovel);

        jMenuBar1.add(menu_cadastrar);

        menu_pesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/zoom.png"))); // NOI18N
        menu_pesquisar.setText("Pesquisar");

        menu_editarCorretor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/user.png"))); // NOI18N
        menu_editarCorretor.setText("Corretores");
        menu_editarCorretor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_editarCorretorActionPerformed(evt);
            }
        });
        menu_pesquisar.add(menu_editarCorretor);

        jMenuBar1.add(menu_pesquisar);
        jMenuBar1.add(jMenu2);

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/information.png"))); // NOI18N
        jMenu1.setText("Sobre");
        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktop_principal, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktop_principal, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menu_cadastrarCorretorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_cadastrarCorretorActionPerformed
        Cadastrar_Dono telaCadastrarDono = new Cadastrar_Dono();
        desktop_principal.add(telaCadastrarDono);
        telaCadastrarDono.setVisible(true);
    }//GEN-LAST:event_menu_cadastrarCorretorActionPerformed

    private void menu_cadastrarImovelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_cadastrarImovelActionPerformed
         Cadastrar_Imovel telaCadastrarImovel = new Cadastrar_Imovel();
        desktop_principal.add(telaCadastrarImovel);
        telaCadastrarImovel.setVisible(true);
    }//GEN-LAST:event_menu_cadastrarImovelActionPerformed

    private void menu_editarCorretorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_editarCorretorActionPerformed
        Pesquisar_ClienteDonoCorretor telaPesquisarClienteDono = new  Pesquisar_ClienteDonoCorretor();
        desktop_principal.add(telaPesquisarClienteDono);
        telaPesquisarClienteDono.setVisible(true);
    }//GEN-LAST:event_menu_editarCorretorActionPerformed

    private void menu_cadastrarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_cadastrarClienteActionPerformed
        Cadastrar_Cliente telaCadastrarCliente = new  Cadastrar_Cliente();
        desktop_principal.add(telaCadastrarCliente);
        telaCadastrarCliente.setVisible(true);
    }//GEN-LAST:event_menu_cadastrarClienteActionPerformed

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
            java.util.logging.Logger.getLogger(Principal_Adm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal_Adm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal_Adm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal_Adm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal_Adm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane desktop_principal;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu menu_cadastrar;
    private javax.swing.JMenuItem menu_cadastrarCliente;
    private javax.swing.JMenuItem menu_cadastrarCorretor;
    private javax.swing.JMenuItem menu_cadastrarImovel;
    private javax.swing.JMenuItem menu_editarCorretor;
    private javax.swing.JMenu menu_pesquisar;
    // End of variables declaration//GEN-END:variables
}
