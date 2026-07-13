
//1291. Sequential Digits
//time complexity: O(1), since the number of sequential digits is limited and does not depend on the input size
//space complexity: O(1), since the number of sequential digits is limited and does not depend on the input size

class SequentialDigits{
     public List<Integer> sequentialDigits(int low, int high) {
        List<Integer> res = new ArrayList<>();

        for (int i = 1; i <= 9; i++) {
            helper(i, low, high, res);
        }

        Collections.sort(res);
        return res;
    }

    public void helper(int num, int low, int high, List<Integer> res) {

        if (num > high) {
            return;
        }

        if (num >= low) {
            res.add(num);
        }

        int lastDigit = num % 10;

        if (lastDigit < 9) {
            helper(num * 10 + (lastDigit + 1), low, high, res);
        }
    }
}