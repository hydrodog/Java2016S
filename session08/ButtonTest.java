public class ButtonTest extends JFrame {
	public ButtonTest() {
		super("test");
		setSize(600,600);
		Container c = getContentPane();
		JButton b = new JButton("ok");
		c.add(BorderLayout.NORTH, b);
		b.addActionListener(  new ActionListener() { // ButtonTest$1
        public void actionPerformed(ActionEvent e) {
					System.out.println("yo!");
				}
			} );
		
		b = new JButton("Cancel");
		b.addActionListener(  new ActionListener() { // ButtonTest$2
        public void actionPerformed(ActionEvent e) {
					System.out.println("yo!");
				}
			} );



		
		setVisible(true);

	}
}

class MyListener implements ActionListener {
	public void actionPerformed(ActionEvent e) {

	}
}
