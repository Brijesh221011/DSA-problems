// 1653. Minimum Deletions to Make String Balanced
// time complexity O(n) , where n is the length of the input string
// space complexity O(1)

public class MinDelToBalanceString {
     public int minimumDeletions(String s) {
         int cntB = 0;
        int delElements = 0;

        for (char ch : s.toCharArray()) {
            if (ch == 'b') {
                cntB++;
            } else { 
                delElements = Math.min(delElements+ 1, cntB);
            }
        }
        return delElements;
    }
}
