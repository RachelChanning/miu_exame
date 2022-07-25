public class findPorcupineNumber {
    public static void main(String [] args){

        int s = findPorcupineNumber(138);
        System.out.println(s);


    }

   static int findPorcupineNumber(int n){
            int firstCorrectPrime = 0;
            int h = n+1;
            while(h<Integer.MAX_VALUE){
                if(isPrime(h)==1){
                    if(h%10==9){
                        if(firstCorrectPrime==0){
                            firstCorrectPrime = h;
                        }else{
                            break;
                        }
                    }else{
                        if(firstCorrectPrime!=0){
                            firstCorrectPrime = 0;
                        }
                    }
                }
                h++;
            }
        return firstCorrectPrime;
    }


    static  int isPrime(int h ){
      if(h<2) return 0;
      for(int i =2;i<h;i++){
          if(h%i==0){
              return 0;
          }
      }
      return 1;
    }
}
