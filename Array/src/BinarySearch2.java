public class BinarySearch2 {
    public static int[] binarySearch(int arr[]){
        int n = arr.length-1;
        for(int i=0;i<arr.length;i++) {
            int count =0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
                if (count > 1) {
                    arr[i] = 0;
                }
            }
        }
        int point =0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                point++;
            }else{

            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int arr[] = {2,5,5,7,7,7,8,8};
        int target = 10;
        int newArr[] = binarySearch(arr);
        for(int ar:newArr){
            System.out.println(ar);
        }
        System.out.println();
    }
}