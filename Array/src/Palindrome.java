public class Palindrome {
    public static Boolean isPalindrome(int x) {
        int duplicate = x;
        int rem;
        int palindrome = 0;
        while (x>0) {
            rem = x % 10;
            palindrome = palindrome * 10 + rem;
            x = x / 10;

        }
        if (palindrome==duplicate) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(121));
    }
}