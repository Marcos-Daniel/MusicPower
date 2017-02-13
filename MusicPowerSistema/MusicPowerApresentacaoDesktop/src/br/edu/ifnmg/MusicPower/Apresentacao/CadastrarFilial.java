/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.MusicPower.Apresentacao;

import br.edu.ifnmg.MusicPower.Entidades.Filial;
import br.edu.ifnmg.MusicPower.Entidades.FilialRepositorio;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import muiscpowerapresentacao.MuiscPowerApresentacao;

/**
 *
 * @author marcos
 */
public class CadastrarFilial extends javax.swing.JFrame {

    Filial novo = new Filial();
    MuiscPowerApresentacao MPA = new MuiscPowerApresentacao();
    ListarFiliais telaListarFiliais;
    FilialRepositorio dao = GerenciadorDeReferencias.getFilial();

    /**
     * Creates new form CadastarFilial
     */
    public CadastrarFilial() {
         initComponents();
    }

    CadastrarFilial(Filial filial, ListarFiliais telaListarFiliais) {
        initComponents();
        this.preencherCampos(filial);
        this.telaListarFiliais = telaListarFiliais;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlCadastrarFilial = new javax.swing.JPanel();
        lblUF = new javax.swing.JLabel();
        txtUF = new javax.swing.JTextField();
        lblCidade = new javax.swing.JLabel();
        txtCidade = new javax.swing.JTextField();
        lblBairro = new javax.swing.JLabel();
        txtBairro = new javax.swing.JTextField();
        lblRua = new javax.swing.JLabel();
        txtRua = new javax.swing.JTextField();
        lblNestabelecimento = new javax.swing.JLabel();
        txtNestabelecimento = new javax.swing.JTextField();
        btnCadastrar = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();
        btnLimparCampos = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        pnlCadastrarFilial.setBorder(javax.swing.BorderFactory.createTitledBorder("Cadastrar/Editar Filial"));

        lblUF.setText("*UF:");

        lblCidade.setText("*Cidade:");

        lblBairro.setText("*Bairro:");

        lblRua.setText("*Rua:");

        txtRua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRuaActionPerformed(evt);
            }
        });

        lblNestabelecimento.setText("*Nº estabelecimento:");

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

        btnLimparCampos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/ifnmg/MusicPower/Apresentacao/Imagens/1474386963_Broom_stick.png"))); // NOI18N
        btnLimparCampos.setText("Limpar Campos");
        btnLimparCampos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparCamposActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlCadastrarFilialLayout = new javax.swing.GroupLayout(pnlCadastrarFilial);
        pnlCadastrarFilial.setLayout(pnlCadastrarFilialLayout);
        pnlCadastrarFilialLayout.setHorizontalGroup(
            pnlCadastrarFilialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCadastrarFilialLayout.createSequentialGroup()
                .addGap(0, 125, Short.MAX_VALUE)
                .addComponent(btnLimparCampos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnCadastrar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSair)
                .addGap(8, 8, 8))
            .addGroup(pnlCadastrarFilialLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlCadastrarFilialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblCidade)
                    .addComponent(lblUF)
                    .addComponent(lblBairro)
                    .addComponent(lblRua)
                    .addComponent(lblNestabelecimento))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlCadastrarFilialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtCidade, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtBairro, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtRua, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtNestabelecimento)
                    .addComponent(txtUF))
                .addContainerGap())
        );
        pnlCadastrarFilialLayout.setVerticalGroup(
            pnlCadastrarFilialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCadastrarFilialLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlCadastrarFilialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtUF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblUF))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlCadastrarFilialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCidade))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlCadastrarFilialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblBairro))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlCadastrarFilialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtRua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblRua))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlCadastrarFilialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNestabelecimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNestabelecimento))
                .addGap(11, 11, 11)
                .addGroup(pnlCadastrarFilialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSair)
                    .addComponent(btnCadastrar)
                    .addComponent(btnLimparCampos))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlCadastrarFilial, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlCadastrarFilial, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnSairActionPerformed

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        this.recuperaCampos();
        int codigo = novo.getId();
        
        try {
            if(codigo == 0){
                MPA.criarFilial(novo);
                this.limparCampos();
                JOptionPane.showMessageDialog(this, "Cadastro realizado com sucesso!!!");
            }else{    
                dao.Alterar(novo);
                JOptionPane.showMessageDialog(this, "Filial editada com sucesso!!!", "Mensagem de confirmação", JOptionPane.INFORMATION_MESSAGE);
                this.dispose();
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Cadastro não realizado falha na conexao com o banco de dados: " + ex.getMessage(), "Mensagem de erro", JOptionPane.ERROR_MESSAGE);
            Logger.getLogger(CadastrarFilial.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void btnLimparCamposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparCamposActionPerformed
        this.limparCampos();
    }//GEN-LAST:event_btnLimparCamposActionPerformed

    private void txtRuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRuaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRuaActionPerformed

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
            java.util.logging.Logger.getLogger(CadastrarFilial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastrarFilial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastrarFilial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastrarFilial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastrarFilial().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnLimparCampos;
    private javax.swing.JButton btnSair;
    private javax.swing.JLabel lblBairro;
    private javax.swing.JLabel lblCidade;
    private javax.swing.JLabel lblNestabelecimento;
    private javax.swing.JLabel lblRua;
    private javax.swing.JLabel lblUF;
    private javax.swing.JPanel pnlCadastrarFilial;
    private javax.swing.JTextField txtBairro;
    private javax.swing.JTextField txtCidade;
    private javax.swing.JTextField txtNestabelecimento;
    private javax.swing.JTextField txtRua;
    private javax.swing.JTextField txtUF;
    // End of variables declaration//GEN-END:variables

    private void recuperaCampos() {

        String bairro = txtBairro.getText().trim();
        if (!bairro.equals("")) {
            novo.setBairro(bairro);
        } else {
            JOptionPane.showMessageDialog(this, "ERRO, O CAMPO BAIRRO É OBRIGATORIO");
        }

        String cidade = txtCidade.getText().trim();
        if (!cidade.equals("")) {
            novo.setCidade(cidade);
        } else {
            JOptionPane.showMessageDialog(this, "ERRO O CAMPO CIDADE É OBRIGATÓRIO");
        }

        String nEstabelecimento = txtNestabelecimento.getText().trim();
        if (!nEstabelecimento.equals("")) {
            novo.setnEstabelecimento(nEstabelecimento);
        } else {
            JOptionPane.showMessageDialog(this, "ERRO O CAMPO NUMERO ESTABELECIMENTO É OBRIGATÒRIO");
        }

        String rua = txtRua.getText().trim();
        if (!rua.equals("")) {
            novo.setRua(rua);
        } else {
            JOptionPane.showMessageDialog(this, "ERRO O CAMPO RUA É OBRIGATÓRIO");
        }

        String UF = txtUF.getText().trim();
        if (!UF.equals("")) {
            novo.setUF(UF);
        } else {
            JOptionPane.showMessageDialog(this, "ERRO O CAMPO CIDADE É OBRIGATÓRIO");
        }
    }

    public void limparCampos() {
        txtBairro.setText("");
        txtCidade.setText("");
        txtNestabelecimento.setText("");
        txtRua.setText("");
        txtUF.setText("");
    }
    
    public void preencherCampos(Filial filial){
        novo = filial;
        txtBairro.setText( filial.getBairro());
        txtCidade.setText( filial.getCidade());
        txtNestabelecimento.setText( filial.getnEstabelecimento());
        txtRua.setText( filial.getRua());
        txtUF.setText( filial.getUF());
    }
}
