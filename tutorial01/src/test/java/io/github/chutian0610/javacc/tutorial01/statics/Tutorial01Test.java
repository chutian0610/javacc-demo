package io.github.chutian0610.javacc.tutorial01.statics;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.StringReader;

public class Tutorial01Test {

    public static BracesCount parser;
    @BeforeAll
    public static void initParser() {
        parser = new BracesCount(new StringReader(""));
    }
    @Test
    @DisplayName("test braces count")
    public void testBracesCount() throws ParseException {
        parser.ReInit(new StringReader("{{{}}}"));
        Assertions.assertEquals(3,parser.Input());
    }
    @Test
    @DisplayName("test braces count with white space")
    public void testBracesCountWithWiteSpace() throws ParseException {
        parser.ReInit(new StringReader("{{{\n\n}\n}\r\n\t}"));
        Assertions.assertEquals(3, parser.Input());
    }
}
