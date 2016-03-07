package session06;
import javax.swing.*;//JFrame;
//import java.awt.Color;
//import java.awt.Container;
import java.awt.*;

public class DrawWindow5 extends JFrame  {
	public DrawWindow5(String title, Color bg) {
		super(title);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(800, 400);
		Container c = getContentPane();
		c.setBackground(bg);
		JButton b = new JButton("ok");
//		c.add(BorderLayout.SOUTH,  new JLabel("testing"));
		JTextField t;
		c.add(BorderLayout.SOUTH,  t = new JTextField("testing"));
		t.setFont(new Font("Times", Font.PLAIN, 28));
		c.add(BorderLayout.NORTH, b);
		b = new JButton("cancel");
		c.add(BorderLayout.EAST, b);
		
		JPanel p = new JPanel();
		p.setBackground(Color.GREEN);
		p.setLayout(new GridLayout(2, 3, 5, 10));
		for (int i = 0; i < 6; i++) {
			b = new JButton(i + "");
			p.add(b);
		}
		c.add(BorderLayout.CENTER, p);
		
		
		
		
		
		this.setVisible(true);		
	}
	
	
	public static void main(String[] a) {
		new DrawWindow5("test", Color.RED);
		new DrawWindow5("hello", Color.BLUE);
	}
}
