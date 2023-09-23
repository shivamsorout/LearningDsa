import java.util.ArrayList;

public class Main {
    public static int[] shuffle(int[] nums, int n) {
        ArrayList<Integer> list = new ArrayList<>();
        int j=n;
        for(int i=0;i<n;i++){
            list.add(nums[i]);
            list.add(nums[j]);
            j++;
        }
        for(int i=0;i<list.size();i++){
            nums[i] = list.get(i);
        }
        return nums;
    }
    public static void main(String[] args) {
        int [] arr = {2,5,1,3,4,7};
        int n = 3;
        int nums[] = shuffle(arr,n);
        for (int i:nums) {
            System.out.println(i);
        }
    }
}