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
public interface ClienteRepositorio extends Repositorio<Cliente> {
    public Cliente Abrir(String cpf) throws SQLException;
    public boolean validarCliente(int id, String nome);
    public Boolean Verificar(String cpf) throws SQLException;
}
