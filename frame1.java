import java.awt.*;
public class frame1 extends Frame {
    TextArea t;
    TextField f;
    Label l,m,n,o;
    Button b;
    public frame1(){
        this.setBackground(new Color(0,255,255));
        this.setLayout(new FlowLayout());
        this.setSize(900,200);
        this.setTitle("new frame");
        
        this.l=new Label("hefcgfnjhyta");
         this.m=new Label("hefcgfnjhyta");
          this.n=new Label("hefcgfnjhyta");
          this.f= new TextField("");
          this.b= new Button("click me");
           this.add(this.f);
        this.add(this.l);
           this.add(this.b);
           this.add(this.m);
              this.add(this.n);
     
        this.setVisible(true);
    }
    public static void main(String[] args) {
        frame1 f=new frame1();
        
    }
    
}