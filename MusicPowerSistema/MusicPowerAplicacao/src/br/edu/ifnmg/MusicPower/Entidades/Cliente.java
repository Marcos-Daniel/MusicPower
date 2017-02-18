/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.MusicPower.Entidades;


/**
 *
 * @author marcos
 */
public class Cliente extends Pessoa implements Entidade {

    private int id;
   
    public Cliente() {

    }

    public Cliente(int id, String nome, String cpf, String telefone, String email, String UF, String cidade, String bairro, String rua, String nResidencia) {
        super();
        this.id = id;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public void setId(int id) {
        this.id = id;
    }
    
}
