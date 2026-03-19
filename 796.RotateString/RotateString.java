//796. Rotate String
//time complexity:O(n),where n is the length of the string
//space complexity:O(1)

class RotateString{
     public boolean rotateString(String s, String goal) {
        if(s.length()!=goal.length()){
            return false;
        }
        s=s+s;
        if(s.contains(goal)){
            return true;
        }
        return false;
    }
}