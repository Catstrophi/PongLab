package PongLab;

import java.awt.Color;
import java.awt.Graphics;

public class Paddle extends Block
{
   //instance variables
   private int speed;

   public Paddle()
   {
       super(10,10);
      speed =5;
   }

    public Paddle(int x, int y, int wid, int h, Color color, int speed)
    {
        super(x, y, wid, h, color);
        this.speed = speed;
    }

    public Paddle(int x, int y, int wid, int h, int speed)
    {
        super(x, y, wid, h);
        this.speed = speed;
    }

    public Paddle(int x, int y, int wid, int h)
    {
        super(x, y, wid, h);
    }

    public Paddle(int x, int y)
    {
        super(x, y);
    }

    public Paddle(int x, int y, int wid)
    {
        super(x, y, wid);
    }


   public void moveUpAndDraw(Graphics window)
   {
       draw(window, Color.white);
       setyPos(getyPos()-this.speed);
       draw(window);
   }

   public void moveDownAndDraw(Graphics window)
   {
       draw(window, Color.white);
       setyPos(getyPos()+this.speed);
       draw(window);
   }

   //add get methods

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }


    //add a toString() method
}