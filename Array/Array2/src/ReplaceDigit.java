public class ReplaceDigit {
    public static String replaceString(String s){
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(i%2==0){
                sb.append(ch);
            }else{
                char newCh = (char) (s.charAt(i-1)+1);
                sb.append(newCh);
            }
        }
        return sb.toString();
    }
}
