public class TruncateString {
    public static String truncateSentence(String s, int k) {
        StringBuilder sb = new StringBuilder();
        int count =0;
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch==' '){
                count++;
            }
            if(count==k){
                break;
            }
            sb.append(ch);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String str = "Hello how are you Contestant";
        int k=4;
        System.out.println(truncateSentence(str,k));
    }
}
