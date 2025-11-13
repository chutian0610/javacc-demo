package io.github.chutian0610.javacc.tutorial02.simple;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.StringReader;

public class CalculatorTest {
    @DisplayName("test 1+2 = 3")
    @Test
    public void testCalculate01() throws ParseException {
        Calculator parser = new Calculator(new StringReader("1+2"));
        Assertions.assertEquals(3,parser.calculate());
    }
    @DisplayName("test 1*2 = 2")
    @Test
    public void testCalculate02() throws ParseException {
        Calculator parser = new Calculator(new StringReader("1*2"));
        Assertions.assertEquals(2,parser.calculate());
    }
    @DisplayName("test 4/2 = 2")
    @Test
    public void testCalculate03() throws ParseException {
        Calculator parser = new Calculator(new StringReader("4/2"));
        Assertions.assertEquals(2,parser.calculate());
    }
    @DisplayName("test 3-1 = 2")
    @Test
    public void testCalculate04() throws ParseException {
        Calculator parser = new Calculator(new StringReader("3-1"));
        Assertions.assertEquals(2,parser.calculate());
    }
    @DisplayName("test 1\n\r+2 = 3 ")
    @Test
    public void testCalculate05() throws ParseException {
        Calculator parser = new Calculator(new StringReader("1\n\r+2"));
        Assertions.assertEquals(3,parser.calculate());
    }
    @DisplayName("test 3-1*2 = 1")
    @Test
    public void testCalculate06() throws ParseException {
        Calculator parser = new Calculator(new StringReader("3-1*2"));
        Assertions.assertEquals(1,parser.calculate());
    }
    @DisplayName("test (3-1)*2 = 4")
    @Test
    public void testCalculate07() throws ParseException {
        Calculator parser = new Calculator(new StringReader("(3-1)*2"));
        Assertions.assertEquals(4,parser.calculate());
    }
    @DisplayName("test 3+ -1*2 = 1")
    @Test
    public void testCalculate08() throws ParseException {
        Calculator parser = new Calculator(new StringReader("3+ -1*2"));
        Assertions.assertEquals(1,parser.calculate());
    }
    @DisplayName("test 1-2-3 = -4")
    @Test
    public void testCalculate09() throws ParseException {
        Calculator parser = new Calculator(new StringReader("1-2-3"));
        Assertions.assertEquals(-4,parser.calculate());
    }
    @DisplayName("test -1+2*3 = 5")
    @Test
    public void testCalculate10() throws ParseException {
        Calculator parser = new Calculator(new StringReader("-1+2*3"));
        Assertions.assertEquals(5,parser.calculate());
    }
}
