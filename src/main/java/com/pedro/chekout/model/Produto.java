package com.pedro.chekout.model;


import org.hibernate.validator.constraints.NotBlank;


public class Produto {
	
	@NotBlank
	private String Id;
	private String Nome;

	public String getId() {
		return Id;
	}

	public void setId(String id) {
		Id = id;
	}

	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}
}
