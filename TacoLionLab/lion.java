import java.awt.*;
import java.applet.*;
import java.util.*; 

public class lion
{
      public static void drawHead(Graphics g)
      {
         g.setColor(Color.orange);
         g.fillRect(400,175,150,200);
         g.setColor(Color.yellow);
         g.fillOval(425,200,100,150);
      }
      
      public static void drawEyes(Graphics g)
      {
         g.setColor(Color.black);
         g.fillRect(438,250,25,25);
         g.fillRect(488,250,25,25);     
      }
      
      public static void drawSmile(Graphics g)   
      {
         g.drawArc(450,275,50,50,0,-180); 
      }
      
      public static void drawBody(Graphics g)
      {
         g.setColor(Color.yellow);
         g.fillRect(425,350,100,250);
         Polygon c = new Polygon();
         c.addPoint(525,400);
         c.addPoint(600,325);
         c.addPoint(625,325);
         c.addPoint(525,425);
         c.addPoint(525,400);
         g.fillPolygon(c);
         
         Polygon d = new Polygon();
         d.addPoint(425,400);
         d.addPoint(325,325);
         d.addPoint(300,325);
         d.addPoint(425,425);
         g.fillPolygon(d);
         
         g.setColor(Color.black);
         g.drawLine(475,475,475,600);

      }
}
