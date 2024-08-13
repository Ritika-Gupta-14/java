import java.util.Scanner;

class invalidException extends Exception{
    public invalidException(String msg){
    super(msg);}
}

class c1 {
    void meth(int age) throws invalidException{
        if(age<18){
            throw new invalidException("NOT able to vote now");
        }
        else{
            System.out.println("Welcome to the Voters club");
        }
    }
}
public class pr4 {
    public static void main(String[] args) {
  
    
    c1 i = new c1();
    try{
        i.meth(19);
        i.meth(12);
    }
    catch(Exception e){
        System.out.println(e.getMessage());
    }
}
}