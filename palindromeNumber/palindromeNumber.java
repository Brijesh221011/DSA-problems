package palindromeNumber;
public class palindromeNumber {
    public static boolean isPalindrome(int x) {
        String str=Integer.toString(x);
        int n=str.length();

        for(int i=0;i<n/2;i++){
            if(str.charAt(i)!=str.charAt(n-i-1)){
                return false;
            }
        }
        return true;
    }
    // public static void main(String[] args) {
       
    //     int number=12121;
    //     boolean result=isPalindrome(number);
    //     System.out.println("Is "+number+" a palindrome? "+result);
    // }
}
