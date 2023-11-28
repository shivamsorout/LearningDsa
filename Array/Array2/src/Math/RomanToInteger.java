package Math;

class RomanToInteger {
    public static int romanToInt(String s) {
        int I = 1, V=5, X=10, L=50, C=100, D=500, M=1000;
        int val = 0;

        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='I'){
                val += I;
            }else if(s.charAt(i)=='V'){
                val += V;
            }else if(s.charAt(i)=='X'){
                val += X;
            }else if(s.charAt(i)=='L'){
                val += L;
            }else if(s.charAt(i)=='C'){
                val += C;
            }else if(s.charAt(i)=='D'){
                val += D;
            }else{
                val += M;
            }
        }
        return val;
    }

    public static void main(String[] args) {
        System.out.println(romanToInt("MCMXCIV"));
    }
}
