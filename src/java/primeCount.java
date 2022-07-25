public class primeCount {

    public static void main(String [] args){

//        int i = primeCount(start,end);
//        int i = primeCount(start,end);
//        int i = primeCount(start,end);
//        int i = primeCount(start,end);
//        int i = primeCount(-10,6);
        int i = primeCount(10,30);
        System.out.println(i);
    }


    static int primeCount(int start,int end){

        int count = 0;
        for (int i = start;i<=end;i++){
            if(isPrime(i)){
                System.out.println("between "+start +","+end+"==>"+i+";");
                count++;
            }
        }
        return count;
    }

    static Boolean isPrime(int n ){
        if(n<2) return false;
        for(int i = 2;i<n;i++){
            if(n%i ==0 ){
                return false;
            }
        }
        return true;

    }
}
