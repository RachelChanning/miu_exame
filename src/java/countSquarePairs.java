public class countSquarePairs {

    public static void main(String[] args) {

//        int[] testSource = new int[]{11, 5, 4, 20};
        int[] testSource = new int[] {9, 0, 2, -5, 7};
        int res = countSquarePairs(testSource);
        System.out.println(res);
    }

    static int countSquarePairs(int[] a) {

        int cnt = 0;
        for(int i = 0;i<a.length;i++){
            for(int j = 0; j<a.length; j++){
                if( a[j]>a[i] && i!=j && a[i]>0){
                    cnt += isPerfectSquare(a[j]+a[i]);
                }
            }
        }


        return cnt;
    }

    static int isPerfectSquare(int h ){
        int sqrtH = (int)Math.sqrt(h);
        Boolean isPerfectSquare = Math.pow(sqrtH,2)==h;

        if(isPerfectSquare){
            return 1;
        }else{
            return 0;
        }
    }
}