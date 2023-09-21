public class JewelsAndStones {
    public static int numJewelsInStones(String jewels, String stones){
        int count=0;
        for(int i=0;i<jewels.length();i++){
            for(int j=0;j<stones.length();j++){
                if(jewels.charAt(i)==stones.charAt(i)){
                    count++;
                }
            }
        }
        return count;
    }
    public String defangIPaddr(String address) {
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<address.length();i++){
            if(address.charAt(i)=='.'){
                sb.append('[');
                sb.append('.');
                sb.append(']');
            }else{
                sb.append(address.charAt(i));
            }
        }
        return sb.toString();
    }
}
