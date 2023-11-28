package List;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindDifference {
    public static List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> list = new ArrayList<>();
        list.add(new ArrayList<>());
        list.add(new ArrayList<>());
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        for(int num:nums1){
            set1.add(num);
        }
        for(int num:nums2){
            set2.add(num);
        }
        for(int num:set1){
            if(!set2.contains(num)){
                list.get(0).add(num);
            }
        }
        for(int num:set2){
            if(!set1.contains(num)){
                list.get(1).add(num);
            }
        }
        return list;
    }

    public static void main(String[] args) {
        int [] nums1 = {1,2,3};
        int [] nums2 = {2,4,6};
        List<List<Integer>> list = findDifference(nums1,nums2);
        for (List<Integer> li : list) {
            System.out.println(li);
        }
    }
}
