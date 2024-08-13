import java.io.IOException;

class ck{
    //we cant throw and propogate checked exception wth throw only also needed throws
    // void m() {
    // throw new IOException("hey");}
    void m() throws IOException{
        throw new IOException("device mrgya error") ;   }

        // void p (){
        //     try{
        //         this.m();
        //     }
        //     catch(Exception e){
        //         System.out.println(e);
        //     }
        // }

}

public class throwkey1 {
    public static void main(String[] args) {
        ck c= new ck();
        // c.p();
         try{
                c.m();
            }
            catch(Exception e){
                System.out.println(e);
            }
    }


    
}
 