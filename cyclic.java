import java.util.Arrays;
public class cyclic {
    public static void main(String[] args) {
        int[] arr={2,4,0,5,1};
        int a=sort(arr);
        System.out.println(a);
        
    }

    public static void swap(int[] arr,int i, int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    
    public static int sort(int[] arr){
        int i=0;
        int ans=-1;
        while (i<arr.length ) {
            if(arr[i]!=i+1 && arr[i]!=0){
                swap(arr,arr[i]-1,i);
            }
            else if(arr[i]==0){
                ans=i+1;
                i++;
            }
            else{
                i++;
            }
            
        }
        return ans;
    }
}
