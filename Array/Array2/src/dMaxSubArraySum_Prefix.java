public class dMaxSubArraySum_Prefix {
    public static int printSubArraySum(int arr[]){
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        int prefixArr[] = new int[arr.length];
        for(int i=0;i< arr.length;i++) {
            for (int j = i; j < arr.length; j++) {

                prefixArr[i] = prefixArr[i-1]+arr[i];
//                currSum=0;
//                for (int k=i;k<=j;k++){
//                    currSum += arr[k];
//                }
//                if(maxSum<currSum){
//                    maxSum=currSum;
//                }
            }
        }
        return maxSum;
    }

    public static void main(String[] args) {
        int arr[] = {2,4,6,8,10};
        System.out.println(printSubArraySum(arr));
    }
}
