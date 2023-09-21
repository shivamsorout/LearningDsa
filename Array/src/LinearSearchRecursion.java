public class LinearSearchRecursion {
    public static int linearSearch(int arr[], int num){
        int left = 0;
        int right = arr.length-1;
        while (left<= right){
            int mid = left + (right-left)/2;
            if(arr[mid]==num){
                return mid;
            }
            if(num>arr[mid]){
                left = mid+1;
            }else{
                right = mid-1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = {2,3,3,4,9,10};
        int num = 3;
//        System.out.println(linearSearch(arr,num));
        System.out.println(linearSearch(arr,num));
    }
}
