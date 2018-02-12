package pa03;

import java.awt.Color;
import java.awt.Graphics;


public class ZiqingCircle extends CircleShape{
  private int random = (int)(Math.random()*255);

  public ZiqingCircle(){
    super();
    this.color = new Color(random%256,0,70);
  }

  public void draw(Graphics g){
    super.draw(g);

    int u = (int)(x-radius);
    int v = (int)(y-radius);
    int w = (int)(2*radius);
    int h = w;

    g.setColor( color );
    g.fillOval( u,v,w,h );
    g.setColor( Color.GREEN );
    g.drawOval(u,v,w,h );
  }



  public String toString(){
    return "ZiqingCircle:" + super.toString();
  }
}
