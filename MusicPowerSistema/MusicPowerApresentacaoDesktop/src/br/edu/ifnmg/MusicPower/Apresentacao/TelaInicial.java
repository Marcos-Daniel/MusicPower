/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.MusicPower.Apresentacao;

import br.edu.ifnmg.MusicPower.Entidades.Filial;
import br.edu.ifnmg.MusicPower.Entidades.FilialRepositorio;
import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import net.sf.jasperreports.engine.JRDataSource;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author marcos
 */
public class TelaInicial extends javax.swing.JFrame {

    /**
     * Creates new form TelaInicial
     */
    public TelaInicial() {
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

        pnlTelaInicial = new javax.swing.JPanel();
        pnlTituloImagem = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblImagem = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuCadastrar = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        menuCadastrarContas = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        menuBuscarFilial = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem12 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenuItem13 = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenu6 = new javax.swing.JMenu();
        jMenu7 = new javax.swing.JMenu();
        jMenu8 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnlTelaInicial.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel1.setFont(new java.awt.Font("Ubuntu", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(4, 2, 2));
        jLabel1.setText("MUSIC POWER");

        lblImagem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/ifnmg/MusicPower/Apresentacao/Imagens/ncBX6n8ei.png"))); // NOI18N

        javax.swing.GroupLayout pnlTituloImagemLayout = new javax.swing.GroupLayout(pnlTituloImagem);
        pnlTituloImagem.setLayout(pnlTituloImagemLayout);
        pnlTituloImagemLayout.setHorizontalGroup(
            pnlTituloImagemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTituloImagemLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addContainerGap(24, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlTituloImagemLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblImagem)
                .addGap(39, 39, 39))
        );
        pnlTituloImagemLayout.setVerticalGroup(
            pnlTituloImagemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTituloImagemLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblImagem, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pnlTelaInicialLayout = new javax.swing.GroupLayout(pnlTelaInicial);
        pnlTelaInicial.setLayout(pnlTelaInicialLayout);
        pnlTelaInicialLayout.setHorizontalGroup(
            pnlTelaInicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlTelaInicialLayout.createSequentialGroup()
                .addContainerGap(145, Short.MAX_VALUE)
                .addComponent(pnlTituloImagem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(144, Short.MAX_VALUE))
        );
        pnlTelaInicialLayout.setVerticalGroup(
            pnlTelaInicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTelaInicialLayout.createSequentialGroup()
                .addContainerGap(80, Short.MAX_VALUE)
                .addComponent(pnlTituloImagem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(80, Short.MAX_VALUE))
        );

        menuCadastrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/ifnmg/MusicPower/Apresentacao/Imagens/1472694467_user_profile_edit.png"))); // NOI18N
        menuCadastrar.setText("Cadastrar");
        menuCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCadastrarActionPerformed(evt);
            }
        });

        jMenuItem1.setText("Cadastrar cliente");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        menuCadastrar.add(jMenuItem1);

        jMenuItem2.setText("Cadastrar funcionário");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        menuCadastrar.add(jMenuItem2);

        jMenuItem3.setText("Cadastrar filial");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        menuCadastrar.add(jMenuItem3);

        jMenuItem4.setText("Cadastrar fornecedor");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        menuCadastrar.add(jMenuItem4);

        menuCadastrarContas.setText("Cadastrar contas");
        menuCadastrarContas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCadastrarContasActionPerformed(evt);
            }
        });
        menuCadastrar.add(menuCadastrarContas);

        jMenuBar1.add(menuCadastrar);

        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/ifnmg/MusicPower/Apresentacao/Imagens/1472697069_search.png"))); // NOI18N
        jMenu2.setText("Buscar");
        jMenu2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu2ActionPerformed(evt);
            }
        });

        jMenuItem5.setText("Buscar cliente");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem5);

        jMenuItem6.setText("Buscar funcionário");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem6);

        menuBuscarFilial.setText("Buscar filial");
        menuBuscarFilial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuBuscarFilialActionPerformed(evt);
            }
        });
        jMenu2.add(menuBuscarFilial);

        jMenuItem8.setText("Buscar fornecedor");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem8);

        jMenuItem7.setText("Buscar conta");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem7);

        jMenuItem12.setText("relatorioFilial");
        jMenuItem12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem12ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem12);

        jMenuBar1.add(jMenu2);

        jMenu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/ifnmg/MusicPower/Apresentacao/Imagens/1472695856_Events_2.png"))); // NOI18N
        jMenu3.setText("Eventos");

        jMenuItem9.setText("Cadastrar Evento");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem9);

        jMenuItem10.setText("Buscar Evento");
        jMenuItem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem10ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem10);

        jMenuBar1.add(jMenu3);

        jMenu4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/ifnmg/MusicPower/Apresentacao/Imagens/1472694983_case.png"))); // NOI18N
        jMenu4.setText("Serviços");

        jMenuItem11.setText("Cadastrar serviço");
        jMenuItem11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem11ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem11);

        jMenuItem13.setText("Buscar serviço");
        jMenu4.add(jMenuItem13);

        jMenuBar1.add(jMenu4);

        jMenu5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/ifnmg/MusicPower/Apresentacao/Imagens/1472695671_box-open-3d.png"))); // NOI18N
        jMenu5.setText("Estoque");
        jMenuBar1.add(jMenu5);

        jMenu6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/ifnmg/MusicPower/Apresentacao/Imagens/1472695776_shopping-cart.png"))); // NOI18N
        jMenu6.setText("Compras");
        jMenuBar1.add(jMenu6);

        jMenu7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/ifnmg/MusicPower/Apresentacao/Imagens/1472695828_aiga_cashier.png"))); // NOI18N
        jMenu7.setText("Vendas");
        jMenuBar1.add(jMenu7);

        jMenu8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/ifnmg/MusicPower/Apresentacao/Imagens/1472695684_calculator.png"))); // NOI18N
        jMenu8.setText("Contas");
        jMenuBar1.add(jMenu8);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlTelaInicial, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlTelaInicial, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        CadastrarCliente telaCadastrarCliente = new CadastrarCliente();
        telaCadastrarCliente.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        CadastrarFuncionario telaCadastrarFuncionario = new CadastrarFuncionario();
        telaCadastrarFuncionario.setVisible(true);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        CadastrarFilial telaCadastrarFilial = new CadastrarFilial();
        telaCadastrarFilial.setVisible(true);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        CadastrarFornecedor telaCadastrarFornecedor = new CadastrarFornecedor();
        telaCadastrarFornecedor.setVisible(true);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void menuCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCadastrarActionPerformed
        
    }//GEN-LAST:event_menuCadastrarActionPerformed

    private void jMenu2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu2ActionPerformed

    private void menuBuscarFilialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuBuscarFilialActionPerformed
        ListarFiliais telaListarFiliais = new ListarFiliais();
        telaListarFiliais.setVisible(true);
    }//GEN-LAST:event_menuBuscarFilialActionPerformed

    private void menuCadastrarContasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCadastrarContasActionPerformed
        CadastrarContas telaCadastrarContas = new CadastrarContas();
        telaCadastrarContas.setVisible(true);
    }//GEN-LAST:event_menuCadastrarContasActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        ListarFornecedores telaListarFornecedor = new ListarFornecedores();
        telaListarFornecedor.setVisible(true);
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
        CadastrarEvento telaCadastrarEvento = new CadastrarEvento();
        telaCadastrarEvento.setVisible(true);
    }//GEN-LAST:event_jMenuItem9ActionPerformed

    private void jMenuItem10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem10ActionPerformed
        ListarEventos telaListarEventos = new ListarEventos();
        telaListarEventos.setVisible(true);
    }//GEN-LAST:event_jMenuItem10ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        ListarContas telaListarContas = new ListarContas();
        telaListarContas.setVisible(true);
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        ListarClientes telaListarClientes = new ListarClientes();
        telaListarClientes.setVisible(true);
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        ListarFuncionarios telaListarFuncionario = new ListarFuncionarios();
        telaListarFuncionario.setVisible(true);
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem12ActionPerformed
        FilialRepositorio dao = GerenciadorDeReferencias.getFilial();
        
        exibeRelatorioJasper("RelatorioFilial.jasper", dao.Abrir() );
    }//GEN-LAST:event_jMenuItem12ActionPerformed

    private void jMenuItem11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem11ActionPerformed
        CadastrarServico telaCadastrarServico = new CadastrarServico();
        telaCadastrarServico.setVisible(true);
    }//GEN-LAST:event_jMenuItem11ActionPerformed

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
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaInicial().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem13;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JLabel lblImagem;
    private javax.swing.JMenuItem menuBuscarFilial;
    private javax.swing.JMenu menuCadastrar;
    private javax.swing.JMenuItem menuCadastrarContas;
    private javax.swing.JPanel pnlTelaInicial;
    private javax.swing.JPanel pnlTituloImagem;
    // End of variables declaration//GEN-END:variables

    private void exibeRelatorioJasper(String caminho_relatorio, List<Filial> dados) {
         try {
            // Parâmetros
            Map parametros = new HashMap();

            // Pega o caminho do arquivo do relatório
            URL arquivo = getClass().getResource(caminho_relatorio);
            
            // Carrega o relatório na memória
            JasperReport relatorio = (JasperReport) JRLoader.loadObject(arquivo);
            
            JRDataSource fontededados = new JRBeanCollectionDataSource(dados, true);
            
            JasperPrint jasperPrint = JasperFillManager.fillReport(relatorio, parametros, fontededados);
            
            // Visualiza o relatório
            JasperViewer jrviewer = new JasperViewer(jasperPrint, false);
            
            jrviewer.setVisible(true);
        
        } catch (JRException ex) {
            Logger.getLogger(JasperReport.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
