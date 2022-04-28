# Input day 6

## Java foreach
Die Java foreach (im IntelliJ als enhanced forloop vorgeschlagen) ist eine kurz Form der for-Schleife, die wenn bestimmte Bedingungen erfüllt sind, verwendet werden kann.

## Konstruktorverkettung 

### Der Konstruktor an sich
Ein Konstruktor ist eine spezielle Methode, die automatisch beim Erzeugen eines Objekts ausgeführt wird. Java hält standardmässig für jede Klasse, die sie definieren, einen Standardkonstruktor bereit. Dieser Konstruktor wird aufgerufen, wenn sie mit *new* ein neues Objekt erstellen.

In vielen Fällen ist es notwendig, dass beispielsweise Initialisierungen durchgeführt werden, wenn ein Objekt erzeugt wird. Dazu programmieren sie einen individuellen Konstruktor, der als Anweisungen die gewünschten Initialisierungen enthält.

Wie andere Methoden können sie auch Konstruktoren überladen. Sie haben so die Möglichkeit, verschiedene Konstruktoren bereitzustellen, mit denen sie ein Objekt erzeugen und initialisieren können. Java unterscheidet die Konstruktoren anhand der Signatur.

### Konstruktorverkettung ohne Vererbung
Durch die sogenannte Konstruktorverkettung können sie bei der Beschreibung eine Konstruktors einen anderen Konstruktor aufrufen und so dessen Programmcode übernehmen. Dies bedeutet, dass der überwiegende Anteil des Programmcodes lediglich in dem Konstruktor vorhanden ist, der mit Parametern aufgerufen wird. 

Der Vorteil der Konstruktorenverkettung besteht darin, daß vorhandener Code wiederverwendet wird. Führt ein parameterloser Konstruktor eine Reihe von nichttrivialen Aktionen durch, so ist es natürlich sinnvoller, diesen in einem spezialisierteren Konstruktor durch Aufruf wiederzuverwenden, als den Code zu duplizieren.
	
Wird ein Konstruktor in einem anderen Konstruktor derselben Klasse explizit aufgerufen, muß dies als erste Anweisung innerhalb der Methode geschehen. Steht der Aufruf nicht an erster Stelle, gibt es einen Compiler-Fehler.

### Konstruktorverkettung mit Vererbung

Wenn eine Klasse instanziert wird, garantiert Java, daß ein zur Parametrisierung des new-Operators passender Konstruktor aufgerufen wird. Daneben garantiert der Compiler, daß auch der Konstruktor der Vaterklasse aufgerufen wird. Dieser Aufruf kann **entweder explizit oder implizit** geschehen.

Falls als erste Anweisung innerhalb eines Konstruktors ein Aufruf der Methode super steht, wird dies als Aufruf des Superklassenkonstruktors interpretiert. super wird wie eine normale Methode verwendet und kann mit oder ohne Parameter aufgerufen werden. Der Aufruf **muß** natürlich zu einem in der Superklasse definierten Konstruktor passen.

Falls als erste Anweisung im Konstruktor kein Aufruf von super steht, setzt der Compiler an dieser Stelle einen impliziten Aufruf super(); ein und ruft damit den parameterlosen Konstruktor der Vaterklasse auf. **Falls ein solcher Konstruktor in der Vaterklasse nicht definiert wurde, gibt es einen Compiler-Fehler.** Das ist genau dann der Fall, wenn in der Superklassendeklaration lediglich parametrisierte Konstruktoren angegeben wurden und daher ein parameterloser default-Konstruktor nicht automatisch erzeugt wurde.

**Alternativ zu diesen beiden Varianten, einen Superklassenkonstruktor aufzurufen, ist es auch erlaubt, mit Hilfe der this-Methode einen anderen Konstruktor der eigenen Klasse aufzurufen. Um die oben erwähnten Zusagen einzuhalten, muß dieser allerdings selbst direkt oder indirekt schließlich einen Superklassenkonstruktor aufrufen.**

### Beispiele

## ohne Vererbung
Klasse Auto

Break Point für Debugger z.B. bei Zeile 17 in der **main Methode** setzen.

## mit Vererbung
Klasse Circle und Shape

Break Point für Debugger z.B. bei Zeile 22 in der **main Methode** setzen.