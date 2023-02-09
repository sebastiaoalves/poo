package br.uern.di.poo.sebastiao.uernfoods;

public class Alimento {
	
	private String medida, informacoesNutricionais;
	private String fabricante, nome;
	
	public Alimento(String medida, String informacoesNutricionais, String fabricante, String nome) {
		super();
		this.medida = medida;
		this.informacoesNutricionais = informacoesNutricionais;
		this.fabricante = fabricante;
		this.nome = nome;
	}

	public String getMedida() {
		return medida;
	}

	public void setMedida(String medida) {
		this.medida = medida;
	}

	public String getInformacoesNutricionais() {
		return informacoesNutricionais;
	}

	public void setInformacoesNutricionais(String informacoesNutricionais) {
		this.informacoesNutricionais = informacoesNutricionais;
	}

	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
