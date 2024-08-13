import java.io.*;
//agar file already exist krti hai to overwrite kr dega nhi to new file create krega
// file writer mein true lgaake append krrta h by default false
public class fyl2 {
    public static void main(String[] args) throws IOException{
          
        try{
            FileWriter fr=new FileWriter("f1.txt",true);
            fr.write("Writing into the file\n");
            System.out.println("file created");
            fr.close();
        }catch(IOException e){
            System.out.println(e);
        }
        
    }
    
}
