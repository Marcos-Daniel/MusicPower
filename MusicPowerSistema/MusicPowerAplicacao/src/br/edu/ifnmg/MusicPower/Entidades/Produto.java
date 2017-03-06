/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.MusicPower.Entidades;

import java.util.Objects;

/**
 *
 * @author breno
 */
public class Produto implements Entidade {
    private int id;
    private String descricao;
    private String marca;
    private String modelo;
    private int qtd;
    private Double valor;
    private String lote;
    
    public Produto() {
        
    }
    

    public Produto(int id, String descricao, String marca, String modelo, int qtd, Double valor, String lote) {
        if(id > 0){
        this.id = id;
        }else{
          this.id = 0;  
        }
        this.descricao = descricao;
        this.marca = marca;
        this.modelo = modelo;
        this.qtd = qtd;
        this.valor = valor;
        this.lote = lote;
    }
  
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) throws ErroValidacao{
          if(marca.length() > 50)
            throw new ErroValidacao("O atributo MARCA deve ter no máximo 50 caracteres!");
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) throws ErroValidacao{
        if(modelo.length() > 50)
            throw new ErroValidacao("O atributo MODELO deve ter no máximo 50 caracteres!");
        this.modelo = modelo;
    }

    public String getLote() {
        return lote;
    }

    public void setLote(String lote) throws ErroValidacao{
        if(lote.length() > 50)
            throw new ErroValidacao("O atributo LOTE deve ter no máximo 50 caracteres!");
        this.lote = lote;
    }
    
    @Override
    public int getId() {
        return id;
    }
    @Override
    public void setId(int id) {
        this.id = id;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) throws ErroValidacao{
          if(descricao.length() > 50)
            throw new ErroValidacao("O atributo DESCRICAO deve ter no máximo 50 caracteres!");
        this.descricao = descricao;
    }
    public int getQtd() {
        return qtd;
    }
    public void setQtd(int qtd) {
        this.qtd = qtd;
    }
    public Double getValor() {
        return valor;
    }
    public void setValor(Double valor) {
        this.valor = valor;
    }
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + this.id;
        hash = 79 * hash + Objects.hashCode(this.descricao);
        return hash;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Produto other = (Produto) obj;
        if (this.id != other.id) {
            return false;
        }
        if (!Objects.equals(this.descricao, other.descricao)) {
            return false;
        }
        return true;
    }
    @Override
    public String toString() {
        return "Produto{" + "id=" + id + ", descricao=" + descricao + '}';
    }   
}
