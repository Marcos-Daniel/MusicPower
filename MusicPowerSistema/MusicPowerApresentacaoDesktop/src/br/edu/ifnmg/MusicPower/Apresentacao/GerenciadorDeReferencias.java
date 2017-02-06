package br.edu.ifnmg.MusicPower.Apresentacao;


import br.edu.ifnmg.MusicPower.Entidades.FilialRepositorio;
import java.sql.SQLException;
import java.util.Locale;
import musicpowerpersistencia.FilialDAO;

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
    
    public static FilialRepositorio getFilial() {
        try{
            if(daoFilial == null){
                daoFilial = new FilialDAO();
                 return daoFilial;
            }
        } catch(SQLException e){
            System.out.print(e);
        }
         return null;
    }
    
}
