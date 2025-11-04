public class Missing {
    public List<Integer> findMissingElements(int[] nums) {
        Arrays.sort(nums);
       Set<Integer>set=new HashSet<>();

       for(int num:nums){
        set.add(num);
       } 
       int si=nums[0],ei=nums[nums.length-1];
       List<Integer>res=new ArrayList<>();
       for(int i=si;i<ei;i++){
        if(!set.contains(i)){
            res.add(i);
        }
       }
       return res;
    }
}
