import java.util.Arrays;

public class Gfg {
    public static int search(int A[], int N)
    {
        int count = 0;
        int res = A[0];
        for(int i=1;i<A.length;i++){
//            if(N==A[i]){
//                count++;
//            }
            res = res^A[i];
        }
        return res;
    }

    public static void main(String[] args) {
        int [] arr = {1,2,5,1,5};
//        System.out.println(search(arr, 5));
        String str = "HelloWorld";

        char[] chars = str.toCharArray();
        Arrays.sort(chars);
        String sortedStr = new String(chars);
        for(int i=0;i<str.length();i++) {
            int count = 1;
            while (i < str.length() - 1 && sortedStr.charAt(i) == sortedStr.charAt(i + 1)) {
                count++;
                i++;
            }
            if (count > 1) {
                System.out.println(sortedStr.charAt(i) + ", count = " + count);
            }
        }
    }
}
