abstract class ab{
    abstract void meth();
   static int l=1;
}
//bhai method same h variable thri isliye jo ye variable l h wo apne local hoyenge dono k
 class ab1 extends ab {
    ab1(){
        ab.l=ab.l+1;
    }
    void meth(){
        System.out.println("meth");
    }
   
    
}
public class abs{
    public static void main(String[] args) {
        
        ab1 in=new ab1();
        System.out.println(in.l);
        in.meth();
    }

}
