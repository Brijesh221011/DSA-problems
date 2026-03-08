class UniqueBinaryString{
    public String findDifferentBinaryString(String[] nums) {
        int n=nums.length;
        StringBuilder missingStr=new StringBuilder();

        for(int i=0;i<n;i++){
          if(nums[i].charAt(i)=='0'){
            missingStr.append('1');
          }else{
            missingStr.append('0');
          }
        }
        return missingStr.toString();
    }
}