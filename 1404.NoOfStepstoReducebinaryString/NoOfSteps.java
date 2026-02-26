// 1404. Number of Steps to Reduce a Binary String to One
// time complexity: O(n) where n is the length of the input string
// space complexity: O(1) since we are using only a constant amount of extra space

class NoOfSteps{
    public int numSteps(String s) {
        int n=s.length();
        int cnt=0;
        int carry=0;

        for(int i=n-1;i>0;i--){
            int bit=s.charAt(i)-'0';
            if(bit+carry==1){ 
                cnt+=2;//+1 add,then divide by 2
                carry=1;
            }else{
                cnt+=1; // just divide by 2

            }
        }
        return cnt+carry;
    }
}