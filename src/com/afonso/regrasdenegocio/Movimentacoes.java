package com.afonso.regrasdenegocio;

import com.afonso.controller.Destinos;

public class Movimentacoes implements Destinos {

	public void  taxaSp() {	
		System.out.println("O ICMS partindo de  SP �: " + SP);
	}
	
	public void taxaMg() {
		System.out.println("O ICMS partindo de MG �: " + MG);
	}

	public void taxaSpParaMG() {
		if(SP > MG) {
			System.out.println("Considerar valor de SP");
		}else {
			System.out.println("Considerar valor de MG");
		}
	}
	
	public void taxaMgParaSp() {
		if(MG > SP) {
			System.out.println("Considerar valor de MG");
		}else {
			System.out.println("Considerar valor de SP");
		}
	}
	
	public void taxaCobrarSeValorIgual() {
		System.out.println("Considerar o valor do ponto de partida.");
	}
}
