// Lab07st.java
// Student Version

import java.awt.*;
import java.applet.*;
import java.util.*; 


public class Lab07st extends Applet
{

   public void paint(Graphics g) 
   {	
      lion.drawBody(g);
      lion.drawHead(g);
      lion.drawEyes(g);
      lion.drawSmile(g);
      hat.drawTriangle(g);
      hat.drawRect(g);
      hat.drawDesign(g);
      taco.drawGreens(g);
      taco.drawTortilla(g);
   }

}

   class lion
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
   
   class hat
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
   
   class taco
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
   