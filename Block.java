package PongLab;
import java.awt.Color;
import java.awt.Graphics;

public class Block
{
	private int xPos;
	private int yPos;
	private int width;
	private int height;

	private Color color;

	public Block(int xPos, int yPos, int width, int height){
		this.xPos = xPos;
		this.yPos = yPos;
		this.width = width;
		this.height = height;
	}

	//add other Block constructors - x , y , width, height, color
	public Block(){
		xPos = 0;
		yPos = 0;
		width = 0;
		height = 0;
	}

	public Block(int xPos, int yPos, int width){
		this.xPos = xPos;
		this.yPos = yPos;
		this.width = width;

	}

	public Block(int xPos, int yPos){
		this.xPos = xPos;
		this.yPos = yPos;
	}
	public Block(int xPos, int yPos, int width, int height, Color color){
		this.xPos = xPos;
		this.yPos = yPos;
		this.width = width;
		this.height = height;
		this.color = color;
	}
	
   //add the other set methods
	public int getxPos() {
		return xPos;
	}

	public void setxPos(int xPos) {
		this.xPos = xPos;
	}

	public int getyPos() {
		return yPos;
	}

	public void setyPos(int yPos) {
		this.yPos = yPos;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color col)
   {

   }

   public void draw(Graphics window)
   {
//   	uncomment after you write the set and get methods
      window.setColor(color);
      window.fillRect(getxPos(), getyPos(), getWidth(), getHeight());
   }

   public void draw(Graphics window, Color col)
   {
   }
   
	public boolean equals(Object obj)
	{
		return false;
	}   

   //add the other get methods
    

   //add a toString() method  - x , y , width, height, color
}