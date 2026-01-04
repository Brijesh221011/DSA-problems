//time complexity: O(n*sqrt(m)) where n is the length of nums and m is the maximum number in each nums[i]
//space complexity: O(1)

public class FourDivisors {
    public int sumFourDivisors(int[] nums) {
        int n=nums.length;
         int sum=0;
        for(int i=0;i<n;i++){
             sum+=findSum(nums[i]);
        }
        return sum;
    }

    public int findSum(int n){
        int sum=0,cnt=0;
        for(int i=1;i*i<=n;i++){
            if(n%i==0){
                int div1=i;
                int div2=n/i;

                if(div1==div2){
                    cnt=cnt+1;
                    sum+=div1;
                }else{
                    cnt=cnt+2;
                    sum=sum+div1+div2;
                }
            }
            
        }
        
        return cnt==4?sum:0;
    }
}
