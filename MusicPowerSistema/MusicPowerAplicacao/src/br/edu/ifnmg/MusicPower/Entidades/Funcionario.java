/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.MusicPower.Entidades;

import java.util.Date;


/**
 *
 * @author marcos
 */
public class Funcionario extends Pessoa implements Entidade {
    
    private int id;
    private String cargo;

    
    public Funcionario() {
        
    }
    
    public Funcionario(int id, String cargo, String nome, String cpf, Date dataNascimento, String telefone, String email, String UF, String cidade, String bairro, String rua, String nResidencia) {
        super();
      //  this.id = id;
        this.cargo = cargo;
    }
    
 /*   @Override
    public int getId() {
        return id;
    }
    
    @Override
    public void setId(int id) {
        this.id = id;
    }
   */ 
    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    
}
