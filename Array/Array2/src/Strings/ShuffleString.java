package Strings;

public class ShuffleString {
    public static String restoreString(String s, int[] indices) {
        char[] word = s.toCharArray();
        char[] newWord = new char[word.length];
        for(int i=0;i<indices.length;i++){
            newWord[indices[i]] = word[i];
            System.out.println(indices[i]+","+word[i]);
        }
        return new String(word);
    }

    public static void main(String[] args) {
        int []indices = {4,5,6,7,0,2,1,3};
        String s = "codeleet";
        System.out.println(restoreString(s,indices));
    }
}
