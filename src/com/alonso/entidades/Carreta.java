package com.alonso.entidades;

public class Carreta {

	private String nomeMarca;
	private int datafabricacao;
	private int mediaKm;

	public Carreta(String nomeMarca, int dataFabricacao, int mediaKm) {
		this.nomeMarca = nomeMarca;
		this.datafabricacao = dataFabricacao;
		this.mediaKm = mediaKm;
	}

	public Carreta() {
	
	}
	
	
	public String getNomeMarca() {
		return nomeMarca;
	}

	public void setNomeMarca(String nomeMarca) {
		this.nomeMarca = nomeMarca;
	}

	public int getDatafabricacao() {
		return datafabricacao;
	}

	public void setDatafabricacao(int datafabricacao) {
		this.datafabricacao = datafabricacao;
	}

	public int getMediaKm() {
		return mediaKm;
	}

	public void setMediaKm(int mediaKm) {
		this.mediaKm = mediaKm;
	}

}
