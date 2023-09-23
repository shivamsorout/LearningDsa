public class DiffrenceSum {
    public static int differenceOfSum(int[] nums) {
        int elementSum=0;
        int digitSum = 0;
        for(int i=0;i<nums.length;i++){
            elementSum += nums[i];
            if(nums[i]>9){
                while (nums[i]>0){
                    int rem = nums[i]%10;
                    digitSum += rem;
                    nums[i] = nums[i]/10;
                }
            }else{
                digitSum += nums[i];
            }
        }
        int difference = Math.abs(elementSum-digitSum);
        return difference;
    }

    public static void main(String[] args) {
        int arr[] = {1,15,6,3};
        System.out.println(differenceOfSum(arr));
    }
}
