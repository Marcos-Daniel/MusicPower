/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.MusicPower.Entidades;

/**
 *
 * @author Mdan
 */
public interface AdministradorRepositorio extends Repositorio<Administrador> {
    public Administrador Abrir(String cpf);
    public boolean VerificaLogin(String login, String senha);
}
