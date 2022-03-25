package br.uern.di.poo.exemplos;

public class JogoFutebol {

	private String nomeTimeCasa;
	private int golsTimeCasa;
	
	private String nomeTimeVisitante;
	private int golsTimeVisitante;
	
	/**
	 * @param nomeTimeCasa
	 * @param golsTimeCasa
	 * @param nomeTimeVisitante
	 * @param golsTimeVisitante
	 */
	public JogoFutebol(String nomeTimeCasa, int golsTimeCasa, String nomeTimeVisitante, int golsTimeVisitante) {
		super();
		this.nomeTimeCasa = nomeTimeCasa;
		this.golsTimeCasa = golsTimeCasa;
		this.nomeTimeVisitante = nomeTimeVisitante;
		this.golsTimeVisitante = golsTimeVisitante;
	}

	/**
	 * @return the nomeTimeCasa
	 */
	public String getNomeTimeCasa() {
		return nomeTimeCasa;
	}

	/**
	 * @param nomeTimeCasa the nomeTimeCasa to set
	 */
	public void setNomeTimeCasa(String nomeTimeCasa) {
		this.nomeTimeCasa = nomeTimeCasa;
	}

	/**
	 * @return the golsTimeCasa
	 */
	public int getGolsTimeCasa() {
		return golsTimeCasa;
	}

	/**
	 * @param golsTimeCasa the golsTimeCasa to set
	 */
	public void setGolsTimeCasa(int golsTimeCasa) {
		this.golsTimeCasa = golsTimeCasa;
	}

	/**
	 * @return the nomeTimeVisitante
	 */
	public String getNomeTimeVisitante() {
		return nomeTimeVisitante;
	}

	/**
	 * @param nomeTimeVisitante the nomeTimeVisitante to set
	 */
	public void setNomeTimeVisitante(String nomeTimeVisitante) {
		this.nomeTimeVisitante = nomeTimeVisitante;
	}

	/**
	 * @return the golsTimeVisitante
	 */
	public int getGolsTimeVisitante() {
		return golsTimeVisitante;
	}

	/**
	 * @param golsTimeVisitante the golsTimeVisitante to set
	 */
	public void setGolsTimeVisitante(int golsTimeVisitante) {
		this.golsTimeVisitante = golsTimeVisitante;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + golsTimeCasa;
		result = prime * result + golsTimeVisitante;
		result = prime * result + ((nomeTimeCasa == null) ? 0 : nomeTimeCasa.hashCode());
		result = prime * result + ((nomeTimeVisitante == null) ? 0 : nomeTimeVisitante.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		JogoFutebol other = (JogoFutebol) obj;
		if (golsTimeCasa != other.golsTimeCasa)
			return false;
		if (golsTimeVisitante != other.golsTimeVisitante)
			return false;
		if (nomeTimeCasa == null) {
			if (other.nomeTimeCasa != null)
				return false;
		} else if (!nomeTimeCasa.equals(other.nomeTimeCasa))
			return false;
		if (nomeTimeVisitante == null) {
			if (other.nomeTimeVisitante != null)
				return false;
		} else if (!nomeTimeVisitante.equals(other.nomeTimeVisitante))
			return false;
		return true;
	}
	
	
	
}
