
public class TestePersonagem {

	public static void main(String[] args) {
		try {
			Personagem p = new Personagem(15, 28, 5);
			System.out.println("A força do personagem é " + p.getForca());
		} catch (AtributoIlegalException aie) {
			System.err.println(aie.getMessage());
		}
	}
}
