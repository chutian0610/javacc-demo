package io.github.chutian0610.javacc.tutorial01.nonstatic;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.StringReader;

public class Tutorial01Test {

    @DisplayName("test braces count with Non static parser")
    @Test
    public void testBracesCount() throws ParseException {
        BracesCountNonStatic parser = new BracesCountNonStatic(new StringReader("{{{}}}"));
        Assertions.assertEquals(3,parser.Input());
    }
    @Test
    @DisplayName("test braces count with white space and Non static parser")
    public void testBracesCountWithWiteSpace() throws ParseException {
        BracesCountNonStatic parser = new BracesCountNonStatic(new StringReader("{{{\n\n}\n}\r\n\t}"));
        Assertions.assertEquals(3, parser.Input());
    }
}
