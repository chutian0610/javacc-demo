package io.github.chutian0610.javacc.tutorial02.tree.v2;

import org.junit.jupiter.api.Test;

import java.io.StringReader;

public class CalculatorTest {

    @Test
    public void testCalculate01() throws ParseException {
        String exp = "1+2+3";
        CalculatorTreeV2 parser = new CalculatorTreeV2(new StringReader(exp));
        parser.calculate();
        Node root = parser.jjtree.rootNode();
        CalculatorPrintVisitor visitor = new CalculatorPrintVisitor(exp);
        root.jjtAccept(visitor, 0);
    }
    @Test
    public void testCalculate02() throws ParseException {
        String exp = "1*(2+3)";
        CalculatorTreeV2 parser = new CalculatorTreeV2(new StringReader(exp));
        parser.calculate();
        Node root = parser.jjtree.rootNode();
        CalculatorPrintVisitor visitor = new CalculatorPrintVisitor(exp);
        root.jjtAccept(visitor, 0);
    }
}
