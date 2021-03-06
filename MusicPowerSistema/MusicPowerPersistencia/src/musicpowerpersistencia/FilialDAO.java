/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package musicpowerpersistencia;

import br.edu.ifnmg.MusicPower.Entidades.ErroValidacao;
import br.edu.ifnmg.MusicPower.Entidades.Filial;
import br.edu.ifnmg.MusicPower.Entidades.FilialRepositorio;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author breno
 */
public class FilialDAO extends DAOGenerica<Filial> implements FilialRepositorio {

    public FilialDAO() throws SQLException {
        setConsultaSalvar("INSERT INTO filial(uf,cidade,bairro,rua,numEstabelicimento)VALUES(?,?,?,?,?)");
        setConsultaAlterar("UPDATE filial SET uf = ?,cidade = ?,bairro = ?,rua = ?,numEstabelicimento = ? WHERE id = ?");
        setConsultaExcluir("DELETE FROM filial WHERE id = ?");
        setConsultaAbrir("SELECT id,uf,cidade,bairro,rua,numEstabelicimento FROM filial");
        setConsultaBusca("select id,uf,cidade,bairro,rua,numEstabelicimento from filial ");
    }

    @Override
    protected Filial preencheObjeto(ResultSet resultado) {
        try {
            Filial tmp = new Filial();
            tmp.setId(resultado.getInt(1));
            tmp.setUF(resultado.getString(2));
            tmp.setCidade(resultado.getString(3));
            tmp.setBairro(resultado.getString(4));
            tmp.setRua(resultado.getString(5));
            tmp.setnEstabelecimento(resultado.getString(6));
            return tmp;
        } catch (SQLException ex) {
            System.out.println(ex + " FILIAL DAO PREENCHER OBJETO");
        } catch (ErroValidacao ex) {
            Logger.getLogger(FilialDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return null;
    }

    @Override
    protected void preencheConsulta(PreparedStatement sql, Filial obj) {
        try {
            sql.setString(1, obj.getUF());
            sql.setString(2, obj.getCidade());
            sql.setString(3, obj.getBairro());
            sql.setString(4, obj.getRua());
            sql.setString(5, obj.getnEstabelecimento());
            if(obj.getId() > 0) sql.setInt(6,obj.getId());
        } catch (SQLException ex) {
            System.out.println(ex + " FILIAL DAO PREENCHER CONSULTA");
        }
    }

    @Override
    protected void preencheFiltros(Filial filtro) {
        if (filtro.getId() > 0) {
            adicionarFiltro("id", "=");
        }
        if (filtro.getCidade() != null) {
            adicionarFiltro("cidade", "=");
        }
        if (filtro.getBairro() != null) {
            adicionarFiltro("bairro", "=");
        }
        if (filtro.getRua() != null) {
            adicionarFiltro("rua", "=");
        }
    }

    @Override
    protected void preencheParametros(PreparedStatement sql, Filial filtro) {
        try {
            int cont = 1;
            if (filtro.getId() > 0) {
                sql.setInt(cont, filtro.getId());
                cont++;
            }
            if (filtro.getCidade() != null) {
                sql.setString(cont, filtro.getCidade());
                cont++;
            }
            if (filtro.getBairro() != null) {
                sql.setString(cont, filtro.getBairro());
                cont++;
            }
            if (filtro.getRua() != null) {
                sql.setString(cont, filtro.getRua());
                cont++;
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(FilialDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public Filial Abrir(String cidade) throws SQLException {
        try {
            PreparedStatement sql = conn.prepareStatement("SELECT id,uf,cidade,bairro,rua,numEstabelicimento FROM Filial WHERE cidade = ?");
            sql.setString(1, cidade);
            ResultSet resultado = sql.executeQuery();
            if (resultado.next()) {
                return preencheObjeto(resultado);
            }
        } catch (SQLException ex) {
            System.out.println(ex + " FILIAL DAO ABRIR");
        }
        return null;
    }

}
