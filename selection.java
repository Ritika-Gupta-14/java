import java.util.Arrays;

public class selection {
    
    public static void main(String[] args) {
        int[] arr={-9,3,2,0,1};
        sort(arr);
        System.out.println(Arrays.toString(arr));;
        
    }

    public static void sort(int[]arr){
        for(int i= 0;i<arr.length;i++){
            int max=0;
            int j;
            for ( j=0;j<arr.length-i;j++){
                if(arr[j]>arr[max]){
                    max=j;
                }}
               j--;
                int temp= arr[max];
                arr[max]=arr[j];
                arr[j]=temp;
            
        }
    }
}
 

// public static void sort(int[]arr){
//         for(int i= 0;i<arr.length;i++){
//             int min=i;
            
//             for ( int j=i+1;j<arr.length;j++){
//                 if(arr[j]<arr[min]){
//                     min=j;
//                 }}
               
//                 int temp= arr[min];
//                 arr[min]=arr[i];
//                 arr[i]=temp;
            
//         }
//     }