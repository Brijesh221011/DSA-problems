//Problem 868: Binary Gap


class BinaryGap{
     public int binaryGap(int n) {
        String str=Integer.toBinaryString(n);
         int maxDiff=0;
         int i=0;
        for(int j=0;j<str.length();j++){
            if(str.charAt(i)=='1' && str.charAt(j)=='1'){
                    int diff=Math.abs(j-i);
                     maxDiff=Math.max(maxDiff,diff);
                     i=j;
            }
            
        }
        return maxDiff;
    }
}