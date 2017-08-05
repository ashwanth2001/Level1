package package2;

import java.applet.AudioClip;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class TootMachine implements ActionListener {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton b1 = new JButton("Fart");

	public static void main(String[] args) {
		TootMachine m = new TootMachine();
		m.makeButtons();
	}

	public void makeButtons() {
		b1.addActionListener(this);
		panel.add(b1);
		frame.add(panel);
		frame.pack();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	private void playSound(String fileName) {
		AudioClip sound = JApplet.newAudioClip(getClass().getResource(fileName));
		sound.play();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == b1) {
			Random r = new Random();
			int a = 1 + r.nextInt(4);
			if (a == 1) {
				playSound("Fart1.wav");
			}
			if (a == 2) {
				playSound("Fart2.wav");
			}
			if (a == 3) {
				playSound("Fart3.wav");
			}
			if (a == 4) {
				playSound("Fart4.wav");
			}
			System.out.println(a);
		}
	}

}
