package _03_polymorphs;

import java.awt.Color;
import java.awt.Graphics;

public class MovingMorph extends Polymorph{

	MovingMorph(int x, int y) {
		super(x, y);
		setWidth(50);
		setHeight(50);
	}

	@Override
	public void draw(Graphics g) {
		g.setColor(Color.black);
		g.fillRect(getX(), getY(), getWidth(), getHeight());
	}
	
//	public void Update() {
//		for (int i = 0; i < 10; i+=10) {
//			setX(getX()+i);
//		}
//		for (int i = 0; i < 10; i+=10) {
//			setY(getY()+i);
//		}
//	}
	
}
