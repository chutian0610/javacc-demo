package io.github.chutian0610.javacc.tutorial02.tree;

public class CalculatorPrintVisitor extends CalculatorTreeDefaultVisitor{

    private String sourceCode;

    public CalculatorPrintVisitor(String sourceCode){
        this.sourceCode = sourceCode;
    }

    public Object defaultVisit(SimpleNode node, Object data){
        int d = (int)data;
        System.out.println(node.toString(getPrefix(d)));
        node.childrenAccept(this, d+1);
        return data;
    }

    public Object visit(ASTNumber node, Object data){
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
