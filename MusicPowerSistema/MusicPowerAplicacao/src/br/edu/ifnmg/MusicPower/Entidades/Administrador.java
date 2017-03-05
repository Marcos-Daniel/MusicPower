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
public class Administrador extends Pessoa{
    
    private String cargo;
    private String login;
    private String senha;

    public Administrador() {
     
    }

    public Administrador(int i, String nome, String cpf, Object object, Object object0, Object object1, Object object2, Object object3, Object object4, Object object5, Object object6, Object object7, Object object8, Object object9) {
        super();
        this.cargo = cargo;
        this.login = login;
        this.senha = senha;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) throws ErroValidacao {
        if(cargo.length() > 56)
            throw new ErroValidacao("O atributo CARGO deve ter no máximo 56 caracteres!");
        this.cargo = cargo;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) throws ErroValidacao {
        if(login.length() > 15)
            throw new ErroValidacao("O atributo LOGIN deve ter no máximo 15 caracteres!");
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) throws ErroValidacao {
        if(senha.length() > 20)
            throw new ErroValidacao("atributo SENHA deve ter no máximo 20 caracteres!");
        this.senha = senha;
    }
    
}
