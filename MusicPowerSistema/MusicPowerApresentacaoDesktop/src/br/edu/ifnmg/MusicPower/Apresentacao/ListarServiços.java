/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.MusicPower.Apresentacao;

import br.edu.ifnmg.MusicPower.Entidades.Serviço;
import br.edu.ifnmg.MusicPower.Entidades.ServiçoRepositorio;
import groovy.model.DefaultTableModel;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.JOptionPane;


/**
 *
 * @author marcos
 */
public class ListarServiços extends javax.swing.JFrame {
    
    ServiçoRepositorio dao;
    Serviço servico = new Serviço();
    ArrayList<Serviço> busca = new ArrayList<>();
    
    /**
     * Creates new form ListarClientes
     */
    public ListarServiços() {
        initComponents();
        this.dao = GerenciadorDeReferencias.getServiço();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlListarCliente = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        lblNome = new javax.swing.JLabel();
        txtCodServiço = new javax.swing.JTextField();
        lblCodCliente = new javax.swing.JLabel();
        txtCodCliente = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        btnLimparCampos = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtNomeCliente = new javax.swing.JTextField();
        pnlCLientes = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblListarServiços = new javax.swing.JTable();
        btnBuscartodos = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnlListarCliente.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Filtrar"));

        lblNome.setText("Cod serviço:");

        lblCodCliente.setText("Cod cliente:");

        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/ifnmg/MusicPower/Apresentacao/Imagens/1472697069_search.png"))); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        btnLimparCampos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/ifnmg/MusicPower/Apresentacao/Imagens/1474386963_Broom_stick.png"))); // NOI18N
        btnLimparCampos.setText("Limpar campos");
        btnLimparCampos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparCamposActionPerformed(evt);
            }
        });

        jLabel1.setText("Nome Cliente:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(lblCodCliente)
                            .addComponent(lblNome))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCodServiço, javax.swing.GroupLayout.DEFAULT_SIZE, 736, Short.MAX_VALUE)
                            .addComponent(txtCodCliente)
                            .addComponent(txtNomeCliente)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnLimparCampos)
                        .addGap(18, 18, 18)
                        .addComponent(btnBuscar)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNome)
                    .addComponent(txtCodServiço, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCodCliente)
                    .addComponent(txtCodCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtNomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBuscar)
                    .addComponent(btnLimparCampos))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlCLientes.setBorder(javax.swing.BorderFactory.createTitledBorder("Serviços"));

        tblListarServiços.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Cod serviço", "Descrição", "Data da solicitação", "Data da entrega", "Valor", "Status pagamento", "Status progresso"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true, true, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblListarServiços);
        if (tblListarServiços.getColumnModel().getColumnCount() > 0) {
            tblListarServiços.getColumnModel().getColumn(2).setResizable(false);
        }

        btnBuscartodos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/ifnmg/MusicPower/Apresentacao/Imagens/1472697069_search.png"))); // NOI18N
        btnBuscartodos.setText("Buscar Todos");
        btnBuscartodos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscartodosActionPerformed(evt);
            }
        });

        btnSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/ifnmg/MusicPower/Apresentacao/Imagens/1473144169_logout.png"))); // NOI18N
        btnSair.setText("Sair");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        btnExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/ifnmg/MusicPower/Apresentacao/Imagens/1474386770_trash_bin.png"))); // NOI18N
        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        btnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/ifnmg/MusicPower/Apresentacao/Imagens/1473023353_editor-pencil-pen-edit-write-glyph.png"))); // NOI18N
        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/ifnmg/MusicPower/Apresentacao/Imagens/1474392208_add.png"))); // NOI18N
        jButton1.setText("Novo");

        javax.swing.GroupLayout pnlCLientesLayout = new javax.swing.GroupLayout(pnlCLientes);
        pnlCLientes.setLayout(pnlCLientesLayout);
        pnlCLientesLayout.setHorizontalGroup(
            pnlCLientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCLientesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlCLientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 847, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlCLientesLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton1)
                        .addGap(18, 18, 18)
                        .addComponent(btnBuscartodos)
                        .addGap(18, 18, 18)
                        .addComponent(btnEditar)
                        .addGap(18, 18, 18)
                        .addComponent(btnExcluir)
                        .addGap(18, 18, 18)
                        .addComponent(btnSair)))
                .addContainerGap())
        );
        pnlCLientesLayout.setVerticalGroup(
            pnlCLientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCLientesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlCLientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBuscartodos)
                    .addComponent(btnSair)
                    .addComponent(btnExcluir)
                    .addComponent(btnEditar)
                    .addComponent(jButton1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pnlListarClienteLayout = new javax.swing.GroupLayout(pnlListarCliente);
        pnlListarCliente.setLayout(pnlListarClienteLayout);
        pnlListarClienteLayout.setHorizontalGroup(
            pnlListarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlListarClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlListarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlCLientes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        pnlListarClienteLayout.setVerticalGroup(
            pnlListarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlListarClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pnlCLientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlListarCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlListarCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLimparCamposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparCamposActionPerformed
        limparCampos();
    }//GEN-LAST:event_btnLimparCamposActionPerformed

    private void btnBuscartodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscartodosActionPerformed
        buscarTodos();
    }//GEN-LAST:event_btnBuscartodosActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        int posicao = tblListarServiços.getSelectedRow();
        if(posicao >= 0){
           Serviço serviço = busca.get(posicao);
           String mensagem = "Deseja realmente excluir este Serviço?";
           int opcao = JOptionPane.showConfirmDialog(this, mensagem, "Mensagem de confirmação",JOptionPane.YES_NO_OPTION);
           
            if (opcao == JOptionPane.YES_OPTION) {
                dao.Excluir(serviço);
                JOptionPane.showMessageDialog(rootPane, "Serviço excluído com sucesso!");
                buscarTodos();
            }     
        }else {
            JOptionPane.showMessageDialog(this, "Escolha uma posição na tabela, o qual você deseja excluir");
        }
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
         int posicao = tblListarServiços.getSelectedRow();
        if(posicao >= 0){
           Serviço serviço = busca.get(posicao);
           String mensagem = "Deseja realmente editar este Serviço?";
           int opcao = JOptionPane.showConfirmDialog(this, mensagem, "Mensagem de confirmação",JOptionPane.YES_NO_OPTION);
           
            if (opcao == JOptionPane.YES_OPTION) {
                
                CadastrarServico telaCadastrarServico = new CadastrarServico(serviço,this);
                telaCadastrarServico.setVisible(true);
                        
            } 
        }else {
            JOptionPane.showMessageDialog(this, "Escolha uma posição na tabela, o qual você deseja editar");
        }
        
            
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        
        buscar(txtCodServiço.getText(),txtCodCliente.getText(),txtNomeCliente.getText());
        
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnSairActionPerformed

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
            java.util.logging.Logger.getLogger(ListarServiços.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListarServiços.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListarServiços.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListarServiços.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ListarServiços().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnBuscartodos;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnLimparCampos;
    private javax.swing.JButton btnSair;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCodCliente;
    private javax.swing.JLabel lblNome;
    private javax.swing.JPanel pnlCLientes;
    private javax.swing.JPanel pnlListarCliente;
    private javax.swing.JTable tblListarServiços;
    private javax.swing.JTextField txtCodCliente;
    private javax.swing.JTextField txtCodServiço;
    private javax.swing.JTextField txtNomeCliente;
    // End of variables declaration//GEN-END:variables

    private void limparCampos() {
        txtCodCliente.setText("");
        txtCodServiço.setText("");
        txtNomeCliente.setText("");
    }

    private void buscarTodos() {
        this.busca = (ArrayList<Serviço>) dao.Abrir();
        preencherTabela(busca);
    }

    private void buscar(String CodServiço, String CodCliente, String NomeCliente) {
        int id = Integer.parseInt(CodServiço);
        int idcliente = Integer.parseInt(CodCliente);
        Serviço filtro = new Serviço(id,null, null, null, null, null, null,idcliente, 0,NomeCliente,null);
        this.busca = (ArrayList<Serviço>) dao.Buscar(filtro);
        preencherTabela(busca);
    }

    private void preencherTabela(ArrayList<Serviço> lista) {
        javax.swing.table.DefaultTableModel modelo = new javax.swing.table.DefaultTableModel();
        modelo.addColumn("Cod Serviço");
        modelo.addColumn("Descrição");
        modelo.addColumn("Data Solicitação");
        modelo.addColumn("Data Entrega");
        modelo.addColumn("Valor");
        modelo.addColumn("Status Pagamento");
        modelo.addColumn("Status Processo");
        modelo.addColumn("ID Cliente");
        modelo.addColumn("Nome Cliente");
        modelo.addColumn("ID Funcionário");
        modelo.addColumn("Nome Funcionário");
        
        for(Serviço c: lista){
            Vector linha = new Vector();
            linha.add(c.getId());
            linha.add(c.getDescricao());
            linha.add(c.getEntrega());
            linha.add(c.getSolicitacao());
            linha.add(c.getValor());
            linha.add(c.getStatusPagamanto());
            linha.add(c.getStatusProgresso());
            linha.add(c.getIdCliente());
            linha.add(c.getNomeCliente());
            linha.add(c.getIdFuncionario());
            linha.add(c.getNomeFuncionario());
            
            modelo.addRow(linha);
        }
        tblListarServiços.setModel(modelo);
    }
}
