import java.awt.*;
import java.awt.event.*;

public class pr7 extends Frame implements ActionListener {
    Label l1,l2,l3;
    Button b1,b2,b3;
    TextField t1,t2;
    public pr7(){
        l1= new Label("Enter Name");
        l2= new Label("Enter Password");
        l3= new Label("");
        b1= new Button("Submit");
        b2= new Button("Clear");
        b3= new Button("Exit");
        t1= new TextField();
        t2= new TextField();
        this.add(l1);
        this.add(t1);
        this.add(l2);
        this.add(t2);
        this.add(b1);
        this.add(b2);
        this.add(b3);
        this.add(l3);

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);

        setLayout(new GridLayout(4,2));
        setVisible(true);
        setSize(600,600);
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==b3){
            System.exit(0);
        }
        String s=t1.getText();
        
        
        if(ae.getSource()==b1){
            l3.setText("welcome to the portal "+ s+"!!!!");
        }
        if(ae.getSource()==b2){
           t1.setText("");
           t2.setText("");
           l3.setText("");
        }
    }
    public static void main(String[] args) {
        new pr7();
    }
}
