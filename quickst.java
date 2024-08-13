import java.util.Arrays;

public class quickst {
    public static void main(String[] args) {
        int [] arr={38,27,43,10,95,50};
                
        qsort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    public static void qsort(int[]arr,int low,int high){
        if(low>=high){
            return;
        }
        int partition=sort(arr,low,high);
        qsort(arr,low,partition-1);
        qsort(arr,partition+1,high);
    }

    public static int sort(int[] arr,int low,int high){
        int pivot=arr[low];
        int i=low;
        int j= high;
        while(i<j){
            while(arr[i]<=pivot && i<high){
                i++;
            }
            while(pivot<arr[j] && j>low){
                j--;
            }
           if(i<j){
            swap(arr, i, j);}

        }
        swap(arr,low,j);
        return j;
    }


    public static void swap(int[]arr, int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;

    }
}
