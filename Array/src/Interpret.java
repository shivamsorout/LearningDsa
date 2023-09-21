public class Interpret {
    public String interpret(String command) {
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<command.length();i++){
            if(command.charAt(i)=='(' && command.charAt(i)==')'){
                sb.append('o');
            }else if(command.charAt(i)=='(' && command.charAt(i)=='a' && command.charAt(i)=='l' && command.charAt(i)==')'){
                sb.append('a');
                sb.append('l');
            } else{
                sb.append('g');
            }
        }
        for (int i=0;i<command.length();i++){
            if(command.charAt(i)=='(' && command.charAt(i)==')'){
                sb.append('o');
            } else if (command.charAt(i)=='(' && command.charAt(i)=='a' && command.charAt(i)=='l' &&command.charAt(i)==')') {

            }else {

            }
        }
        return "";
    }
}
