package package2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ChuckleClicker implements ActionListener {
	JFrame j = new JFrame();
	JPanel panel = new JPanel();
	JButton b1 = new JButton("joke");
	JButton b2 = new JButton("punchline");

	public static void main(String[] args) {
		ChuckleClicker c = new ChuckleClicker();
		c.makeButtons();
	}

	public void makeButtons() {

		b1.addActionListener(this);
		b2.addActionListener(this);
		panel.add(b1);
		panel.add(b2);
		j.add(panel);
		j.pack();
		j.setVisible(true);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == b1){
			JOptionPane.showMessageDialog(null, "Where do animals go when their tails fall off?");
		}
		else if(e.getSource() == b2){
			JOptionPane.showMessageDialog(null, "The retail store.");

		}

	}
}
