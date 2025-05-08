package coffee;

public class GCDOfTwoNumbers {
    public int GCD(int n1, int n2) {
        while (n1>0 && n2>0) {            
            if (n1>n2){
                n1 = n1%n2;
            }
            else n2 = n2%n1;
        }
        return n1==0?n2:n1;
    }
    public static void main(String[] args) {
        GCDOfTwoNumbers obj = new GCDOfTwoNumbers();
        int res = obj.GCD(12, 15);
        System.out.println(res);
    }
    
}
