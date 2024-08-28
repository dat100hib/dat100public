# DAT100: Java Programmering 2 - uke 36

Oppgavene på denne programmeringslab er oppdelt i **grunnleggende oppgaver** (G oppgaver), basis oppgaver (B oppgaver), samt valgfrie oppgaver (V oppgaver) som beskrevet på [forrige programmeringslab](https://github.com/dat100hib/dat100public/blob/master/programmering/jplab1/JP1.md) 

### Oppgave 1

Lag et program som leser inn to heltall fra brukeren og skriver ut summen av de. Modifiser programmet slik det kan beregne areal av et rektangel der lengden og bredden på rektangelet leses inn fra brukeren.

### Oppgave 2

**Oppgave 6 Kap. 2 i Java-boken:** Metoden `min` i klassen `Math` finner det minste av to tall dvs. `min(1,10) = 1`. Bruk denne metoden til å beregne og skrive ut det minste av 4 tall som brukeren skriver inn. 

### Oppgave 3

**Oppgave 9 Kap 2. i Java-boken:** Lag et program som ber brukeren om å skrive inn en dato som tre heltall: et dagnummer, et månedsnummer, og et årstall. Skriv datoen ut på vanlig måte med punktum og skilletegn, f.eks, 4.11.2013. Det er ikke nødvendig å sjekke at datoen er lovlig.

### Oppgave B2 - Uttrykk og vekslepenger

Skriv et program som leser inn en pris og et beløp (begge heltall) som er betalt og beregner hvor mange 10 og 1-kr kunden skal ha igjen i vekslepenger slik kunden får færrest mulig antall mynter tilbake.

**Hint:** Operatoren `%` (modulo) gir rest ved heltalldivisjon.
### Oppgave 5 (Gruppearbeid)

Nedanfor finn du eit lite Java-program. Programmet inneheld nokre feil. Først går kvar enkelt student gjennom programmet på eigahand (utan å bruke Eclipse) og prøver å finne feila og kva som blir skrive ut i dei skrivesetningane som kan utførast. Metoden `length()` gir lengden på en streng.

Deretter set 2 - 3 studentar seg saman og diskuterer svara. Bli einige om svara før de skriv inn programmet og sjekkar at de har rett. Dersom de har feil, prøv å forstå kvifor de tok feil. Viss ikkje de forstår kvifor, spør.

```java
public class Eksperiment
  public static void main(String[] args) {

    int a = 5;
    String s = "Hei";
    b = 4.2;

    System.out.println(a);
    System.out.println(s);
    System.out.println(b);
    System.out.println(s + a + 3);
    System.out.println(3 + a + s);
    System.out.println(s - "H");
    System.out.println(7 / a);
    System.out.println(13 - 2 * 5);

    int c = 1578;
    System.out.println(c.length());
    System.out.println(s.length());
```


### Oppgave G4 - Input og for-løkker

Vi kan lese et tall inn fra brukeren i et Java program ved å legge følgende til i toppen av filen (etter `package`)

```java
import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;
```

og bruke følgende setninger på den plass i programmet der vi ønsker å lese inn et tall fra brukeren og lagre det (her lagrer vi tallet i en variabel `tall`)

```java
String tallTxt = showInputDialog("Gi et tall:");

int tall = parseInt(tallTxt);
```

#### a)

Skriv et program som leser et tall inn fra brukeren og skriver dette tall ut på skjermen via `System.out.println`-metoden.

#### b)

Utvid programmet ovenfor med en `for`-løkke slik programmet leser inn fem (5) tall og for hver gang et tall er lest inn skrives dette ut på skjermen.



### <a name="jp2b4"></a> Oppgave B4 - Blir en del av obligatoriske innlevering neste uke

En trinnskatt er en progressiv skatt på bruttolønn som beregnes når inntekten er
høyere enn 164 100kr.

![](assets/markdown-img-paste-20190821100958296.png)

Se https://www.skatteetaten.no/satser/trinnskatt/?year=2022#rateShowYear for aktuelle satser.

Lag et program som leser inn bruttoinntekt, beregner og skriver ut trinnskatten dvs. det beløpet som personen skal betale i trinnskatt.

### <a name="jp2b5"></a> Oppgave B5 - Blir en del av obligatoriske innlevering neste uke

#### a)

Lag et program som leser inn en poengsum (heltall) som en student har oppnådd på en prøve, og finn
og skriv ut den karakteren A-F dette tilsvarer. Grenser for de ulike karakterene skal være:

![](assets/markdown-img-paste-20190821101128267.png)

Skriv ut feilmelding ved ugyldig poengsum (negativ verdi eller over 100).

#### b)

Utvid programmet i pkt. a) slik at det kan lese inn poengsummer fra 10 studenter og skrive ut karakteren (eller feilmelding) etter hver innlesing. **HINT:** hvordan kan du bruke en for-løkke til dette.

#### c)

Legg inn kontroll på innlesinga i programmet i pkt. b) slik at ugyldige poengsummer (negativ verdi eller over 100) må leses inn på nytt.



### Oppgave V2 - Bruk av statisk import

Eksemplene i Java-boken bruker *statisk* import av klasser fra de biblioteker som brukes i programmet. Eksempelvis vil vi da bruke:


```java
import static java.lang.Math.*;
import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;
```

i programmet for beregning av kulevolum for å få tilgang til konstanter og metoder i Math-bibliotek klassen, metoder for å lese inn via dialogboks og for konvertering av strenger til heltall.

Statisk import betyr at vi kan referere direkte til metoder og konstanter i klassen uten å legge klasse-navnet foran. Eks. kan vi med statisk import skrive:

```java
pow(x,y);
```

istedet for:

```java
Math.pow(x,y);
```

Statisk import er ikke anbefalt for større programmer da vi lett kan få sammenfald i navne om der eks. er metoder med samme navn i flere av de biblioteker som importeres.

Skriv om programmet for beregning av kulevolum slik det ikke bruker statisk import dvs. modifiser import-setningene slik de ikke bruker `static` som vist nedenfor

```java
import java.lang.Math.*;
import javax.swing.JOptionPane.*;
import java.lang.Integer.*;
```

og modifiser programmet slik eliminerer de kompileringsfeil som oppstod da du endret til vanlig (ikke statisk) import.
