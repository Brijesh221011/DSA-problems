
//495. Teemo Attacking
//time complexity: O(n), where n is the length of timeSeries
//space complexity: O(1)

class TeemoAttacking{
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        int n=timeSeries.length;
        if(n==0){
            return 0;
        }

        int res=0;
        for(int i=0;i<n-1;i++){
           int gap=timeSeries[i+1]-timeSeries[i];
           res=res+Math.min(gap,duration);
        }
        return res+duration;
    }
}