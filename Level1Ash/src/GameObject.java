import java.awt.Color;
import java.awt.Graphics;

public class GameObject {
int x;
int y;
int width;
int height;
void update(){
	
}
void draw(Graphics g){
	g.setColor(Color.BLUE);
	g.fillRect(x,y,100,100);
}
}
