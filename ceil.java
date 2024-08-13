class ceil{
    public static void main(String[] args) {
        int[] arr={1,2,4,5,16};
        int ans= binsearchceil(arr,-100);
        System.out.println(ans);

    }
    static int binsearchceil(int[] arr,int t){
        int s=0;
        int e=arr.length-1;
        int ans=s+(e-s)/2;
        while(s<=e){
            int mid= s+(e-s)/2;
            if(t==arr[mid]){
                return mid;
            }
            else if(t>arr[mid]){
                s=mid+1;
            }
            else{
                e=mid-1;
            }
            
        }
        return e;
    }
}