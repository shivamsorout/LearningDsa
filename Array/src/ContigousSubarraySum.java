public class ContigousSubarraySum {

    public  static int  contiguousSubarraySumMethod(int[] arr, int k){
        if(arr.length < k){
            return -1;
        }

        int sum = 0;
        for(int i = 0; i<k; i++){
           sum += arr[i];
        }

        int maxSum = sum;
        for(int i = k; i <arr.length; i++){
            sum += arr[i] - arr[i - k];
            maxSum = Math.max(maxSum,sum);
        }

        return maxSum;
    }

    public static void main(String[] args) {
      int  arr[] = {1, 2,3,4};
      int k = 3;

        int result = contiguousSubarraySumMethod(arr,k);
        System.out.println(result);
    }
}
