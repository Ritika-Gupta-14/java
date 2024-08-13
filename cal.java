import java.awt.*;
import java.awt.event.*;

public class cal extends Frame implements ActionListener {
    Label l1,l2,l3;
    TextField f1,f2,f3;
    Button b1,b2,b3,b4,b5;
   public cal(){
    this.l1= new Label("Enter 1st number");
    this.l2= new Label("Enter 2nd number");
    this.l3= new Label("Result");
    this.f1=new TextField();
    this.f2=new TextField();
    this.f3=new TextField();
    this.b1=new Button("Add");
    this.b2=new Button("Subtract");
    this.b3=new Button("Multiply");
    this.b4=new Button("Divide");
    this.b5=new Button("Exit");

    this.add(this.l1);
    this.add(this.f1);
    this.add(this.l2);
    this.add(this.f2);
    this.add(this.l3);
    this.add(this.f3);
    this.add(this.b1);
    this.add(this.b2);
    this.add(this.b3);
    this.add(this.b4);   
    this.add(this.b5);  
   this.b1.addActionListener(this);
   this.b2.addActionListener(this);
   this.b3.addActionListener(this);
   this.b4.addActionListener(this);
   this.b5.addActionListener(this);
   this.setLayout(new GridLayout(6,2));
    this.setVisible(true);
    this.setSize(400,350);


}
public void actionPerformed(ActionEvent e){
    if(e.getSource()==this.b5){
    System.exit(0);}
    int n1= Integer.parseInt(this.f1.getText());
    int n2= Integer.parseInt(this.f2.getText());
    if(e.getSource()==this.b1){
        this.f3.setText(String.valueOf(n2+n1));}
    if(e.getSource()==this.b2){
        this.f3.setText(String.valueOf(n1-n2));}
    if(e.getSource()==this.b3){
        this.f3.setText(String.valueOf(n2*n1));}
    if(e.getSource()==this.b4){
        this.f3.setText(String.valueOf(n1/n2));}

}
    public static void main(String[] args) {
        cal c =new cal();
    }
}
