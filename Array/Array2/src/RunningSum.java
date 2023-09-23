public class RunningSum {
    public static int[] runningSum(int[] nums) {
        for(int i=0;i<nums.length;i++){
            int sum=0;
            for(int j=0;j<=i;j++){
                sum += nums[j];
            }
            nums[i] = sum;
        }
        return nums;
    }

    public static void main(String[] args) {
        int [] arr = {1,2,3,4};
        int []newArr = runningSum(arr);
        for(int i:newArr){
            System.out.println(i);
        }
    }
}
