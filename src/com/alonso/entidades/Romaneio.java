package com.alonso.entidades;

import com.afonso.regrasdenegocio.Movimentacoes;

public class Romaneio extends Movimentacoes  {

	private int numeroOS;
	private String rotaOrigem;
	private String rotaDestino;
	
	public Romaneio(int numeroOS, String rotaOrigem, String rotaDestino) {
		this.numeroOS = numeroOS;
		this.rotaOrigem = rotaOrigem;
		this.rotaDestino = rotaDestino;
	}
	
	
	
	@Override
	public String toString() {
		return "Romaneio [numeroOS=" + numeroOS + ", rotaOrigem=" + rotaOrigem + ", rotaDestino=" + rotaDestino +"]";
	
	}



	public int getNumeroOS() {
		return numeroOS;
	}
	public void setNumeroOS(int numeroOS) {
		this.numeroOS = numeroOS;
	}
	public String getRotaOrigem() {
		return rotaOrigem;
	}
	public void setRotaOrigem(String rotaOrigem) {
		this.rotaOrigem = rotaOrigem;
	}
	public String getRotaDestino() {
		return rotaDestino;
	}
	public void setRotaDestino(String rotaDestino) {
		this.rotaDestino = rotaDestino;
	}
	
	
	
}
