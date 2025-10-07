// Binary Search

// time complexity O(log n)
// space complexity O(1)

public class Sqrt {
    public  int mySqrt(int x) {
     long left=0,right=x;

        while(left<=right){
            long mid=(long)(left+right)/2;
            if(mid*mid==x){
                return (int)mid;
            }else if(mid*mid<x){
                left=mid+1;
            }else{
                right=mid-1;
            }
        }
        return (int)left-1;
    }
    // public static void main(String[] args) {
    //     int x=8;
    //     System.out.println(mySqrt(x));
    // }
}
