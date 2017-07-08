import javax.swing.JFrame;

public class LeagueInvaders {
	JFrame a;
	final int width = 500;
	final int height = 800;
	public LeagueInvaders(){
		a = new JFrame();
		setup();
	}
	public static void main(String[] args) {
		System.out.println("hi");
		LeagueInvaders Game = new LeagueInvaders();
	}
	public void setup(){
		a.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
