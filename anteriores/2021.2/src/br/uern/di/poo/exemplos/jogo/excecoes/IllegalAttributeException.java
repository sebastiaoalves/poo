package br.uern.di.poo.exemplos.jogo.excecoes;

public class IllegalAttributeException extends RuntimeException {
	
	private static final long serialVersionUID = 1L;
	private int valorAtributoPersonagem;
	private String nomeDoAtributoPersonagem;
	
	public IllegalAttributeException(int valorAtributoPersonagem, String nomeDoAtributoPersonagem) {
		super();
		this.valorAtributoPersonagem = valorAtributoPersonagem;
		this.nomeDoAtributoPersonagem = nomeDoAtributoPersonagem;
	}

	public int getValorAtributoPersonagem() {
		return valorAtributoPersonagem;
	}

	public String getNomeDoAtributoPersonagem() {
		return nomeDoAtributoPersonagem;
	}

	@Override
	public String getMessage() {
		return "Um atributo ilegal foi detectatado. Atributo: " + 
				this.nomeDoAtributoPersonagem + ". Valor: " +
				this.valorAtributoPersonagem +".";
	}
	
}
