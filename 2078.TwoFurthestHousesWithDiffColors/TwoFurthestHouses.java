//2078. Two Furthest Houses With Different Colors
//time complexity: O(n^2), where n is the length of the colors
//space complexity: O(1)

class TwoFurthestHouses{
    public int maxDistance(int[] colors) {
        int n=colors.length;
        int dist=-1;

        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                 if(colors[i]!=colors[j]){
                    dist=Math.max(dist,j-i);
                 }
            }
        }
        return dist;
    }
}