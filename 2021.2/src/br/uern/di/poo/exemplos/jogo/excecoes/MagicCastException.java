package br.uern.di.poo.exemplos.jogo.excecoes;
import br.uern.di.poo.exemplos.jogo.magias.Magia;

public class MagicCastException extends RuntimeException{
	
	private static final long serialVersionUID = 1L;
	
	private Magia magia;
	private String causa;
	public MagicCastException(Magia magia, String causa) {
		super();
		this.magia = magia;
		this.causa = causa;
	}
	public Magia getMagia() {
		return magia;
	}
	public String getCausa() {
		return causa;
	}
	@Override
	public String getMessage() {
		return "Erro ao lançar a magia " + magia.getNome() + ". Razão: " +
				this.causa;
	}

}
