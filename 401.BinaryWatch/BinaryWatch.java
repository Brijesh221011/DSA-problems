//401. Binary Watch
//time: O(1) since the number of combinations is fixed
//space: O(1) since the number of combinations is fixed

class BinaryWatch {
    public List<String> readBinaryWatch(int turnedOn) {
        List<String>result=new ArrayList<>();

        for(int i=0;i<12;i++){
            for(int j=0;j<60;j++){
                if(Integer.bitCount(i)+Integer.bitCount(j)==turnedOn){
                    String time=i+":"+(j<10 ?"0"+j:j);
                    result.add(time);
                }
            }
        }
        return result;
    }
}