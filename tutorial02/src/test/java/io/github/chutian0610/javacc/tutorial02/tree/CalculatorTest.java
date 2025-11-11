package io.github.chutian0610.javacc.tutorial02.tree;

import org.junit.jupiter.api.Test;

import java.io.StringReader;

public class CalculatorTest {

    @Test
    public void testCalculate01() throws ParseException {
        String exp = "1+2+3";
        CalculatorTree parser = new CalculatorTree(new StringReader(exp));
        parser.calculate();
        Node root = parser.jjtree.rootNode();
        CalculatorPrintVisitor visitor = new CalculatorPrintVisitor(exp);
        root.jjtAccept(visitor, 0);
    }
    @Test
    public void testCalculate02() throws ParseException {
        String exp = "1+(2+3)";
        CalculatorTree parser = new CalculatorTree(new StringReader(exp));
        parser.calculate();
        Node root = parser.jjtree.rootNode();
        CalculatorPrintVisitor visitor = new CalculatorPrintVisitor(exp);
        root.jjtAccept(visitor, 0);
    }
    @Test
    public void testCalculate03() throws ParseException {
        String exp = "1+2*3";
        CalculatorTree parser = new CalculatorTree(new StringReader(exp));
        parser.calculate();
        Node root = parser.jjtree.rootNode();
        CalculatorPrintVisitor visitor = new CalculatorPrintVisitor(exp);
        root.jjtAccept(visitor, 0);
    }
}
