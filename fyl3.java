import java.io.*;
import java.util.Scanner;
public class fyl3{
    public static void main(String[] args) {
        try{
            File f= new File("f1.txt");
            Scanner sc =new Scanner(f);
        while(sc.hasNextLine()){
            System.out.println(sc.nextLine());
            
        }
    sc.close();

}catch(IOException e){
            System.out.println(e);
        }
        
    }
}