import java.util.*;

public class SlefDividingNumber {
    public static List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> list = new ArrayList<>();
        for(int i=left; i<=right;i++){
            boolean selfDividing = isSelfDividing(i);
            if(selfDividing){
                list.add(i);
            }
        }
        return list;
    }
    public static boolean isSelfDividing(int i){
        int temp=i;
        while(temp>0){
            int rem = temp%10;
            if(rem==0){
                return false;
            }
            if(rem>0 && i%rem!=0){
                return false;
            }
            temp = temp/10;
        }
        return true;
    }

    public static void main(String[] args) {
        int left = 1;
        int right = 22;
        List<Integer> list = selfDividingNumbers(left,right);
        for(Integer i:list){
            System.out.println(i);
        }
    }
}
