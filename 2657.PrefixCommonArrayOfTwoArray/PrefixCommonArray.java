
// 2657. Find the Prefix Common Array of Two Arrays
//time complexity: O(n), where n is the length of the input arrays A and B.
//space complexity: O(n), where n is the length of the input arrays A and B.

class PrefixCommonArray{
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int n=A.length;
        Set<Integer>visA=new HashSet<>(); // To track numbers encountered in A
        Set<Integer>visB=new HashSet<>(); // To track numbers encountered in B
        int result[]=new int[n]; // To store the prefix common counts
        int commonCount=0;  
        for(int i=0;i<n;i++){
            if(visB.contains(A[i])){
               commonCount++;
            }
            visA.add(A[i]);
            if(visA.contains(B[i])){
                commonCount++;
            }
            visB.add(B[i]);
            result[i]=commonCount;
        }
        return result;
    }
}