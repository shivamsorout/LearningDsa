public class TrappingRainWater {
    public static int trappedRainWater(int arr[]){
        int n = arr.length;

        int lefMaxBoundary[] = new int[arr.length];
        //Left max Boundary
        lefMaxBoundary[0] = arr[0];
        for(int i=1;i< arr.length;i++){
            if(arr[i]>lefMaxBoundary[i-1]){
                lefMaxBoundary[i] = arr[i];
            }else {
                lefMaxBoundary[i] = lefMaxBoundary[i-1];
            }
        }
        int rightMaxBoundary[] = new int[arr.length];
        rightMaxBoundary[arr.length-1] =arr[arr.length-1];
        //Right Max Boundary
        for(int i=arr.length-2;i>=0;i--){
            if(arr[i]>rightMaxBoundary[i+1]){
                rightMaxBoundary[i] = arr[i];
            }else {
                rightMaxBoundary[i] = rightMaxBoundary[i+1];
            }
        }


        int trappedWater = 0;
        for(int i=0;i< arr.length;i++){
            //WaterLevel = min(lefMax Boundary - rightMAx Boundary)
            int waterLevel = Math.min(lefMaxBoundary[i],rightMaxBoundary[i]);
            //trappedWater = waterLevel - height;
            trappedWater += waterLevel - arr[i];
        }
        return trappedWater;
    }

    public static void main(String[] args) {
        int arr[] = {4,2,0,6,3,2,5};
        System.out.println(trappedRainWater(arr));
    }
}
