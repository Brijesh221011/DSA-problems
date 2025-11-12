import java.util.Arrays;
//time complexity: O(mlogm+nlogn)
//space complexity: O(1)

public class Players {
     public int matchPlayersAndTrainers(int[] players, int[] trainers) {
         int m=players.length;
        int n=trainers.length;
        Arrays.sort(players);
        Arrays.sort(trainers);
        int cnt=0;
        int i=0,j=0;
        while(i<m && j<n){
            if(players[i]<=trainers[j]){
                cnt++;
               i++;
               j++;
            }else{
                j++;
            }
        }
        return cnt;
    }
}
