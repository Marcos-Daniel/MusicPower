/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package musicpowerpersistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author breno
 */
public class Conexao {
    
    public static void iniciar() throws ClassNotFoundException{
        Class.forName("com.mysql.jdbc.Driver");
    }
    public static Connection criarConexao() throws SQLException{
        return DriverManager.getConnection("jdbc:mysql://localhost:3306/BDMusicPower","root","root");
    }
}
