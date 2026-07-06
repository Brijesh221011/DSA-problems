
//1288. Remove Covered Intervals
//time complexity: O(nlogn),where n is the length of intervals
//space complexity: O(1)

class CoveredInterval{
     public int removeCoveredIntervals(int[][] intervals) {
        int n = intervals.length;
        Arrays.sort(intervals, (a, b) -> {
            if (a[0] == b[0]) {
                return b[1] - a[1];
            }
            return a[0] - b[0];
        });

        int curr = intervals[0][1];
        int cnt = 0;
        for (int i = 1; i < n; i++) {
            if (curr>= intervals[i][1]) {
                cnt++;
            }else{
                curr=intervals[i][1];
            }

        }
        return n - cnt;
    }
}