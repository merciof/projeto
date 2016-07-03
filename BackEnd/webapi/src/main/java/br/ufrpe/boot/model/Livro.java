package br.ufrpe.boot.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id; 

@Entity
public class Livro {
	
	@Id
	@GeneratedValue
	Integer id;
	String nome;
	String sinopse;
	String autor;
	String estadoConservacao; 
	String edicao;
	

	public Livro() { }

//	public Livro(Integer id, String nome, String sinopse, String autor, String estadoConservacao, String edicao) {
//		this.id = id;
//		this.nome = nome;
//		this.sinopse = sinopse;
//		this.autor = autor;
//		this.estadoConservacao = estadoConservacao;
//		this.edicao = edicao;
//	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSinopse() {
		return sinopse;
	}

	public void setSinopse(String sinopse) {
		this.sinopse = sinopse;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getEstadoConservacao() {
		return estadoConservacao;
	}

	public void setEstadoConservacao(String estadoConservacao) {
		this.estadoConservacao = estadoConservacao;
	}

	public String getEdicao() {
		return edicao;
	}

	public void setEdicao(String edicao) {
		this.edicao = edicao;
	}
	
	
}
