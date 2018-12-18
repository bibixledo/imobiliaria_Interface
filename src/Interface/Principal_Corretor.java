package Interface;

/**
 *
 * @author Lêdo
 */
public class Principal_Corretor extends javax.swing.JFrame {
    public Principal_Corretor() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktop_principal = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        menu_cadastrar = new javax.swing.JMenu();
        menu_cadastrarDono = new javax.swing.JMenuItem();
        menu_cadastrarImovel = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        menu_pesquisarImovel = new javax.swing.JMenuItem();
        menu_pesquisarClienteDono = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        menu_registroAluguel = new javax.swing.JMenuItem();
        menu_registroVenda = new javax.swing.JMenuItem();
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

        menu_cadastrarDono.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/user_add.png"))); // NOI18N
        menu_cadastrarDono.setText("Dono");
        menu_cadastrarDono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_cadastrarDonoActionPerformed(evt);
            }
        });
        menu_cadastrar.add(menu_cadastrarDono);

        menu_cadastrarImovel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/casa1.png"))); // NOI18N
        menu_cadastrarImovel.setText("Imovel");
        menu_cadastrarImovel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_cadastrarImovelActionPerformed(evt);
            }
        });
        menu_cadastrar.add(menu_cadastrarImovel);

        jMenuBar1.add(menu_cadastrar);

        jMenu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/zoom.png"))); // NOI18N
        jMenu3.setText("Pesquisar");

        menu_pesquisarImovel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/casa1.png"))); // NOI18N
        menu_pesquisarImovel.setText("Imóveis");
        menu_pesquisarImovel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_pesquisarImovelActionPerformed(evt);
            }
        });
        jMenu3.add(menu_pesquisarImovel);

        menu_pesquisarClienteDono.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/user.png"))); // NOI18N
        menu_pesquisarClienteDono.setText("Clientes/Donos");
        menu_pesquisarClienteDono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_pesquisarClienteDonoActionPerformed(evt);
            }
        });
        jMenu3.add(menu_pesquisarClienteDono);

        jMenuBar1.add(jMenu3);

        jMenu4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/dinheiro1.png"))); // NOI18N
        jMenu4.setText("Financeiro");
        jMenuBar1.add(jMenu4);
        jMenuBar1.add(jMenu2);

        jMenu5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/page.png"))); // NOI18N
        jMenu5.setText("Registros");

        menu_registroAluguel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/dinheiro2.png"))); // NOI18N
        menu_registroAluguel.setText("Aluguel");
        menu_registroAluguel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_registroAluguelActionPerformed(evt);
            }
        });
        jMenu5.add(menu_registroAluguel);

        menu_registroVenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/dinheiro3.png"))); // NOI18N
        menu_registroVenda.setText("Venda");
        menu_registroVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_registroVendaActionPerformed(evt);
            }
        });
        jMenu5.add(menu_registroVenda);

        jMenuBar1.add(jMenu5);

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

    private void menu_cadastrarDonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_cadastrarDonoActionPerformed
        Cadastrar_Dono telaCadastrarDono = new Cadastrar_Dono();
        desktop_principal.add(telaCadastrarDono);
        telaCadastrarDono.setVisible(true);
    }//GEN-LAST:event_menu_cadastrarDonoActionPerformed

    private void menu_cadastrarImovelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_cadastrarImovelActionPerformed
         Cadastrar_Imovel telaCadastrarImovel = new Cadastrar_Imovel();
        desktop_principal.add(telaCadastrarImovel);
        telaCadastrarImovel.setVisible(true);
    }//GEN-LAST:event_menu_cadastrarImovelActionPerformed


    private void menu_pesquisarClienteDonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_pesquisarClienteDonoActionPerformed
        Pesquisar_ClienteDonoCorretor telaPesquisarClienteDono = new  Pesquisar_ClienteDonoCorretor();
        desktop_principal.add(telaPesquisarClienteDono);
        telaPesquisarClienteDono.setVisible(true);
    }//GEN-LAST:event_menu_pesquisarClienteDonoActionPerformed
 
    private void menu_pesquisarImovelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_pesquisarImovelActionPerformed
        Pesquisar_Imovel telaPesquisarImovel = new  Pesquisar_Imovel();
        desktop_principal.add(telaPesquisarImovel);
        telaPesquisarImovel.setVisible(true);
    }//GEN-LAST:event_menu_pesquisarImovelActionPerformed

    private void menu_registroAluguelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_registroAluguelActionPerformed
        Registro_Aluguel telaRegistroAluguel = new  Registro_Aluguel();
        desktop_principal.add(telaRegistroAluguel );
        telaRegistroAluguel.setVisible(true);
    }//GEN-LAST:event_menu_registroAluguelActionPerformed

    private void menu_registroVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_registroVendaActionPerformed
        Registro_Venda telaRegistroVenda = new Registro_Venda ();
        desktop_principal.add(telaRegistroVenda);
        telaRegistroVenda.setVisible(true);
       
    }//GEN-LAST:event_menu_registroVendaActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane desktop_principal;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu menu_cadastrar;
    private javax.swing.JMenuItem menu_cadastrarDono;
    private javax.swing.JMenuItem menu_cadastrarImovel;
    private javax.swing.JMenuItem menu_pesquisarClienteDono;
    private javax.swing.JMenuItem menu_pesquisarImovel;
    private javax.swing.JMenuItem menu_registroAluguel;
    private javax.swing.JMenuItem menu_registroVenda;
    // End of variables declaration//GEN-END:variables
}
