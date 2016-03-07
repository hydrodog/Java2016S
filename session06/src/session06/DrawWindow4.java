package session06;
import javax.swing.JFrame;

public class DrawWindow4 {
	public static void createWindow() {
		JFrame f = new JFrame("Test");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setSize(800, 400);
		f.setVisible(true);		
	}
	
	
	public static void main(String[] a) {
		createWindow();
		createWindow();
	}
}
