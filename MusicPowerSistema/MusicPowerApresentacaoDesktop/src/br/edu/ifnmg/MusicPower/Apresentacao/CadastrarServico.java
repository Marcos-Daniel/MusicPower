/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.MusicPower.Apresentacao;

import br.edu.ifnmg.MusicPower.Entidades.Cliente;
import br.edu.ifnmg.MusicPower.Entidades.ClienteRepositorio;
import br.edu.ifnmg.MusicPower.Entidades.Funcionario;
import br.edu.ifnmg.MusicPower.Entidades.FuncionarioRepositorio;
import br.edu.ifnmg.MusicPower.Entidades.Serviço;
import br.edu.ifnmg.MusicPower.Entidades.ServiçoRepositorio;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author marcos
 */
public class CadastrarServico extends javax.swing.JFrame {
    
    Cliente novoCliente = new Cliente();
    Funcionario novoFuncionario = new Funcionario();
    Serviço novoServico = new Serviço();
    ClienteRepositorio daoCliente = GerenciadorDeReferencias.getCliente();
    FuncionarioRepositorio daoFuncionario = GerenciadorDeReferencias.getFuncionario();
    ServiçoRepositorio daoServico = GerenciadorDeReferencias.getServiço();
    /**
     * Creates new form CadastrarServiços
     */
    public CadastrarServico() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFormattedTextField1 = new javax.swing.JFormattedTextField();
        pnlCadastrarServico = new javax.swing.JPanel();
        pnlIdentificarCliente = new javax.swing.JPanel();
        lblId = new javax.swing.JLabel();
        lblNome = new javax.swing.JLabel();
        txtIdFuncinario = new javax.swing.JTextField();
        txtNomeFuncionario = new javax.swing.JTextField();
        pnlDadosDoServiço = new javax.swing.JPanel();
        lblDescricao = new javax.swing.JLabel();
        txtDescricao = new javax.swing.JTextField();
        lblDataDaSolicitacao = new javax.swing.JLabel();
        txtDataSolicitacao = new javax.swing.JFormattedTextField();
        lblDataEntrega = new javax.swing.JLabel();
        txtDataEntrega = new javax.swing.JFormattedTextField();
        lblValor = new javax.swing.JLabel();
        txtValor = new javax.swing.JFormattedTextField();
        txtStatusPagamanto = new javax.swing.JTextField();
        txtStatusProgresso = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnSair = new javax.swing.JButton();
        btnCadastrar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        pnlIdentificarCliente1 = new javax.swing.JPanel();
        lblId1 = new javax.swing.JLabel();
        lblNome1 = new javax.swing.JLabel();
        txtIdCliente = new javax.swing.JTextField();
        txtNomeCliente = new javax.swing.JTextField();

        jFormattedTextField1.setText("jFormattedTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnlCadastrarServico.setBorder(javax.swing.BorderFactory.createTitledBorder("Cadastrar serviço"));

        pnlIdentificarCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("identificar funcionario"));

        lblId.setText("Id:");

        lblNome.setText("*Nome:");

