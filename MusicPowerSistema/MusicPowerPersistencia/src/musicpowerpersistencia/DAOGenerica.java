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
    Connection conn;
    String ConsultaSalvar, ConsultaAlterar, ConsultaAbrir, ConsultaExcluir;
    private String consultaBusca;
    
    private String where = "";

    DAOGenerica(){
        try {
            Conexao.iniciar();
            conn = Conexao.criarConexao();
        } catch (ClassNotFoundException ex) {
            System.out.println("Driver não encontrado!");
        } catch (SQLException ex) {
            System.out.println("Usuário/senha errados!");
        } 
    }
    public abstract T preencherObjeto(ResultSet resultado) throws SQLException;
    public abstract void preencherConsulta(T obj,PreparedStatement sql) throws SQLException;
    protected abstract void preencheFiltros(T filtro);
    protected abstract void preencheParametros(PreparedStatement sql, T filtro);
    @Override
       public boolean Salvar(T obj){
           try {
               PreparedStatement sql = conn.prepareStatement(ConsultaSalvar);
               preencherConsulta(obj,sql);
               sql.executeUpdate();
               return true;
           } catch (SQLException ex) {
             System.out.println(ex);
           }
           return false;
       }
    @Override
       public boolean Alterar(T obj){
           try {
               PreparedStatement sql = conn.prepareStatement(ConsultaAlterar);
               preencherConsulta(obj,sql);
               sql.executeUpdate();
               return true;
           } catch (SQLException ex) {
               System.out.println(ex);
           }
           return false;
       }
    @Override
       public boolean Excluir(int id){
           try {
               PreparedStatement sql = conn.prepareStatement(ConsultaExcluir);
               sql.setInt(1, id);
               sql.executeUpdate();
               return true;
           } catch (SQLException ex) {
               System.out.println(ex);
           }
           return false;
       }
   @Override
       public T Abrir(int id){
           try {
               PreparedStatement sql = conn.prepareStatement(ConsultaAbrir);
               sql.setInt(1, id);
               ResultSet resultado = sql.executeQuery();
               if(resultado.next()) return preencherObjeto(resultado);
           } catch (SQLException ex) {
               System.out.println(ex);
           }
           return null;
       }
    @Override
       public List<T> Buscar(T filtro){
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

                T tmp = preencherObjeto( resultado);

                ret.add(tmp);
            }

        } catch (SQLException ex) {
            System.out.println(ex);
        }      
           return ret;
       }
       
    protected void adicionarFiltro(String campo, String operador) {
        if (where.length() > 0) {
            where = where + " and ";
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
}
