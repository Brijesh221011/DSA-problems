
// 2126. Destroying Asteroid
//time complexity: O(nlogn), where n is the length of the input array
//space complexity: O(1)

class DestroyingAsteroid{
    public boolean asteroidsDestroyed(int mass, int[] asteroids) {
        Arrays.sort(asteroids);
        long currMass = mass;
        for(int i=0;i<asteroids.length;i++){
            if(currMass>=asteroids[i]){
               currMass+=asteroids[i];
            }else{
                return false;
            }
        }
        return true;
    }
}