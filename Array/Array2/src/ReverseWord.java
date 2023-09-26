public class ReverseWord {
    public static String reverseWord(String s){
        String newString = "";
        String []str = s.split(" ");
        StringBuilder sb = new StringBuilder();

        for(int i=0;i<str.length;i++){
            for(int j=0;j<str[i].length();j++){
                sb.append(str[i].charAt(j));
            }
            sb.reverse();
            newString += sb.toString()+" ";
        }
        return newString.trim();
    }
    public static void main(String[] args) {
        String s = "Let's take LeetCode contest";
    }
}
