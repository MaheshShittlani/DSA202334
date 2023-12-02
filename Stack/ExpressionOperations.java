import java.util.EmptyStackException;

public class ExpressionOperations {
    private String exp;

    public ExpressionOperations(String exp) {
        this.exp = exp;
    }

    public boolean isParenthisisMathed() {
        char[] arr = exp.toCharArray();
        MyStack s1 = new MyStack(arr.length);
        try {
            for (int i = 0; i < arr.length; i++) {
                char ch = arr[i];
                if (ch == '(' || ch == '{' || ch == '[') {
                    s1.push(ch);
                } else if (ch == ')') {
                    if (s1.peep() != '(') {
                        return false;
                    } else {
                        s1.pop();
                    }
                } else if (ch == '}') {
                    if (s1.peep() != '{') {
                        return false;
                    } else {
                        s1.pop();
                    }
                } else if (ch == ']') {
                    if (s1.peep() != '[') {
                        return false;
                    } else {
                        s1.pop();
                    }
                }
            }

            return s1.isEmpty();
        } catch (EmptyStackException e) {
            return false;
        }
    }

    public String intoPost() {
        String postfix = "";

        return postfix;
    }

    public String intoPre() {
        String prefix = "";

        return prefix;
    }

    public int evalPost(String postfix) {
        int result = 0;
        return result;
    }

    public int evalPre(String prefix) {
        int result = 0;
        return result;
    }
}
