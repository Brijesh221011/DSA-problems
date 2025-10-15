import java.util.List;

public class PartII {
    public int maxIncreasingSubarrays(List<Integer> nums) {
        int n = nums.size();
        if (n < 2){
           return 0;
        } 

        int res = 0;
        int prev = 0;
        int curr = 1;

        for (int i = 1; i < n; i++) {
            if (nums.get(i) > nums.get(i - 1)) {
                curr++;
            } else {
                // Try both ways: split one run, or two adjacent runs
                res = Math.max(res, Math.min(prev, curr));
                res = Math.max(res, curr / 2);
                prev = curr;
                curr = 1;
            }
        }
        
        res = Math.max(res, Math.min(prev, curr));
        res = Math.max(res, curr / 2);

        return res;
    }
}
