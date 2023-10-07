package Strings;

public class ProductExceptSelf {
    public static int[] productExceptSelf(int[] nums) {

        //O(n^2) time complexity
//        int[] arr = new int[nums.length];
//
//        for (int i = 0; i < nums.length; i++) {
//            int count = 1;
//            for (int j = 0; j < nums.length; j++) {
//                if (j != i) {
//                    count = count * nums[j];
//                }
//            }
//            arr[i] = count;
//        }
//        return arr;
        //O(n) time complexity
        int n = nums.length;

        // Initialize result array with products to the left of each element

        int[] result = new int[n];
        result[0] = 1;

        // Calculate products to the left of each element

        int leftProduct = 1;
        for (int i = 1; i < n; i++) {
            leftProduct *= nums[i - 1];
            result[i] = leftProduct;
        }

        // Calculate products to the right of each element and multiply with the result
        int rightProduct = 1;
        for (int i = n - 1; i >= 0; i--) {
            result[i] *= rightProduct;
            rightProduct *= nums[i];
        }

        return result;
    }
    public static void main(String[] args) {
        int []arr = {1,2,3,4};
        for(int i:productExceptSelf(arr)){
            System.out.println(i);
        }
    }
}
