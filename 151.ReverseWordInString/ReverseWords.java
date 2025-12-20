

public class ReverseWords {
     public String reverseWords(String s) {
        String str=s.trim();
        StringBuilder sb=new StringBuilder();
        String[] arr=str.split("\\s+");
        for(int i=arr.length-1;i>=0;i--){
            sb.append(arr[i]);
            if(i!=0){
              sb.append(" ");
            }
        }
        return sb.toString();
    }
}
