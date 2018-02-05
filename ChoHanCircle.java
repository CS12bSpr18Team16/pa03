package pa03;

import java.awt.Color;

public class ChoHanCircle extends CircleShape{

  public ChoHanCircle(){
    super();
    this.color = new Color(0,0,0);
  }

  public static void main(String[] args){
    ChoHanCircle x = new ChoHanCircle();
    System.out.println("my circle is "+x);
  }

  public String toString(){
    return "ChoHanCircle:" + super.toString();
  }
}
