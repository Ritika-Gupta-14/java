import java.awt.*;
import java.awt.event.*;




public class formawt extends Frame implements ActionListener{
    Label l1,l2,l3;
    TextField f1,f2;
    Button b1,b2,b3;
    public formawt(){
        this.l1=new Label("Enter the name");
        this.l2=new Label("Enter the pasword");
        this.l3=new Label("");
        this.f1= new TextField();
        this.f2= new TextField();
        this.b1=new Button("Submit");
        this.b2=new Button("Clear");
        this.b3=new Button("Exit");
        this.add(this.l1);
        this.add(this.f1);
        this.add(this.l2);
        this.add(this.f2);
        this.add(this.b1);
        this.add(this.b2);
        this.add(this.b3);
        this.add(this.l3);
        this.b1.addActionListener(this);
         this.b2.addActionListener(this);
            this.b3.addActionListener(this);
  
         this.setLayout(new GridLayout(4,2));
        this.setVisible(true);
         this.setSize(400,350);
        

    }
    public void actionPerformed(ActionEvent e){
        if (e.getSource()==this.b3){
            System.exit(0);
        }
        String s1= this.f1.getText();
        String s2= this.f2.getText();
        if (e.getSource()==this.b1){
            this.l3.setText("Welcome "+s1+" your password is "+s2);
        }
         if (e.getSource()==this.b2){
            this.f1.setText("");
             this.f2.setText("");
              this.l3.setText("");
        }
    }

    public static void main(String[] args) {
         new formawt();
    }
    
}