        javax.swing.GroupLayout pnlIdentificarClienteLayout = new javax.swing.GroupLayout(pnlIdentificarCliente);
        pnlIdentificarCliente.setLayout(pnlIdentificarClienteLayout);
        pnlIdentificarClienteLayout.setHorizontalGroup(
            pnlIdentificarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlIdentificarClienteLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(pnlIdentificarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblId)
                    .addComponent(lblNome))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlIdentificarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtIdFuncinario)
                    .addComponent(txtNomeFuncionario))
                .addContainerGap())
        );
        pnlIdentificarClienteLayout.setVerticalGroup(
            pnlIdentificarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlIdentificarClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlIdentificarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblId)
                    .addComponent(txtIdFuncinario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlIdentificarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNome)
                    .addComponent(txtNomeFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlDadosDoServiço.setBorder(javax.swing.BorderFactory.createTitledBorder("Dados do serviço"));

        lblDescricao.setText("*Descrição:");

        lblDataDaSolicitacao.setText("*Data da solicitação:");

        txtDataSolicitacao.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter()));
        txtDataSolicitacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDataSolicitacaoActionPerformed(evt);
            }
        });

        lblDataEntrega.setText("*Data da entrega:");

        txtDataEntrega.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter()));

        lblValor.setText("*Valor:");

        txtStatusPagamanto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtStatusPagamantoActionPerformed(evt);
            }
        });

        jLabel1.setText("*StatusPagamento:");

        jLabel2.setText("*StatusProcesso:");

        javax.swing.GroupLayout pnlDadosDoServiçoLayout = new javax.swing.GroupLayout(pnlDadosDoServiço);
        pnlDadosDoServiço.setLayout(pnlDadosDoServiçoLayout);
        pnlDadosDoServiçoLayout.setHorizontalGroup(
            pnlDadosDoServiçoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDadosDoServiçoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlDadosDoServiçoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlDadosDoServiçoLayout.createSequentialGroup()
                        .addGroup(pnlDadosDoServiçoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlDadosDoServiçoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(lblValor)
                                .addComponent(lblDataEntrega)
                                .addComponent(lblDataDaSolicitacao)
                                .addComponent(lblDescricao))
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(20, 20, 20))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlDadosDoServiçoLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)))
                .addGroup(pnlDadosDoServiçoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtStatusPagamanto)
                    .addComponent(txtDescricao, javax.swing.GroupLayout.DEFAULT_SIZE, 338, Short.MAX_VALUE)
                    .addComponent(txtDataSolicitacao)
                    .addComponent(txtDataEntrega)
                    .addComponent(txtValor)
                    .addComponent(txtStatusProgresso))
                .addContainerGap())
        );
        pnlDadosDoServiçoLayout.setVerticalGroup(
            pnlDadosDoServiçoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDadosDoServiçoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlDadosDoServiçoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDescricao)
                    .addComponent(txtDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlDadosDoServiçoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDataDaSolicitacao)
                    .addComponent(txtDataSolicitacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlDadosDoServiçoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDataEntrega)
                    .addComponent(txtDataEntrega, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlDadosDoServiçoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblValor)
                    .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlDadosDoServiçoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtStatusPagamanto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlDadosDoServiçoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtStatusProgresso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/ifnmg/MusicPower/Apresentacao/Imagens/1473144169_logout.png"))); // NOI18N
        btnSair.setText("Sair");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        btnCadastrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/ifnmg/MusicPower/Apresentacao/Imagens/1473025465_save.png"))); // NOI18N
        btnCadastrar.setText("Cadastrar");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/ifnmg/MusicPower/Apresentacao/Imagens/1474386963_Broom_stick.png"))); // NOI18N
        jButton1.setText("Limpar campos");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        pnlIdentificarCliente1.setBorder(javax.swing.BorderFactory.createTitledBorder("Identificar cliente"));

        lblId1.setText("Id:");

        lblNome1.setText("*Nome:");

        javax.swing.GroupLayout pnlIdentificarCliente1Layout = new javax.swing.GroupLayout(pnlIdentificarCliente1);
        pnlIdentificarCliente1.setLayout(pnlIdentificarCliente1Layout);
        pnlIdentificarCliente1Layout.setHorizontalGroup(
            pnlIdentificarCliente1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlIdentificarCliente1Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(pnlIdentificarCliente1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblId1)
                    .addComponent(lblNome1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlIdentificarCliente1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtIdCliente)
                    .addComponent(txtNomeCliente))
                .addContainerGap())
        );
        pnlIdentificarCliente1Layout.setVerticalGroup(
            pnlIdentificarCliente1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlIdentificarCliente1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlIdentificarCliente1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblId1)
                    .addComponent(txtIdCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlIdentificarCliente1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNome1)
                    .addComponent(txtNomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pnlCadastrarServicoLayout = new javax.swing.GroupLayout(pnlCadastrarServico);
        pnlCadastrarServico.setLayout(pnlCadastrarServicoLayout);
        pnlCadastrarServicoLayout.setHorizontalGroup(
            pnlCadastrarServicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCadastrarServicoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlCadastrarServicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlIdentificarCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlDadosDoServiço, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlIdentificarCliente1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlCadastrarServicoLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnCadastrar)
                        .addGap(12, 12, 12)
                        .addComponent(btnSair)))
                .addContainerGap())
        );
        pnlCadastrarServicoLayout.setVerticalGroup(
            pnlCadastrarServicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCadastrarServicoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlIdentificarCliente1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pnlIdentificarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pnlDadosDoServiço, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlCadastrarServicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(btnCadastrar)
                    .addComponent(btnSair))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlCadastrarServico, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlCadastrarServico, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtDataSolicitacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDataSolicitacaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDataSolicitacaoActionPerformed

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        try {
            this.recuperaCamposPessoa();
            boolean vCliente = daoCliente.validarCliente(novoServico.getIdCliente(), novoServico.getNomeCliente());
            boolean vFuncionario = daoFuncionario.validarFuncionario(novoServico.getIdFuncionario(), novoServico.getNomeFuncionario());
            if(vCliente && vFuncionario){
                daoServico.Salvar(novoServico);
                JOptionPane.showMessageDialog(this, "Cadastro realizado com sucesso!!!");

            }else {
                JOptionPane.showMessageDialog(this, "Funcionário ou cliente não encontrado!!!");
            }
        } catch (ParseException ex) {
            Logger.getLogger(CadastrarServico.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void txtStatusPagamantoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtStatusPagamantoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtStatusPagamantoActionPerformed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnSairActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        limparCampos();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(CadastrarServico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastrarServico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastrarServico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastrarServico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastrarServico().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnSair;
    private javax.swing.JButton jButton1;
    private javax.swing.JFormattedTextField jFormattedTextField1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lblDataDaSolicitacao;
    private javax.swing.JLabel lblDataEntrega;
    private javax.swing.JLabel lblDescricao;
    private javax.swing.JLabel lblId;
    private javax.swing.JLabel lblId1;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblNome1;
    private javax.swing.JLabel lblValor;
    private javax.swing.JPanel pnlCadastrarServico;
    private javax.swing.JPanel pnlDadosDoServiço;
    private javax.swing.JPanel pnlIdentificarCliente;
    private javax.swing.JPanel pnlIdentificarCliente1;
    private javax.swing.JFormattedTextField txtDataEntrega;
    private javax.swing.JFormattedTextField txtDataSolicitacao;
    private javax.swing.JTextField txtDescricao;
    private javax.swing.JTextField txtIdCliente;
    private javax.swing.JTextField txtIdFuncinario;
    private javax.swing.JTextField txtNomeCliente;
    private javax.swing.JTextField txtNomeFuncionario;
    private javax.swing.JTextField txtStatusPagamanto;
    private javax.swing.JTextField txtStatusProgresso;
    private javax.swing.JFormattedTextField txtValor;
    // End of variables declaration//GEN-END:variables

public void recuperaCamposPessoa() throws ParseException{
    
    int idCliente = Integer.parseInt(txtIdCliente.getText().trim());
    if(idCliente > 0){
        novoServico.setIdCliente(idCliente);
    }
    
    String nomeCliente = txtNomeCliente.getText().trim();
    if(!nomeCliente.equals("")){
        novoServico.setNomeCliente(nomeCliente);
    }
    
    int idFuncionario = Integer.parseInt(txtIdFuncinario.getText().trim());
    if(idFuncionario > 0){
        novoServico.setIdFuncionario(idFuncionario);
    }
    
    String nomeFuncionario = txtNomeCliente.getText().trim();
    if(!nomeFuncionario.equals("")){
        novoServico.setNomeFuncionario(nomeFuncionario);
    }
    
    String descricao = txtDescricao.getText().trim();
    if(!descricao.equals("")){
        novoServico.setDescricao(descricao);
    }
    
     SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");

    Date dataSolicitacao = new Date( format.parse(txtDataSolicitacao.getText().trim()).getTime());
    if(dataSolicitacao != null){
        novoServico.setSolicitacao(dataSolicitacao);
    }    
    
    Date dataEntrega = new Date( format.parse(txtDataEntrega.getText().trim()).getTime());
    if(dataEntrega !=null){
        novoServico.setEntrega(dataEntrega);
    }
    
    Double valor = Double.parseDouble(txtValor.getText().trim());
    if(valor != null){
        novoServico.setValor(valor);
    }
    
    String statusPagamento = txtStatusPagamanto.getText().trim();
    if(!statusPagamento.equals("")){
        novoServico.setStatusPagamanto(statusPagamento);
    }
    
    String statusProcesso = txtStatusProgresso.getText().trim();
    if(!statusProcesso.equals("")){
        novoServico.setStatusProgresso(statusProcesso);
    }
    
  }

    private void limparCampos() {
        txtIdCliente.setText("");
        txtDataEntrega.setText("");
        txtDataSolicitacao.setText("");
        txtDescricao.setText("");
        txtIdFuncinario.setText("");
        txtNomeCliente.setText("");
        txtNomeFuncionario.setText("");
        txtStatusPagamanto.setText("");
        txtStatusProgresso.setText("");
        txtValor.setText("");                
    }

}
