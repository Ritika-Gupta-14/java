interface i1{
    void meth1();
    
}
interface i extends i1{
    void meth2();
}
class in implements i{
    public void meth1(){
        System.out.println("method 1");
    }
    public void meth2(){
        System.out.println("method 2");

    }
}

public class p5 {
    public static void main(String[] args) {
        in i =new in();
        i.meth1();
        i.meth2();
    }
    
}
