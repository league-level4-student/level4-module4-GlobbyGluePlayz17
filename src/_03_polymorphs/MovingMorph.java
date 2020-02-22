package _03_polymorphs;

import java.awt.Color;
import java.awt.Graphics;

public class MovingMorph extends Polymorph{

	MovingMorph(int x, int y) {
		super(x, y);
	}

	@Override
	public void draw(Graphics g) {
		g.setColor(Color.gray);
		g.fillRect(getX(), getY(), 50, 50);
	}
	
	public void update() {
		
	}
	
}
