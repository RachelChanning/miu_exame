public class guthrieIndex {
    public static void main(String [] args){
//        int i = guthrieIndex(1);
//        int i = guthrieIndex(2);
//        int i = guthrieIndex(3);
//        int i = guthrieIndex(4);
        int i = guthrieIndex(42);
        System.out.println(i);
    }
    static int guthrieIndex(int n){
        int cnt = 0;
        while (n!=1){
            if(n%2==0){
                n=n/2;
            }else{
                n=n*3+1;
            }
            cnt++;
        }
        return cnt;
    }
}
