

public class CheckNumber {
     public boolean areNumbersAscending(String s) {
        String []parts=s.split(" ");

        int prev=-1;

        for(String part:parts){
            if(Character.isDigit(part.charAt(0))){
                int num=Integer.parseInt(part);

                if(num<=prev){
                     return false;
                }
                prev=num;
            }
        }
        return true;
    }
}
