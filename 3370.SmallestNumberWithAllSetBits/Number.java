// 3370. Smallest Number With All Set Bits


public class Number{
    public int smallestNumber(int n) {
        String str=Integer.toBinaryString(n);
        String res="";
       
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
           res=str.replace('0','1');
        }
        return Integer.parseInt(res,2);
    }
}