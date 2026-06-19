// 1732. Find the Highest Altitude
//time complexity: O(n), where n is the length of the gain array
//space complexity: O(1)

class HighestAltitude{
    public int largestAltitude(int[] gain) {
        int highest=0;
        int sum=0;

        for(int i=0;i<gain.length;i++){
            sum+=gain[i];
            highest=Math.max(highest,sum);
        }
        return highest;
    }
}