
public class MakeStringsEqual {
     public int findMinimumOperations(String s1, String s2, String s3) {
         String[] str=new String[3];

          str[0]=s1;
          str[1]=s2;
          str[2]=s3;

          String pref=str[0];
    
         for(int i=1;i<str.length;i++){
            while(str[i].indexOf(pref)!=0){
               pref=pref.substring(0,pref.length()-1);
            }
            if(pref.isEmpty()){
                return -1;
            }
         }
         return (s1.length()+s2.length()+s3.length())-3*pref.length();
    }
}
