import java.util.Arrays;

public class AppleRedistribution {
     public int minimumBoxes(int[] apple, int[] capacity) {
        Arrays.sort(capacity);

        int sum=0;

        for(int num:apple){
            sum+=num;
        }
         int n=capacity.length;
         int cnt=0;
        for(int i=n-1;i>=0;i--){
             if(sum<=0){
                return cnt;
             }
             sum-=capacity[i];
             cnt++;
        }
        return cnt;
    }
}
