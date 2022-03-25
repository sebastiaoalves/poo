package br.uern.di.poo.exemplos;

// Criar uma classe chamada CartaBaralho, que tem os atributos Carta e Naipe, 
// usando as enums acima. Criar também:
// Um construtor, que recebe  a carta e o naipe
// Os métodos get para carta e naipe
// Um método público estático chamado geraBaralho, que retorna um vetor com
// todas as cartas de um baralho.

public class CartaBaralho {
	
	private Naipe naipe;
	private Carta carta;
	/**
	 * @param naipe
	 * @param carta
	 */
	public CartaBaralho(Naipe naipe, Carta carta) {
		super();
		this.naipe = naipe;
		this.carta = carta;
	}
	/**
	 * @return the naipe
	 */
	public Naipe getNaipe() {
		return naipe;
	}
	/**
	 * @return the carta
	 */
	public Carta getCarta() {
		return carta;
	}
	
	public static CartaBaralho[] geraBaralho() {
		Naipe todosOsNaipes[] = Naipe.values();
		Carta todasAsCartas[] = Carta.values();
		
		CartaBaralho [] baralho = 
				new CartaBaralho[todasAsCartas.length * todosOsNaipes.length];
		
		int i = 0;
		for (Naipe naipe : todosOsNaipes)
			for (Carta carta : todasAsCartas) {
				baralho[i] = new CartaBaralho(naipe, carta);
				i++;
			}
		
		return baralho;
	}
	@Override
	public String toString() {
		return this.carta.getNome() + " de " + this.naipe.getNome();
	}
	
	

}



