
public class CheckString {
    public boolean isPrefixString(String s, String[] words) {
        String str="";

        for(String word:words){
            str+=word;

            if(str.equals(s)){
                return true;
            }

            if(str.length()>s.length()){
                return false;
            }
        }

        return false;
    }
}
