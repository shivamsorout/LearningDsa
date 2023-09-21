public class BinarySearch {
    public static int binarySearch(int arr[], int target){
        int left = 0;
        int right = arr.length-1;
        int ans = -1;
        while(left<=right){
            int mid = (left + right)/2;
            if(arr[mid] == target){
                ans = mid;
                right = mid - 1;
            } else if (arr[mid] > target) {
                left = mid +1;
            }else{
                right = mid - 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int arr[] = {-7,-3,10,10,12,13,15};
        int target = 10;
        System.out.println(binarySearch(arr,target));
    }
}