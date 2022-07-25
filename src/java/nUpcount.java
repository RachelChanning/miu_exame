public class nUpcount {


    public static void main(String args[]){


//        int[] a = new int[]{ 2 , 3 , 1 , -6 , 8 , -3 , -1 , 2 } ;
//        int n = 5;
        int[] a = new int[]{5} ;
        int n = 5;


        int times = nUpCount(a,n);
        System.out.println(times);
    }

    static int nUpCount(int a[],int n){

        if (a.length < 1) {
            return 0;
        }
        int partialSum = 0, upCount = 0, previousPartialSum;
        for (int i = 0; i < a.length; i++) {
            previousPartialSum = partialSum;
            partialSum += a[i];
            if (previousPartialSum < n && partialSum >= n) {
                upCount++;
            }
        }
        return upCount;


//        int tmpSum = 0;
//        int cnt = 0;
//        for(int i = 0;i<a.length;i++){
//            int nextSum = tmpSum + a[i];
//            if(tmpSum<=n && nextSum>n){
//                cnt++;
//            }
//            tmpSum = nextSum;
//            System.out.println("tmpSum===>"+tmpSum);
//        }
//        return cnt;
    }
}
