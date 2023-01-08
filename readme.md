# Parser task

<h2>Aufgabe 1: Was ist die Funktion</h2>

Parser bekommt eine Zeichenkette als Uhrzeit. Die Methode parseAndDisplay trennt die Zeichenkette
am "/"-Zeichen in Token auf. Die Tokens werden umgewandelt und gesetzt in "calender"-Objekt in
Stunde, Minute und Sekunden. Das simpleDateFormat-Objekt legt das Anzeigeformat fest. calendar wird
per simpleDateFormat bei der Ausgabe formatiert. Angezeigt wird zum Beispiel 08.01.2023 22:23:45.

<h2>Aufgabe 2: Welche Schwierigkeiten sehen Sie?</h2>

Ich sehe mehrere Schwierigkeiten. Die Milisekunden in einer Zeichenkette werden konvertiert, aber
sind nicht im simpleDateFormat für die Formatierung enthalten. Bei Ausgabe werden deshalb die
Milisekunden nicht zum Tagesdatum angezeigt.
Neben den Milisekunden wird die convert-Methode null zurückgeben, wenn der zu konvierterende Token
nicht als Nummer formatiert wird. Das zieht eine RuntimeException als NullPointerException nach
sich. Besser ist den Token mit der Integer.parse(String) zu einer Zahl zu wandeln. Bei
ParseException sollte eine Fehlermeldung ausgegeben werden und convert-Methode nichts zurückgeben,
sowie hier das Programm mit Fehler beenden.
Außerdem wäre zur Dokumentation Java-Doc hinzuzufügen, welcher durch ein Build-Tool wie Maven2
erzeugt werden kann. Hiermit liegt Dokumentation vor.
Der Parsel-Konstruktor darf gern privat sein. Dann ist der Parser eine Utility-Klasse. Die einzelnen
Methode werden static, weil keine Attribute verarbeitet werden und rein Parameter von außen
übergeben werden. Zudem ist die Methode parseAndDisplay mit einem ByteArrayOutputStream als Rückgabe
zu versehene, um auf richtige Umwandlung der Eingangsparameters zu prüfen.
Toki erschließt sich nicht als variablename, deshalb benannte ich den Namen zu stringTokenizer um.
Ebenfalls sind t1 bis t4 unbenannt zu aussagekräftigere Namen wie hours, minutes, seconds und
miliseconds.

<h2>Überrabeiten des QuellCodes</h2>