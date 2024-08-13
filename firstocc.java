import java.util.Arraays;

public class firstocc {
    public static void main(String[] args) {
        int[] nums={2,3,4,4,4,4,6,9};
        int[] ans= bins(nums, 14);
        System.out.println(Arrays.toString(ans));
        
    }

    public static int[] bins(int[] nums, int t){
        int s=0;
        int e=nums.length-1;
        int st=-1;
        int end=-1;
        while(s<=e){
            int mid= s+(e-s)/2;
            if(nums[mid]==t){
                st=mid;
                e=mid-1;
            }
            else if(nums[mid]>t){
                e=mid-1;
            }
            else{
                s=mid+1;
            }
        }
        s=0;
        e=nums.length-1;
         while(s<=e){
            int mid= s+(e-s)/2;
            if(nums[mid]==t){
                end=mid;
                s=mid+1;
            }
            else if(nums[mid]>t){
                e=mid-1;
            }
            else{
                s=mid+1;
            }
        }

        int[] a={st,end};
        return a;
    }
}
