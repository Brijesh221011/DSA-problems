//118. Pascal's Triangle
//time complexity: O(n^2),where n is the number of rows in the pascal triangle.
//space complexity: O(n^2),where n is the number of rows in the pascal triangle.

class PascalTriangle{
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>>result=new ArrayList<>();

        for(int i=0;i<numRows;i++){
            List<Integer>temp=getRow(i);
            result.add(temp);
        }
        return result;
    }

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