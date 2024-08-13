import java.io.*;
public class fyl4 {
    public static void main(String[] args) {
        try{
            File f = new File("C:\\Users\\asd\\Desktop\\java\\f1,txt");
            if(f.exists())  {
            f.delete();
                System.out.println("File deleted");
            }
           else{
            System.out.println("file doesnt exist");
           }
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
