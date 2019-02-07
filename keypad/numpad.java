/**
 * It looks like panels don't work all by themselves, you have to put them into a JFrame
 */

import java.awt.*;			// Abstract Window Toolkit , precedes Swing
import javax.swing.*;		// GUI widget toolkit
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class numpad extends JPanel{
	
	String numberString = "";
	
	JTextField txtf = new JTextField();
	
	JButton b1 = new JButton("1");
	JButton b2 = new JButton("2");
	JButton b3 = new JButton("3");
	JButton b4 = new JButton("4");
	JButton b5 = new JButton("5");
	JButton b6 = new JButton("6");
	JButton b7 = new JButton("7");
	JButton b8 = new JButton("8");
	JButton b9 = new JButton("9");
	JButton bstar = new JButton("*");
	JButton b0 = new JButton("0");		
	JButton bhash = new JButton("#");
	JButton bclear = new JButton("Clear");
	
	public numpad() {			// constructor that inherits from JPanel
		
		JPanel panel = new JPanel(new GridLayout(4,3));
		
		panel.add(b1);
		panel.add(b2);
		panel.add(b3);
		panel.add(b4);
		panel.add(b5);
		panel.add(b6);
		panel.add(b7);
		panel.add(b8);
		panel.add(b9);
		panel.add(bstar);
		panel.add(b0);		
		panel.add(bhash);
		panel.add(bclear);
		
		BtListener bthear = new BtListener();
		
		b1.addActionListener(bthear);
		b2.addActionListener(bthear);
		b3.addActionListener(bthear);
		b4.addActionListener(bthear);
		b5.addActionListener(bthear);
		b6.addActionListener(bthear);
		b7.addActionListener(bthear);
		b8.addActionListener(bthear);
		b9.addActionListener(bthear);
		bstar.addActionListener(bthear);
		b0.addActionListener(bthear);
		bhash.addActionListener(bthear);
		bclear.addActionListener(bthear);
		
		// let's add a listener to all the buttons
		
		setLayout(new BorderLayout());
		add(panel, BorderLayout.CENTER);
		add(bclear, BorderLayout.SOUTH);
		add(txtf, BorderLayout.NORTH);
		
		txtf.setHorizontalAlignment(SwingConstants.RIGHT);
		txtf.setPreferredSize(new Dimension(300, 30));
		
	}
	
	public static void main(String[] args) {		// where the program starts from... tell program what to run
		// invokeLater may cause this code to run before or later than rest of program/body
		SwingUtilities.invokeLater(new Runnable() {
			
			public void run() {
				JFrame frame = new JFrame();
				frame.add(new numpad());
				frame.setSize(300,400);
				frame.setVisible(true);
			
			}
		});
	}
	
	class BtListener implements ActionListener {
		
		@Override		// overriding method
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == b1) {
				numberString += "1";			// you are adding strings, not numbers ;)
				txtf.setText(numberString);
			} else if (e.getSource() == b2) {
				numberString += "2";
				txtf.setText(numberString);
			} else if (e.getSource() == b3) {
				numberString += "3";
				txtf.setText(numberString);
			} else if (e.getSource() == b4) {
				numberString += "4";
				txtf.setText(numberString);
			} else if (e.getSource() == b5) {
				numberString += "5";
				txtf.setText(numberString);
			} else if (e.getSource() == b6) {
				numberString += "6";
				txtf.setText(numberString);
			} else if (e.getSource() == b7) {
				numberString += "7";
				txtf.setText(numberString);
			} else if (e.getSource() == b8) {
				numberString += "8";
				txtf.setText(numberString);
			} else if (e.getSource() == b9) {
				numberString += "9";
				txtf.setText(numberString);
			} else if (e.getSource() == bstar) {
				numberString += "*";
				txtf.setText(numberString);
			} else if (e.getSource() == b0) {
				numberString += "0";
				txtf.setText(numberString);
			} else if (e.getSource() == bhash) {
				numberString += "#";
				txtf.setText(numberString);
			} else if (e.getSource() == bclear) {
				numberString = "";					// set textfield to nothing when cleared
				txtf.setText(numberString);
			}
			
		}
	}

}
