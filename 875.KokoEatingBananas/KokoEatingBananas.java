//875. Koko Eating Bananas

class KokoEatingBananas{
      public int minEatingSpeed(int[] piles, int h) {
        int n=piles.length;
        int maxVal=Integer.MIN_VALUE;

         for(int i=0;i<n;i++){
            maxVal=Math.max(maxVal,piles[i]);
         }
          int ans=0;
         int low=1,high=maxVal;
         while(low<=high){
            int mid=low+(high-low)/2;
            long val=minBananas(piles,mid);
            if(val<=(long)h){
                ans=mid;
                high=mid-1; 
            }else{
                low=mid+1;
            }
         }
       return ans;
    }

    public long minBananas(int[] piles,int k){
        long sum=0;

        for(int i=0;i<piles.length;i++){
            sum=sum+(long)Math.ceil((double)piles[i]/k);
        }

        return (long)sum;
    }
}