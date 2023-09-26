import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class MaximumNUmbersOfStringPairs {
    public static int maximumNumberOfStringPairs(String[] words) {
        int count=0;
        List<String> list = new ArrayList<>();
        for(int i=0;i<words.length;i++){
            for(int j=0;j<words.length;j++){
                StringBuilder sb = new StringBuilder();
                for(int k=0;k<words[j].length();k++){
                    sb.append(words[j].charAt(k));
                }
                String str = sb.reverse().toString();
                if(words[i].equals(str)){
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String [] str = {"ku","dd","gu","uk"};
        System.out.println(maximumNumberOfStringPairs(str));
    }
}
