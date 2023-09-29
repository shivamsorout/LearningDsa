public class dMaxSubArraySum_Prefix {
    public static int printSubArraySum(int arr[]){
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        int prefixArr[] = new int[arr.length];
         prefixArr[0] = arr[0];
        for(int i=1;i<prefixArr.length;i++){
            prefixArr[i] = prefixArr[i-1] + arr[i];
        }
        for(int i=0;i< arr.length;i++) {
            for (int j = i; j < arr.length; j++) {
                currSum = i == 0?prefixArr[j]:prefixArr[j]-prefixArr[i-1];
                if(maxSum<currSum){
                    maxSum=currSum;
                }
            }
        }
        return maxSum;
    }
    public static int printSubArraySumUsingKadanesAlgo(int arr[]){
        int maxSum = Integer.MIN_VALUE;
        int curSum = 0;
        for(int i=0;i<arr.length;i++){
            curSum = curSum + arr[i];
            if(curSum<0){
                curSum=0;
            }
            maxSum = Math.max(curSum,maxSum);
        }
        return maxSum;
    }

    public static void main(String[] args) {
        int arr[] = {-2,-3,4,-1,-2,1,5,-3};
//        System.out.println(printSubArraySum(arr));
        System.out.println(printSubArraySumUsingKadanesAlgo(arr));
    }
}
