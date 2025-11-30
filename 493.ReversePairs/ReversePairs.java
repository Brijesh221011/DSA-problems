//time complexity: O(nlogn)
//space complexity: O(n)

public class ReversePairs {
     public int reversePairs(int[] nums) {
        int n=nums.length;
        return mergesort(nums,0,n-1);
    }

     public int countPairs(int arr[],int low,int mid,int high){
        int right=mid+1;
        int cnt=0;
        for(int i=low;i<=mid;i++){
            while(right<=high && arr[i]>2L*arr[right]){
                right++;
            }
            cnt+=(right-(mid+1));
        }
        return cnt;
     }
    public int mergesort(int arr[],int si,int ei){
        //base case
        if(si>=ei){
            return 0;
        }
        int cnt=0;
        int mid=si+(ei-si)/2;
        cnt+=mergesort(arr,si,mid);//left part
        cnt+=mergesort(arr,mid+1,ei);//right part
        cnt+=countPairs(arr,si,mid,ei);
        merge(arr,si,mid,ei);
        return cnt;
    }
    public void merge(int arr[],int si,int mid,int ei){
        int temp[]=new int[ei-si+1];
        int i=si;
        int j=mid+1;
        int k=0;

        while(i<=mid && j<=ei){
            if(arr[i]<arr[j]){
                temp[k]=arr[i];
                i++;
            }else{
                temp[k]=arr[j];
                j++;
            }
           k++;
        }
       
        while(i<=mid){
            temp[k++]=arr[i++];
        }
        while(j<=ei){
            temp[k++]=arr[j++];
        }
        for(k=0;k<temp.length;k++){
            arr[si+k]=temp[k];
        }

    }
}
