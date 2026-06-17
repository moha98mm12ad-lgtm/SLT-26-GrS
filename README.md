# SLT-26-GrS
Projektdokumentation: Tic-Tac-Toe in Java
Projektmitglieder: Mahima Islam, Mohammad Haj Mohammad, Christina Adelina Ardelean
GitHub: https://github.com/moha98mm12 ad-lgtm/SLT-26-GrS

1. Projektübersicht & Zielsetzung
Ziel des Projekts war die Implementierung eines klassischen, konsolenbasierten Tic-Tac-Toe-Spiels in Java unter Verwendung von objektorientierten Designprinzipien. Das Spiel ermöglicht es zwei menschlichen Spielern, abwechselnd Symbole (X und O) auf einem 3x3 Spielfeld zu platzieren, bis ein Spieler gewinnt oder das Spielfeld voll ist (Unentschieden).
Ein besonderer Fokus in der Endphase lag auf dem Refactoring der Package-Struktur sowie der Absicherung des Quellcodes durch automatisierte Unit-Tests mit JUnit 5.
2. Kanbanboard am Anfang des Projekts
 
3. Architektur & Klassendesign
Das Projekt folgt einer klaren, objektorientierten Aufteilung. Alle Klassen befinden sich innerhalb der Paketstruktur org.tictactoe.
•	Main: Der Einstiegspunkt der Applikation. Sie initialisiert die Klasse TicTacToe und startet die Spielschleife.
•	TicTacToe: Steuert die übergeordnete Spiellogik (Spielerwechsel, Abfrage des Spielstatus, Überprüfung der Siegbedingungen).
•	Board: Repräsentiert das 3x3 Spielfeld mittels eines zweidimensionalen Arrays. Sie verwaltet das Setzen von Symbolen und prüft, ob Zellen frei oder belegt sind.
•	Player: Repräsentiert einen Spieler und speichert dessen Namen sowie das zugewiesene Symbol (X oder O).
4. Qualitätssicherung & Unit-Testing
Zur Gewährleistung der Code-Qualität wurden automatisierte Modultests (Unit-Tests) implementiert. Entsprechend den Qualitätsanforderungen wurde für die Kernfunktionalitäten jeweils ein positiver Testfall (Regelfall) und ein negativer Testfall (Fehlerfall/Grenzfall) abgedeckt.
Die Tests wurden im Verzeichnis src/test/java/org/tictactoe/ in der Klasse BoardTest realisiert:
Testfälle für die Spielfeld-Validierung (BoardTest)
1.	Positive
o	Ziel: Überprüfung, ob ein frisch initialisiertes Spielfeld korrekt als leer erkannt wird.
o	Erwartung: assertTrue liefert für die Koordinaten (0,0) den Wert true.
2.	Negative
o	Ziel: Überprüfung, ob eine bereits belegte Zelle vom System korrekt als "nicht leer" erkannt wird.
o	Erwartung: Nach dem Platzieren eines Symbols liefert assertFalse für diese Zelle den Wert false.

5. Fazit & Projektergebnis
Das Projekt wurde erfolgreich abgeschlossen. Alle bekannten Syntax- und Strukturfehler wurden im Zuge des Refactorings vollständig behoben. Das Spiel lässt sich fehlerfrei kompilieren, über die Main-Klasse starten und die automatisierten Tests laufen erfolgreich ("grün") durch.
