// 678. Valid Parenthesis String
//time complexity: O(n),where n is the length of the string s
//space complexity: O(1)


class ValidParenthesisString {

     public boolean checkValidString(String s) {
        int minOpen = 0;
        int maxOpen = 0;

        for (char ch : s.toCharArray()) {
            if (ch == '(') { // open bracket '('
                minOpen++;
                maxOpen++;
            } else if (ch == ')') { //close bracket ')'
                minOpen--;
                maxOpen--;
            } else { //having '*'
                minOpen--;
                maxOpen++;
            }
            if (minOpen < 0 ) {
                minOpen=0;
            }
             if (maxOpen < 0 ) {
                return false;
            }
        }

        return minOpen == 0;
    }
}