
//3536. Maximum Product of Two Digits in an Integer
//time complexity: O(logn), since we are iterating through the digits of the number.
//space complexity: O(logn), since we are storing the digits in a list.

class MaxProdOfTwoDigits{

     public int maxProduct(int n) {
         List<Integer>arrL=new ArrayList<>();

         while(n>0){
            int digit=n%10;
            arrL.add(digit);
            n/=10;
         }
         Collections.sort(arrL);

         int m=arrL.size();
         int ans=arrL.get(m-1)*arrL.get(m-2);

         return ans;
    }
}