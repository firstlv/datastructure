package solution;


import java.util.Stack;

/**
 * 判断括号是否有效
 */
public class ValidParentheses {

    public boolean judge(String s){
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(' || c == '{' || c == '['){
                stack.push(c);
            }else {
                if (stack.isEmpty())
                    return false;
                char topChar = stack.pop();
                if (c == '(' && topChar != ')')
                    return false;
                if (c == '[' && topChar != ']')
                    return false;
                if (c == '{' && topChar != '}')
                    return false;
            }

        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String s = "({[]})";
        ValidParentheses validParentheses = new ValidParentheses();
        boolean judge = validParentheses.judge(s);
        System.out.println(judge);
    }
}
