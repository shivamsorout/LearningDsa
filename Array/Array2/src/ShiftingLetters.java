public class ShiftingLetters {
    public String shiftingLetters(String s, int[] shifts) {
        //Pending
        char newCh ='a';
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<s.length();i++){
            for(int j=0;j<shifts.length;j++){
                char ch = s.charAt(i);
                int num = shifts[j];
                newCh = (char)(ch+num);
            }
            sb.append(newCh);
        }
        return sb.toString();
    }
}
