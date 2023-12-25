import java.util.*;

public class SumOfArrayElement {
        public static int countLargestGroup(int n) {
            Map<Integer,Integer> map = new HashMap<>();
            for(int i=1;i<=n;i++){
                map.put(countGroup(i),map.getOrDefault(countGroup(i),0)+1);
            }
            int maxCount = 0;
            int maxCountOcc = 0;
            for(int count: map.values()){
                if(count>maxCount){
                    maxCount=count;
                    maxCountOcc = 1;
                } else if (count==maxCount) {
                    maxCountOcc++;
                }
            }
            return maxCountOcc;

        }
        public static int countGroup(int n){
            String str = String.valueOf(n);
            int sum=0;
            for(int i=0;i<str.length();i++){
                sum = sum+(str.charAt(i)-'0');
                System.out.println(sum);
            }
            return sum;
        }

    public static void main(String[] args) {
        System.out.println(countLargestGroup(13));
    }
}
