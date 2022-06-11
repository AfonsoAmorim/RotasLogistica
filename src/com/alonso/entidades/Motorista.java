package com.alonso.entidades;

public class Motorista {

	private String nome;
	private int idade;
	private int cnh;
	private int rg;
	
	public Motorista(String nome, int idade, int cnh, int rg) {
		this.nome = nome;
		this.idade = idade;
		this.cnh = cnh;
		this.rg = rg;
	}
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public int getCnh() {
		return cnh;
	}
	public void setCnh(int cnh) {
		cnh = cnh;
	}
	public int getRg() {
		return rg;
	}
	public void setRg(int rg) {
		this.rg = rg;
	} 
	
	
	
}
