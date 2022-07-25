public class Madhav {

    public static void main(String []args){

//        int[]a = new int[]{2,1,1};
//        int[]a = new int[]{2, 1, 1, 4, -1, -1} ;
//        int[]a = new int[]{6, 2, 4, 2, 2, 2, 1, 5, 0, 0}  ;
//        int[]a = new int[]{18, 9, 10, 6, 6, 6}   ;
        int[]a = new int[]{3, 1, 2, 3, 0}   ;
        int i = Madhav(a);
        System.out.println(i);
    }
    static int Madhav(int[] a ){

        Boolean isLengthValie = isValidLength(a);
        if(!isLengthValie) return 0;

        int maxPlusSize = maxPlusSize(a);
        int correct = a[0];
        int cnt = 2;
        int tmpIndex = 1;
        while(cnt<=maxPlusSize){
            int tmpSum = 0;
            for(int j = tmpIndex;j<tmpIndex+cnt;j++  ){
                tmpSum = tmpSum + a[j];
            }
            if(tmpSum!=correct){
                return 0;
            }
            tmpIndex = tmpIndex + cnt;
            cnt++;
        }

        return 1;


    }
    static Boolean isValidLength(int[] a ){

        int len = a.length;

        int lenSqrt = (int)Math.sqrt(len*2);

        return  len*2 == (lenSqrt*(lenSqrt+1))?true:false;
    }


    static int maxPlusSize(int[] a ){

        int len = a.length;

        int lenSqrt = (int)Math.sqrt(len*2);

        return lenSqrt;
    }
}
