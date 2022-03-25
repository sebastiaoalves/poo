// Um comentário
package br.uern.di.poo.exemplos.basicos;

import javax.swing.JFrame;
import static javax.swing.JOptionPane.*;

/*
 * Comentário de várias linhas. 
 */
public class Hello {

	public static void main(String[] args) {
		System.out.println("Alô mundo.");
		System.out.printf("%s ", "Alô mundo");
		showMessageDialog(null, "Alô mundo.");
		JFrame janela1 = new JFrame("Uma janela");
		JFrame janela2 = new JFrame("Outra janela");
		janela1.setVisible(true);
		janela2.setVisible(true);
	}

}
