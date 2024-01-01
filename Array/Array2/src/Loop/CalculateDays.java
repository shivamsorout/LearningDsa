package Loop;

public class CalculateDays {

    //we have calculate total if mon-1 and tue-2 and sun-7.
    //after week monday will increase by 1

    //if val 10 then
    //1+2+3+4+5+6+7+2+3+4(mon to sun and mon to wed)

    public static int calDays(int num){
        int result=0;
        int val=0;
        for(int i=1;i<=num/7;i++){
            for(int j=i;j<=7+i-1;j++){
                result+=j;
            }
            val = i;
        }
        if(num%7!=0){
            int rem = num%7;
            val=val+1;
            for(int i=1;i<=rem;i++){
                result += val;
                val++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(calDays(20));
    }
}
