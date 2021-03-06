package br.edu.ifnmg.MusicPower.Apresentacao;

import br.edu.ifnmg.MusicPower.Entidades.AdministradorRepositorio;
import br.edu.ifnmg.MusicPower.Entidades.ClienteRepositorio;
import br.edu.ifnmg.MusicPower.Entidades.CompraRepositorio;
import br.edu.ifnmg.MusicPower.Entidades.ContaRepositorio;
import br.edu.ifnmg.MusicPower.Entidades.EventoRepositorio;
import br.edu.ifnmg.MusicPower.Entidades.FilialRepositorio;
import br.edu.ifnmg.MusicPower.Entidades.FornecedorRepositorio;
import br.edu.ifnmg.MusicPower.Entidades.FuncionarioRepositorio;
import br.edu.ifnmg.MusicPower.Entidades.ItensCompraRepositorio;
import br.edu.ifnmg.MusicPower.Entidades.ItensVendaRepositorio;
import br.edu.ifnmg.MusicPower.Entidades.ProdutoRepositorio;
import br.edu.ifnmg.MusicPower.Entidades.ServiçoRepositorio;
import br.edu.ifnmg.MusicPower.Entidades.VendaRepositorio;
import java.sql.SQLException;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import musicpowerpersistencia.AdministradorDao;
import musicpowerpersistencia.ClienteDAO;
import musicpowerpersistencia.CompraDAO;
import musicpowerpersistencia.ContaDAO;
import musicpowerpersistencia.EventoDAO;
import musicpowerpersistencia.FilialDAO;
import musicpowerpersistencia.FornecedorDAO;
import musicpowerpersistencia.FuncionarioDAO;
import musicpowerpersistencia.ItensCompraDAO;
import musicpowerpersistencia.ItensVendaDAO;
import musicpowerpersistencia.ProdutoDAO;
import musicpowerpersistencia.ServicoDAO;
import musicpowerpersistencia.VendaDAO;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Mdan
 */
public class GerenciadorDeReferencias {

    private static FilialRepositorio daoFilial;
    private static ContaRepositorio daoConta;
    private static FornecedorRepositorio daoFornecedor;
    private static EventoRepositorio daoEvento;
    private static ClienteRepositorio daoCliente;
    private static FuncionarioRepositorio daoFuncionario;
    private static AdministradorRepositorio daoAdministrador;
    private static ServiçoRepositorio daoServiço;
    private static ProdutoRepositorio daoProduto;
    private static VendaRepositorio daoVenda;
    private static ItensVendaRepositorio daoItensVenda;
    private static CompraRepositorio daoCompra;
    private static ItensCompraRepositorio daoItensCompra;
    
    public static FilialRepositorio getFilial() {
        try {
            if (daoFilial == null) {
                daoFilial = new FilialDAO();
            }
            return daoFilial;
        } catch (SQLException e) {
            System.out.print(e);
        }
        return null;
    }

    public static FornecedorRepositorio getFornecedor() {
        try {
            if (daoFornecedor == null) {
                daoFornecedor = new FornecedorDAO();
            }
            return daoFornecedor;
        } catch (Exception e) {
            System.out.print(e);
        }
        return null;
    }

    public static ContaRepositorio getConta() {
        try {
            if (daoConta == null) {
                daoConta = new ContaDAO();
            }
            return daoConta;
        } catch (Exception e) {
            System.out.print(e);
        }
        return null;
    }

    public static EventoRepositorio getEvento() {
        try {
            if (daoEvento == null) {
                daoEvento = new EventoDAO();
            }
            return daoEvento;
        } catch (Exception e) {
            System.out.print(e);
        }
        return null;
    }

    public static ClienteRepositorio getCliente() {
        try {
            if (daoCliente == null) {
                daoCliente = new ClienteDAO();
            }
            return daoCliente;
        } catch (Exception e) {
            System.out.print(e);
        }
        return null;
    }

    public static FuncionarioRepositorio getFuncionario() {
        try {
            if (daoFuncionario == null) {
                daoFuncionario = new FuncionarioDAO();
            }
            return daoFuncionario;
        } catch (Exception e) {
            System.out.print(e);
        }
        return null;
    }
    
    public static AdministradorRepositorio getAdministrador() {
        try {
            if (daoAdministrador == null) {
                daoAdministrador = new AdministradorDao();
            }
            return daoAdministrador;
        } catch (Exception e) {
            System.out.print(e);
        }
        return null;
    }
    
    public static ServiçoRepositorio getServiço() {
        try {
            if (daoServiço == null) {
                daoServiço = new ServicoDAO();
            }
            return daoServiço;
        } catch (Exception e) {
            System.out.print(e);
        }
        return null;
    }
    
    public static ProdutoRepositorio getProduto() {
        try {
            if (daoProduto == null) {
                daoProduto = new ProdutoDAO();
            }
            return daoProduto;
        } catch (Exception e) {
            System.out.print(e);
        }
        return null;
    }
    
    public static VendaRepositorio getVenda() {
        try {
            if (daoVenda == null) {
                daoVenda = new VendaDAO();
            }
            return daoVenda;
        } catch (Exception e) {
            System.out.print(e);
        }
        return null;
    }
    
    public static ItensVendaRepositorio getItensVenda() {
        try {
            if (daoItensVenda == null) {
                daoItensVenda = new ItensVendaDAO();
            }
            return daoItensVenda;
        } catch (Exception e) {
            System.out.print(e);
        }
        return null;
    }
    
     public static CompraRepositorio getCompra() {
        try {
            if (daoCompra == null) {
                daoCompra = new CompraDAO();
            }
            return daoCompra;
        } catch (Exception e) {
            System.out.print(e);
        }
        return null;
    }
    
    public static ItensCompraRepositorio getItensCompra() {
        try {
            if (daoItensCompra == null) {
                daoItensCompra = new ItensCompraDAO();
            }
            return daoItensCompra;
        } catch (Exception e) {
            System.out.print(e);
        }
        return null;
    }

}
