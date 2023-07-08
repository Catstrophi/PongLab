package PongLab;
import java.awt.Color;
import java.awt.Graphics;

public class Ball extends Block {
	private int xSpeed;
	private int ySpeed;

	public Ball()
	{
		super(200,200);
		xSpeed = 3;
		ySpeed = 1;
	}

	//add the other Ball constructors
	public Ball(int y, int x){
		setxPos(x);
		setyPos(y);
	}
	public Ball(int y, int x, int wid, int ht){
		setxPos(x);
		setyPos(y);
		setWidth(wid);
		setHeight(ht);
	}
	public Ball(int y, int x, int wid, int ht, Color color){
		setxPos(x);
		setyPos(y);
		setWidth(wid);
		setHeight(ht);
		setColor(color);
	}
	public Ball(int y, int x, int wid, int ht, Color color, int xSpeed, int ySpeed){
		setxPos(x);
		setyPos(y);
		setWidth(wid);
		setHeight(ht);
		setColor(color);
		this.xSpeed = xSpeed;
		this.ySpeed = ySpeed;
	}

    //add the set methods
	public void setxSpeed(int xSpeed) {
		this.xSpeed = xSpeed;
	}
	public void setySpeed(int ySpeed) {
		this.ySpeed = ySpeed;
	}

	public void moveAndDraw(Graphics window){
		draw(window, Color.white);
	   	setxSpeed(getxSpeed()+this.xSpeed);
	   	setySpeed(getxSpeed()+this.ySpeed);
	   	draw(window);
   }

	public boolean equals(Object obj)
	{
		return false;
	}

   //add the get methods
   public int getxSpeed() {
	   return xSpeed;
   }
   public int getySpeed() {
		return ySpeed;
	}

   //add a toString() method
}