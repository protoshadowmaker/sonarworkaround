package com.protoshadowmaker.sonarworkaround;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FormatterUnitTest {
    @Test
    public void format_isCorrect() {
        assertEquals("Formatted: text", new Formatter().format("text"));
    }
}