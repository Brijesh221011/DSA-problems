

public class DeleteColumn {
     public int minDeletionSize(String[] strs) {
        int cnt=0;
         int n=strs.length;
         int m=strs[0].length();

        for(int col=0;col<m;col++){
            for(int j=0;j<n-1;j++){
                if(strs[j+1].charAt(col)-strs[j].charAt(col)<0){
                    cnt++;
                    break;
                }
            }
        }
        return cnt;
        
    }
}
