import java.io.*;

public class pr9 {
    public static void main(String[] args) throws IOException {
        FileReader f= new FileReader("ab.txt");
        FileWriter o= new FileWriter("fb2.txt");
        int a;
        while((a=f.read())!=-1){
            System.out.print((char)a);
            o.write(a);
        }

        f.close();
        o.close();
    }

}
