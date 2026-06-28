
//1846. Maximum Element After Decreasing and Rearranging
//time complexity: O(nlogn), where n is the length of the array
//space complexity: O(1)

class MaximumElementAfterDecAndReArr{

   public int maximumElementAfterDecrementingAndRearranging(int[] arr) {
        int n=arr.length;
        if(n==1){
            return 1;
        }
        Arrays.sort(arr);
        
         if(arr[0]!=1){
                arr[0]=1;
             }
             
        for(int i=1;i<n;i++){
            
             if(arr[i-1]+1<arr[i]){
                arr[i]=arr[i-1]+1;
             }
        }
        return arr[n-1];
    }
}