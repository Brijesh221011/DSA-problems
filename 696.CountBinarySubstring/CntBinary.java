// 696. Count Binary Substrings
//time: O(n) where n is the length of the input string
//space: O(1) since we are using only a constant amount of space to store the counts and the answer

class CntBinary{
     public int countBinarySubstrings(String s) {
        int ans=0;
        int prev=0;
        int curr=1;

        for(int i=1;i<s.length();i++){
            if(s.charAt(i-1)==s.charAt(i)){
                curr++;
            }else{
                prev=curr;
                curr=1;
            }

            if(curr<=prev){
                ans++;
            }
        }
        return ans;
    }
}