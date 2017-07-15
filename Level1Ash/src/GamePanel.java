import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JPanel;
import javax.swing.Timer;

public class GamePanel extends JPanel implements ActionListener, KeyListener{
	int repeat =17;
	Timer timer;
	GameObject object;
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		repaint();
		object.update();
	}
    public GamePanel(){
    	timer = new Timer(repeat,this);
    	object = new GameObject();
}
    void startGame(){
    	timer.start();
    }
    public void paintComponent(Graphics g){
    object.draw(g);	
		
	}
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
	}
	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		 if (e.getKeyCode() == KeyEvent.VK_UP){
				object.y = object.y-10;
			}
	if (e.getKeyCode() == KeyEvent.VK_DOWN){
		object.y = object.y+10;
	        }
	if (e.getKeyCode() == KeyEvent.VK_LEFT){
		object.x = object.x-10;
	        }
	if (e.getKeyCode() == KeyEvent.VK_RIGHT){
		object.x = object.x+10;
	}
	revalidate();
	repaint();
	}
	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub

	    if (e.getKeyCode() == KeyEvent.VK_UP){
					object.y = object.y-10;
				}
		if (e.getKeyCode() == KeyEvent.VK_DOWN){
			object.y = object.y+10;
		        }
		if (e.getKeyCode() == KeyEvent.VK_LEFT){
			object.x = object.x-10;
		        }
		if (e.getKeyCode() == KeyEvent.VK_RIGHT){
			object.x = object.x+10;
		}
		revalidate();
		repaint();
	}
}
	

