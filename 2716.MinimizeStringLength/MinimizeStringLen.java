//2716. Minimize String Length


import java.util.HashSet;

public class MinimizeStringLen {
    public int minimizedStringLength(String s) {
        HashSet<Character>set=new HashSet<>();
        for(char ch:s.toCharArray()){
            set.add(ch);
        }
        return  set.size();
    }
}
