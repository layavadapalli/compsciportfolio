import java.awt.*;
import java.applet.*;
import java.util.*; 


public class taco
{
      public static void drawTortilla(Graphics g)
      {
         g.setColor(Color.orange);
         g.fillArc(430,375,90,90,0,-180);
      }
      
      public static void drawGreens(Graphics g)
      {
         g.setColor(Color.black);
         g.drawLine(425,375,475,420);
         g.drawLine(525,375,475,420);
         g.setColor(Color.green);
         g.fillOval(425,400,25,25);
         g.fillOval(450,400,25,25);
         g.fillOval(475,400,25,25);
         g.fillOval(500,400,25,25);
      }
}
