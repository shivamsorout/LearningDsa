public class Panagram {
    public static boolean checkIfPangram(String sentence) {
        String str = "abcdefghijklmnopqrstuvwxyz";
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j < sentence.length(); j++) {
                if (str.charAt(i) == sentence.charAt(j)) {
                    count++;
                    break;
                }
            }
        }
        if (count == 26) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        String sentence = "thequickbrownfoxjumpsoverthelazydog";
        System.out.println(checkIfPangram(sentence));
    }
}
