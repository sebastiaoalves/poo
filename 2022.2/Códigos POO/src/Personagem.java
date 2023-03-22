
public class Personagem {

	private int forca, agilidade, inteligencia;

	public Personagem(int forca, int agilidade, int inteligencia) throws AtributoIlegalException {
		this.forca = forca;
		if(forca < 1 || forca > 20)
			throw new AtributoIlegalException("Força");
		this.agilidade = agilidade;
		if(agilidade < 1 || agilidade > 20)
			throw new AtributoIlegalException("Agilidade");
		if(inteligencia < 1 || inteligencia > 20)
			throw new AtributoIlegalException("Inteligencia");
		this.inteligencia = inteligencia;
	}

	public int getForca() {
		return forca;
	}

	public void setForca(int forca) {
		this.forca = forca;
	}

	public int getAgilidade() {
		return agilidade;
	}

	public void setAgilidade(int agilidade) {
		this.agilidade = agilidade;
	}

	public int getInteligencia() {
		return inteligencia;
	}

	public void setInteligencia(int inteligencia) {
		this.inteligencia = inteligencia;
	}
	
	
	
}
