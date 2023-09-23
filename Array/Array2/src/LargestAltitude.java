public class LargestAltitude {
    public static int largestAltitude(int[] gain) {
        int alt[] = new int[gain.length+1];
        alt[0] = 0;
        int highestAlt = 0;
        for(int i=1;i<gain.length;i++){
            alt[i] = gain[i-1]+alt[i-1];
        }
        alt[alt.length-1] = gain[gain.length-1]+alt[alt.length-2];
        for(int i=0;i<alt.length;i++){
            if(alt[i]>highestAlt){
                highestAlt=alt[i];
            }
        }
        return highestAlt;
    }
    public static void main(String[] args) {
        int arr[] = {-5,1,5,0,-7};
//        int newArr[] = largestAltitude(arr);
//        for(int i:newArr){
//            System.out.println(i);
//        }
        System.out.println(largestAltitude(arr));
    }
}
