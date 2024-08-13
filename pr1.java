interface i1{
    public  void display();
}
interface i2 extends i1{
   public  void display2();
}
class pr implements i2{
    public  void display() {
        System.out.println("dis1");
    }
    public  void display2() {
        System.out.println("dis 2");
    }}
    
    public class pr1 {
    public static void main(String[] args) {
        pr inst= new pr();
        inst.display();
        inst.display2();
    }
}