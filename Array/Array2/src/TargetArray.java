public class TargetArray {
    public static int[] createTargetArray(int[] nums, int[] index) {
        int target[] = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            target[index[i]] = nums[i];
        }
        return target;
    }

    public static void main(String[] args) {
        int num[] = {0,1,2,3,4};
        int index[] = {0,1,2,2,1};
        int arr[] = createTargetArray(num,index);
        for(int i:arr){
            System.out.println(i);
        }
    }
}
