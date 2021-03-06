/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.MusicPower.Apresentacao;

import br.edu.ifnmg.MusicPower.Entidades.Compra;
import br.edu.ifnmg.MusicPower.Entidades.CompraRepositorio;
import br.edu.ifnmg.MusicPower.Entidades.Evento;
import br.edu.ifnmg.MusicPower.Entidades.EventoRepositorio;
import br.edu.ifnmg.MusicPower.Entidades.ItensCompra;
import br.edu.ifnmg.MusicPower.Entidades.ItensCompraRepositorio;
import br.edu.ifnmg.MusicPower.Entidades.ItensVenda;
import br.edu.ifnmg.MusicPower.Entidades.ItensVendaRepositorio;
import br.edu.ifnmg.MusicPower.Entidades.Venda;
import br.edu.ifnmg.MusicPower.Entidades.VendaRepositorio;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author marcos
 */
public class ListarCompra extends javax.swing.JFrame {

    CompraRepositorio daoCompra;
    ItensCompraRepositorio daoItensCompra;
    Compra compra = new Compra();
    ArrayList<Compra> buscaCompra = new ArrayList<>();
    ArrayList<ItensCompra> buscaItensCompra = new ArrayList<>();
    int idcompra;
    
    /**
     * Creates new form ListarClientes
     */
    public ListarCompra() {
        initComponents();
        this.daoCompra = GerenciadorDeReferencias.getCompra();
        this.daoItensCompra = GerenciadorDeReferencias.getItensCompra();
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
        pnlFiltrar = new javax.swing.JPanel();
        lblNome = new javax.swing.JLabel();
        txtIdCompra = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        btnLimparCampos = new javax.swing.JButton();
        lblDataInicio = new javax.swing.JLabel();
        txtDataCompra = new javax.swing.JTextField();
        pnlEventos = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblListarVenda = new javax.swing.JTable();
        pnlEventos1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblListarItensVenda = new javax.swing.JTable();
        btnSair1 = new javax.swing.JButton();
        btnExcluir1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        pnlListarCliente.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        pnlFiltrar.setBorder(javax.swing.BorderFactory.createTitledBorder("Filtrar"));

        lblNome.setText("ID Compra:");

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

        lblDataInicio.setText("Data Compra:");

        javax.swing.GroupLayout pnlFiltrarLayout = new javax.swing.GroupLayout(pnlFiltrar);
        pnlFiltrar.setLayout(pnlFiltrarLayout);
        pnlFiltrarLayout.setHorizontalGroup(
            pnlFiltrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFiltrarLayout.createSequentialGroup()
                .addGroup(pnlFiltrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlFiltrarLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(pnlFiltrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblNome)
                            .addComponent(lblDataInicio))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlFiltrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtIdCompra, javax.swing.GroupLayout.DEFAULT_SIZE, 726, Short.MAX_VALUE)
                            .addComponent(txtDataCompra)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlFiltrarLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnLimparCampos)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBuscar)))
                .addContainerGap())
        );
        pnlFiltrarLayout.setVerticalGroup(
            pnlFiltrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFiltrarLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlFiltrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNome)
                    .addComponent(txtIdCompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlFiltrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDataCompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDataInicio))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlFiltrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLimparCampos)
                    .addComponent(btnBuscar))
                .addGap(41, 41, 41))
        );

        pnlEventos.setBorder(javax.swing.BorderFactory.createTitledBorder("Dados compra"));

        tblListarVenda.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null}
            },
            new String [] {
                "Cod Compra", "Cod Fornecedor", "Cod Funcionário", "Valor Compra", "Data Compra"
            }
        ));
        jScrollPane1.setViewportView(tblListarVenda);

        javax.swing.GroupLayout pnlEventosLayout = new javax.swing.GroupLayout(pnlEventos);
        pnlEventos.setLayout(pnlEventosLayout);
        pnlEventosLayout.setHorizontalGroup(
            pnlEventosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlEventosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 847, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlEventosLayout.setVerticalGroup(
            pnlEventosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlEventosLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );

        pnlEventos1.setBorder(javax.swing.BorderFactory.createTitledBorder("Itens da Compra"));

        tblListarItensVenda.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Cod Item", "Cod Compra", "Cod Produto", "Quantidade", "Valor Unitario"
            }
        ));
        jScrollPane2.setViewportView(tblListarItensVenda);

        btnSair1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/ifnmg/MusicPower/Apresentacao/Imagens/1473144169_logout.png"))); // NOI18N
        btnSair1.setText("Sair");
        btnSair1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSair1ActionPerformed(evt);
            }
        });

        btnExcluir1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/ifnmg/MusicPower/Apresentacao/Imagens/1474386770_trash_bin.png"))); // NOI18N
        btnExcluir1.setText("Excluir");
        btnExcluir1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluir1ActionPerformed(evt);
            }
        });

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/ifnmg/MusicPower/Apresentacao/Imagens/1474392208_add.png"))); // NOI18N
        jButton2.setText("Novo");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlEventos1Layout = new javax.swing.GroupLayout(pnlEventos1);
        pnlEventos1.setLayout(pnlEventos1Layout);
        pnlEventos1Layout.setHorizontalGroup(
            pnlEventos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlEventos1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlEventos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 847, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlEventos1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnExcluir1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnSair1)))
                .addContainerGap())
        );
        pnlEventos1Layout.setVerticalGroup(
            pnlEventos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlEventos1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlEventos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSair1)
                    .addComponent(btnExcluir1)
                    .addComponent(jButton2))
                .addContainerGap())
        );

        javax.swing.GroupLayout pnlListarClienteLayout = new javax.swing.GroupLayout(pnlListarCliente);
        pnlListarCliente.setLayout(pnlListarClienteLayout);
        pnlListarClienteLayout.setHorizontalGroup(
            pnlListarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlListarClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlListarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlFiltrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlEventos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlEventos1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        pnlListarClienteLayout.setVerticalGroup(
            pnlListarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlListarClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlFiltrar, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlEventos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pnlEventos1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                .addComponent(pnlListarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLimparCamposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparCamposActionPerformed
        limparCampos();
    }//GEN-LAST:event_btnLimparCamposActionPerformed
    
    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        try {
            busca(txtIdCompra.getText(),txtDataCompra.getText());
        } catch (ParseException ex) {
            Logger.getLogger(ListarCompra.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnSair1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSair1ActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnSair1ActionPerformed

    private void btnExcluir1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluir1ActionPerformed
        String mensagem = "Tem certeza que deseja excluir essa compra?";
        int opcao = JOptionPane.showConfirmDialog(this, mensagem, "Mensagem de confirmação", JOptionPane.YES_NO_OPTION);
        
        if(opcao == JOptionPane.YES_OPTION){
            daoItensCompra.ExcluirItens(idcompra);
            daoCompra.ExcluirItens(idcompra);
            JOptionPane.showMessageDialog(rootPane, "compra excluida com sucesso!!!");
            this.dispose();
        }
    }//GEN-LAST:event_btnExcluir1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        TelaOperacoesCompra telaCadastrarCompra = new TelaOperacoesCompra();
        telaCadastrarCompra.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    
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
            java.util.logging.Logger.getLogger(ListarCompra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListarCompra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListarCompra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListarCompra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ListarCompra().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnExcluir1;
    private javax.swing.JButton btnLimparCampos;
    private javax.swing.JButton btnSair1;
    private javax.swing.JButton jButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblDataInicio;
    private javax.swing.JLabel lblNome;
    private javax.swing.JPanel pnlEventos;
    private javax.swing.JPanel pnlEventos1;
    private javax.swing.JPanel pnlFiltrar;
    private javax.swing.JPanel pnlListarCliente;
    private javax.swing.JTable tblListarItensVenda;
    private javax.swing.JTable tblListarVenda;
    private javax.swing.JTextField txtDataCompra;
    private javax.swing.JTextField txtIdCompra;
    // End of variables declaration//GEN-END:variables

    private void limparCampos() {
        
        txtIdCompra.setText("");
        txtDataCompra.setText("");
        
    }
    
    private void busca(String idCompra, String dataCompra) throws ParseException {
      int id = Integer.parseInt(idCompra);
      SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
      
      java.sql.Date dataI = new java.sql.Date(format.parse(dataCompra).getTime());
      
      Compra filtro = new Compra(id,0,0,0.0,dataI);
      buscaCompra = (ArrayList<Compra>) daoCompra.Buscar(filtro);
      preencherTabela1(buscaCompra);
      
      ItensCompra itenscompra = new ItensCompra(0,idcompra,0,0,0.0);
      buscaItensCompra = (ArrayList<ItensCompra>) daoItensCompra.Buscar(itenscompra);
      preencherTabela2(buscaItensCompra);
      
    } 

    private void preencherTabela1(ArrayList<Compra> busca) throws ParseException {
        
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("Cod Compra");
        modelo.addColumn("Cod Fornecedor");
        modelo.addColumn("Cod Funcionário");
        modelo.addColumn("Valor Compra");
        modelo.addColumn("Data Compra");
        
        for(Compra c: busca){
            SimpleDateFormat in= new SimpleDateFormat("yyyy-MM-dd"); 
            SimpleDateFormat out = new SimpleDateFormat("dd/MM/yyyy"); 
            String dataCompra = out.format(in.parse(c.getDataCompra().toString()));
            
            idcompra = c.getId();
            Vector linha = new Vector();
            linha.add(c.getId());
            linha.add(c.getFornecedor());
            linha.add(c.getFuncionario());
            linha.add(c.getValor());
            linha.add(dataCompra);
            
            modelo.addRow(linha);
            
        }
        
        tblListarVenda.setModel(modelo);
        
    }
    
    private void preencherTabela2(ArrayList<ItensCompra> busca) {
        
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("Cod Item Compra");
        modelo.addColumn("Cod compra");
        modelo.addColumn("Cod Produto");
        modelo.addColumn("Quantidade");
        modelo.addColumn("Valor Unitário");
        
        for(ItensCompra c: busca){
            
            Vector linha = new Vector();
            linha.add(c.getId());
            linha.add(c.getCompra());
            linha.add(c.getProduto());
            linha.add(c.getQtd());
            linha.add(c.getValor());
            
            modelo.addRow(linha);
            
        }
        
        tblListarItensVenda.setModel(modelo);
        
    }

}
