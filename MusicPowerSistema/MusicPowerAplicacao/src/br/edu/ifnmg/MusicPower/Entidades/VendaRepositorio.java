/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.MusicPower.Entidades;

/**
 *
 * @author breno
 */
public interface VendaRepositorio extends Repositorio<Venda>{
    public int buscarUltimoId();
    public boolean ExcluirItens(int idvenda);
}
