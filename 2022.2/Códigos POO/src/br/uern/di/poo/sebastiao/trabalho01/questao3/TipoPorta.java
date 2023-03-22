package br.uern.di.poo.sebastiao.trabalho01.questao3;

public enum TipoPorta {
	
	PORTA_SIMPLES("Porta simples", "Compensado", "Simples", 50), 
	PORTA_PADRAO("Porta padrão", "Andiroba", "Encaixe", 140),
	PORTA_LUXO("Porta de luxo", "Ipê", "Tetra", 350);
	
	String descricao;
	String material;
	String fechadura;
	double precoPorMetroQuadrado;
	
	private TipoPorta(String descricao, String material, String fechadura, double precoPorMetroQuadrado) {
		this.descricao = descricao;
		this.material = material;
		this.fechadura = fechadura;
		this.precoPorMetroQuadrado = precoPorMetroQuadrado;
	}
	

	public String getDescricao() {
		return descricao;
	}


	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}


	public String getMaterial() {
		return material;
	}

	public String getFechadura() {
		return fechadura;
	}

	public double getPrecoPorMetroQuadrado() {
		return precoPorMetroQuadrado;
	}
	
	public String toString() {
		return this.descricao + " de " + this.material + " com fechadura " + this.fechadura; 
	}

}
