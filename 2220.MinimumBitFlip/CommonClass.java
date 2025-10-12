// time complexity: O(logn)
// space complexity: O(1)

public class CommonClass {

    public int minBitFlips(int start, int goal) {
        int res=start^goal;
         int cnt=0;
        while(res!=0){
            cnt++;
            res=res&(res-1);
        }
        return cnt;
    }
    
}
