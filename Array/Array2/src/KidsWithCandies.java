import java.util.*;

public class KidsWithCandies {
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> list = new ArrayList<>();
        int max = candies[0];
        for(int i=0;i<candies.length;i++){
            if(candies[i]>max){
                max = candies[i];
            }
        }
        System.out.println(max);
        for(int i=0;i<candies.length;i++){
            if(candies[i]+extraCandies>=max){
                list.add(true);
            }else{
                list.add(false);
            }
        }
        return list;
    }
    public static  int[] smallerNumbersThanCurrent(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            int count = 0;
            for(int j=0;j<nums.length;j++){
                if(nums[j]<nums[i] && j!=i){
                    count++;
                }
                list.add(count);
            }
        }

        for(int i=0;i<list.size();i++){
            nums[i] = list.get(i);
        }
        return nums;
    }

    public static void main(String[] args) {
        int [] arr = {2,3,5,1,3};
        int n = 3;
        List<Boolean> list = kidsWithCandies(arr,n);
        for(Boolean b:list){
            System.out.println(b);
        }
    }
}
