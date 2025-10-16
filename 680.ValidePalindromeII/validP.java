

public class validP {
    public boolean isPalindrome(String s,int start,int end){
        while(start<end){
            if(s.charAt(start)!=s.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
    public boolean validPalindrome(String s) {
        int i=0;
        int j=s.length()-1;

        while(i<j){
            if(s.charAt(i)!=s.charAt(j)){
                if(isPalindrome(s,i+1,j)){
                   return true;
                }
                if(isPalindrome(s,i,j-1)){
                    return true;
                }
                return false;
            }
            i++;
            j--;
        }
        return true;
       
    }
}
