public class stantonMeasure {
    public static void main(String [] args){
       int i =  stantonMeasure(new int[]{1, 3, 1, 1, 3, 3, 2, 3, 3, 3, 4});
       System.out.println(i);
    }
    static int stantonMeasure(int[ ] a){
        int count1s = 0;
        for(int i = 0;i<a.length;i++){
            if(a[i]==1){
                count1s ++;
            }
        }
        int res = 0;
        for(int i = 0;i<a.length;i++){
            if(a[i]==count1s){
                res ++;
            }
        }
        return res;
    }
}
