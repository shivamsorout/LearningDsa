package Math;

public class HappyNumber {
    public static boolean isHappy(int n) {
        int temp = n;
        int sqar = 0;
        if(n==1){
            return true;
        }
        while(temp>0){
            int rem = temp%10;
            sqar += rem*rem;
            temp = temp/10;
        }
        isHappy(sqar);
        return false;
    }
    public static void main(String[] args) {
        System.out.println(isHappy(19));
    }
}
