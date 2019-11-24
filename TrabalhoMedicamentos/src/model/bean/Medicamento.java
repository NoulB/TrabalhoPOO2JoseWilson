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
public class Medicamento {
    private String id_med;
    private String nome_med;
    private String descr_prod;
    private String ean;
    private double preco;
    private double preco_icms;
    private String exclusivo_hospital;
    private int med_tipo_id_tipo;
    private String nome_tipo;
    private String substancias;

    public String getSubstancias() {
        return substancias;
    }

    public void setSubstancias(String substancias) {
        this.substancias = substancias;
    }

    public String getNome_tipo() {
        return nome_tipo;
    }

    public void setNome_tipo(String nome_tipo) {
        this.nome_tipo = nome_tipo;
    }

    public Object getGetMed_tipo() {
        return getMed_tipo;
    }

    public void setGetMed_tipo(Object getMed_tipo) {
        this.getMed_tipo = getMed_tipo;
    }
    private String substancia_cod_subs;
    private String tributacao_id;
    private String fabricante_cnpj;
    public Object getMed_tipo;

    public String getId_med() {
        return id_med;
    }

    public void setId_med(String id_med) {
        this.id_med = id_med;
    }

    public String getNome_med() {
        return nome_med;
    }

    public void setNome_med(String nome_med) {
        this.nome_med = nome_med;
    }

    public String getDescr_prod() {
        return descr_prod;
    }

    public void setDescr_prod(String descr_prod) {
        this.descr_prod = descr_prod;
    }

    public String getEan() {
        return ean;
    }

    public void setEan(String ean) {
        this.ean = ean;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double getPreco_icms() {
        return preco_icms;
    }

    public void setPreco_icms(double preco_icms) {
        this.preco_icms = preco_icms;
    }

    public String getExclusivo_hospital() {
        return exclusivo_hospital;
    }

    public void setExclusivo_hospital(String exclusivo_hospital) {
        this.exclusivo_hospital = exclusivo_hospital;
    }

    public int getMed_tipo_id_tipo() {
        return med_tipo_id_tipo;
    }

    public void setMed_tipo_id_tipo(int med_tipo_id_tipo) {
        this.med_tipo_id_tipo = med_tipo_id_tipo;
    }

    public String getSubstancia_cod_subs() {
        return substancia_cod_subs;
    }

    public void setSubstancia_cod_subs(String substancia_cod_subs) {
        this.substancia_cod_subs = substancia_cod_subs;
    }

    public String getTributacao_id() {
        return tributacao_id;
    }

    public void setTributacao_id(String tributacao_id) {
        this.tributacao_id = tributacao_id;
    }

    public String getFabricante_cnpj() {
        return fabricante_cnpj;
    }

    public void setFabricante_cnpj(String fabricante_cnpj) {
        this.fabricante_cnpj = fabricante_cnpj;
    }

    public void setMed_tipo(Med_tipo tipo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setSubstancia(Substancias sub) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Object getMed_tipo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
 
    
}
