
//1903. Largest Odd Number in String
//time complexity: O(n), where n is the length of the input string num.
//space complexity: O(1)

class LargestOddNumsInString{
    public String largestOddNumber(String num) {
        
        for(int i=num.length()-1;i>=0;i--){
            char ch=num.charAt(i);

            if(ch%2==1){
                return num.substring(0,i+1);
            }
        }
        return "";
    }
}