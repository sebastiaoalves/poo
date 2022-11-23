import javax.swing.JFrame;

public class TesteVariaveis2 {

	public static void main(String[] args) {
		JFrame janela1, janela2;
		janela1 = new JFrame();
		janela2 = new JFrame();
		
		janela1.setSize(200,200);
		janela1.setTitle("1ª janela");
		janela1.setLocation(400, 400);
		janela1.setVisible(true);
		janela1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		janela2.setVisible(true);
		janela2.setTitle ("2ª janela");
		janela2.setSize(500,500);
		janela2.setLocation(0,0);
		janela2.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		
	}

}
