
// 1711. Count Good Meals
//time complexity: O(n*log(max(deliciousness))), where n is the number of elements in the deliciousness array and max(deliciousness) is the maximum value in the deliciousness array.
//space complexity: O(n), as we are using a HashMap to store the count of each deliciousness value, which can potentially store up to n entries in the worst case.  

class CountGoodMeals{
    int MOD=(int)1e9+7;
    public int countPairs(int[] deliciousness) {
        int n=deliciousness.length;
        Map<Integer,Integer>hm=new HashMap<>();
        int cnt=0;

        for(int i=0;i<n;i++){

            for(int j=1;j<=(1<<21);j<<=1){
                int exp=j-deliciousness[i];
                if (hm.containsKey(exp)) {
                    cnt = (cnt + hm.get(exp)) % MOD;
                }
            }
                hm.put(deliciousness[i],hm.getOrDefault(deliciousness[i],0)+1);
        }
        return cnt;
    }

}