
//11. Container With Most Water
//time complexity: O(n), where n is the length of the input array
//space complexity: O(1)


class ContainerWithWater{
    public int maxArea(int[] height) {
        int lh=0;
        int rh=height.length-1;
        int maxWtr=0;
        while(lh<rh){
            int ht=Math.min(height[lh],height[rh]);
            int w=rh-lh;
            int currWtr=ht*w;
            maxWtr=Math.max(currWtr,maxWtr);

            if(height[lh]<height[rh]){
                lh++;
            }else{
                rh--;
            }
        }
        return maxWtr;
    }
}