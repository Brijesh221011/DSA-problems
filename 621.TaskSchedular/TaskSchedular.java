

public class TaskSchedular {
    
    public int leastInterval(char[] tasks, int n) {
         int[] freq = new int[26];
        for (char task : tasks) {
            freq[task - 'A']++;
        }

        int maxFreq = 0;
        for (int fr : freq) {
            maxFreq = Math.max(maxFreq, fr);
        }

        int maxCnt = 0;
        for (int f : freq) {
            if (f == maxFreq) {
                maxCnt++;
            }
        }
        
        int partCnt = maxFreq - 1;
        int partLen = n + 1;
        // Calculate the minimal intervals
        int minLen = partCnt * partLen + maxCnt;

        return Math.max(minLen, tasks.length);
    }
}
