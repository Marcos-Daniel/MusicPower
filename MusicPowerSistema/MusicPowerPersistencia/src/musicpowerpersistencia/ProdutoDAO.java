/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package musicpowerpersistencia;

import br.edu.ifnmg.MusicPower.Entidades.Produto;
import br.edu.ifnmg.MusicPower.Entidades.ProdutoRepositorio;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author marcos
 */
public class ProdutoDAO extends DAOGenerica<Produto> implements ProdutoRepositorio {
    public ProdutoDAO() throws SQLException{
       setConsultaSalvar("INSERT INTO produto(descricao,marca,modelo,qtd,valor,lote)VALUES(?,?,?,?,?,?)");
       setConsultaAlterar("UPDATE produto SET descricao = ?,marca = ?,modelo = ?,qtd = ?,valor = ?,lote = ? WHERE id = ?");
       setConsultaExcluir("DELETE FROM produto WHERE id = ?");
       setConsultaAbrir("SELECT id,descricao,marca,modelo,qtd,valor,lote FROM produto");
       setConsultaBusca("SELECT id,descricao,marca,modelo,qtd,valor,lote FROM produto");
    }
  
    @Override
    public Produto Abrir(String descricao) throws SQLException{
        try {
            PreparedStatement sql = conn.prepareStatement("SELECT id,descricao,qtd,valor FROM produto WHERE descricao = ?");
            sql.setString(1, descricao);
            ResultSet resultado = sql.executeQuery();
            if(resultado.next()) return preencheObjeto(resultado);
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return null;
    }

    @Override
    protected void preencheFiltros(Produto filtro) {
        if(filtro.getId() > 0) adicionarFiltro("id", "=");
        if(filtro.getDescricao()!= null) adicionarFiltro("descricao", "=");
        if(filtro.getMarca()!= null) adicionarFiltro("marca", "=");
    }

    @Override
    protected void preencheParametros(PreparedStatement sql, Produto filtro) {
         try {
            int cont = 1;
            if(filtro.getId() > 0){ sql.setInt(cont, filtro.getId()); cont++; }
            if(filtro.getDescricao()!= null ){ sql.setString(cont, filtro.getDescricao()); cont++; }
            if(filtro.getMarca()!=null){ sql.setString(cont, filtro.getMarca());}
            
        } catch (SQLException ex) {
            Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    protected Produto preencheObjeto(ResultSet resultado) {
        try {
            Produto tmp = new Produto();
            tmp.setId(resultado.getInt(1));
            tmp.setDescricao(resultado.getString(2));
            tmp.setMarca(resultado.getString(3));
            tmp.setModelo(resultado.getString(4));
            tmp.setQtd(resultado.getInt(5));
            tmp.setValor(resultado.getDouble(6));
            tmp.setLote(resultado.getString(7));
            return tmp;
      } catch(SQLException ex){
          System.out.println(ex);
      }
      return null;
    }

    @Override
    protected void preencheConsulta(PreparedStatement sql, Produto obj) {
       try{
            sql.setString(1, obj.getDescricao());
            sql.setString(2, obj.getMarca());
            sql.setString(3, obj.getModelo());
            sql.setInt(4, obj.getQtd());
            sql.setDouble(5, obj.getValor());
            sql.setString(6, obj.getLote());
            if(obj.getId() >0) sql.setInt(7, obj.getId());
        } catch(SQLException ex){
            System.out.println(ex);
        }
    }

}
