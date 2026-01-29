// 2976. Minimum Cost to Convert String I
//time complexity: O(26^3 + m) where m is the length of source/target strings
//space complexity: O(1) since the dist array size is constant (26x26)  


public class MinCostToConvert {
    int MOD=(int)1e9;
    public long minimumCost(String source, String target, char[] original, char[] changed, int[] cost) {
        int n=original.length;
        
        int[][] dist=new int[26][26];

        for(int i=0;i<26;i++){
            for(int j=0;j<26;j++){
                if(i==j){
                    dist[i][j]=0;
                }else{
                    dist[i][j]=MOD;
                }
            }
        }

        for(int i=0;i<n;i++){
            int u=original[i]-'a';
            int v=changed[i]-'a';
            int w=cost[i];
            dist[u][v]=Math.min(dist[u][v],w);
        }


        for(int k=0;k<26;k++){
            for(int i=0;i<26;i++){
                for(int j=0;j<26;j++){
                    dist[i][j]=Math.min(dist[i][j],dist[i][k]+dist[k][j]);
                }
            }
        }

        long minCost=0;

        for(int i=0;i<source.length();i++){
            int u = source.charAt(i) - 'a';
            int v = target.charAt(i) - 'a';
            if(u!=v){
                if(dist[u][v]>=MOD){
                    return -1;
                }
                minCost+=dist[u][v];
            }
        }
        return minCost;
    }
}
