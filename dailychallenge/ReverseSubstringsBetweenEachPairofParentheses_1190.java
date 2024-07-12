package dailychallenge;

import java.util.Stack;

public class ReverseSubstringsBetweenEachPairofParentheses_1190 {
    public String reverseParentheses(String s) {
        Stack<Character> res = new Stack<>();
        for (char c : s.toCharArray()) {
            StringBuilder portion = new StringBuilder();
            if (c == ')') {
                while (res.peek() != '(') {
                    portion.append(res.pop());
                }
                res.pop();
                for (char revChar : portion.toString().toCharArray()) {
                    res.push(revChar);
                }
            } else {
                res.add(c);
            }
        }
        StringBuilder ans = new StringBuilder();
        for (char c : res) {
            ans.append(c);
        }
        return ans.toString();
    }
}
