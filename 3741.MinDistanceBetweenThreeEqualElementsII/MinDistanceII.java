
// 3741. Minimum Distance Between Three Equal Elements II
//time complexity: O(n),where n is the length of the input array
//space complexity: O(n),where n is the number of unique elements in the input array

class MinDistanceII{
    public int minimumDistance(int[] nums) {
        int n=nums.length;
        Map<Integer, int[]> hm = new HashMap<>();
        int res = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            int value = nums[i];

            if (!hm.containsKey(value)) {
                hm.put(value, new int[]{-1, -1}); 
            }

            int[] arr = hm.get(value);

            if (arr[0] != -1 && arr[1] != -1) {
                int distance = 2 * (i - arr[0]);
                res = Math.min(res, distance);
            }
            arr[0] = arr[1];
            arr[1] = i;
        }

        return res == Integer.MAX_VALUE ? -1 : res;
    }
}