public class DifferenceBetweenTwoNumbers {
    public static int differenceBetweenTwoNumbers(int arr[], int diff){
        int count =0;
        for(int i=0;i< arr.length;i++){
            for(int j=0;j< arr.length;j++){
                if(arr[i]-arr[j]==diff){
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int arr[] = {1,4,3,5,8,7};
        int diff = 2;
        System.out.println(differenceBetweenTwoNumbers(arr,diff));
    }
}
