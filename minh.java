interface i1{
    void meth();
}
interface i2{
    void fun();
}

class c1 implements i1,i2{
    public void fun(){
        System.out.println("fun");
    
    }
    public void meth(){
    System.out.println("meth");
}
}
    

public class minh {
    public static void main(String[] args) {
        
        c1 in=new c1();
        in.meth();
        in.fun();
    }

    
}




