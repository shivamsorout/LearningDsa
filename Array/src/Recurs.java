public class Recurs {
    public static void printNNumbers(int n){
        if(n==0) {
            return;
        }
        System.out.println(n);
        printNNumbers(n-1);
        System.out.println(n);
    }
    public static void main(String[] args) {
        printNNumbers(5);
    }
}
