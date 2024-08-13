import java.io.*;

public class FileInputStreamEx {
    public static void main(String[] args) throws IOException {
         FileInputStream in=null;
         FileOutputStream out=null;
        try{
            in= new FileInputStream("fb1.txt");
           
             out = new FileOutputStream("fb2.txt");
             int f;
            while((f=in.read())!=-1){
                out.write(f);
            }}catch(Exception e){
                System.out.println(e);
            }
        finally{
            if (in!=null){
                in.close();
            }
             if (out!=null){
                out.close();
            }
        }
    }
    
}
