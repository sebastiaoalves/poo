
public class AtributoIlegalException extends Exception {
	
	private String nomeDoAtributo;

	public AtributoIlegalException(String nomeDoAtributo) {
		super("O atributo " + nomeDoAtributo + " tem um valor inválido.");
		this.nomeDoAtributo = nomeDoAtributo;
	}

	public String getNomeDoAtributo() {
		return nomeDoAtributo;
	}

	public void setNomeDoAtributo(String nomeDoAtributo) {
		this.nomeDoAtributo = nomeDoAtributo;
	}

}
