package edu.remad.parser;

public class ParserDriver {

  public static void main(String[] args) {
    String textToParse = "22/23/45/478";
    Parser parser = new Parser();

    parser.parseAndDisplay(textToParse);
    Parser2.parseAndDisplay(textToParse);
  }
}
