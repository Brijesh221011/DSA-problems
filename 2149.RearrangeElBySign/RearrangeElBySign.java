// 2149. Rearrange Array Elements by Sign
//time complexity O(n) , where n is the length of the input array
//space complexity O(n)

class RearrangeEl{
    public int[] rearrangeArray(int[] nums) {
        int n=nums.length;
        int pos[]=new int[n/2];
        int neg[]=new int[n/2];
           int i=0,j=0;
         for(int m=0;m<n;m++){
            if(nums[m]>0){
                pos[i]=nums[m];
                i++;
            }else{
                neg[j]=nums[m];
                j++;
            }
         }
         i=0;
         j=0;
        int k=0;
        while(i<pos.length && j<neg.length){
            nums[k++]=pos[i++];
            nums[k++]=neg[j++];
        }
        return nums;
    }
}