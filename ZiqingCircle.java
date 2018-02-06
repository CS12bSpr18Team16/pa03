package pa03;

import java.awt.Color;

public class ZiqingCircle extends CircleShape{

  public ZiqingCircle(){
    super();
    this.color = new Color(0,0,255);
  }

  public static void main(String[] args){
    ZiqingCircle x= new ZiqingCircle();
    System.out.println("my circle is "+x);
  }
  
  public String toString(){
    return "ZiqingCircle:" + super.toString();
  }
}
