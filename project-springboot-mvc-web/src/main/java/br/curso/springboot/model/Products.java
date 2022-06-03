/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.curso.springboot.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author rayss
 */
@Entity
public class Products implements Serializable{
    
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idProduct;
    
    private int codParceVend;
    private String loginUsuEmp;
    private String nomeProduct;
    private String descProduct;
    private String catProduct;
    private float precoProduct;
    private float pesoProduct;
    private String detailProduct;
    private String imgProduct;

  
    public Long getIdProduct() {
        return idProduct;
    }

   
    public void setIdProduct(Long idProduct) {
        this.idProduct = idProduct;
    }

   
    public String getNomeProduct() {
        return nomeProduct;
    }

  
    public void setNomeProduct(String nomeProduct) {
        this.nomeProduct = nomeProduct;
    }

   
    public String getDescProduct() {
        return descProduct;
    }

    public void setDescProduct(String descProduct) {
        this.descProduct = descProduct;
    }

  
    public String getCatProduct() {
        return catProduct;
    }

   
    public void setCatProduct(String catProduct) {
        this.catProduct = catProduct;
    }

  
    public float getPrecoProduct() {
        return precoProduct;
    }

  
    public void setPrecoProduct(float precoProduct) {
        this.precoProduct = precoProduct;
    }

    
    public String getDetailProduct() {
        return detailProduct;
    }

   
    public void setDetailProduct(String detailProduct) {
        this.detailProduct = detailProduct;
    }

   
    public String getImgProduct() {
        return imgProduct;
    }

   
    public void setImgProduct(String imgProduct) {
        this.imgProduct = imgProduct;
    }

    
    public String getLoginUsuEmp() {
        return loginUsuEmp;
    }

   
    public void setLoginUsuEmp(String loginUsuEmp) {
        this.loginUsuEmp = loginUsuEmp;
    }

   
    public int getCodParceVend() {
        return codParceVend;
    }

   
    public void setCodParceVend(int codParceVend) {
        this.codParceVend = codParceVend;
    }

    
    public float getPesoProduct() {
        return pesoProduct;
    }

    
    public void setPesoProduct(float pesoProduct) {
        this.pesoProduct = pesoProduct;
    }

   
    
}
