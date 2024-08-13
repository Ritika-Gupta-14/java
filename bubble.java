import java.util.Arrays;

public class bubble {
    public static void main(String[] args) {
        int[]arr={-3,45,62,32,1,43,0};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void sort(int[] arr){
        int temp;
        boolean swapped;
        for (int i=0; i<arr.length;i++){
            swapped=false;
            for (int j=1;j<arr.length-i;j++){
                if(arr[j-1]>arr[j]){
                        temp=arr[j];
                        arr[j]=arr[j-1];
                        arr[j-1]=temp;
                        swapped=true;
                }
            }
            //if no swapping occurs array is sorted
            if(swapped==false){
                break;
            }
    }
   
}
}