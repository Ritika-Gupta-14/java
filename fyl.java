import java.io.*;
import java.util.*;
public class fyl {
    public static void main(String[] args) {
        File f= new File("f1.txt");
        try{
        if(f.createNewFile()){
            System.out.println("file created");
        }
        else{
            System.out.println("file exists already");
        }
    }catch(IOException e){
        System.out.println(e);
    }
    }
    
}
