import java.io.IOException;

public class exth {
    public static void main(String[] args)  {// we can avoid the catch block by using throws with mai class
        try{
        throw new IOException();}
        catch( IOException e){
            System.out.println(e);
        }
    }
    
}
