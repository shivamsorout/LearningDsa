public class ConcatenationOfArray {
    public static int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int newArr[] = new int[n+n];

        for(int i=0;i<n;i++){
            newArr[i] = nums[i];
        }

        int j = 0;
        for(int i=n;i< newArr.length;i++){
            newArr[i]  = nums[j];
            j++;
        }
        return newArr;
    }

    public static void main(String[] args) {
        int arr[] = {1,2,1};
        int []ans = getConcatenation(arr);
        for(int el:ans){
            System.out.println(el);
        }
    }
}
