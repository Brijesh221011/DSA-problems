
//3211. Generate Binary String Without Adjacent Zeroes
//tc:O(2^n),where n is the length of the binary string to be generated
//sc:O(n)

class AllBinaryStringWithoutAdjacentZeroes {

    public List<String> validStrings(int n) {
        List<String>res=new ArrayList<>();
        helper(n,"",res);
        return res;
    }

    public void helper(int n,String str,List<String>temp){
        if(str.length()==n){
            temp.add(str);
            return;
        }

        helper(n,str+"1",temp);
        if(str.length()==0 || str.charAt(str.length()-1)!='0'){
            helper(n,str+"0",temp);
        }
       
    }
}