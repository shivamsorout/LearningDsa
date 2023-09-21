public class MaximumDifference {
    public static int maximumDifference(int [] arr){

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int num : arr){
            if(num %2 == 0){
                if(num < min){
                    min = num;
                }
                if(num > max){
                    max = num;
                }
            }
        }
        return max-min;
    }

    public static void main(String[] args) {
        int arr[] = {2,3,4,5,6,7,8,9};
        System.out.println(maximumDifference(arr));
    }
}
