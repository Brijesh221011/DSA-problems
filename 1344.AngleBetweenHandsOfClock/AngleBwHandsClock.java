
//1344. Angle Between Hands of Clock
//time complexity: O(1)
//space complexity: O(1)

class AngleBwHandsClock{
     public double angleClock(int hour, int minutes) {
        double res=Math.abs(30*hour-(double) (11*minutes)/2);
        return Math.min(res,360-res);
    }
}