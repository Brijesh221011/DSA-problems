class RobotToOrigin{
     public boolean judgeCircle(String moves) {
        int countL=0 , countR=0, countU=0 , countD=0;
        for(int i=0;i<moves.length();i++){
            char ch=moves.charAt(i);
            if(ch=='L'){
                countL++;
            }else if(ch=='R'){
                countR++;
            }else if(ch=='U'){
                countU++;
            }else 
            {
                countD++;
            }
            
        }
       return countL==countR && countU==countD; 
    }
}