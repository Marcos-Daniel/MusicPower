/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package muiscpowerapresentacao;

import br.edu.ifnmg.MusicPower.Entidades.Conta;
import br.edu.ifnmg.MusicPower.Entidades.ContaRepositorio;
import br.edu.ifnmg.MusicPower.Entidades.Filial;
import br.edu.ifnmg.MusicPower.Entidades.FilialRepositorio;
import br.edu.ifnmg.MusicPower.Entidades.Fornecedor;
import br.edu.ifnmg.MusicPower.Entidades.FornecedorRepositorio;
import java.sql.SQLException;
import musicpowerpersistencia.ContaDAO;
import musicpowerpersistencia.FilialDAO;
import musicpowerpersistencia.FornecedorDAO;

/**
 *
 * @author Mdan
 */
public class MuiscPowerApresentacao {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        // TODO code application logic here
    }

    public static void criarFilial(Filial filial) throws SQLException{
        
        FilialRepositorio bd_filial = new FilialDAO();
        bd_filial.Salvar(filial);
        
    }
    
    public static void criarFornecedor(Fornecedor fornecedor){
        
        FornecedorRepositorio bd_fornecedor = new FornecedorDAO();
        bd_fornecedor.Salvar(fornecedor);
        
    }
    
    public static void criarConta(Conta conta) throws SQLException {
        
        ContaRepositorio bd_conta = new ContaDAO();
        bd_conta.Salvar(conta);
        
    }

}
