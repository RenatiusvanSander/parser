# Parser task

<h2>Aufgabe 1: Was ist die Funktion</h2>

Parser bekommt eine Zeichenkette als Uhrzeit, parst diese zum Kalenderdatum und schreibt auf die
Konsole. Die Methode parseAndDisplay trennt die Zeichenkette am "/"-Zeichen in Token auf. Die Tokens
werden umgewandelt und gesetzt in "calender"-Objekt in Stunde, Minute und Sekunden. Das
simpleDateFormat-Objekt legt das Anzeigeformat fest. calendar wird per simpleDateFormat bei Ausgabe
formatiert. Angezeigt wird zum Beispiel 08.01.2023 22:23:45.

<h2>Aufgabe 2: Welche Schwierigkeiten sehen Sie?</h2>

Ich sehe mehrere Schwierigkeiten.
Der Parse-Konstruktor darf gern privat sein und wird zu einer Utility-Klasse. Die einzelnen
Methode werden static, weil keine Attribute verarbeitet werden und rein Parameter von außen
übergeben werden. Zudem ist die Methode parseAndDisplay mit einem ByteArrayOutputStream als Rückgabe
zu versehene, um auf richtige Umwandlung der Eingangsparameters per JUnit-Test zu prüfen.
Toki erschließt sich nicht als variablename, deshalb benannte ich den Namen zu stringTokenizer um.
Ebenfalls sind t1 bis t4 nicht sehr aussagekräftige Namen. Aussagekräftigere Namen, welche umgehend
leicht zu verstehen sind, wären: hours, minutes, seconds und miliseconds.
Die Milisekunden einer Zeichenkette werden konvertiert, aber
sind nicht im simpleDateFormat für die Formatierung enthalten. Bei Ausgabe werden die
Milisekunden nicht im formatierten Tagesdatum angezeigt.
Neben den Milisekunden wird die convert-Methode null zurückgeben, wenn der zu konvierterende Token
nicht als Nummer formatiert wird. Das zieht eine RuntimeException als NullPointerException nach sich
und das Programm bricht ab. Besser ist die Zeichenkette mit der Integer.parse(String) zu einer
Ganzzahl zu wandeln. Hiermit wird die Parsebarkeit einer Zahl geprüft. Bei
NumberFormatException sollte eine Fehlermeldung im Catch-Block ausgegeben. Die convert-Methode
sollte nichts Im Fehlerfall zurückgeben, sowie hier das Programm mit Fehler beenden. Eine geworfene
RuntimeException beendet fehlerhaft das Programm.
Außerdem wäre zur Dokumentation Java-Doc hinzuzufügen, welcher durch ein Build-Tool wie Maven2
erzeugt werden kann. Hiermit liegt eine Dokumentation vor.
Der Parse-Konstruktor darf gern privat sein und wird zu einer Utility-Klasse. Die einzelnen
Methode werden static, weil keine Attribute verarbeitet werden und rein Parameter von außen
übergeben werden. Zudem ist die Methode parseAndDisplay mit einem ByteArrayOutputStream als Rückgabe
zu versehene, um auf richtige Umwandlung der Eingangsparameters per JUnit-Test zu prüfen.
Toki erschließt sich nicht als variablename, deshalb benannte ich den Namen zu stringTokenizer um.
Ebenfalls sind t1 bis t4 nicht sehr aussagekräftige Namen. Aussagekräftigere Namen, welche umgehend
leicht zu verstehen sind, wären: hours, minutes, seconds und miliseconds.