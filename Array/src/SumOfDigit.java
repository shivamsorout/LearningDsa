public class SumOfDigit {
    public static int sumOfDigitis(int N){
        if(N==0){
            return 0;
        }
        int sum=0;
        int rem = N%10;
        sum = sumOfDigitis(N/10)+rem;
        return sum;
    }
    public static void main(String[] args) {
        System.out.println(sumOfDigitis(123));
    }
}
