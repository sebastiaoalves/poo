package br.uern.di.poo.sebastiao.trabalho01.questao3;

public class ServicosPorta {

	public static final double ADICIONAL_LUXO = 0.1;
	
	public static final double SERVICO_INSTALACAO_POR_METRO = 70.0;
	
	public static final double SERVICO_INSTALACAO_PIVOTANTE = 350.0;

	public static double calculaPrecoInstalacao(Porta porta) {
		double area = porta.getAltura() * porta.getLargura();
		double valor = area * SERVICO_INSTALACAO_POR_METRO;
		if(porta.isPivotante())
			valor += SERVICO_INSTALACAO_PIVOTANTE;
		if(porta.getTipoPorta() == TipoPorta.PORTA_LUXO)
			valor *= 1.1;
		return valor;
	}
	
}
