package com.orangetalents.projetoSpring.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "tb_endereco")
public class Endereco {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@NotBlank(message = "Insira o logradouro!")
	@Size(min = 3, max = 100)
	private String logradouro;
	
	@NotBlank(message = "Insira o número!")
	@Size(max = 10)
	private String numero;
	
	@Size(max = 50)
	private String complemento;
	
	@NotBlank(message = "Insira o bairro!")
	@Size(min = 3, max = 50)
	private String bairro;
	
	@NotBlank(message = "Insira a cidade!")
	@Size(min = 2, max = 50)
	private String cidade;
	
	@NotBlank(message = "Insira o estado!")
	@Size(min = 2, max = 25)
	private String estado;
	
	@NotBlank(message = "Insira o CEP!")
	@Size(min = 8, max = 9)
	private String cep;
	
	@ManyToOne
	@JsonIgnoreProperties("endereco")
	private Usuario usuario;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
}
