
public class BitsCharacter {
    public boolean isOneBitCharacter(int[] bits) {
        int n=bits.length;
       
       int idx=0;

       while(idx<n-1){
        if(bits[idx]==0){
            idx=idx+1;
        }else{
            idx=idx+2;
        }
       }
       return idx==n-1;
    }
}
