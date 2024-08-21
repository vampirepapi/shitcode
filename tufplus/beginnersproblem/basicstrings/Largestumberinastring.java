package tufplus.beginnersproblem.basicstrings;

public class Largestumberinastring {
    public String largeOddNum(String s) {
        int maxOdd=-1;
        for (int i = 0; i < s.length(); i++) {
            for (int j = i+1; j <= s.length(); j++) {
                int absVal = Math.abs(Integer.parseInt(s.substring(i, j)));
                    if (absVal!=0 &&absVal%2!=0) {
                        maxOdd=Math.max(maxOdd, absVal);
                    }
            }
        }
        return maxOdd>0?String.valueOf(maxOdd):"";
    }
    public static void main(String[] args) {
        String s="7542351161";
        Largestumberinastring obj = new Largestumberinastring();
        
        System.out.println(obj.largeOddNum(s));
    }
    
}
