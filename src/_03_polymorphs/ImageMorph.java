package _03_polymorphs;

import java.awt.Color;
import java.awt.Graphics;

public class ImageMorph extends Polymorph{

	ImageMorph(int x, int y) {
		super(x, y);
		setWidth(50);
		setHeight(50);
	}

	@Override
	public void draw(Graphics g) {
		g.setColor(Color.blue);
		g.fillArc(getX(), getY(), getWidth(), getHeight(), 45, 270);
	}
	
	public void update() {
		
	}
	
}
