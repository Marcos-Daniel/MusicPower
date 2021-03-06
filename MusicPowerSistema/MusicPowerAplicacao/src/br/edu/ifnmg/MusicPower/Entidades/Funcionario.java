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
public class Funcionario extends Pessoa {
    
    private String cargo;

    
    public Funcionario() {
        
    }
    
    public Funcionario(int id, String cargo, String nome, String cpf, Date dataNascimento, String telefone, String email, String UF, String cidade, String bairro, String rua, String nResidencia) {
        super();
        this.cargo = cargo;
    }
    
    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) throws ErroValidacao {
        if(cargo.length() > 30)
            throw new ErroValidacao("O atributo CARGO deve ter no máximo 30 caracteres!");
        this.cargo = cargo;
    }
    
}
