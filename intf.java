interface i{
    int l=0;
    //interfce k variable by default final hote h isliye
    void meth();
    void fun();
}
class c1 implements i{
    
   public void meth(){
        System.out.println("meth");
    }
   public void fun(){
        System.out.println("fun");
    }
}

public class intf{
    public static void main(String[] args) {
        c1 in=new c1();
        in.meth();
        in.fun();
        System.out.println(i.l);
    }
}