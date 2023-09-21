public class PowerOfN {
    public static int power(int N, int R){
        if(R<1){
            return 1;
        }
        int pow = N*power(N,R-1);
        return pow;
    }
    public static void main(String[] args) {

        System.out.println(power(2,4));
    }
}
