package io.github.chutian0610.javacc.tutorial02.tree.v2;

public class CalculatorPrintVisitor extends CalculatorTreeV2DefaultVisitor {

    private String sourceCode;

    public CalculatorPrintVisitor(String sourceCode){
        this.sourceCode = sourceCode;
    }

    public Object defaultVisit(SimpleNode node, Object data){
        BaseNode baseNode = (BaseNode) node;
        int d = (int)data;
        System.out.println(node.toString(getPrefix(d))+":"+baseNode.formatText());
        node.childrenAccept(this, d+1);
        return data;
    }

    public Object visit(AST_number node, Object data){
        int d = (int)data;
        System.out.println(node.toString(getPrefix(d))+":"+node.jjtGetFirstToken().image);
        return data;
    }

    public String getPrefix(int level){
        StringBuilder s= new StringBuilder();
        for (int i = 0; i < level; i++) {
            s.append(" ");
        }
        return s.toString();
    }
}
