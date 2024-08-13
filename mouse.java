import java.awt.*;
import java.awt.event.*;
public class mouse extends Frame implements MouseListener {
    Label l;
    public mouse(){
        this.addMouseListener(this);
        this.l = new Label();
        this.l.setBounds(20,50,100,20);
        this.add(this.l);
        this.setSize(300,300);  
        this.setLayout(null);  
        this.setVisible(true);  
    }
    public void mouseClicked(MouseEvent m){ 
       this.l.setText("Mouse clicked");
    }
    public void mouseEntered(MouseEvent m){
       this.l.setText("Mouse entered");
    }
    public void mouseExited(MouseEvent m){
       this.l.setText("Mouse exited");
    }
    public void mousePressed(MouseEvent m){
       this.l.setText("Mouse pressed");
    }
    public void mouseReleased(MouseEvent m){
       this.l.setText("Mouse released");
    }
    public static void main(String[] args) {
        new mouse();
    }
    
}
