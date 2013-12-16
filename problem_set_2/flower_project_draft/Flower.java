

public class Flower
{
	   private int x;
	   private int y;


   public Flower(int theX, int theY)
   {
	      x = theX;
	      y = theY;
   }

   public void draw()
   {
	   Ellipse topPetal = new Ellipse(x+20, y, 20, 20);
       Ellipse leftPetal = new Ellipse(x, y+20, 20, 20);
       Ellipse rightPetal = new Ellipse(x+40, y+20, 20, 20);
       Ellipse bottomPetal = new Ellipse(x+20, y+40, 20, 20);
       Ellipse theCenter = new Ellipse(x+20, y+20, 20, 20);
       Line theStem = new Line(x+30, y+60, x+30, y+120);
       topPetal.setColor(Color.PINK);
       leftPetal.setColor(Color.PINK);
       rightPetal.setColor(Color.PINK);
       bottomPetal.setColor(Color.PINK);
       theCenter.setColor(Color.YELLOW);
       //theLine.setLine(Color.GREEN);
       theStem.setColor(Color.GREEN);
       
       topPetal.fill();
       //topPetal.draw();
       leftPetal.fill();
       rightPetal.fill();
       bottomPetal.fill();
       theCenter.fill();
       theStem.draw();
   }
}
