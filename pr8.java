import java.io.*;
public class pr8{
    public static void main(String[] args) throws IOException {
        FileInputStream f= null;FileOutputStream o= null;
        
            f=new FileInputStream("ab.txt");
            o= new FileOutputStream("fb2.txt");
            int c;
            while((c=f.read())!=-1){
                System.out.println((char)c);
                o.write(c);
            }
        
        
            if(f==null){
                f.close();
            }
            if(o==null){
                o.close();
            }
        }
    }

