import java.io.*;
import java.util.Scanner;

public class pr6 {
    public static void main(String[] args) {
        FileWriter w;Scanner sc=null;
        try{
            File f= new File("ab.txt");
             w= new FileWriter(f,true);
            w.write("\nhello\n new file");
            w.close();
            System.out.println("wrote into file reading now");
          sc= new Scanner(f);
          while(sc.hasNextLine()){
            System.out.println(sc.nextLine());
          }
    
        }catch (Exception e){
            System.out.println(e);
        }
        finally{
            sc.close();
        }
    }
        
    }
