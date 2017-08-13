package package3;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ColorTeacher implements ActionListener {

	JFrame j = new JFrame("Color teacher");
	JPanel p = new JPanel();
	JButton y = new JButton();
	JButton r = new JButton();
	JButton b = new JButton();
	JButton g = new JButton();

	public static void main(String[] args) {
		ColorTeacher teacher = new ColorTeacher();
		teacher.createUI();
	}

	void createUI() {
		y.setBackground(Color.yellow);
		y.setOpaque(true);
		r.setBackground(Color.red);
		r.setOpaque(true);
		b.setBackground(Color.blue);
		b.setOpaque(true);
		g.setBackground(Color.green);
		g.setOpaque(true);
		p.add(y);
		p.add(r);
		p.add(b);
		p.add(g);
		j.add(p);
		j.pack();
		j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		y.addActionListener(this);
		r.addActionListener(this);
		b.addActionListener(this);
		g.addActionListener(this);
		j.setVisible(true);

	}

	void speak(String words) {
		try {
			Runtime.getRuntime().exec("say " + words);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == y) {
			speak("yellow");
		}
		if (e.getSource() == r) {
			speak("red");
		}
		if (e.getSource() == b) {
			speak("blue");
		}
		if (e.getSource() == g) {
			speak("green");
		}
	}
}
