package Recursion;

public class PowerOfN {
    public static int powerOfN(int n, int p){
        if(p<1){
            return 1;
        }
        int pow = 1;
        pow *= n * powerOfN(n,p-1);
        return pow;
    }

    public static void main(String[] args) {
        System.out.println(powerOfN(2,4));
    }


}
