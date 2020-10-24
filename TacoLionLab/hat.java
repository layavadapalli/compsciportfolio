import java.awt.*;
import java.applet.*;
import java.util.*; 

public class hat
{
      public static void drawTriangle(Graphics g)
      {
         g.setColor(Color.green);
         Polygon e = new Polygon();
         e.addPoint(475,100);
         e.addPoint(425,175);
         e.addPoint(525,175);
         g.fillPolygon(e);
      }
      
      public static void drawRect(Graphics g)
      {
         g.fillRect(325,175,300,50);
      }
      
      public static void drawDesign(Graphics g)
      {
         g.setColor(Color.white);
         g.drawLine(425,125,525,125);
         g.drawLine(425,138,525,138);
         g.drawLine(425,150,525,150);
         g.drawLine(425,163,525,163);
         g.drawLine(325,188,625,188);
         g.drawLine(325,200,625,200);
         g.drawLine(325,213,625,213);
      }
  
}
