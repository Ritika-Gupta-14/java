abstract class animal{
    public abstract void sound();
    public void sleep(){
        System.out.println("sleeping");
    }
}
class dog extends animal{
    public void sound(){
        System.out.println("woof-woof");
    }

}
public class p4 {
    public static void main(String[] args) {
        dog d=new dog();
        d.sound();
        d.sleep();
    }
    
}
