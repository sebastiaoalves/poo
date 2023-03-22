import javax.swing.JOptionPane;

public class Teste {
	
	public static int leIndiceVetor() throws NullPointerException, NumberFormatException{
		String indiceStr = JOptionPane.showInputDialog("Digite o índice do vetor para exibir o elemento");
		String indiceStrSemEspaco = indiceStr.trim();
		int indiceVetor = Integer.parseInt(indiceStrSemEspaco);
		return indiceVetor;
	}
	
	public static void main(String[] args) {
		int vetor [ ] = {10, 20, 30};
		int indiceVetor = -1;
		try { 
			indiceVetor = leIndiceVetor();
			JOptionPane.showMessageDialog(null, "O elemento índice " + indiceVetor + " é " + vetor[indiceVetor]);
		} catch(NullPointerException npe) {
			System.err.println("O índice não foi informado.");
		} catch(NumberFormatException nfe) {
			System.err.println("O índice não é um número válido.");
		} catch(ArrayIndexOutOfBoundsException aiobe) {
			System.err.println("O índice deve ser entre 0 e " + vetor.length);
		} finally {
			JOptionPane.showMessageDialog(null, "Fim do programa");
		}
		System.exit(0);
	}

}
