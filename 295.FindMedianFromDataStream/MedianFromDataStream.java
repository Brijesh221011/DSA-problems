
//295. Find Median from Data Stream
//time complexity: O(logn) for addNum and O(1) for findMedian
//space complexity: O(n), where n is the number of elements in the data stream

class MedianFromDataStream{
    class MedianFinder {
    PriorityQueue<Integer>minH;
    PriorityQueue<Integer>maxH;
    public MedianFinder() {
        minH=new PriorityQueue<>();
        maxH=new PriorityQueue<>(Collections.reverseOrder());
    }
    
    public void addNum(int num) {
            maxH.add(num);
           minH.add(maxH.remove());

           if(minH.size()>maxH.size()){
            maxH.add(minH.remove());
           }
           
    }
    
    public double findMedian() {
        if(minH.size()==maxH.size()){
            return (minH.peek()+maxH.peek())/2.0;
        }
        return maxH.peek();
    }
}

}