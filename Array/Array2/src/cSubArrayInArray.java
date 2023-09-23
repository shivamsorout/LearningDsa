public class cSubArrayInArray {
    public static void printSubArray(int arr[]){
        for(int i=0;i< arr.length;i++){
            for(int j=i;j< arr.length;j++){
                System.out.print("{");
                printArr(arr,i,j);
                System.out.print("} ");
            }
            System.out.println(" ");
        }
    }
    public static void printArr(int arr[],int i, int j){
        for (int k=i;k<=j;k++){
            System.out.print(arr[k]+",");
        }
    }

    public static void main(String[] args) {
        int arr[] = {2,4,6,8,10};
        printSubArray(arr);
    }
}
