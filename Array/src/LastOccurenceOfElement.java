public class LastOccurenceOfElement {
    public static int lastOccurrenceOfElement(int [] arr, int num){

//        int ind = -1;
//        for(int i=0;i< arr.length;i++){
//            if(arr[i]==num){
//                ind = i;
//            }
//        }
//        return ind;
        for(int i=arr.length-1;i>=0;i--){
            if(arr[i]==num){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int num = 8;
        int arr[] = {8,2,3,4,5,7,8};
        System.out.println(lastOccurrenceOfElement(arr,num));
    }
}
