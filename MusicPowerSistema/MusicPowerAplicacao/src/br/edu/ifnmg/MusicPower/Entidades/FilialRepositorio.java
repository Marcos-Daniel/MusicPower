/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.MusicPower.Entidades;

import java.sql.SQLException;

/**
 *
 * @author breno
 */
public interface FilialRepositorio extends Repositorio<Filial>{
    public Filial Abrir(String cidade) throws SQLException;
}
