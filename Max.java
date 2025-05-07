import java.awt.*;
import java.awt.event.*;
public class Max extends Frame implements ActionListener{
Label l1,l2,l3,l4;
TextField t1,t2,t3,result;
Button b;
Max(){
setLayout(null);
l1=new Label("Enter first number:");
l2=new Label("Enter second number:");
l3=new Label("Enter third number:");
b=new Button("Max");
l4=new Label("Max:");
t1=new TextField();
t2=new TextField();
t3=new TextField();
result=new TextField();
result.setEditable(false);

l1.setBounds(50,50,150,20);
t1.setBounds(200,50,100,20);
l2.setBounds(50,80,150,20);
t2.setBounds(200,80,100,20);
l3.setBounds(50,110,150,20);
t3.setBounds(200,110,100,20);
b.setBounds(100,150,30,30);
l4.setBounds(50,200,150,20);
result.setBounds(200,200,100,20);
add(l1); 
add(t1);
add(l2); 
add(t2);
add(l3); 
add(t3);
add(b);
add(l4);
add(result); 
b.addActionListener(this);
setTitle("max of three");
setSize(300,200);
setVisible(true);
addWindowListener (new WindowAdapter(){

public void windowClosing(WindowEvent we){
dispose();
}
});
}

public void actionPerformed(ActionEvent e){
int a=Integer.parseInt(t1.getText());
int b=Integer.parseInt(t2.getText());
int c=Integer.parseInt(t3.getText());
int max=Math.max(a,Math.max(b,c));
result.setText("Max:"+max);

}
public static void main(String args[]){
     new Max();

}
}





