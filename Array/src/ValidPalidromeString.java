public class ValidPalidromeString {
    public static Boolean isPalindrome(String s){
        String str = s.toLowerCase();
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if((ch>='a' && ch<='z') || (ch>='0' && ch<='9')){
                sb.append(ch);
            }
        }
        String st = sb.toString();
        int left = 0;
        int right = st.length()-1;
        while(left<=right){
            if(st.charAt(left) != st.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(s));
    }
}
