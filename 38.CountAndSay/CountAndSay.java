// 38. Count and Say
//time: O(n*m) where n is the number of iterations and m is the length of the resulting string in each iteration
//space: O(m) where m is the length of the resulting string in each iteration

class CountAndSay{
    public String countAndSay(int n) {
      String res="1";

      for(int i=1;i<n;i++){
        StringBuilder sb=new StringBuilder();
        int cnt=1;

        for(int j=1;j<res.length();j++){
            if(res.charAt(j)==res.charAt(j-1)){
                cnt++;
            }else{
                sb.append(cnt).append(res.charAt(j-1));
                cnt=1;
            }
        }
        sb.append(cnt).append(res.charAt(res.length()-1));
        res=sb.toString();
      } 
      return res; 
    }
}