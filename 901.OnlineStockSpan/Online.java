import java.util.ArrayList;
class Online{

    static class StockSpanner {
         ArrayList<Integer>temp;
        public StockSpanner() {
            temp=new ArrayList<>();
        }
        
        public int next(int price) {
            temp.add(price);
            int cnt=1;
    
            for(int i=temp.size()-2;i>=0;i--){
                 if(temp.get(i)<=price){
                    cnt++;
                 }else{
                    break;
                 }
            }
            return cnt;
        }
        
    }
    public static void main(String[] args){
            StockSpanner obj=new StockSpanner();
            System.out.println(obj.next(100));
            System.out.println(obj.next(80));
            System.out.println(obj.next(60));
            System.out.println(obj.next(70));
            System.out.println(obj.next(60));
            System.out.println(obj.next(75));
            System.out.println(obj.next(85));
    }
}
