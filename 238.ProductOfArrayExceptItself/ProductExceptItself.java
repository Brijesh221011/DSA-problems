//238. Product of Array Except Self
//time complexity: O(n),where n is the length of the input array
//space complexity: O(n)

class ProductExceptItself{
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int pref[]=new int[n];
        int []suff=new int[n];
        pref[0]=1;
        suff[n-1]=1;
        for(int i=1;i<n;i++){
            pref[i]=pref[i-1]*nums[i-1];
        }

        for(int i=n-2;i>=0;i--){
            suff[i]=suff[i+1]*nums[i+1];
        }
        int []res=new int[n];
        for(int i=0;i<n;i++){
            res[i]=pref[i]*suff[i];
        }
        return res;
    }
}