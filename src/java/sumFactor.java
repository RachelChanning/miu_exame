public class sumFactor {

    public static void main(String[] args){
//       int times =  sumFactor(new int[]{3, 0, 2, -5, 0});
//       int times =  sumFactor(new int[]{9, -3, -3, -1, -1});
       int times =  sumFactor(new int[]{0,0,0});
       System.out.println(times);
    }

    static  int sumFactor(int[ ] a){
        if(a.length==0) return 0;
        int sum = 0 ;
        for(int i = 0;i<a.length ;i++){
            sum += a[i];
        }
        int sumTimes = 0;
        for(int i = 0;i<a.length;i++){
            if(a[i]==sum){
                sumTimes ++;
            }
        }
        return sumTimes;
    }
}
