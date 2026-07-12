
//1331. Rank Transform of an Array
//time complexity: O(nlogn), where n is the length of the input array


class RankTransformArray{
    public int[] arrayRankTransform(int[] arr) {
        int n=arr.length;
        int[] nums=new int[n];

        for(int i=0;i<n;i++){
            nums[i]=arr[i];
        }

        Arrays.sort(nums);
        Map<Integer,Integer>hm=new HashMap<>();
       
        int cnt=1;
        for(int i=0;i<n;i++){
           if(!hm.containsKey(nums[i])){
              hm.put(nums[i],cnt++);
           }
        }
        List<Integer>temp=new ArrayList<>();
        for(int i=0;i<n;i++){
             int val=hm.get(arr[i]);
             temp.add(val);
        }
         int[] res=new int[n];

         for(int i=0;i<n;i++){
            res[i]=temp.get(i);
         }
         return res;
    }
}