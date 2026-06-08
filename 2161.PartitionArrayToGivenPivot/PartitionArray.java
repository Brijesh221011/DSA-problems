
// 2161. Partition Array According to Given Pivot
//time complexity: O(n), where n is the length of the input array
//space complexity: O(n) for the temporary list used to store the partitioned elements

class PartitionArray{
     public int[] pivotArray(int[] nums, int pivot) {
        int n=nums.length;
        List<Integer>temp=new ArrayList<>();

        for(int num:nums){
           if(num<pivot){
               temp.add(num);
           }
        }

        for(int num:nums){
           if(num==pivot){
               temp.add(num);
           }
        }

        for(int num:nums){
           if(num>pivot){
               temp.add(num);
           }
        }
        
        int[] ans=new int[n];
        for(int i=0;i<n;i++){
            ans[i]=temp.get(i);
        }
        return ans;
    }
}