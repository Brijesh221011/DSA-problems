//Problem 1461: Check If a String Contains All Binary Codes of Size K

class BinaryOfSizeK{
    public void binstrRec(char[] s, int idx, ArrayList<String> res) {
        int n = s.length;

        if (idx == n) {
            res.add(new String(s));
            return;
        }

        // assign '0' at current position
        s[idx] = '0';
        binstrRec(s, idx + 1, res);

        // assign '1' at current position
        s[idx] = '1';
        binstrRec(s, idx + 1, res);
    }
    
    public boolean hasAllCodes(String s, int k) {
        int len=s.length();
        if (k > len){
             return false;
        }

        HashSet<String> set = new HashSet<>();

        // Sliding window of size k
        for (int i = 0; i <= len - k; i++) {
            set.add(s.substring(i, i + k));
        }

        // Total possible binary strings of length k = 2^k
         return set.size() == (1 << k);
    }
}