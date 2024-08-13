import java.io.*;
public class FileWriterReader {
    public static void main(String[] args)  {
        FileReader in=null;
        FileWriter out= null;
        try{
            in= new FileReader("f1.txt");
            out= new FileWriter("f2.txt");
            int f;
            while((f=in.read())!=-1){
                out.write(f);
            }}
            catch(Exception e){
                System.out.println(e);
            }
            //finally block mein agar ek bhi stream bnd ni hui to exception aayega isliye ya to uppar throws lgao yaniche alas se handle kro
            finally{
                try{
                 if (in!=null){
                in.close();
            }
             if (out!=null){
                out.close();
            }}catch(IOException e){
                System.out.println(e);
            }
            }
    
        }}