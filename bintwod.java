import java.util.Arrays;
public class bintwod { 
   public static void main(String[] args){
    int[][] arr={
        {1,3,5,7},
        {2,4,6,8},
        {3,6,9,12},
        {8,16,24,32}
    };
    System.out.println(Arrays.toString(search(arr,1)));

   }

   public static int[] search(int[][] arr, int t ){
    int r= 0;
    int c= arr.length-1;
    while(r<arr.length && c>-1){
        if(arr[r][c]== t){
            return new int[]{r,c};
        }
        else if(arr[r][c]>t){
            c--;
        }
        else{
            r++;
        }
    }
    return new int[]{-1,-1};
   }
}
