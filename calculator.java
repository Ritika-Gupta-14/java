import java.awt.*;
import java.awt.event.*;
 
class Calculator implements ActionListener
{
//Declaring Objects
Frame f=new Frame();
Label l1=new Label("First Number");
Label l2=new Label("Second Number");
Label l3=new Label("Result");
TextField t1=new TextField();
TextField t2=new TextField();
TextField t3=new TextField();
Button b1=new Button("Add");
Button b2=new Button("Sub");
Button b3=new Button("Mul");
Button b4=new Button("Div");
Button b5=new Button("Cancel");
Calculator()
{
//Giving Coordinates
this.l1.setBounds(50,100,100,20);
this.l2.setBounds(50,140,100,20);
this.l3.setBounds(50,180,100,20);
this.t1.setBounds(200,100,100,20);
this.t2.setBounds(200,140,100,20);
this.t3.setBounds(200,180,100,20);
this.b1.setBounds(50,250,50,20);
this.b2.setBounds(110,250,50,20);
this.b3.setBounds(170,250,50,20);
this.b4.setBounds(230,250,50,20);
this.b5.setBounds(290,250,50,20);
//Adding components to the frame
this.f.add(this.l1);
this.f.add(this.l2);
this.f.add(this.l3);
this.f.add(this.t1);
this.f.add(this.t2);
this.f.add(this.t3);
this.f.add(this.b1);
this.f.add(this.b2);
this.f.add(this.b3);
this.f.add(this.b4);
this.f.add(this.b5);
this.b1.addActionListener(this);
this.b2.addActionListener(this);
this.b3.addActionListener(this);
this.b4.addActionListener(this);
this.b5.addActionListener(this);
this.f.setLayout(null);
this.f.setVisible(true);
this.f.setSize(400,350);
}
public void actionPerformed(ActionEvent e)
{
int n1=Integer.parseInt(this.t1.getText());
int n2=Integer.parseInt(this.t2.getText());
if(e.getSource()==this.b1)
{
this.t3.setText(String.valueOf(n1+n2));
}
if(e.getSource()==this.b2)
{
this.t3.setText(String.valueOf(n1-n2));
}
if(e.getSource()==this.b3)
{
this.t3.setText(String.valueOf(n1*n2));
}
if(e.getSource()==this.b4)
{
this.t3.setText(String.valueOf(n1/n2));
}
if(e.getSource()==this.b5)
{
System.exit(0);
}
}
public static void main(String[] args)
{
new Calculator();
}
}
