//time complexity: O(n)
//space complexity: O(n)

import java.util.Arrays;
public class Candy {
    public int candy(int[] ratings) {
        int n=ratings.length;
        int pref[]=new int[n];
        Arrays.fill(pref,1);
        for(int i=1;i<n;i++){
            if(ratings[i]>ratings[i-1]){
                pref[i]=pref[i-1]+1;
            }
        }
         
         int suff[]=new int[n];
         Arrays.fill(suff,1);
        for(int i=n-2;i>=0;i--){
            if(ratings[i]>ratings[i+1]){
                suff[i]=suff[i+1]+1;
            }
        }
          int minCandies=0;
        for(int i=0;i<n;i++){
            minCandies=minCandies+(Math.max(pref[i],suff[i]));
        }
        return minCandies;
    }
}
