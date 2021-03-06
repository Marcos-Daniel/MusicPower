/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.MusicPower.Apresentacao;

import br.edu.ifnmg.MusicPower.Entidades.Cliente;
import br.edu.ifnmg.MusicPower.Entidades.ClienteRepositorio;
import br.edu.ifnmg.MusicPower.Entidades.ErroValidacao;
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
public class CadastrarCliente extends javax.swing.JFrame {
    
    Cliente novo = new Cliente();
    MuiscPowerApresentacao MPA = new MuiscPowerApresentacao();
    ListarClientes telalistarClientes ;
    ClienteRepositorio dao = GerenciadorDeReferencias.getCliente();
    
    /**
     * Creates new form CadastrarCliente
     */
    public CadastrarCliente() {
        initComponents();
    }
    
    CadastrarCliente(Cliente cliente, ListarClientes telalistarClientes){
        initComponents();
        this.preencherCampos(cliente);
        this.telalistarClientes = telalistarClientes; 
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
        txtNome = new javax.swing.JTextField();
        lblTelefone = new javax.swing.JLabel();
        txtTelefone = new javax.swing.JTextField();
        lblEmail = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        lblUF = new javax.swing.JLabel();
        txtUf = new javax.swing.JTextField();
        lblCidade = new javax.swing.JLabel();
        txtCidade = new javax.swing.JTextField();
        lblBairro = new javax.swing.JLabel();
        txtBairro = new javax.swing.JTextField();
        lblRua = new javax.swing.JLabel();
        txtRua = new javax.swing.JTextField();
        lblNumeroResidencia = new javax.swing.JLabel();
        txtNumeroResidencia = new javax.swing.JTextField();
        btnCadastar = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        lblNome1 = new javax.swing.JLabel();
        lblNome2 = new javax.swing.JLabel();
        txtCpf = new javax.swing.JFormattedTextField();
        txtNascimento = new javax.swing.JFormattedTextField();

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        pnlCadastrarCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Cadastrar Cliente"));

        lblNome.setText("*Nome:");

        lblTelefone.setText("*Telefone:");

        lblEmail.setText("*E-mail:");

        lblUF.setText("*UF:");

        lblCidade.setText("*Cidade:");

        lblBairro.setText("*Bairro:");

        lblRua.setText("*Rua:");

        lblNumeroResidencia.setText("*Nº residencia:");

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

        lblNome1.setText("*Cpf:");

        lblNome2.setText("*Nascimento:");

        try {
            txtCpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            txtNascimento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout pnlCadastrarClienteLayout = new javax.swing.GroupLayout(pnlCadastrarCliente);
        pnlCadastrarCliente.setLayout(pnlCadastrarClienteLayout);
        pnlCadastrarClienteLayout.setHorizontalGroup(
            pnlCadastrarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCadastrarClienteLayout.createSequentialGroup()
                .addGroup(pnlCadastrarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlCadastrarClienteLayout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(lblNome))
                    .addGroup(pnlCadastrarClienteLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(pnlCadastrarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlCadastrarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(pnlCadastrarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblNumeroResidencia)
                                    .addComponent(lblUF, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblRua, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addComponent(lblNome2, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(lblTelefone, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(lblEmail, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(lblCidade, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addComponent(lblNome1, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlCadastrarClienteLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblBairro)))
                .addGap(23, 23, 23)
                .addGroup(pnlCadastrarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlCadastrarClienteLayout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnCadastar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                        .addComponent(btnSair))
                    .addComponent(txtNome)
                    .addComponent(txtTelefone)
                    .addComponent(txtEmail)
                    .addComponent(txtUf)
                    .addComponent(txtCidade)
                    .addComponent(txtBairro)
                    .addComponent(txtRua)
                    .addComponent(txtNumeroResidencia)
                    .addComponent(txtCpf)
                    .addComponent(txtNascimento))
                .addContainerGap())
        );
        pnlCadastrarClienteLayout.setVerticalGroup(
            pnlCadastrarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCadastrarClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlCadastrarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNome)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlCadastrarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNome1)
                    .addComponent(txtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlCadastrarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNome2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(pnlCadastrarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTelefone)
                    .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlCadastrarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEmail))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlCadastrarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCidade))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlCadastrarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtUf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblUF))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addGroup(pnlCadastrarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtRua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblRua))
                .addGap(14, 14, 14)
                .addGroup(pnlCadastrarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblBairro))
                .addGap(16, 16, 16)
                .addGroup(pnlCadastrarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNumeroResidencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNumeroResidencia))
                .addGap(18, 18, 18)
                .addGroup(pnlCadastrarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(btnCadastar)
                    .addComponent(btnSair))
                .addContainerGap())
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
                .addComponent(pnlCadastrarCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

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
                if(dao.Salvar(novo)){
                this.limparCampos();
                    JOptionPane.showMessageDialog(this, "Cadastro realizado com sucesso!!!"); 
                }else{
                    JOptionPane.showMessageDialog(this, "Ocorreu um erro durante a execução!");
                }
            } else {
                dao.Alterar(novo);
                JOptionPane.showMessageDialog(this, "Cliente editado com sucesso!!!", "Mensagem de confirmação", JOptionPane.INFORMATION_MESSAGE);
                this.dispose();
             }
        } catch (ParseException ex) {
            Logger.getLogger(CadastrarCliente.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ErroValidacao ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage());
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
            java.util.logging.Logger.getLogger(CadastrarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastrarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastrarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastrarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastrarCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastar;
    private javax.swing.JButton btnSair;
    private javax.swing.JButton jButton1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel lblBairro;
    private javax.swing.JLabel lblCidade;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblNome1;
    private javax.swing.JLabel lblNome2;
    private javax.swing.JLabel lblNumeroResidencia;
    private javax.swing.JLabel lblRua;
    private javax.swing.JLabel lblTelefone;
    private javax.swing.JLabel lblUF;
    private javax.swing.JPanel pnlCadastrarCliente;
    private javax.swing.JTextField txtBairro;
    private javax.swing.JTextField txtCidade;
    private javax.swing.JFormattedTextField txtCpf;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JFormattedTextField txtNascimento;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtNumeroResidencia;
    private javax.swing.JTextField txtRua;
    private javax.swing.JTextField txtTelefone;
    private javax.swing.JTextField txtUf;
    // End of variables declaration//GEN-END:variables

    private void limparCampos() {
        
        txtNome.setText("");
        txtCpf.setText("");
        txtNascimento.setText("");
        txtTelefone.setText("");
        txtEmail.setText("");
        txtCidade.setText("");
        txtUf.setText("");
        txtRua.setText("");
        txtBairro.setText("");
        txtNumeroResidencia.setText("");
        
    }

    private void recuperarCampos() throws ParseException, ErroValidacao {
         SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");

        String nome = txtNome.getText().trim();
        if(!nome.equals("")){
            novo.setNome(nome);
        }else {
            JOptionPane.showMessageDialog(this, "ERRO, O CAMPO NOME É OBRIGATORIO");
        }
        
        String cpf = txtCpf.getText().trim();
        if(!cpf.equals("")){
            novo.setCpf(cpf);
        }else {
            JOptionPane.showMessageDialog(this, "ERRO, O CAMPO CPF É OBRIGATORIO");
        }
        
        Date nascimento = new Date( format.parse(txtNascimento.getText().trim()).getTime());
        if(!nascimento.equals("")){
            novo.setDataNascimento(nascimento);
        }else {
            JOptionPane.showMessageDialog(this, "ERRO, O CAMPO DATA NASCIMENTO É OBRIGATORIO");
        }
        
        String telefone = txtTelefone.getText().trim();
        if(!telefone.equals("")){
            novo.setTelefone(telefone);
        }else {
            JOptionPane.showMessageDialog(this, "ERRO, O CAMPO TELEFONE É OBRIGATORIO");
        }
        
        String email = txtEmail.getText().trim();
        if(!email.equals("")){
            novo.setEmail(email);
        }else {
            JOptionPane.showMessageDialog(this, "ERRO, O CAMPO EMAIL É OBRIGATORIO");
        }
        
        String cidade = txtCidade.getText().trim();
        if(!cidade.equals("")){
            novo.setCidade(cidade);
        }else {
            JOptionPane.showMessageDialog(this, "ERRO, O CAMPO CIDADE É OBRIGATORIO");
        }
        
        String uf = txtUf.getText().trim();
        if(!uf.equals("")){
            novo.setUF(uf);
        }else {
            JOptionPane.showMessageDialog(this, "ERRO, O CAMPO UF É OBRIGATORIO");
        }
        
        String rua = txtRua.getText().trim();
        if(!rua.equals("")){
            novo.setRua(rua);
        }else {
            JOptionPane.showMessageDialog(this, "ERRO, O CAMPO RUA É OBRIGATORIO");
        }
        
        String bairro = txtBairro.getText().trim();
        if(!bairro.equals("")){
            novo.setBairro(bairro);
        }else {
            JOptionPane.showMessageDialog(this, "ERRO, O CAMPO BAIRRO É OBRIGATORIO");
        }
            
        String numResidencia = txtNumeroResidencia.getText().trim();
        if(!numResidencia.equals("")){
            novo.setnResidencia(numResidencia);
        }else {
            JOptionPane.showMessageDialog(this, "ERRO, O CAMPO NUMERO RESIDÊNCIA É OBRIGATORIO");
        }
        
    }

    private void preencherCampos(Cliente cliente) {
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println(cliente.getDataNascimento());
        String dataNascimento = format.format(cliente.getDataNascimento());
        
        novo = cliente;
        txtNome.setText(cliente.getNome());
        txtCpf.setText(cliente.getCpf());
        txtNascimento.setText(dataNascimento);
        txtTelefone.setText(cliente.getTelefone());
        txtEmail.setText(cliente.getEmail());
        txtCidade.setText(cliente.getCidade());
        txtUf.setText(cliente.getUF());
        txtRua.setText(cliente.getRua());
        txtBairro.setText(cliente.getBairro());
        txtNumeroResidencia.setText(cliente.getnResidencia());
        
    }
}
