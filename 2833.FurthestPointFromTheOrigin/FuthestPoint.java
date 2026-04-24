
// 2833. Furthest Point from the Origin
//time complexity: O(n), where n is the length of the moves string. We iterate through the moves string once to calculate the final position and count the number of spaces. The space complexity is O(1) since we are using a constant amount of extra space to store the counts and sums.
// space complexity: O(1) since we are using a constant amount of extra space to store the counts and sums.

class FurthestPoint{
    public int furthestDistanceFromOrigin(String moves) {
        int countSpace=0;
        int sum=0;
        for(int i=0;i<moves.length();i++){
            char ch=moves.charAt(i);
            if(ch=='L'){
                sum++;
            }else if(ch=='R'){
                sum--;
            }else{
                countSpace++;
            }
        }
       return Math.abs(sum)+countSpace;
    }
}