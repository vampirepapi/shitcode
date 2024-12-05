package coffee;
class CheckIfTheNumberIsArmstrong{
    public boolean isArmstrong(int n) {
        int len = lengthOfN(n);
        int temp = n;
        int newNum = 0;
        while (n>0) {
            newNum += Math.pow(n%10, len);
            n = n/10;
        }
        return newNum == temp;

    }
    public int lengthOfN(int n) {
        int cnt = 0;
        while (n>0){
            cnt++;
            n=n/10;
        }
        return cnt;
        
    }
    public static void main(String[] args) {
        CheckIfTheNumberIsArmstrong obj = new CheckIfTheNumberIsArmstrong();
        boolean res = obj.isArmstrong(153);
        System.out.println(res);
    }
    
}