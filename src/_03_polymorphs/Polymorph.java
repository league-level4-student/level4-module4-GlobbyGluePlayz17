package _03_polymorphs;

import java.awt.Graphics;
import java.util.Random;

public abstract class Polymorph {
    private int x;
    private int y;
    private int width;
    private int height;
    
    Polymorph(int x, int y){
   	 this.x = x;
   	 this.y = y;
    }
    
    public void update(){
//   	 x = new Random().nextInt(850);
//   	 y = new Random().nextInt(550);
    	
    		x++;
    		y++;
		    	
    }
    
    public abstract void draw(Graphics g);
    
    public int getX() {
		return x;
    }
    
    public void setX(int x) {
    	if (x > 900) {
			x = 900;
		}
    	if (x < 0) {
			x = 0;
		}
    	this.x = x;
    }

	public int getY() {
		return y;
	}

	public void setY(int y) {
		if (x > 600) {
			x = 600;
		}
		if (x < 0) {
			x = 0;
		}
		this.y = y;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		width = 50;
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		height = 50;
		this.height = height;
	}
	
	
    
}
