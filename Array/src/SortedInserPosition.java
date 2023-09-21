import java.util.Scanner;

public class SortedInserPosition {
    public static int sortedInsertPosition(int arr[],int num){
        int left = 0;
        int right = arr.length-1;

        while ( left <= right){
            int mid = left + (right-left)/2;
            if(arr[mid]==num){
                return mid;
            } if (arr[mid]<num) {
                left = mid + 1;
            }else{
                right = mid - 1;
            }
        }
        return left;
    }
    public static void main(String[] args) {
        int number = 5;
        int arr[] = {1,2,3,4,5,6};
        System.out.println(sortedInsertPosition(arr,number));
    }
}
