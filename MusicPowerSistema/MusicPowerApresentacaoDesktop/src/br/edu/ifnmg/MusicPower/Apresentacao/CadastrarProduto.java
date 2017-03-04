/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.MusicPower.Apresentacao;

import br.edu.ifnmg.MusicPower.Entidades.Cliente;
import br.edu.ifnmg.MusicPower.Entidades.ClienteRepositorio;
import br.edu.ifnmg.MusicPower.Entidades.Produto;
import br.edu.ifnmg.MusicPower.Entidades.ProdutoRepositorio;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import muiscpowerapresentacao.MuiscPowerApresentacao;

/**
 *
 * @author marcos
 */
public class CadastrarProduto extends javax.swing.JFrame {
    
    Produto novo = new Produto();
    MuiscPowerApresentacao MPA = new MuiscPowerApresentacao();
    ListarProdutos telalistarProduto;
    ProdutoRepositorio dao = GerenciadorDeReferencias.getProduto();
    
    /**
     * Creates new form CadastrarCliente
     */
    public CadastrarProduto() {
        initComponents();
    }
    
    CadastrarProduto(Produto produto,ListarProdutos telalistarProduto){
        
        initComponents();
        this.preencherCampos(produto);
        this.telalistarProduto = telalistarProduto;
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        pnlCadastrarCliente = new javax.swing.JPanel();
        lblNome = new javax.swing.JLabel();
        txtDescricao = new javax.swing.JTextField();
        lblTelefone = new javax.swing.JLabel();
        txtQuantidade = new javax.swing.JTextField();
        lblEmail = new javax.swing.JLabel();
        txtValor = new javax.swing.JTextField();
        lblCidade = new javax.swing.JLabel();
        txtLote = new javax.swing.JTextField();
        btnCadastar = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        txtMarca = new javax.swing.JTextField();
        lblNome1 = new javax.swing.JLabel();
        txtModelo = new javax.swing.JTextField();
        lblNome2 = new javax.swing.JLabel();

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        pnlCadastrarCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Cadastrar Produto"));

        lblNome.setText("*Descrição:");

        lblTelefone.setText("*Quantidade:");

        lblEmail.setText("*Valor:");

        lblCidade.setText("*Lote:");

        btnCadastar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/ifnmg/MusicPower/Apresentacao/Imagens/1473025465_save.png"))); // NOI18N
        btnCadastar.setText("Cadastrar");
        btnCadastar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastarActionPerformed(evt);
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
        jButton1.setText("Limpar campos");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        lblNome1.setText("*marca:");

        lblNome2.setText("*Modelo:");

        javax.swing.GroupLayout pnlCadastrarClienteLayout = new javax.swing.GroupLayout(pnlCadastrarCliente);
        pnlCadastrarCliente.setLayout(pnlCadastrarClienteLayout);
        pnlCadastrarClienteLayout.setHorizontalGroup(
            pnlCadastrarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCadastrarClienteLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(pnlCadastrarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblNome1)
                    .addComponent(lblNome)
                    .addComponent(lblNome2)
                    .addComponent(lblTelefone)
                    .addComponent(lblEmail)
                    .addComponent(lblCidade))
                .addGap(32, 32, 32)
                .addGroup(pnlCadastrarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtModelo)
                    .addComponent(txtMarca)
                    .addComponent(txtDescricao)
                    .addComponent(txtQuantidade)
                    .addComponent(txtValor)
                    .addComponent(txtLote)
                    .addGroup(pnlCadastrarClienteLayout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCadastar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                        .addComponent(btnSair)))
                .addContainerGap())
        );
        pnlCadastrarClienteLayout.setVerticalGroup(
            pnlCadastrarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCadastrarClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlCadastrarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNome)
                    .addComponent(txtDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlCadastrarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNome1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlCadastrarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNome2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(pnlCadastrarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTelefone)
                    .addComponent(txtQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlCadastrarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEmail))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlCadastrarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtLote, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCidade))
                .addGap(28, 28, 28)
                .addGroup(pnlCadastrarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(btnCadastar)
                    .addComponent(btnSair))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlCadastrarCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlCadastrarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlCadastrarCliente.getAccessibleContext().setAccessibleName("Cadastrar Produto");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnSairActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        limparCampos();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnCadastarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastarActionPerformed
       
        try {
            this.recuperarCampos();
            int codigo = novo.getId();
            if (codigo == 0) {
                MPA.criarProduto(novo);
                this.limparCampos();
                JOptionPane.showMessageDialog(this, "Cadastro realizado com sucesso!!!");      
             } else {
                dao.Alterar(novo);
                JOptionPane.showMessageDialog(this, "Produto editado com sucesso!!!", "Mensagem de confirmação", JOptionPane.INFORMATION_MESSAGE);
                this.dispose();
             }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Cadastro não realizado falha na conexao com o banco de dados: " + e.getMessage(), "Mensagem de erro", JOptionPane.ERROR_MESSAGE);
            Logger.getLogger(CadastrarFilial.class.getName()).log(Level.SEVERE, null, e);
        }
      
    }//GEN-LAST:event_btnCadastarActionPerformed

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
            java.util.logging.Logger.getLogger(CadastrarProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastrarProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastrarProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastrarProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastrarProduto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastar;
    private javax.swing.JButton btnSair;
    private javax.swing.JButton jButton1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel lblCidade;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblNome1;
    private javax.swing.JLabel lblNome2;
    private javax.swing.JLabel lblTelefone;
    private javax.swing.JPanel pnlCadastrarCliente;
    private javax.swing.JTextField txtDescricao;
    private javax.swing.JTextField txtLote;
    private javax.swing.JTextField txtMarca;
    private javax.swing.JTextField txtModelo;
    private javax.swing.JTextField txtQuantidade;
    private javax.swing.JTextField txtValor;
    // End of variables declaration//GEN-END:variables

    private void limparCampos() {
        
        txtDescricao.setText("");
        txtMarca.setText("");
        txtModelo.setText("");
        txtQuantidade.setText("");
        txtValor.setText("");
        txtLote.setText("");
        
    }

    private void recuperarCampos() throws ParseException {

        String descricao = txtDescricao.getText().trim();
        if(!descricao.equals("")){
            novo.setDescricao(descricao);
        }
        
        String marca = txtMarca.getText().trim();
        if(!marca.equals("")){
            novo.setMarca(marca);
        }
        
        String modelo = txtModelo.getText().trim();
        if(!modelo.equals("")){
            novo.setModelo(modelo);
        }
        
        int qtd = Integer.parseInt(txtQuantidade.getText());
        if(qtd !=0){
            novo.setQtd(qtd);
        }
        
        Double valor = Double.parseDouble(txtValor.getText());
        if(valor != 0){
            novo.setValor(valor);
        }
        
        String lote = txtLote.getText().trim();
        if(!lote.equals("")){
            novo.setLote(lote);
        }
        
    }

    private void preencherCampos(Produto produto) {
        String qtd = String.valueOf(produto.getQtd());
        String valor = String.valueOf(produto.getValor());
        
        novo = produto;
        txtDescricao.setText(produto.getDescricao());
        txtMarca.setText(produto.getMarca());
        txtModelo.setText(produto.getModelo());
        txtQuantidade.setText(qtd);
        txtValor.setText(valor);
        txtLote.setText(produto.getLote());
        
    }
}