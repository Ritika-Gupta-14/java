import java.util.Arrays;

public class refarray {
public static void main(String[] args) {
    int[] arr={1,2,3};
    int[] a=arr;
    arr[1]=0;
    String n= "ritika";
    String n2= new String("ritika");
    System.out.println(n.equals(n2));
    System.out.println();

    // System.out.println(Arrays.toString(arr));
    // System.out.println(Arrays.toString(a));
}    
}
