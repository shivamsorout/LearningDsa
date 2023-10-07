package Sorting;

public class BubbleSort {
    public static int[] bubbleSort(int []arr){
        for(int i=0;i< arr.length-1;i++){
            for(int j=0;j< arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] =arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        int arr[] = {3,2,7,1,5};
        for(int i:bubbleSort(arr)){
            System.out.print(i+",");
        }
    }
}
