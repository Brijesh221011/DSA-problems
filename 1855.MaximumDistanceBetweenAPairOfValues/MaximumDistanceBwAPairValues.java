class MaximumDistanceBwAPairValues {
   
   public int maxDistance(int[] nums1, int[] nums2) {
        int maxDist=Integer.MIN_VALUE;

         int i=0,j=0;

         while(i<nums1.length && j<nums2.length){
            while(j<nums2.length && (i<=j && nums1[i]<=nums2[j])){
                maxDist=Math.max(maxDist,j-i);
                j++;
            }
            if(i>j){
                j++;
            }else{
                 i++;
            }
           
         }

        if(maxDist==Integer.MIN_VALUE){
            return 0;
        }
        return maxDist;
    }
}