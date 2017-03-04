/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.MusicPower.Apresentacao;

import br.edu.ifnmg.MusicPower.Entidades.Cliente;
import br.edu.ifnmg.MusicPower.Entidades.ClienteRepositorio;
import br.edu.ifnmg.MusicPower.Entidades.Conta;
import br.edu.ifnmg.MusicPower.Entidades.ContaRepositorio;
import br.edu.ifnmg.MusicPower.Entidades.Evento;
import br.edu.ifnmg.MusicPower.Entidades.EventoRepositorio;
import br.edu.ifnmg.MusicPower.Entidades.Filial;
import br.edu.ifnmg.MusicPower.Entidades.FilialRepositorio;
import java.io.InputStream;
import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import musicpowerpersistencia.Conexao;
import net.sf.jasperreports.engine.JRDataSource;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JRResultSetDataSource;
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
    ArrayList<Filial> buscaFilial = new ArrayList<>();
    ArrayList<Conta> buscaConta = new ArrayList<>();
    ArrayList<Evento> buscaEvento = new ArrayList<>();
    ArrayList<Cliente> buscaCliente = new ArrayList<>();
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
        mnCadastrarAdministrador = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        mnBuscarAdminisrador = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        mnCadastrarEventos = new javax.swing.JMenuItem();
        mnBuscarEvento = new javax.swing.JMenuItem();
        mnRelatorioEventos = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        mnCadastrarservico = new javax.swing.JMenuItem();
        mnBuscarServico = new javax.swing.JMenuItem();
        mnRelatorioSevico = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem25 = new javax.swing.JMenuItem();
        jMenuItem26 = new javax.swing.JMenuItem();
        jMenuItem27 = new javax.swing.JMenuItem();
        jMenu7 = new javax.swing.JMenu();
        mnCadastrarVenda = new javax.swing.JMenuItem();
        mnBuscarVenda = new javax.swing.JMenuItem();
        mnRelatorioVendas = new javax.swing.JMenuItem();
        jMenu8 = new javax.swing.JMenu();
        mnCadastrarContas = new javax.swing.JMenuItem();
        mnBuscarContas = new javax.swing.JMenuItem();
        mnRelatorioContas = new javax.swing.JMenuItem();
        jMenu9 = new javax.swing.JMenu();
        mnCadastrarFornecedores = new javax.swing.JMenuItem();
        mnBuscarFornecedores = new javax.swing.JMenuItem();
        mnRelatoriofornecedores = new javax.swing.JMenuItem();
        jMenu10 = new javax.swing.JMenu();
        mnBuscarFiliais = new javax.swing.JMenuItem();
        jMenuItem34 = new javax.swing.JMenuItem();
        mnRelatorioFiliais = new javax.swing.JMenuItem();

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
                .addContainerGap(228, Short.MAX_VALUE)
                .addComponent(pnlTituloImagem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(228, Short.MAX_VALUE))
        );
        pnlTelaInicialLayout.setVerticalGroup(
            pnlTelaInicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTelaInicialLayout.createSequentialGroup()
                .addContainerGap(80, Short.MAX_VALUE)
                .addComponent(pnlTituloImagem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(80, Short.MAX_VALUE))
        );

        menuCadastrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/ifnmg/MusicPower/Apresentacao/Imagens/1472694467_user_profile_edit.png"))); // NOI18N
        menuCadastrar.setText("Cadastrar pessoas");
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

        mnCadastrarAdministrador.setText("Cadatrar administrador");
        mnCadastrarAdministrador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnCadastrarAdministradorActionPerformed(evt);
            }
        });
        menuCadastrar.add(mnCadastrarAdministrador);

        jMenuBar1.add(menuCadastrar);

        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/ifnmg/MusicPower/Apresentacao/Imagens/1472697069_search.png"))); // NOI18N
        jMenu2.setText("Buscar pessoas");
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

        mnBuscarAdminisrador.setText("Buscar administrador");
        mnBuscarAdminisrador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnBuscarAdminisradorActionPerformed(evt);
            }
        });
        jMenu2.add(mnBuscarAdminisrador);

        jMenuBar1.add(jMenu2);

        jMenu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/ifnmg/MusicPower/Apresentacao/Imagens/1472695856_Events_2.png"))); // NOI18N
        jMenu3.setText("Eventos");

        mnCadastrarEventos.setText("Cadastrar evento");
        mnCadastrarEventos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnCadastrarEventosActionPerformed(evt);
            }
        });
        jMenu3.add(mnCadastrarEventos);

        mnBuscarEvento.setText("Buscar evento");
        mnBuscarEvento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnBuscarEventoActionPerformed(evt);
            }
        });
        jMenu3.add(mnBuscarEvento);

        mnRelatorioEventos.setText("Relatorio eventos");
        mnRelatorioEventos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnRelatorioEventosActionPerformed(evt);
            }
        });
        jMenu3.add(mnRelatorioEventos);

        jMenuBar1.add(jMenu3);

        jMenu4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/ifnmg/MusicPower/Apresentacao/Imagens/1472694983_case.png"))); // NOI18N
        jMenu4.setText("Serviços");

        mnCadastrarservico.setText("Cadastrar serviço");
        mnCadastrarservico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnCadastrarservicoActionPerformed(evt);
            }
        });
        jMenu4.add(mnCadastrarservico);

        mnBuscarServico.setText("Buscar serviço");
        mnBuscarServico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnBuscarServicoActionPerformed(evt);
            }
        });
        jMenu4.add(mnBuscarServico);

        mnRelatorioSevico.setText("Relatorio serviços");
        jMenu4.add(mnRelatorioSevico);

        jMenuBar1.add(jMenu4);

        jMenu5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/ifnmg/MusicPower/Apresentacao/Imagens/1472695671_box-open-3d.png"))); // NOI18N
        jMenu5.setText("Estoque");

        jMenuItem25.setText("Cadastro Estoque");
        jMenuItem25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem25ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem25);

        jMenuItem26.setText("Listagem Estoque");
        jMenuItem26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem26ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem26);

        jMenuItem27.setText("Relatorio Estoques");
        jMenu5.add(jMenuItem27);

        jMenuBar1.add(jMenu5);

        jMenu7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/ifnmg/MusicPower/Apresentacao/Imagens/1472695828_aiga_cashier.png"))); // NOI18N
        jMenu7.setText("Vendas");

        mnCadastrarVenda.setText("Cadastrar venda");
        mnCadastrarVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnCadastrarVendaActionPerformed(evt);
            }
        });
        jMenu7.add(mnCadastrarVenda);

        mnBuscarVenda.setText("Buscar venda");
        mnBuscarVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnBuscarVendaActionPerformed(evt);
            }
        });
        jMenu7.add(mnBuscarVenda);

        mnRelatorioVendas.setText("Relatorio vendas");
        jMenu7.add(mnRelatorioVendas);

        jMenuBar1.add(jMenu7);

        jMenu8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/ifnmg/MusicPower/Apresentacao/Imagens/1472695684_calculator.png"))); // NOI18N
        jMenu8.setText("Contas");

        mnCadastrarContas.setText("Cadastrar contas");
        mnCadastrarContas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnCadastrarContasActionPerformed(evt);
            }
        });
        jMenu8.add(mnCadastrarContas);

        mnBuscarContas.setText("Buscar contas");
        mnBuscarContas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnBuscarContasActionPerformed(evt);
            }
        });
        jMenu8.add(mnBuscarContas);

        mnRelatorioContas.setText("Relatorio contas");
        mnRelatorioContas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnRelatorioContasActionPerformed(evt);
            }
        });
        jMenu8.add(mnRelatorioContas);

        jMenuBar1.add(jMenu8);

        jMenu9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/ifnmg/MusicPower/Apresentacao/Imagens/1488404328_truck.png"))); // NOI18N
        jMenu9.setText("Fornecedores");

        mnCadastrarFornecedores.setText("Cadastrar fornecedores");
        mnCadastrarFornecedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnCadastrarFornecedoresActionPerformed(evt);
            }
        });
        jMenu9.add(mnCadastrarFornecedores);

        mnBuscarFornecedores.setText("Buscar fornecedores");
        mnBuscarFornecedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnBuscarFornecedoresActionPerformed(evt);
            }
        });
        jMenu9.add(mnBuscarFornecedores);

        mnRelatoriofornecedores.setText("Relatorio fornecedores");
        jMenu9.add(mnRelatoriofornecedores);

        jMenuBar1.add(jMenu9);

        jMenu10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/ifnmg/MusicPower/Apresentacao/Imagens/1488404390_architecture-interior-02.png"))); // NOI18N
        jMenu10.setText("Filiais");

        mnBuscarFiliais.setText("Cadastrar filiais");
        mnBuscarFiliais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnBuscarFiliaisActionPerformed(evt);
            }
        });
        jMenu10.add(mnBuscarFiliais);

        jMenuItem34.setText("Buscar filiais");
        jMenuItem34.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem34ActionPerformed(evt);
            }
        });
        jMenu10.add(jMenuItem34);

        mnRelatorioFiliais.setText("Relatorio filiais");
        mnRelatorioFiliais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnRelatorioFiliaisActionPerformed(evt);
            }
        });
        jMenu10.add(mnRelatorioFiliais);

        jMenuBar1.add(jMenu10);

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

    private void menuCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCadastrarActionPerformed
        
    }//GEN-LAST:event_menuCadastrarActionPerformed

    private void jMenu2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu2ActionPerformed

    private void mnCadastrarEventosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnCadastrarEventosActionPerformed
        CadastrarEvento telaCadastrarEvento = new CadastrarEvento();
        telaCadastrarEvento.setVisible(true);
    }//GEN-LAST:event_mnCadastrarEventosActionPerformed

    private void mnBuscarEventoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnBuscarEventoActionPerformed
        ListarEventos telaListarEventos = new ListarEventos();
        telaListarEventos.setVisible(true);
    }//GEN-LAST:event_mnBuscarEventoActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        ListarClientes telaListarClientes = new ListarClientes();
        telaListarClientes.setVisible(true);
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        ListarFuncionarios telaListarFuncionario = new ListarFuncionarios();
        telaListarFuncionario.setVisible(true);
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void mnCadastrarservicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnCadastrarservicoActionPerformed
        CadastrarServico telaCadastrarServico = new CadastrarServico();
        telaCadastrarServico.setVisible(true);
    }//GEN-LAST:event_mnCadastrarservicoActionPerformed

    private void mnBuscarServicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnBuscarServicoActionPerformed
        
        ListarServiços telaListarServiços = new ListarServiços();
        telaListarServiços.setVisible(true);
        
    }//GEN-LAST:event_mnBuscarServicoActionPerformed

    private void mnBuscarVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnBuscarVendaActionPerformed
        ListarVenda telaListarVenda = new ListarVenda();
        telaListarVenda.setVisible(true);
    }//GEN-LAST:event_mnBuscarVendaActionPerformed

    private void mnBuscarContasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnBuscarContasActionPerformed
        ListarContas telaListarContas = new ListarContas();
        telaListarContas.setVisible(true);
    }//GEN-LAST:event_mnBuscarContasActionPerformed

    private void mnBuscarFornecedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnBuscarFornecedoresActionPerformed
        ListarFornecedores telaListarFornecedor = new ListarFornecedores();
        telaListarFornecedor.setVisible(true);
    }//GEN-LAST:event_mnBuscarFornecedoresActionPerformed

    private void mnRelatorioFiliaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnRelatorioFiliaisActionPerformed
       FilialRepositorio daoFilial = GerenciadorDeReferencias.getFilial();
       buscaFilial = (ArrayList<Filial>) daoFilial.Abrir();
       exibeRelatorioJasper("RelatorioFilial.jasper", buscaFilial );
    }//GEN-LAST:event_mnRelatorioFiliaisActionPerformed

    private void mnBuscarFiliaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnBuscarFiliaisActionPerformed
        CadastrarFilial telaCadastrarFilial = new CadastrarFilial();
        telaCadastrarFilial.setVisible(true);
    }//GEN-LAST:event_mnBuscarFiliaisActionPerformed

    private void mnBuscarAdminisradorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnBuscarAdminisradorActionPerformed
       ListarAdministradores telaListarAdministradores = new ListarAdministradores();
       telaListarAdministradores.setVisible(true);
    }//GEN-LAST:event_mnBuscarAdminisradorActionPerformed

    private void mnRelatorioEventosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnRelatorioEventosActionPerformed
      EventoRepositorio daoEvento = GerenciadorDeReferencias.getEvento(); 
      buscaEvento = (ArrayList<Evento>) daoEvento.Abrir();   
      exibeRelatorioJasper("RelatorioEvento.jasper", buscaEvento);
    }//GEN-LAST:event_mnRelatorioEventosActionPerformed

    private void mnCadastrarFornecedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnCadastrarFornecedoresActionPerformed
        CadastrarFornecedor telaCadastrarFornecedor = new CadastrarFornecedor();
        telaCadastrarFornecedor.setVisible(true);
    }//GEN-LAST:event_mnCadastrarFornecedoresActionPerformed

    private void mnCadastrarContasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnCadastrarContasActionPerformed
        CadastrarContas telaCadastrarContas = new CadastrarContas();
        telaCadastrarContas.setVisible(true);
    }//GEN-LAST:event_mnCadastrarContasActionPerformed

    private void jMenuItem34ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem34ActionPerformed
        ListarFiliais telaListarFiliais = new ListarFiliais();
        telaListarFiliais.setVisible(true);
    }//GEN-LAST:event_jMenuItem34ActionPerformed

    private void jMenuItem25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem25ActionPerformed
       
        CadastrarProduto telaCadastrarProduto = new CadastrarProduto();
        telaCadastrarProduto.setVisible(true);
        
    }//GEN-LAST:event_jMenuItem25ActionPerformed

    private void jMenuItem26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem26ActionPerformed
        
        ListarProdutos telaListarProdutos = new ListarProdutos ();
        telaListarProdutos.setVisible(true);
        
    }//GEN-LAST:event_jMenuItem26ActionPerformed

    private void mnCadastrarAdministradorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnCadastrarAdministradorActionPerformed
        CadastrarAdministrador telaCadastrarAdministrador = new CadastrarAdministrador();
        telaCadastrarAdministrador.setVisible(true);
    }//GEN-LAST:event_mnCadastrarAdministradorActionPerformed

    private void mnRelatorioContasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnRelatorioContasActionPerformed
      /*FilialRepositorio daoFilial = GerenciadorDeReferencias.getFilial();
      buscaFilial = (ArrayList<Filial>) daoFilial.Abrir();
      exibeRelatorioJasper("RelatorioFilial.jasper", buscaFilial );*/
      ContaRepositorio daoConta = GerenciadorDeReferencias.getConta(); 
      buscaConta = (ArrayList<Conta>) daoConta.Abrir();   
      exibeRelatorioJasper("RepositorioContas.jasper", buscaConta);
    }//GEN-LAST:event_mnRelatorioContasActionPerformed

    private void mnCadastrarVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnCadastrarVendaActionPerformed
        
        TelaOperacoesVenda telaoperaçaovenda = new TelaOperacoesVenda();
        telaoperaçaovenda.setVisible(true);
        
    }//GEN-LAST:event_mnCadastrarVendaActionPerformed

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
    private javax.swing.JMenu jMenu10;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenu jMenu9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem25;
    private javax.swing.JMenuItem jMenuItem26;
    private javax.swing.JMenuItem jMenuItem27;
    private javax.swing.JMenuItem jMenuItem34;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JLabel lblImagem;
    private javax.swing.JMenu menuCadastrar;
    private javax.swing.JMenuItem mnBuscarAdminisrador;
    private javax.swing.JMenuItem mnBuscarContas;
    private javax.swing.JMenuItem mnBuscarEvento;
    private javax.swing.JMenuItem mnBuscarFiliais;
    private javax.swing.JMenuItem mnBuscarFornecedores;
    private javax.swing.JMenuItem mnBuscarServico;
    private javax.swing.JMenuItem mnBuscarVenda;
    private javax.swing.JMenuItem mnCadastrarAdministrador;
    private javax.swing.JMenuItem mnCadastrarContas;
    private javax.swing.JMenuItem mnCadastrarEventos;
    private javax.swing.JMenuItem mnCadastrarFornecedores;
    private javax.swing.JMenuItem mnCadastrarVenda;
    private javax.swing.JMenuItem mnCadastrarservico;
    private javax.swing.JMenuItem mnRelatorioContas;
    private javax.swing.JMenuItem mnRelatorioEventos;
    private javax.swing.JMenuItem mnRelatorioFiliais;
    private javax.swing.JMenuItem mnRelatorioSevico;
    private javax.swing.JMenuItem mnRelatorioVendas;
    private javax.swing.JMenuItem mnRelatoriofornecedores;
    private javax.swing.JPanel pnlTelaInicial;
    private javax.swing.JPanel pnlTituloImagem;
    // End of variables declaration//GEN-END:variables

    
    private void exibeRelatorioJasper(String caminho_relatorio, List dados) {
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
