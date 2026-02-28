class PrimeNumsSetBits{
    public int countPrimeSetBits(int left, int right) {
        
        boolean[] isPrime = new boolean[33];
        for (int i = 2; i <= 32; i++) {
            isPrime[i] = isPrimeNumber(i);
        }

        int count = 0;
        for (int i = left; i <= right; i++) {
            // Count set bits in binary representation
            int setBits = Integer.bitCount(i);
            // Check if the count of set bits is prime
            if (isPrime[setBits]) {
                count++;
            }
        }
        return count;
    }

   
    private boolean isPrimeNumber(int num) {
        if (num < 2) return false;
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}