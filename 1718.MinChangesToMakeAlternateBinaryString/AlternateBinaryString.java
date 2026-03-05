class AlternateBinaryString{
    public int minOperations(String s) {
        int n=s.length();
        int mismatch0=0;
        int mismatch1=0;

        for(int i=0;i<n;i++){
            char ch1=(i%2==0)?'0':'1';
            if(s.charAt(i)!=ch1){
                mismatch0++;;
            }
               //if starting with '1'
             char ch2=(i%2==0)?'1':'0';
            if(s.charAt(i)!=ch2){
                mismatch1++;;
            }
        }
        return Math.min(mismatch0,mismatch1);
    }
}