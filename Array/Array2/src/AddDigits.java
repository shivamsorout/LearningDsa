import javax.swing.*;

public class AddDigits {
    public static int addDigits(int num) {
        int sum = 0;
        while (num != 0) {
            int rem = num % 10;
            sum += rem;
            num = num / 10;
        }
        if(sum>9){
            return addDigits(sum);
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(addDigits(38));
    }
}
