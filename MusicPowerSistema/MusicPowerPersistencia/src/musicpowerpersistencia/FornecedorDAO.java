/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package musicpowerpersistencia;

import br.edu.ifnmg.MusicPower.Entidades.ErroValidacao;
import br.edu.ifnmg.MusicPower.Entidades.Fornecedor;
import br.edu.ifnmg.MusicPower.Entidades.FornecedorRepositorio;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author marcos
 */
public class FornecedorDAO extends DAOGenerica<Fornecedor> implements FornecedorRepositorio {

    public FornecedorDAO() {
        setConsultaSalvar("INSERT INTO fornecedor(nome,cnpj,telefone,email,uf,cidade,bairro,rua,numestabelecimento)VALUES(?,?,?,?,?,?,?,?,?)");
        setConsultaAlterar("UPDATE fornecedor SET nome = ?,cnpj = ?,telefone = ?,email = ?,uf = ?,bairro = ?,rua = ?, cidade = ?, numestabelecimento  = ? WHERE id = ?");
        setConsultaExcluir("DELETE FROM fornecedor WHERE id = ?");
        setConsultaAbrir("SELECT id,nome,cnpj,telefone,email,uf,cidade,bairro,rua,numestabelecimento FROM fornecedor");
        setConsultaBusca("SELECT id,nome,cnpj,telefone,email,uf,cidade,bairro,rua,numestabelecimento FROM fornecedor");
    }

    @Override
    public Fornecedor Abrir(String nome) throws SQLException {
        try {
            PreparedStatement sql = conn.prepareStatement("SELECT id,nome,cnpj,telefone,email,uf,cidade,nestabelecimento FROM Fornecedor WHERE nome = ?");
            sql.setString(1, nome);
            ResultSet resultado = sql.executeQuery();
            if (resultado.next()) {
                return preencheObjeto(resultado);
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return null;
    }

    @Override
    protected void preencheFiltros(Fornecedor filtro) {
        if (filtro.getId() > 0) {
            adicionarFiltro(" id", "=");
        }
        if (filtro.getNome() != null) {
            adicionarFiltro("nome", "=");
        }
        if (filtro.getCnpj() != null) {
            adicionarFiltro(" cnpj", "=");
        }
    }

    @Override
    protected void preencheParametros(PreparedStatement sql, Fornecedor filtro) {
        try {
            int cont = 1;
            if (filtro.getId() > 0) {
                sql.setInt(cont, filtro.getId());
                cont++;
            }
            if (filtro.getNome() != null) {
                sql.setString(cont, filtro.getNome());
                cont++;
            }
            if (filtro.getCnpj() != null) {
                sql.setString(cont, filtro.getCnpj());
                cont++;
            }

        } catch (SQLException ex) {
            Logger.getLogger(FornecedorDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    protected Fornecedor preencheObjeto(ResultSet resultado) {
        try {
            Fornecedor tmp = new Fornecedor();
            tmp.setId(resultado.getInt(1));
            tmp.setNome(resultado.getString(2));
            tmp.setCnpj(resultado.getString(3));
            tmp.setTelefone(resultado.getString(4));
            tmp.setEmail(resultado.getString(5));
            tmp.setUF(resultado.getString(6));
            tmp.setBairro(resultado.getString(7));
            tmp.setRua(resultado.getString(8));
            tmp.setCidade(resultado.getString(9));
            tmp.setnEstabelecimento(resultado.getString(10));
            return tmp;
        } catch (SQLException ex) {
            System.out.println(ex);
        } catch (ErroValidacao ex) {
            Logger.getLogger(FornecedorDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    @Override
    protected void preencheConsulta(PreparedStatement sql, Fornecedor obj) {
        try {
            sql.setString(1, obj.getNome());
            sql.setString(2, obj.getCnpj());
            sql.setString(3, obj.getTelefone());
            sql.setString(4, obj.getEmail());
            sql.setString(5, obj.getUF());
            sql.setString(6, obj.getCidade());
            sql.setString(7, obj.getBairro());
            sql.setString(8, obj.getRua());
            sql.setString(9, obj.getnEstabelecimento());
            if(obj.getId() > 0) sql.setInt(10,obj.getId());
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }
}
