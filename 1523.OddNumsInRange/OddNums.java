
public class OddNums {
     public int countOdds(int low, int high) {
       int calc=(high-low+1);

       return (calc + (low % 2)) / 2;
    }
}
