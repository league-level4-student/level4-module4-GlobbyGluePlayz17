package _03_polymorphs;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MouseFollowerMorph extends Polymorph {

	MouseFollowerMorph(int x, int y) {
		super(x, y);
		setWidth(50);
		setHeight(50);
	}

	@Override
	public void draw(Graphics g) {
		g.setColor(Color.red);
		g.fillRect(getX(), getY(), getWidth(), getHeight());
	}
	
	public void update(int mouseX, int mouseY) {
		super.update();
		setX(mouseX);
		setY(mouseY);
		
	}
	
}
