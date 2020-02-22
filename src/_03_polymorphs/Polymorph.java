package _03_polymorphs;

import java.awt.Graphics;

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
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}
	
	
    
}
