/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.MusicPower.Apresentacao;

import br.edu.ifnmg.MusicPower.Entidades.Fornecedor;
import br.edu.ifnmg.MusicPower.Entidades.FornecedorRepositorio;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import muiscpowerapresentacao.MuiscPowerApresentacao;

/**
 *
 * @author marcos
 */
public class CadastrarFornecedor extends javax.swing.JFrame {

    Fornecedor novo = new Fornecedor();
    MuiscPowerApresentacao MPA = new MuiscPowerApresentacao();
    ListarFornecedores telaListarFornecedor;
    FornecedorRepositorio dao = GerenciadorDeReferencias.getFornecedor();
    /**
     * Creates new form CadastrarFornecedor
     */
    public CadastrarFornecedor() {
        initComponents();
    }
    
    CadastrarFornecedor(Fornecedor fornecedor, ListarFornecedores telaListarFornecedores){
        initComponents();
        this.preencherCampos(fornecedor);
        this.telaListarFornecedor = telaListarFornecedores;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlCadastrarFornecedor = new javax.swing.JPanel();
        lblNome = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        lblCnpj = new javax.swing.JLabel();
        txtCnpj = new javax.swing.JTextField();
        lblTelefone = new javax.swing.JLabel();
        txtTelefone = new javax.swing.JTextField();
        lblEmail = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        lblUF = new javax.swing.JLabel();
        txtUF = new javax.swing.JTextField();
        lblCidade = new javax.swing.JLabel();
        txtCidade = new javax.swing.JTextField();
        lblBairro = new javax.swing.JLabel();
        txtBairro = new javax.swing.JTextField();
        lblRua = new javax.swing.JLabel();
        txtRua = new javax.swing.JTextField();
        lblNEstabelecimento = new javax.swing.JLabel();
        txtNEstabelecimento = new javax.swing.JTextField();
        btnCadastrar = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        pnlCadastrarFornecedor.setBorder(javax.swing.BorderFactory.createTitledBorder("Cadastrar Fornecedor"));

        lblNome.setText("*Nome:");

        lblCnpj.setText("*Cnpj:");

        lblTelefone.setText("*Telefone:");

        lblEmail.setText("*Email:");

        lblUF.setText("*UF:");

        lblCidade.setText("*Cidade:");

        lblBairro.setText("*Bairro:");

        txtBairro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBairroActionPerformed(evt);
            }
        });

        lblRua.setText("*Rua:");

        lblNEstabelecimento.setText("*Nº Estabelecimento:");

        btnCadastrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/ifnmg/MusicPower/Apresentacao/Imagens/1473025465_save.png"))); // NOI18N
        btnCadastrar.setText("Cadastrar");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });

        btnSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/ifnmg/MusicPower/Apresentacao/Imagens/1473144169_logout.png"))); // NOI18N
        btnSair.setText("Sair");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/ifnmg/MusicPower/Apresentacao/Imagens/1474386963_Broom_stick.png"))); // NOI18N
        jButton1.setText("LImpar campos");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlCadastrarFornecedorLayout = new javax.swing.GroupLayout(pnlCadastrarFornecedor);
        pnlCadastrarFornecedor.setLayout(pnlCadastrarFornecedorLayout);
        pnlCadastrarFornecedorLayout.setHorizontalGroup(
            pnlCadastrarFornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCadastrarFornecedorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlCadastrarFornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblNEstabelecimento)
                    .addComponent(lblRua)
                    .addComponent(lblBairro)
                    .addComponent(lblCidade)
                    .addComponent(lblCnpj)
                    .addComponent(lblNome)
                    .addComponent(lblTelefone)
                    .addComponent(lblEmail)
                    .addComponent(lblUF))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlCadastrarFornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlCadastrarFornecedorLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton1)
                        .addGap(18, 18, 18)
                        .addComponent(btnCadastrar)
                        .addGap(18, 18, 18)
                        .addComponent(btnSair))
                    .addComponent(txtCnpj, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtNome)
                    .addComponent(txtEmail)
                    .addComponent(txtTelefone)
                    .addComponent(txtCidade)
                    .addComponent(txtBairro)
                    .addComponent(txtRua)
                    .addComponent(txtNEstabelecimento)
                    .addComponent(txtUF, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        pnlCadastrarFornecedorLayout.setVerticalGroup(
            pnlCadastrarFornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCadastrarFornecedorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlCadastrarFornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNome)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlCadastrarFornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCnpj)
                    .addComponent(txtCnpj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlCadastrarFornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTelefone)
                    .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlCadastrarFornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEmail)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlCadastrarFornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUF)
                    .addComponent(txtUF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlCadastrarFornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCidade)
                    .addComponent(txtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlCadastrarFornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblBairro)
                    .addComponent(txtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlCadastrarFornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRua)
                    .addComponent(txtRua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlCadastrarFornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNEstabelecimento)
                    .addComponent(txtNEstabelecimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlCadastrarFornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSair)
                    .addComponent(btnCadastrar)
                    .addComponent(jButton1))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlCadastrarFornecedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlCadastrarFornecedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtBairroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBairroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBairroActionPerformed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnSairActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.limparCampos();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        this.recuperarCampos();
        int codigo = novo.getId();
        
        try {
            if(codigo == 0){
                MPA.criarFornecedor(novo);
                this.limparCampos();
                JOptionPane.showMessageDialog(this, "Cadastro realizado com sucesso!!!");
            }
            else{
                dao.Alterar(novo);
                JOptionPane.showMessageDialog(this, "Fornecedor editada com sucesso!!!", "Mensagem de confirmação", JOptionPane.INFORMATION_MESSAGE);
                this.dispose();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Cadastro não realizado falha na conexao com o banco de dados: " + e.getMessage(), "Mensagem de erro", JOptionPane.ERROR_MESSAGE);
            Logger.getLogger(CadastrarFilial.class.getName()).log(Level.SEVERE, null, e);
        }
    }//GEN-LAST:event_btnCadastrarActionPerformed

    
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
            java.util.logging.Logger.getLogger(CadastrarFornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastrarFornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastrarFornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastrarFornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastrarFornecedor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnSair;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel lblBairro;
    private javax.swing.JLabel lblCidade;
    private javax.swing.JLabel lblCnpj;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblNEstabelecimento;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblRua;
    private javax.swing.JLabel lblTelefone;
    private javax.swing.JLabel lblUF;
    private javax.swing.JPanel pnlCadastrarFornecedor;
    private javax.swing.JTextField txtBairro;
    private javax.swing.JTextField txtCidade;
    private javax.swing.JTextField txtCnpj;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtNEstabelecimento;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtRua;
    private javax.swing.JTextField txtTelefone;
    private javax.swing.JTextField txtUF;
    // End of variables declaration//GEN-END:variables

    private void preencherCampos(Fornecedor fornecedor) {
        
        novo = fornecedor;
        txtBairro.setText(fornecedor.getBairro());
        txtCidade.setText(fornecedor.getCidade());
        txtCnpj.setText(fornecedor.getCnpj());
        txtEmail.setText(fornecedor.getEmail());
        txtNEstabelecimento.setText(fornecedor.getnEstabelecimento());
        txtNome.setText(fornecedor.getNome());
        txtRua.setText(fornecedor.getRua());
        txtTelefone.setText(fornecedor.getTelefone());
        txtUF.setText(fornecedor.getUF());
  
    }

    private void limparCampos() {
        
        txtBairro.setText("");
        txtCidade.setText("");
        txtCnpj.setText("");
        txtEmail.setText("");
        txtNEstabelecimento.setText("");
        txtNome.setText("");
        txtRua.setText("");
        txtTelefone.setText("");
        txtUF.setText("");
        
    }

    private void recuperarCampos() {
        
        String bairro = txtBairro.getText().trim();
        if(!bairro.equals("")){
            novo.setBairro(bairro);
        }else{
            JOptionPane.showMessageDialog(this, "ERRO, O CAMPO BAIRRO É OBRIGATORIO");
        }
        
        String cidade = txtCidade.getText().trim();
        if (!cidade.equals("")) {
            novo.setCidade(cidade);
        } else {
            JOptionPane.showMessageDialog(this, "ERRO, O CAMPO CIDADE É OBRIGATORIO");
        }
        
        String cnpj = txtCnpj.getText().trim();
        if (!cnpj.equals("")) {
            novo.setCnpj(cnpj);
        } else {
            JOptionPane.showMessageDialog(this, "ERRO, O CAMPO CNPJ É OBRIGATORIO");
        }
        
        String email = txtEmail.getText().trim();
        if (!email.equals("")) {
            novo.setEmail(email);
        } else {
            JOptionPane.showMessageDialog(this, "ERRO, O CAMPO E-MAIL É OBRIGATORIO");
        }
        
        String nestabelecimento = txtNEstabelecimento.getText().trim();
        if (!nestabelecimento.equals("")) {
            novo.setnEstabelecimento(nestabelecimento);
        } else {
            JOptionPane.showMessageDialog(this, "ERRO, O CAMPO N° ESTABELECIMENTO É OBRIGATORIO");
        }
        
        String nome = txtNome.getText().trim();
        if (!nome.equals("")) {
            novo.setNome(nome);
        } else {
            JOptionPane.showMessageDialog(this, "ERRO, O CAMPO NOME É OBRIGATORIO");
        }
        
        String rua = txtRua.getText().trim();
        if (!rua.equals("")) {
            novo.setRua(rua);
        } else {
            JOptionPane.showMessageDialog(this, "ERRO, O CAMPO RUA É OBRIGATORIO");
        }
        
        String telefone = txtTelefone.getText().trim();
        if (!telefone.equals("")) {
            novo.setTelefone(telefone);
        } else {
            JOptionPane.showMessageDialog(this, "ERRO, O CAMPO TELEFONE É OBRIGATORIO");
        }
        
        String uf = txtUF.getText().trim();
        if (!uf.equals("")) {
            novo.setUF(uf);
        } else {
            JOptionPane.showMessageDialog(this, "ERRO, O CAMPO  UF É OBRIGATORIO");
        }
        
    }
}
