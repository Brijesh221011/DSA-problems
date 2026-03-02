// 119. Pascal's Triangle II
//time complexity: O(n),where n is the row index of the pascal triangle.
//space complexity: O(n),where n is the row index of the pascal triangle.

class PascalTriangleII{
    public List<Integer> getRow(int rowIndex) {
        List<Integer>res=new ArrayList<>();
        long ans=1;
        res.add(1);

        for(int i=1;i<=rowIndex;i++){
            ans=ans*(rowIndex-(i-1));
            ans=ans/i;
            res.add((int)ans);
        }
        return res;
    }
}