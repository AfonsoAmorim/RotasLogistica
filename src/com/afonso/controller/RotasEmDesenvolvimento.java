package com.afonso.controller;

import com.afonso.regrasdenegocio.Movimentacoes;
import com.alonso.entidades.Motorista;
import com.alonso.entidades.Romaneio;

public class RotasEmDesenvolvimento {

	public static void main(String[] args) {

		Motorista motoristaAlfa = new Motorista("Jos� Gomes", 30, 22211100, 54465885);
		Motorista motoristaRomel = new Motorista("Julio", 33, 55888000, 996655442);

		Movimentacoes movimentacaoCarga = new Movimentacoes();
		movimentacaoCarga.taxaSp();
		movimentacaoCarga.taxaMg();
		
		
		Romaneio rotaAlfa = new Romaneio(1, "S�o Paulo", "Minas Gerais");
		System.out.println(rotaAlfa.toString());
		movimentacaoCarga.taxaSpParaMG();
		
		
		
	}

}
