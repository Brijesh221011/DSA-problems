class Sol{
    public int divide(int dividend, int divisor) {
        if(dividend==Integer.MIN_VALUE && divisor==-1){
            return Integer.MAX_VALUE;
        }
        long res=(long)dividend/divisor;
        return (int) res;
    }
}