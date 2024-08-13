import java.io.*;

public class pr5 {
    public static void main(String[] args) {
        
    
try{
    File f= new File("ab.txt");
    if(f.createNewFile()){
        System.out.println("File created");

    }else{
        System.out.println("file exists");
    }
}  
catch(Exception e){
    System.out.println(e);
}  
}
}