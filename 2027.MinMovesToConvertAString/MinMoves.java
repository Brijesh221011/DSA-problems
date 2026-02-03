// Problem 2027. Minimum Moves to Convert a String
//time complexity: O(n),where n is the length of the string
//space complexity: O(1)

public class MinMoves {
    public int minimumMoves(String s) {
        int n=s.length();
        int cnt=0;
        int i=0;
        while(i<n){
            if(s.charAt(i)=='X'){
                cnt++;
                i+=3;
            }else{
                i++;
            }
        }
        return cnt;
    }
}
