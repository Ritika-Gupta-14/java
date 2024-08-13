
import java.util.InputMismatchException;
import java.util.Scanner;
public class p7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    System.out.println("Enter the numbers to divide: ");
    try{
    float a = sc.nextInt();
    float b= sc.nextInt();
    float res = a/b;
    System.out.println("result of a/b is : "+res);
}catch(InputMismatchException e){
    System.out.println("Invalid input");
}catch(ArithmeticException e){
    System.out.println("cant divide the numbers");
}
catch(Exception e){
    System.out.println(e);
}
finally{
    System.out.println("finally block");
    sc.close();
}
    }
}
