

public class PalindromicSubstring {
    public String longestPalindrome(String s) {
        int i=0,j=0;
         
         for(int c=0;c<s.length();c++){
            int oddLen=expandFromCenter(s,c,c);
            int evenLen=expandFromCenter(s,c,c+1);

            int maxLen=Math.max(oddLen,evenLen);

            if(maxLen>j-i){
                i=c-(maxLen-1)/2;
                j=c+maxLen/2;
            }
         }
         return s.substring(i,j+1);
           
    }

    public int expandFromCenter(String s,int i,int j){
        while(i>=0 && j<s.length() && s.charAt(i)==s.charAt(j)){
            i--;
            j++;
        }
        return (j-i-1);
    }
}
