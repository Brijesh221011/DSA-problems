// 1009. Complement of Base 10 Integer

class Complement{
    public int bitwiseComplement(int n) {
      if(n==0){
        return 1;
      }
      String str=Integer.toBinaryString(n);
      String res="";

      for(int i=0;i<str.length();i++){
        if(str.charAt(i)=='1'){
            res+="0";
        }else{
            res+="1";
        }
      }
      return Integer.parseInt(res,2);
    }
}