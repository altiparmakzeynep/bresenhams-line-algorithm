package computerGraphics;
import java.awt.Canvas;
import java.util.*;
import java.awt.Graphics;
import java.awt.Color;
import javax.swing.JFrame;

public class Drawing extends Canvas {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		//step 1, let start and end points
	    System.out.print("Enter co-ordinates of start points: ");
        int x1 = input.nextInt();
        int y1 = input.nextInt();
	          
        System.out.print("Enter co-ordinates of end points: ");
        int x2 = input.nextInt();
        int y2 = input.nextInt();
	    
        
        JFrame frame = new JFrame("Bresenham's Line Algorithm");
        Canvas canvas = new Drawing();
        canvas.setSize(500, 500);
        frame.add(canvas);
        frame.pack();
        frame.setVisible(true);
    }

        static void paint(int x1, int y1, int x2, int y2) {	  
   
    	Graphics g = getGraphics();
    	//step 1, start and end points
//    	int x1 = 0;
//    	int y1 = 0;
//    	int x2 = 500;
//    	int y2 = 500;
    	
    	//step 2, finding decision parameter value
    	int dx = Math.abs(x2- x1);
    	int dy = Math.abs(y2 - y1);
    	int d = 2*dy - dx; //decision parameter value
    	
    	int x = x1;
    	int y = y1;
    	
    	while(x<x2) {
    		if(d>=0) {
    			g.drawLine(x, y, x, y);
    			y = y+1; //plotted points
    			d = d + 2*dy - 2*dx;
//    	    	x = x + 1;	
    		}
    		else
    		{
    			g.drawLine(x, y, x, y);
    			d = d+2*dy;
//    			x = x + 1;
//    			y = y1;
//    			g.setColor(Color.red);
    		}
    		x += 1; //plotted points
    	}
    }
}

