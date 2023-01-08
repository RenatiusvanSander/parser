package edu.remad.parser;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.ByteArrayOutputStream;
import java.nio.charset.StandardCharsets;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * JUnit tests für {@link Parser2}
 */
public class Parser2Test {

  /**
   * Testet konvertieren der Zeichenkette 2 wird als Ganzzahl 2 zurückgegeben
   */
  @Test
  public void testConvertShouldReturn2() {
    int expectedNumber = 2;
    int actualConvertedNumber = Parser2.convert("2");

    assertEquals(
        expectedNumber, actualConvertedNumber);
  }

  /**
   * Testet when textuelle Zeit kann nicht umgewandelt werden und es ene {@link RuntimeException}
   * geworfen.
   */
  @Test
  public void testConvertShouldThrowExpectedRuntimeExecption() {
    RuntimeException thrownException = Assertions.assertThrows(RuntimeException.class, () ->
        Parser2.convert("gjkf")
    );

    assertEquals("For input string: \"gjkf\"", thrownException.getMessage());
  }

  /**
   * Testet ParseAndDisplay wandelt übergebenen String in die bestimmte Zeit-Formatierung um.
   */
  @Test
  public void testParseAndDisplayShouldUseExpectedFormat() {
    String expectedFormattedTime = "08.01.2023 22:56:45:263";

    ByteArrayOutputStream actualOutputStream = Parser2.parseAndDisplay("22/56/45/263");
    String actualFormatedTime = actualOutputStream.toString(StandardCharsets.UTF_8);

    assertEquals(expectedFormattedTime, actualFormatedTime,
        String.format("Zecichenkette muss als %s formatiert sein", expectedFormattedTime));
  }
}
