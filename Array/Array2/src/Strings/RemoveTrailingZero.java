package Strings;

public class RemoveTrailingZero {
    public static String removeTrailingZeros(String num) {
        StringBuilder sb = new StringBuilder();
        int n = 0;
        for(int i=num.length()-1;i>=0;i--){
            if(num.charAt(i)!='0'){
                n = i;
                break;
            }
        }
        for(int i=n;i>=0;i--){
            sb.append(num.charAt(i));
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(removeTrailingZeros("51230100"));
    }
}
