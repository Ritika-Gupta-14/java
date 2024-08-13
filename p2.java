
import java.util.Scanner;

class Circle{
    float r;
    Circle(float a){
        this.r=a;
    }
    void area(){
        double ar= Math.PI*this.r*this.r;
         String s = String.format("%.2f",ar);
        System.out.println(s+" : is the area of circle");
    }
}
class Rect{
    float l,b;
    Rect(float x,float y){
        this.l=x;
        this.b=y;
    }
    void area(){
        double ar = this.l*this.b;
        String s = String.format("%.2f",ar);
        System.out.println(s+" : is the area of rectangle");
    }
}
public class p2{
    public static void main(String[] args) {
        System.out.println("select the shape to find the area");
        System.out.println("1.Circle");
        System.out.println("2.Rectangle");
        int ch;
        Scanner sc= new Scanner(System.in);
        ch=sc.nextInt();
        switch (ch) {
            case 1:
            System.out.print("Enter radius ");
            float r = sc.nextFloat();
            Circle c =new Circle(r);
            c.area();
                
            break;
            case 2:
            System.out.print("Enter length and breadth ");
            float l = sc.nextFloat();
            float b = sc.nextFloat();
            Rect re =new Rect(l,b);
            re.area();
             break;
            default:
            System.out.println("incorrect choice");
                break;
        }
        sc.close();

    }
}