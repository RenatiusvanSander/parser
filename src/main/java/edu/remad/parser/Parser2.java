package edu.remad.parser;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.StringTokenizer;

/**
 * Parst eine Zeit-Zeichenkette, welche als Trennzeichen das {@code /} enthält. Hiermit werden
 * Stunde, Minute, Sekunde und Milisekunden getrennt. Am Ende wird die Zeit formatiert angezeigt.
 */
public class Parser2 {

  /**
   * privater Parser2 Konstruktor
   */
  private Parser2() {
    // bitte greifen Sie statisch zu
  }

  /**
   * Parst and zeigt formatiert die Zeit an.
   *
   * @param s Zeichenkette als Zeit, welche als Trennzeichen {@code /} enthält.
   * @return formatierte Zeit wird als {@link ByteArrayOutputStream} zurückgegeben
   */
  public static ByteArrayOutputStream parseAndDisplay(String s) {
    StringTokenizer stringTokenizer = new StringTokenizer(s, "/");

    String hours = stringTokenizer.nextToken();
    String minutes = stringTokenizer.nextToken();
    String seconds = stringTokenizer.nextToken();
    String miliseconds = stringTokenizer.nextToken();

    Calendar calendar = Calendar.getInstance();
    calendar.set(Calendar.HOUR_OF_DAY, convert(hours));
    calendar.set(Calendar.MINUTE, convert(minutes));
    calendar.set(Calendar.SECOND, convert(seconds));
    calendar.set(Calendar.MILLISECOND, convert(miliseconds));

    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss:SSS");
    ByteArrayOutputStream outPutStream = new ByteArrayOutputStream();
    System.setOut(new PrintStream(outPutStream));
    System.out.println(simpleDateFormat.format(calendar.getTime()));

    return outPutStream;
  }

  /**
   * Konvertiert Zeichenkette als Zahl zu einer Ganzzahl
   *
   * @param valueToConvert Zeichenkette, welche zur Ganzzahl zu konvertieren ist.
   * @return Zahl wird zurückgegeben, nachdem die Zeichenkette erfolgreich zur Ganzzahl konvertiert
   * ist.
   */
  public static int convert(String valueToConvert) {
    try {
      return Integer.parseInt(valueToConvert);
    } catch (NumberFormatException e) {
      System.out.println(String.format("%s: error is %s", Parser2.class.getName(), e.getMessage()));
      throw new RuntimeException(e.getMessage(), e);
    }
  }
}