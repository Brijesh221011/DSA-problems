
// 3751. Total Waviness of Numbers in Range I

class TotalWaviness-I{
     public int totalWaviness(int num1, int num2) {
        int totWave=0;
        for(int i=num1;i<=num2;i++){
            totWave+=helper(i);
        }
        return totWave;
    }

    public int helper(int num){
        String s=Integer.toString(num);
         int cnt=0;
        for(int i=1;i<s.length()-1;i++){
            if(s.charAt(i)>s.charAt(i-1) && s.charAt(i)>s.charAt(i+1)){
               cnt++;
            }else if(s.charAt(i)<s.charAt(i-1) && s.charAt(i)<s.charAt(i+1)){
                cnt++;
            }
        }
        return cnt;
    }
}