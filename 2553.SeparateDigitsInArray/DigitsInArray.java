
// 2553. Separate the Digits in an Array
//time complexity: O(n*m), where n is the number of elements in the input array and m is the average number of digits in each element. 
//space complexity: O(n*m), where n is the number of elements in the input array and m is the average number of digits in each element. 
class DigitsInArray{
     public int[] separateDigits(int[] nums) {
        List<Integer>temp=new ArrayList<>();

        for(int num:nums){
           String str=Integer.toString(num);
            for(int i=0;i<str.length();i++){
                 char ch=str.charAt(i);
                temp.add(ch-'0');
            }
            
        }
        int[] res=new int[temp.size()];

        for(int i=0;i<res.length;i++){
            res[i]=temp.get(i);
        }
        return res;
    }
}