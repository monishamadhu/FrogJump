package week4.frogjump;

import java.awt.event.MouseEvent;
import acm.program.*;
import acm.graphics.GImage;

public class FrogJump extends GraphicsProgram {
	public static final int SQSIZE = 75;
	public static final int NCOLS = 7;
	public static final int NROWS = 3;
	private GImage frog;
	
	private int height=SQSIZE*NROWS;
	private int width = SQSIZE*NCOLS;
	private int xcoord = width/2+SQSIZE/2;
	private int ycoord = (2*height)-SQSIZE;
	
	public void run() {
		frog = new GImage("C:/Users/moni0/Pictures/frog.jpg");
		frog.scale(0.5);
		add(frog,xcoord,ycoord);
		addMouseListeners();	
	}
	
	public void mousePressed(MouseEvent e) {
		if((e.getX()<(getWidth()-SQSIZE)) &&(e.getY()<getHeight()-SQSIZE)) {
			add(frog,e.getX(),e.getY());
		}
	}
	public void mouseReleased(MouseEvent e) {
		add(frog,xcoord,ycoord);
	}
}
	

