package pa03;

import java.awt.Color;
import java.awt.Graphics;


public class AnnaCircle extends CircleShape{
    //My new instance variable
    private double myR= Math.random();
    //Overrides the default constructor
    public AnnaCircle(){
      super();
      this.color=new Color(255,182,193,100);    //transparent light pink
    }
    
    //Overrides the update method
    //Radius increase when radius is smaller than 5
    //When it is larger 60, it will remain the same
    public void update(double dt){
  	  this.radius += dt*myR;

      if  (this.radius <5){
        this.myR *= -1;
      }else if (this.radius >60){
        this.myR *= 0;
      }
      super.update(dt);
    }
    public String toString(){
      return "AnnaCircle: "+super.toString();
    }
}
