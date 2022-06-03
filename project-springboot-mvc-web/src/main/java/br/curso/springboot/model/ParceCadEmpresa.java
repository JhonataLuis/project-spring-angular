/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.curso.springboot.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.OneToMany;

/**
 *
 * @author rayss
 */
@Entity
public class ParceCadEmpresa implements Serializable{
    
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
    private int codParceVend;
	
    private String nomeEmp;
    private String cnpjEmp;
    private String ramoEmp;
    private String nomeRepre;
    private String sobrenomeRepre;
    private String emailRepre;
    
    @OneToMany//UMA EMPRESA PARA MUITOS TELEFONES
    private List<Telefone> telefones;
    
    @Lob
    private byte[] imagemBusiness;
    
    private String nomeImg;
    private String tipoImg;

    
    public byte[] getImagemBusiness() {
		return imagemBusiness;
	}


	public void setImagemBusiness(byte[] imagemBusiness) {
		this.imagemBusiness = imagemBusiness;
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


	public int getCodParceVend() {
        return codParceVend;
    }

   
    public void setCodParceVend(int codParceVend) {
        this.codParceVend = codParceVend;
    }

    
    public String getNomeEmp() {
        return nomeEmp;
    }

   
    public void setNomeEmp(String nomeEmp) {
        this.nomeEmp = nomeEmp;
    }

    
    public String getCnpjEmp() {
        return cnpjEmp;
    }

   
    public void setCnpjEmp(String cnpjEmp) {
        this.cnpjEmp = cnpjEmp;
    }

    
    

    
    public String getRamoEmp() {
        return ramoEmp;
    }

    
    public void setRamoEmp(String ramoEmp) {
        this.ramoEmp = ramoEmp;
    }

    
    public String getNomeRepre() {
        return nomeRepre;
    }

    
    public void setNomeRepre(String nomeRepre) {
        this.nomeRepre = nomeRepre;
    }

    
    public String getSobrenomeRepre() {
        return sobrenomeRepre;
    }

    
    public void setSobrenomeRepre(String sobrenomeRepre) {
        this.sobrenomeRepre = sobrenomeRepre;
    }

    
    public String getEmailRepre() {
        return emailRepre;
    }

    
    public void setEmailRepre(String emailRepre) {
        this.emailRepre = emailRepre;
    }

    
   public List<Telefone> getTelefones() {
	return telefones;
   }
   
   public void setTelefones(List<Telefone> telefones) {
	this.telefones = telefones;
   }


}
