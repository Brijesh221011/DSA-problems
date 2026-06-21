
// 1833. Maximum Ice Cream Bars
//time complexity: O(nlogn), where n is the number of elements in the costs array
//space complexity: O(1)

class MaximumIceBar{
   
    public int maxIceCream(int[] costs, int coins) {
        Arrays.sort(costs);

        int n=costs.length;
          if(costs[0]>coins){
            return 0;
          }
          int cnt=0;
        for(int i=0;i<n;i++){
            if(costs[i]>coins){
                break;
            }
            cnt++;
            coins-=costs[i];
        }
        return cnt;
    }
}