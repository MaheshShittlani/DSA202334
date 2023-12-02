public class TestExpression {
    public static void main(String[] args) {
        String s = "[(a + b) * (c + d) - e]";

        ExpressionOperations expOp = new ExpressionOperations(s);
        boolean isMathed = expOp.isParenthisisMathed();
        System.out.println(isMathed);
    }
}
