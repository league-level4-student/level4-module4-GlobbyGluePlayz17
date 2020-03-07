package _03_polymorphs;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

public class PolymorphWindow extends JPanel implements ActionListener, MouseListener, MouseMotionListener{
    public static final int WIDTH = 900;
    public static final int HEIGHT = 600;
    
    private JFrame window;
    private Timer timer;
    
    Polymorph movingPoly0;
    Polymorph movingPoly1;
    Polymorph movingPoly3;
    ArrayList<Polymorph> pmarr;
    
    Polymorph mdm;
    MouseFollowerMorph mfm;
    Polymorph im;
    
    public static void main(String[] args) {
   	 new PolymorphWindow().buildWindow();
    }
    
    public void buildWindow(){
   	 window = new JFrame("IT'S MORPHIN' TIME!");
   	 window.add(this);
   	 window.getContentPane().setPreferredSize(new Dimension(500, 500));
   	 window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   	 window.pack();
   	 window.setVisible(true);
   	 
   	 window.addMouseListener(this);
   	 window.addMouseMotionListener(this);
   	 
   	 
//   bluePoly = new BluePolymorph(50, 50);
//   redPoly = new RedMorph(100, 100);
     movingPoly0 = new MovingMorph(39, 47);
     movingPoly1 = new MovingMorph(56, 20);
     movingPoly3 = new MovingMorph(46, 50);
     
     mdm = new MessageDisplayerMorph(400, 400);
     mfm = new MouseFollowerMorph(390, 203);
     im = new ImageMorph(50, 269);
     
   	 pmarr = new ArrayList<Polymorph>();
   	 pmarr.add(movingPoly0);
   	 pmarr.add(movingPoly1);
   	 pmarr.add(movingPoly3);

   	 
   	 timer = new Timer(1000 / 30, this);
   	 timer.start();
    }
    
    public void paintComponent(Graphics g){
    //draw background
   	 g.setColor(Color.LIGHT_GRAY);
   	 g.fillRect(0, 0, 500, 500);
   	 
   	 
   	for (Polymorph p: pmarr) {
  		 p.draw(g);
  	 }

   	mdm.draw(g);
   	mfm.draw(g);
   	im.draw(g);
   	
//   draw polymorph
//   bluePoly.draw(g);
// 	 redPoly.draw(g);
// 	 movingPoly.draw(g);
   	 
    }

    @Override
    public void actionPerformed(ActionEvent e) {
   	 repaint();
   	 
   	 for (Polymorph p: pmarr) {
   		 p.update();
   	 }
   	 
   	 im.update();
   	 
//   bluePoly.update();
//   redPoly.update();
// 	 movingPoly.update();
   	 
    }

	@Override
	public void mouseClicked(MouseEvent e) {	
		
//		if (e.getX() > mdm.getX() ||  e.getX() < mdm.getX()+mdm.getWidth()) {
//			System.out.println(mdm.getX());
//			if (e.getY() > mdm.getY() ||  e.getY() < mdm.getY()+mdm.getHeight()) {
//				mdm.update();
//			}
//		}
//	}
		if (e.getX() > mdm.getX() && e.getY() > mdm.getY()) {
			if (e.getX() < mdm.getX()+mdm.getWidth() && e.getY() < mdm.getY()+mdm.getHeight()) {
				System.out.println("aetg");
				mdm.update();
			}
			
		}
	}
	
	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		mfm.update(e.getX(), e.getY());
		//System.out.print(e.getX() + "," + e.getY());
		//System.out.println("");
	}
}
