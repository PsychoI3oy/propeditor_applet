
/**
 * @author evan
 * graphics of a G1 phone
 * @version 0.3
 */
package net.widgetron.propeditorapplet;


import javax.swing.*;
import java.awt.*;


public class G1graphics extends JPanel{
	/**
	 * 
	 */
	private static final long serialVersionUID = (long) 0.03;
	private int xStart = 0;
	private int yStart = 0; 
	private int totalWidth = 280;
	private int totalHeight = 210;
	
	public G1graphics(){
	}
	
	public G1graphics(int x, int y, int w, int h){
		xStart = x;
		yStart = y; 
		totalWidth = w;
		totalHeight = h;
	}
	
	
	public void paintComponent(Graphics g){
		int x = xStart;
		int y = yStart;
		int w = totalWidth;
		int h = totalHeight;
		//top (screen) part of main body - black
		// fill rounded rectangle, starts at 0,0, 9/10 of width, .588 of height; arcW = .01*w; arcH=.014*h
		g.setColor(Color.black);
		g.fillRoundRect(x, y, (int)Math.round( w*.9), (int) Math.round( h*.588),(int) Math.round( .05*w), (int)Math.round(.055*h));

		
		//bottom (keyboard) part of main body - black
		// fill rounded rectangle, starts at 0, (h*.457), 1w x .542h
		g.fillRoundRect(x, (int)Math.round( h*.457 )+y, w, (int)Math.round( h*.542), (int)Math.round( .05*w), (int) Math.round(.055*h));
		
		//screen, FILLrectangle, white
		// starts at xS*.04333, yS*.0619; .826w x .457h
		g.setColor(Color.white);
		g.fillRect((int) Math.round(w*.04333)+x, (int)Math.round( h*.0619)+y, (int) Math.round(w*.826), (int)Math.round( h*.457));
		
		//title text
		g.setColor(Color.blue);
		Font font = new Font("Serif", Font.PLAIN, w/8);
		g.setFont(font);
		g.drawString("PropEditor", (int) Math.round(w*.2)+x, (int)Math.round( h*.3)+y);
		
		//keyboard area, draw rectangle, white? dk grey? 
		//break up into keys?
		// starts at xS*.04333, yS*.6095; .826w x .343h
		g.setColor(Color.darkGray);
		g.fillRect((int) Math.round(w*.04333)+x, (int) Math.round(h*.6095)+y, (int) Math.round(w*.826), (int) Math.round(h*.343));
		
		//menu button, drawRect, xS*.887, yS*.6571; .0333w x .152 h
		g.setColor(Color.white);
		g.drawRect((int)Math.round( w*.9)+x, (int)Math.round( h*.7)+y, (int) Math.round(w*.0233), (int) Math.round(h*.072));
		//circle buttons: .0166666*w, .0238*h
		// xS*.95
		
		// end button - red fillcircle
		//yS*.54128
		g.setColor(Color.red);
		g.fillOval((int) Math.round(w*.95)+x, (int) Math.round(h*.50128)+y, (int) Math.round(w*.02666), (int) Math.round(h*.0338));
		//call button - green fillcircle
		//yS*.9333
		g.setColor(Color.green);
		g.fillOval((int) Math.round(w*.95)+x, (int) Math.round(h*.9033)+y, (int) Math.round(w*.02666), (int) Math.round(h*.0338));
		// white buttons white fillcircle
		//yS*.619
		//yS*.819
		g.setColor(Color.white);
		g.fillOval((int)Math.round( w*.95)+x, (int)Math.round( h*.609)+y, (int)Math.round( w*.02666), (int)Math.round( h*.0338));
		g.fillOval((int) Math.round(w*.95)+x, (int)Math.round( h*.809)+y, (int) Math.round(w*.02666), (int)Math.round( h*.0338));
		//trackball white drawcircle
		//yS*.714
		g.setColor(Color.darkGray);
		g.drawOval((int) Math.round(w*.95)+x, (int) Math.round(h*.71)+y, (int) Math.round(w*.02666), (int)Math.round( h*.0338));
		
	}
	
	public Dimension getPreferredSize(){
		return new Dimension(totalWidth, totalHeight);
	}
}
