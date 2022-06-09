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
import javax.persistence.Lob;
import javax.persistence.ManyToOne;

/**
 *
 * @author rayss
 */
@Entity
public class Products implements Serializable{
    
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long idProduct;
    
    private String nomeProduct;
    private String descProduct;
    private String catProduct;
    private float precoProduct;
    private float pesoProduct;
    private String detailProduct;
    
    @Lob
    private byte[] imgProduct;
    
    private String nomeImg;
    private String tipoImg;
    
    //MUITOS PRODUTOS PARA UMA EMPRESA
    @ManyToOne
    private ParceCadEmpresa parceCadEmpresa;

    
    public byte[] getImgProduct() {
		return imgProduct;
	}


	public void setImgProduct(byte[] imgProduct) {
		this.imgProduct = imgProduct;
	}


	public String getNomeImg() {
		return nomeImg;
	}


	public void setNomeImg(String nomeImg) {
		this.nomeImg = nomeImg;
	}


	public String getTipoImg() {
		return tipoImg;
	}


	public void setTipoImg(String tipoImg) {
		this.tipoImg = tipoImg;
	}


	public ParceCadEmpresa getParceCadEmpresa() {
		return parceCadEmpresa;
	}


	public void setParceCadEmpresa(ParceCadEmpresa parceCadEmpresa) {
		this.parceCadEmpresa = parceCadEmpresa;
	}

  
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

    
    public float getPesoProduct() {
        return pesoProduct;
    }

    
    public void setPesoProduct(float pesoProduct) {
        this.pesoProduct = pesoProduct;
    }

   
    
}
