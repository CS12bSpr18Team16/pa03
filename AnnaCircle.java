package pa03;

import java.awt.Color;
import java.awt.Graphics;


public class AnnaCircle extends CircleShape{
    private double myR= Math.random();

    public AnnaCircle(){
      super();
      this.color=new Color(255,182,193,100);
    }
    public void update(double dt){
  	  this.radius += dt*myR;

      if  (this.radius <5){
        this.myR *= -1;
      }else if (this.radius > 60){
        this.myR *= 0;
      }
      super.update(dt);
    }
    public String toString(){
      return "AnnaCircle: "+super.toString();
    }
}
