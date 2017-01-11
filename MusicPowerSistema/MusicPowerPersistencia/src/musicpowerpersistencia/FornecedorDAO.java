/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package musicpowerpersistencia;

import br.edu.ifnmg.MusicPower.Entidades.Fornecedor;
import br.edu.ifnmg.MusicPower.Entidades.FornecedorRepositorio;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author marcos
 */
public class FornecedorDAO extends DAOGenerica<Fornecedor> implements FornecedorRepositorio {
    public FornecedorDAO() {
       setConsultaSalvar("INSERT INTO fornecedor(nome,cnpj,telefone,email,uf,cidade,nestabelecimento)VALUES(?,?,?,?,?,?,?)");
       setConsultaAlterar("UPDATE fornecedor SET nome = ?,cnpj = ?,telefone = ?,email = ?,uf = ?, cidade = ? nestabelecimento = ?, WHERE id = ?");
       setConsultaExcluir("DELETE FROM fornecedor WHERE id = ?");
       setConsultaAbrir("SELECT id,nome,cnpj,telefone,email,uf,cidade,nestabelecimento FROM Fornecedor WHERE id = ?");
    }
    @Override
    public Fornecedor preencherObjeto(ResultSet resultado) throws SQLException{
        try {
            Fornecedor tmp = new Fornecedor();
            tmp.setId(resultado.getInt(1));
            tmp.setNome(resultado.getString(2));
            tmp.setCnpj(resultado.getString(3));
            tmp.setTelefone(resultado.getString(4));
            tmp.setEmail(resultado.getString(5));
            tmp.setUF(resultado.getString(6));
            tmp.setCidade(resultado.getString(7));
            tmp.setnEstabelecimento(resultado.getString(8));
            return tmp;
        } catch(SQLException ex){
            System.out.println(ex);
        }
        return null;
    }
    @Override
    public void preencherConsulta(Fornecedor obj,PreparedStatement sql) throws SQLException{
        try {
            sql.setString(1, obj.getNome());
            sql.setString(2, obj.getCnpj());
            sql.setString(3, obj.getTelefone());
            sql.setString(4, obj.getEmail());
            sql.setString(5, obj.getUF());
            sql.setString(6, obj.getCidade());
            sql.setString(7, obj.getnEstabelecimento());
        } catch(SQLException ex){
            System.out.println(ex);
        }
    }
    @Override
    public Fornecedor Abrir(String nome) throws SQLException{
        try {
            PreparedStatement sql = conn.prepareStatement("SELECT id,nome,cnpj,telefone,email,uf,cidade,nestabelecimento FROM Fornecedor WHERE nome = ?");
            sql.setString(1, nome);
            ResultSet resultado = sql.executeQuery();
            if(resultado.next()) return preencherObjeto(resultado);
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return null;
    }

    @Override
    protected void preencheFiltros(Fornecedor filtro) {
       if(filtro.getId() > 0) adicionarFiltro("id", "=");
       if(filtro.getNome() != null) adicionarFiltro("nome", "=");
       if(filtro.getCnpj()!= null) adicionarFiltro("cnpj", "=");
    }

    @Override
    protected void preencheParametros(PreparedStatement sql, Fornecedor filtro) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
