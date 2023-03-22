import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class TesteUnitarioPersonagem {
	
	@Test
	public void testaForca() throws AtributoIlegalException {
		Personagem p = new Personagem(20, 15, 10);
		assertEquals(p.getForca(), 20);
	}
	
	@Test
	public void testaAgilidade() throws AtributoIlegalException {
		Personagem p = new Personagem(20, 15, 10);
		assertEquals(p.getAgilidade(), 15);
	}
	
	@Test(expected = AtributoIlegalException.class)
	public void testaInteligenciaInvalido() throws AtributoIlegalException {
		Personagem p = new Personagem(20, 15, -1);
		assertEquals(p.getInteligencia(), -1);
	}
	
}
