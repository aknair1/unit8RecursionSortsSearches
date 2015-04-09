

import java.awt.*;
import javax.swing.JPanel;
import java.awt.geom.Line2D;

public class TreePanel extends JPanel
{
   private final int PANEL_WIDTH = 1000;
   private final int PANEL_HEIGHT = 1000;

   private final double POSANGLE_CHANGE = .2;
   private final double NEGANGLE_CHANGE = -.4;
   private final double LENGTH_FACTOR = .5;
   private final double END = 10;
   private final double START = 200;
   private final double XSTART = 500;
   private final double YSTART = 500;
   private final Color[] colors = {Color.blue,Color.green,Color.cyan,Color.gray,Color.magenta,Color.orange,Color.yellow};

   public TreePanel ()
   {          
      setPreferredSize (new Dimension(PANEL_WIDTH, PANEL_HEIGHT));
    }

   
   public void drawLine (double angle, double x, double y, double length, Graphics2D g)
   {    
      if (length <= END)
         return;
      else
      {
         double x2 = x + Math.cos(angle)*length;
         double y2 = y - Math.sin(angle)*length;
         g.setColor(colors[(int)(Math.random()*6)]);
         g.draw(new Line2D.Double(x,y,x2,y2)); 
         drawLine(angle + POSANGLE_CHANGE,x2,y2,length*LENGTH_FACTOR,g);
         drawLine(angle + NEGANGLE_CHANGE,x2,y2,length*LENGTH_FACTOR,g);
         drawLine(angle + 2 *POSANGLE_CHANGE,x2,y2,length*LENGTH_FACTOR,g);
         drawLine(angle + 2 *NEGANGLE_CHANGE,x2,y2,length*LENGTH_FACTOR,g);         
         drawLine(angle + 3 *POSANGLE_CHANGE,x2,y2,length*LENGTH_FACTOR,g);
         drawLine(angle + 3 *NEGANGLE_CHANGE,x2,y2,length*LENGTH_FACTOR,g);
      }
   }    
     
    
           
   
   public void paintComponent (Graphics g)
   {
      super.paintComponent(g);
      Graphics2D g2 = (Graphics2D) g;
      g2.setColor(Color.BLACK);
      g2.draw(new Line2D.Double(XSTART,YSTART,XSTART,YSTART - START));
      drawLine(Math.PI / 2,XSTART,YSTART,START,g2);
      drawLine(0,XSTART,YSTART-(START /2),START,g2);
      drawLine(Math.PI/4,XSTART,YSTART-(START /2),START,g2);
      drawLine(3* Math.PI/4,XSTART,YSTART-(START /2),START,g2);      
      drawLine(3*(Math.PI / 2),XSTART,YSTART-START,START,g2); 
      drawLine(Math.PI,XSTART,YSTART-(START /2),START,g2);
   }

 
}
