package random;

public class DefangingAnIPAddress_1108 {
    public static String defangIPaddr(String address) {
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < address.length(); i++) {
            if (address.charAt(i) == ('.')) {
                ans.append("[.]");
            } else {
                ans.append(address.charAt(i));
            }
        }
        return ans.toString();
    }

    public static void main(String[] args) {
        String address = "255.100.50.0";
        System.out.println(defangIPaddr(address));
    }
}
