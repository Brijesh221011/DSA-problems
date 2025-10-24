

public class Sum {
     public int sumSubarrayMins(int[] arr) {
      int n = arr.length;

        int[] nse = nse(arr);
        int[] psee = pse(arr);

        int mod = (int)1e9 + 7;
        int sum = 0;

        for (int i = 0; i < n; i++) {
           
            int left = i - psee[i];
            int right = nse[i] - i;
            long freq = left * right * 1L;
            int val = (int)((freq * arr[i]) % mod);

            sum = (sum + val) % mod;
        }
        return sum;
    }
    public int[] nse(int[] arr){
        int n=arr.length;
        Stack<Integer>st=new Stack<>();
        int res[]=new int[n];
        for(int i=n-1;i>=0;i--){
            while(!st.isEmpty() && arr[st.peek()]>=arr[i]){
                st.pop();
            }
            if(st.isEmpty()){
                res[i]=n;
            }else{ 
                res[i]=st.peek();
            }
            st.push(i);
        }
        return res;
    }

     public int[] pse(int[] arr){
        int n=arr.length;
        Stack<Integer>st=new Stack<>();
        int res[]=new int[n];
        for(int i=0;i<n;i++){
            while(!st.isEmpty() && arr[st.peek()]>arr[i]){
                st.pop();
            }
            if(st.isEmpty()){
                res[i]=-1;
            }else{
                res[i]=st.peek();
            }
            st.push(i);
        }
        return res;
    }
}
