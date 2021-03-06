package br.curso.springboot.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.ForeignKey;

@Entity
public class Telefone implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String numero;
	private String tipo;
	
	@ManyToOne//MUITOS TELEFONES PARA UMA EMPRESA
	private ParceCadEmpresa parceCadEmpresa;
	
	//MUITOS TELEFONES PARA UMA EMPRESA
	@ForeignKey(name = "pessoa_id")
	@ManyToOne(optional = false)//ANNOTAÇÃO QUE OBRIGA TER UM PAI CADASTRADO
	private Pessoa pessoa;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	public ParceCadEmpresa getParceCadEmpresa() {
		return parceCadEmpresa;
	}
	public void setParceCadEmpresa(ParceCadEmpresa parceCadEmpresa) {
		this.parceCadEmpresa = parceCadEmpresa;
	}
	public Pessoa getPessoa() {
		return pessoa;
	}
	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}
}
