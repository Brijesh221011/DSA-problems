
// 1423. Maximum Points You Can Obtain from Cards
//time complexity: O(k), where k is the number of cards to take
//space complexity: O(1)

class MaxPointsCards{
    public int maxScore(int[] cardPoints, int k) {
        int n=cardPoints.length;
        int maxScore=0;

        int leftSum=0;

        for(int i=0;i<k;i++){
            leftSum+=cardPoints[i];
            maxScore=Math.max(leftSum,maxScore);
        }
         
         int rightSum=0;
        for(int i=0;i<k;i++){
            leftSum-=cardPoints[k-i-1];
            rightSum+=cardPoints[n-i-1];
            maxScore=Math.max(maxScore,leftSum+rightSum);
        }
        return maxScore;
    }
}