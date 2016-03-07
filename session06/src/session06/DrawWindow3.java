package session06;
import javax.swing.JFrame;

public class DrawWindow3 {
	DrawWindow3() {
		JFrame f = new JFrame("Test");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setSize(800, 400);
		f.setVisible(true);		
	}
	
	
	public static void main(String[] a) {
		DrawWindow3 d1 = new DrawWindow3();
		new DrawWindow3();
		new DrawWindow3();
	}
}
