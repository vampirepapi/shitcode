package random;

public class PartitioningIntoMinimumNumberOfDeciBinaryNumbers_1689 {
    public static int minPartitions(String n) {
        int max = 0;
        for (char c : n.toCharArray()) {
            if (Integer.parseInt(Character.toString(c)) > max) {
                max = Integer.parseInt(Character.toString(c));
            }
        }
        return max;
    }

    public static void main(String[] args) {
        String n = "27346209830709182346";
        System.out.println(minPartitions(n));

    }

}
