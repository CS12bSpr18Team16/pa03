package pa03;

import java.awt.Color;
import java.awt.Graphics;

public class ChoHanCircle extends CircleShape{
  private Color borderColor;

  public ChoHanCircle(){
    super();
    this.color = new Color(128,128,128);
    this.borderColor = new Color(0,191,255);
  }

  public void draw(Graphics g){
    super.draw(g);
    int u = (int)(x-radius);
    int v = (int)(y-radius);
    int w = (int)(2*radius);
    int h = w;
    g.setColor( color );
    g.fillOval( u,v,w,h );
    g.setColor( Color.RED );
    g.drawOval(u,v,w,h );
	}

/**
  public static void main(String[] args){
    ChoHanCircle x = new ChoHanCircle();
    System.out.println("my circle is "+x);
  }
*/

  public String toString(){
    return "ChoHanCircle:" + super.toString();
  }
}
