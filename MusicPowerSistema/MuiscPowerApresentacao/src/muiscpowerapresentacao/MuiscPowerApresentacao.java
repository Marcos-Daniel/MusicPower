/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package muiscpowerapresentacao;

import br.edu.ifnmg.MusicPower.Entidades.Cliente;
import br.edu.ifnmg.MusicPower.Entidades.ClienteRepositorio;
import br.edu.ifnmg.MusicPower.Entidades.Conta;
import br.edu.ifnmg.MusicPower.Entidades.ContaRepositorio;
import br.edu.ifnmg.MusicPower.Entidades.Evento;
import br.edu.ifnmg.MusicPower.Entidades.EventoRepositorio;
import br.edu.ifnmg.MusicPower.Entidades.Filial;
import br.edu.ifnmg.MusicPower.Entidades.FilialRepositorio;
import br.edu.ifnmg.MusicPower.Entidades.Fornecedor;
import br.edu.ifnmg.MusicPower.Entidades.FornecedorRepositorio;
import br.edu.ifnmg.MusicPower.Entidades.Funcionario;
import br.edu.ifnmg.MusicPower.Entidades.FuncionarioRepositorio;
import br.edu.ifnmg.MusicPower.Entidades.ItensVenda;
import br.edu.ifnmg.MusicPower.Entidades.ItensVendaRepositorio;
import br.edu.ifnmg.MusicPower.Entidades.Produto;
import br.edu.ifnmg.MusicPower.Entidades.ProdutoRepositorio;
import br.edu.ifnmg.MusicPower.Entidades.Venda;
import br.edu.ifnmg.MusicPower.Entidades.VendaRepositorio;
import java.sql.SQLException;
import musicpowerpersistencia.ClienteDAO;
import musicpowerpersistencia.ContaDAO;
import musicpowerpersistencia.EventoDAO;
import musicpowerpersistencia.FilialDAO;
import musicpowerpersistencia.FornecedorDAO;
import musicpowerpersistencia.FuncionarioDAO;
import musicpowerpersistencia.ItensVendaDAO;
import musicpowerpersistencia.ProdutoDAO;
import musicpowerpersistencia.VendaDAO;

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
    
    public static void criarEvento(Evento evento) throws SQLException {
        
        EventoRepositorio bd_evento = new EventoDAO();
        bd_evento.Salvar(evento);
        
    }
    
    public static void criarCliente(Cliente cliente) throws SQLException {
        
        ClienteRepositorio bd_cliente = new ClienteDAO();
        bd_cliente.Salvar(cliente);
        
    }
    
    public static void criarFuncionario(Funcionario funcionario) throws SQLException, ClassNotFoundException {
        
        FuncionarioRepositorio bd_funcionario = new FuncionarioDAO();
        bd_funcionario.Salvar(funcionario);
        
    }
    
    public static void criarProduto(Produto produto) throws SQLException, ClassNotFoundException {
        
        ProdutoRepositorio bd_produto = new ProdutoDAO();
        bd_produto.Salvar(produto);
        
    }
    
    public static void criarVenda(Venda venda) throws SQLException, ClassNotFoundException {
        
        VendaRepositorio bd_venda = new VendaDAO();
        bd_venda.Salvar(venda);
        
    }
    
    public static void criarBuscaVenda(Venda venda) throws SQLException, ClassNotFoundException {
        
        VendaRepositorio bd_venda = new VendaDAO();
        bd_venda.buscarUltimoId();
        
    }
    
    public static void criarItensVenda(ItensVenda Itensvenda) throws SQLException, ClassNotFoundException {
        
        ItensVendaRepositorio bd_Itensvenda = new ItensVendaDAO();
        bd_Itensvenda.Salvar(Itensvenda);
        
    }

}
