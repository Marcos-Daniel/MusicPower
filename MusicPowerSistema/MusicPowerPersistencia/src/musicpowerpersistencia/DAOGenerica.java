/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package musicpowerpersistencia;

import br.edu.ifnmg.MusicPower.Entidades.Entidade;
import br.edu.ifnmg.MusicPower.Entidades.Repositorio;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import static sun.misc.MessageUtils.where;

/**
 *
 * @author breno
 */
public abstract class DAOGenerica<T extends Entidade> implements Repositorio<T> {

    protected Connection conn;
    private String ConsultaSalvar;
    private String ConsultaAlterar;
    private String ConsultaAbrir;
    private String ConsultaExcluir;
    private String consultaBusca;
    private String consultaUltimoId;

    private String where = "";

    DAOGenerica() {
        try {
            Conexao.iniciar();
            conn = Conexao.criarConexao();
        } catch (ClassNotFoundException ex) {
            System.out.println("Driver não encontrado!");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

    protected abstract T preencheObjeto(ResultSet resultado);
    protected abstract void preencheConsulta(PreparedStatement sql, T obj);
    protected abstract void preencheFiltros(T filtro);
    protected abstract void preencheParametros(PreparedStatement sql, T filtro);
    
    @Override
    public boolean Salvar(T obj) {
        try {
            if (obj.getId() == 0) {
                PreparedStatement sql = conn.prepareStatement(getConsultaSalvar());
                preencheConsulta(sql, obj);
                sql.executeUpdate();
            } else {
                PreparedStatement sql = conn.prepareStatement(getConsultaAlterar());
                preencheConsulta(sql, obj);
                sql.executeUpdate();
            }
            return true;

        } catch (SQLException e) {
            System.out.print(e + " Dg Salvar");

        }
        return false;
    }

    @Override
    public boolean Alterar(T obj) {
        try {
            PreparedStatement sql = conn.prepareStatement(ConsultaAlterar);
            preencheConsulta(sql, obj);
            sql.executeUpdate();
            return true;
        } catch (SQLException ex) {
            System.out.println(ex + "Dg Alterar");
        }
        return false;
    }

    @Override
    public T Excluir(int id) {
        try {
            PreparedStatement sql = conn.prepareStatement(ConsultaExcluir);
            sql.setInt(1, id);
            sql.executeUpdate();
            return null;
        } catch (SQLException ex) {
            System.out.println(ex + "Dg Excluir");
        }
        return null;
    }

    @Override
    public T Abrir(int id) {
        try {
            PreparedStatement sql = conn.prepareStatement(ConsultaAbrir);
            sql.setInt(1, id);
            ResultSet resultado = sql.executeQuery();
            if (resultado.next()) {
                return preencheObjeto(resultado);
            }
        } catch (SQLException ex) {
            System.out.println(ex + "Dg Abrir");
        }
        return null;
    }

    @Override
    public List<T> Buscar(T filtro) {
        List<T> ret = new ArrayList<>();
        preencheFiltros(filtro);

        if (where.length() > 0) {
            where = "WHERE " + where;
        }

        try {
            PreparedStatement sql = conn.prepareStatement(getConsultaBusca() + where);
            preencheParametros(sql, filtro);
            ResultSet resultado = sql.executeQuery();
            while (resultado.next()) {

                T tmp = preencheObjeto(resultado);

                ret.add(tmp);
            }

        } catch (SQLException ex) {
            System.out.println(ex + " Dg Buscar");
        }
        return ret;
    }

    protected void adicionarFiltro(String campo, String operador) {
        if (where.length() > 0) {
            where = where + " or ";
        }

        where = where + campo + " " + operador + " ?";
    }

    public String getConsultaSalvar() {
        return ConsultaSalvar;
    }

    public void setConsultaSalvar(String ConsultaSalvar) {
        this.ConsultaSalvar = ConsultaSalvar;
    }

    public String getConsultaAlterar() {
        return ConsultaAlterar;
    }

    public void setConsultaAlterar(String ConsultaAlterar) {
        this.ConsultaAlterar = ConsultaAlterar;
    }

    public String getConsultaAbrir() {
        return ConsultaAbrir;
    }

    public void setConsultaAbrir(String ConsultaAbrir) {
        this.ConsultaAbrir = ConsultaAbrir;
    }

    public String getConsultaExcluir() {
        return ConsultaExcluir;
    }

    public void setConsultaExcluir(String ConsultaExcluir) {
        this.ConsultaExcluir = ConsultaExcluir;
    }

    public String getConsultaBusca() {
        return consultaBusca;
    }

    public void setConsultaBusca(String consultaBusca) {
        this.consultaBusca = consultaBusca;
    }

    public String getConsultaUltimoId() {
        return consultaUltimoId;
    }

    public void setConsultaUltimoId(String consultaUltimoId) {
        this.consultaUltimoId = consultaUltimoId;
    }
}
