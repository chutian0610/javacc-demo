package io.github.chutian0610.javacc.tutorial02.tree;

public class CalculateVisitor implements CalculatorTreeVisitor{
    @Override
    public Double visit(SimpleNode node, Object data) {
       if(node.getClass() ==SimpleNode.class){
           throw new IllegalStateException("Unexpected Node:"+node.toString());
       }
       return (Double) node.jjtAccept(this,data);
    }

    @Override
    public Double visit(ASTStartNode node, Object data) {
        return visit((SimpleNode) node.jjtGetChild(0),data);

    }

    @Override
    public Double visit(ASTAddNode node, Object data) {
        Double left = visit((SimpleNode) node.jjtGetChild(0),data);
        Double right =visit((SimpleNode) node.jjtGetChild(1),data);
        return left+right;
    }

    @Override
    public Double visit(ASTSubtractNode node, Object data) {
        Double left = visit((SimpleNode) node.jjtGetChild(0),data);
        Double right =visit((SimpleNode) node.jjtGetChild(1),data);
        return left-right;
    }

    @Override
    public Double visit(ASTMulNode node, Object data) {
        Double left = visit((SimpleNode) node.jjtGetChild(0),data);
        Double right =visit((SimpleNode) node.jjtGetChild(1),data);
        return left*right;
    }

    @Override
    public Double visit(ASTDivNode node, Object data) {
        Double left = visit((SimpleNode) node.jjtGetChild(0),data);
        Double right =visit((SimpleNode) node.jjtGetChild(1),data);
        return left/right;
    }

    @Override
    public Double visit(ASTMinusNode node, Object data) {
        Double left = visit((SimpleNode) node.jjtGetChild(0),data);
        return -left;
    }

    @Override
    public Double visit(ASTNumber node, Object data) {
        String number = node.jjtGetFirstToken().image;
        return Double.parseDouble(number);
    }
}
