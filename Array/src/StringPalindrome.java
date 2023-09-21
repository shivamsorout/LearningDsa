public class StringPalindrome {
    public static Boolean palidrome(int x){
        String str = String.valueOf(x);
        int left = 0;
        int right = str.length()-1;
        while(right>=left){
            if(str.charAt(left)!=str.charAt(right)){
               return false;
            }
            left++;
            right--;
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(palidrome(123271));
    }
}
