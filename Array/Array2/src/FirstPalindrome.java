public class FirstPalindrome {
    public static String firstPalindrome(String[] words) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < words.length; i++) {
            int k = words[i].length() - 1;
            for (int j = 0; j < words[i].length(); j++) {
                while (j <= k) {
                    if (words[i].charAt(j) == words[i].charAt(k)) {
                        sb.append(words[i].charAt(j));
                        sb.append(words[i].charAt(k));
                    }
                    j++;
                    k--;
                }
            }
        }
        return "";
    }

    public static void main(String[] args) {
        String []str = {"abc","car","ada","racecar","cool"};
        System.out.println(firstPalindrome(str));
    }
}
