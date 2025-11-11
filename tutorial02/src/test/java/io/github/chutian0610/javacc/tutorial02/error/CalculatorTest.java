package io.github.chutian0610.javacc.tutorial02.error;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.StringReader;

public class CalculatorTest {
    @DisplayName("test 1-2-3 != -4")
    @Test
    public void testCalculateError() throws ParseException {
        CalculatorError parser = new CalculatorError(new StringReader("1-2-3"));
        Assertions.assertNotEquals(-4,parser.calculate());
    }
}
