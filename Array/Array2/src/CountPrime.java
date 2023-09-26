public class CountPrime {
    public static int countPrimes(int n) {
        if(n==0 || n==1){
            return 0;
        }
        if(n==2){
            return 1;
        }
        int count = 0;
        for(int i=2;i<n;i++){
            boolean isPrime = isPrime(i);
            if(isPrime){
                count++;
            }
        }
        return count;
    }

    public static boolean isPrime(int n){
        int m = (int)Math.sqrt(n);
        int point=0;
        for(int i=2;i<n;i++){
            if(n%i==0){
                point++;
            }
        }
        if(point == 0){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println();
    }
}
