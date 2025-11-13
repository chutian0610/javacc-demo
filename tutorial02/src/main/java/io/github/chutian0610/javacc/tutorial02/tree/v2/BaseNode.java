package io.github.chutian0610.javacc.tutorial02.tree.v2;

public abstract class BaseNode extends SimpleNode{
    public BaseNode(int i) {
        super(i);
    }
    public BaseNode(CalculatorTreeV2 p, int i) {
        super(p, i);
    }

    public String formatText() {
        if (jjtGetFirstToken() == null || jjtGetLastToken() == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        Token current = jjtGetFirstToken();
        Token last = jjtGetLastToken();

        while (current != null) {
            sb.append(current.image);
            if (current == last) break;
            Token next = current.next;
            if (next != null) {
                if (!needsNoSpace(current, next)) {
                    sb.append(" ");
                }
            }
            current = current.next;
        }
        return sb.toString();
    }
    // 判断两个token之间是否需要添加空格
    private static boolean needsNoSpace(Token current, Token next) {
        // 对于一些操作符，可能不需要额外的空格
        // 例如: a+b, 3.14, () 等
        return false; // 保守起见，总是添加空格
    }
}
