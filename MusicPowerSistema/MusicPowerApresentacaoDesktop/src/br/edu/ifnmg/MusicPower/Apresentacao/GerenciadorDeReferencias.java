package br.edu.ifnmg.MusicPower.Apresentacao;

import br.edu.ifnmg.MusicPower.Entidades.ClienteRepositorio;
import br.edu.ifnmg.MusicPower.Entidades.ContaRepositorio;
import br.edu.ifnmg.MusicPower.Entidades.EventoRepositorio;
import br.edu.ifnmg.MusicPower.Entidades.FilialRepositorio;
import br.edu.ifnmg.MusicPower.Entidades.FornecedorRepositorio;
import java.sql.SQLException;
import java.util.Locale;
import musicpowerpersistencia.ClienteDAO;
import musicpowerpersistencia.ContaDAO;
import musicpowerpersistencia.EventoDAO;
import musicpowerpersistencia.FilialDAO;
import musicpowerpersistencia.FornecedorDAO;

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
    
    public static FornecedorRepositorio getFornecedor(){
        try {
            if(daoFornecedor == null){
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

}
