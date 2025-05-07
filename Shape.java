import java.applet.*;
import java.awt.*;

public class Shape extends Applet{

 public void init(){
   setBackground(java.awt.Color.white);
 }
 public void paint(Graphics g){
   g.drawRect(50,50,100,60);
   g.drawOval(200,50,80,80);
   g.drawLine(100,250,350,250);
 }
}
   
