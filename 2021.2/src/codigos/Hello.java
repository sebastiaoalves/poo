// Um comentário
package codigos;
import java.lang.System;
import java.math.*;
import java.time.*;
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
		janela2.setVisible(true);
	}

}
