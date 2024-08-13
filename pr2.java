//multiple inheritance
interface i1 {
public void m1();
public void m3();    
}

 interface i2 {
    public void m1();
    public void m2();
}


public class pr2 implements i1,i2 {
public void m1(){
    System.out.println("method common in both the interfaces ");
};
public void m3(){
    System.out.println("method from i1");
}; 
public void m2(){
    System.out.println("method from i2");
}; 
public static void main(String[] args) {
    pr2 i= new pr2();
    i.m1();
    i.m2();
    i.m3();
}
}