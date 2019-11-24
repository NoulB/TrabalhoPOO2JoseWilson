/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.bean;

/**
 *
 * @author Raphael
 */
public class Tributacao {
    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome_tributo() {
        return nome_tributo;
    }

    public void setNome_tributo(String nome_tributo) {
        this.nome_tributo = nome_tributo;
    }
    private String nome_tributo;
}
