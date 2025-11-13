package io.github.chutian0610.javacc.tutorial02.tree.v2;

public
class AST_unary extends io.github.chutian0610.javacc.tutorial02.tree.v2.BaseNode {
    public AST_unary(int id) {
        super(id);
    }

    protected boolean positive;

    public boolean isPositive() {
        return positive;
    }

    public void setPositive(boolean positive) {
        this.positive = positive;
    }
    public AST_unary(CalculatorTreeV2 p, int id) {
        super(p, id);
    }


    /** Accept the visitor. **/
    public Object jjtAccept(CalculatorTreeV2Visitor visitor, Object data) {

        return
                visitor.visit(this, data);
    }
}
