public class SumOddLengthSubarrays {
    public static int sumOddLengthSubarrays(int [] arr){
        int sum = 0;
        for(int i=0;i<arr.length;i++){
            int count = 0;
            for(int j=i;j<arr.length;j++){
                for(int k=i;k<j;k++){
                    count++;
                    if(count%2!=0){
                        sum += arr[k];
                    }
                }
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int arr[] = {1,2};
        System.out.println(sumOddLengthSubarrays(arr));
    }
}
