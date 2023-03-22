package br.uern.di.poo.sebastiao.trabalho01.questao3;

public class Porta {
	
	private TipoPorta tipoPorta;
	private double altura, largura;
	private boolean pivotante;
	
	public static final double ADICIONAL_PIVOTANTE = 350;
	
	public static final double LARGURA_PADRAO = 0.7;
	public static final double ALTURA_PADRAO = 1.8;
	
	public Porta() {
		this.tipoPorta = TipoPorta.PORTA_SIMPLES;
		this.altura = ALTURA_PADRAO;
		this.largura = LARGURA_PADRAO;
		this.pivotante = false;
	}

	public Porta(TipoPorta tipoPorta, double altura, double largura, boolean pivotante) {
		this.tipoPorta = tipoPorta;
		this.altura = altura;
		this.largura = largura;
		this.pivotante = pivotante;
	}

	public TipoPorta getTipoPorta() {
		return tipoPorta;
	}

	public void setTipoPorta(TipoPorta tipoPorta) {
		this.tipoPorta = tipoPorta;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getLargura() {
		return largura;
	}

	public void setLargura(double largura) {
		this.largura = largura;
	}

	public boolean isPivotante() {
		return pivotante;
	}

	public void setPivotante(boolean pivotante) {
		this.pivotante = pivotante;
	}
	
	public double calculaPreco() {
		double area = this.altura * this.largura;
		double preco = area * this.tipoPorta.getPrecoPorMetroQuadrado();
		if(this.pivotante)
			preco += ADICIONAL_PIVOTANTE;
		return preco;
	}
	
	public void exibePorta() {
		System.out.println("Informações da porta:");
		System.out.println("Tipo: " + this.tipoPorta.toString());
		System.out.println("Dimensões: " + this.largura + "m x " +this.altura + "m");
		System.out.println("Pivotante: " + (this.pivotante?"Sim":"Não"));
	}

}
