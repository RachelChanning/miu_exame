public class nextPerfectSquare {
    public static void main(String args[]){

        System.out.println(nextPerfectSquare(6));
        System.out.println(nextPerfectSquare(36));
        System.out.println(nextPerfectSquare(0));
        System.out.println(nextPerfectSquare(-5));

    }

    static int nextPerfectSquare(int n){
        if(n<0){
            return 0;
        }
         int sqreN = (int)Math.sqrt(n);
        int nextSqre = sqreN + 1;

        return nextSqre * nextSqre;
    }

}
