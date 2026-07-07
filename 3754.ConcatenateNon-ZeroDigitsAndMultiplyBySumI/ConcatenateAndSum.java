//3754. Concatenate Non-Zero Digits and Multiply by Sum of Digits
//time complexity: O(log n), where n is the input number
//space complexity: O(log n), where n is the input number   

class ConcatenateAndSum{
     public long sumAndMultiply(int n) {
        String str=Integer.toString(n);
        int len=str.length();
        long sum=0;
        int num=0;
        
        for(int i=0;i<len;i++){
            int digit=str.charAt(i)-'0';

            if(digit!=0){
                num=num*10+digit;
                sum+=digit;
            }
        }
        return sum*num;
    }
}