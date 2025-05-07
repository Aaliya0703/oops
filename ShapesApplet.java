import java.applet.*;
import java.awt.*;


public class ShapesApplet extends Applet{

public void paint(Graphics g){
g.setColor(Color.blue);
g.drawLine(50, 450, 200, 200);

g.setColor(Color.red);
g.drawRect(10,30,70,10);

g.setColor(Color.green);
g.drawOval(40,50,70,70);



}


}
