import com.sun.source.tree.BreakTree;

import java.sql.Array;

public class TwoSum {
    public static Boolean twoSum(int arr[], int k) {
        int newArr[] = new int[2];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] + arr[j] == k) {
                    newArr[0] = i;
                    newArr[1] = j;
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int [] arr = {3,2,5,7,12,14,17};
        int target = 16;
        Boolean res = twoSum(arr,target);
//        for(int i:arrr){
//            System.out.println(i);
//        }
    }
}
