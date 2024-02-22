import java.util.Arrays;

public class MyHashSet {
    int size = (int)Math.pow(10, 6)+1;
    boolean[] flag;
    public MyHashSet() {
        flag = new boolean[size];

    }
    
    public void add(int key) {
        flag[key]=true;
    }
    
    public void remove(int key) {
        flag[key] = false;   
    }    

    public boolean contains(int key) {
        return flag[key];    
    }
    public static void main(String[] args) {
        MyHashSet myHashSet = new MyHashSet();
        myHashSet.add(1);
        myHashSet.add(2);
        myHashSet.add(3);
        System.out.println(Arrays.toString(new Object[] {null, null, null, myHashSet.contains(1), myHashSet.contains(3), null, myHashSet.contains(2), null, myHashSet.contains(2)}));
        myHashSet.remove(2);
        System.out.println(myHashSet.contains(2));
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */