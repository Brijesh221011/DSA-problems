
// 2259. Remove Digit From Number to Maximize Result
//time complexity O(n), where n is the length of the input string number. 
//space complexity O(n), where n is the length of the input string number.

class RemoveDigit{
    public String removeDigit(String number, char digit) {
        int n=number.length();
        String res="";
        for(int i=0;i<n;i++){
            char ch=number.charAt(i);
           if(ch==digit){
             String str=number.substring(0,i)+number.substring(i+1,n);
             int val=str.compareTo(res);
            if(val>0){
                res=str;
            }  
           }
        }
        return res;
    }
}