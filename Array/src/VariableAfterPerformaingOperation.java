public class VariableAfterPerformaingOperation {
    public static int finalValueAfterOperations(String [] operations ){
        int X = 0;
        for(int i=0;i<operations.length;i++){
            if(operations[i].equals("--X")){
                --X;
            } else if (operations[i].equals("X--")) {
                X--;
            } else if (operations[i].equals("X++")) {
                X++;
            } else if (operations[i].equals("++X")){
                ++X;
            }
        }
        return X;
    }

    public static void main(String[] args) {
        String []arr = {"--X","X++","X++"};
        System.out.println(finalValueAfterOperations(arr));
    }
}
