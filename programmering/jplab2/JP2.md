# DAT100: Java Programmering 2 - uke 35

Oppgavene nedenfor er oppdelt i tre kategorier

- **Grunnleggende oppgaver (G oppgaver):** disse oppgavene har til formål å sjekke at dere har forstått de fundamentale elementer og begrep innen Java programmering som gjennomgått så langt på forelesning og beskrevet i Java-boken.

- **Basis oppgaver (B oppgaver):** dette er oppgaver med middels vanskelighetsgrad. Klarer du å løse disse oppgaven da indikerer det at du er godt med i faget.

- **Valgfrie oppgaver (V oppgaver):** dette er mer krevende oppgaver for de som ønsker flere utfordringer. Har du løst basisoppgavene da bør du gjøre et forsøk på å løse de valgfrie oppgavene.

Om du finner de grunnleggende- eller basisoppgavene vanskelig, så les Kap. 2 i Java-boken en gang til og se igjennom videoene og slides fra forelesninger. Husk å ta kontakt med undervisere eller lab-assistenter om du sitter fast med programmeringsoppgavene og trenger hjelp for å komme videre.   

Som nevnt på første forelesning inneholder programmeringslab'ene flere oppgaver end de fleste vil klare å løse på 2 timer. Det er derfor viktig at du forsøker å løse en god del av oppgavene før programmeringslab. Da kan du få hjelp på programmeringslab til de deler som du finner vanskelig. Dere kan gjerne jobbe sammen i grupper med 2-3 personer før og under lab.

## Grunnleggende oppgaver

Start oppgavene med å opprette et nytt Eclipse-prosjekt og en ny klasse i inne i dette prosjektet for hver av oppgavene nedenfor.

Se evt. videoen: https://hvl.instructure.com/courses/21897/pages/programmeringslab-0-installasjon-av-java-utviklingsmiljo-onsdag?module_item_id=531403 fra første programmeringslab om grunnleggende bruk av Eclipse om du ikke husker stegene.

Koden i oppgave G1 til G4 nedenfor skrives inn i `main`-metoden i klassen (ved **TODO** kommentaren):

```java
public class OppgaveG1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
}
```

### Oppgave G1 - Variable og tilordninger

#### a)

Skriv inn  *deklarasjon* av to variable `a` og `b` av typen `int` (heltall) i `main`-metoden.

#### b)

Legg til to tilordningssetninger etter deklarasjonen i a) som gir variablen `a` verdien `5` og `b` verdien `7`.

#### c)

Skriv ut verdien av variablene `a` og `b` på slutten av programmet ved å bruke `System.out.println`-metoden. Kjør programmet og se at verdiene `5` og `7` blir skrevet ut i *Console* nederst i Eclipse-vinduet.

#### d)

Prøv å endre typen på variablen `a` fra `int` til `boolean`. Dette skal gi en feilmelding i Eclipse. Hvorfor?

### Oppgave G2 - Variable og uttrykk

#### a)

Modifiser programmet fra oppgave G1 ved å legge til en deklarasjon av en variabel `c`.

#### b)

Legg til en tilordningssetning som setter verdien for variablen `c` lik summen av verdiene tildelt til `a` og `b`. Skriv verdien av variablen `c` ut i slutten av programmet. Kjør programmet og se at der `12` blir skrevet ut i *Console* nederst i Eclipse-vinduet.

#### c)

Modifiser verdien av `a` fra `5` til `8` og sjekk at `c` nå har verdien `15` når den skrives ut.

### Oppgave G3 - Valgsetninger

#### a)

Lag et program som leser inn to heltall `a` og `b`, og skriver ut verdien av `a/b` hvis ikke `b` er `0`, og en feilmelding ellers (siden det ikke går an å dele med `0`).

#### b)

Test programmet med ulike verdier for (`a`,`b`) = `(10,2)`, `(9,2)` og `(8,0)`
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

## Basis oppgaver

### Oppgave B1 - Uttrykk og kulevolum

Skriv et program som beregner volum av en kule ved bruk av `Math`-biblioteket:

https://docs.oracle.com/en/java/javase/16/docs/api/java.base/java/lang/Math.html

Konstanten `PI` i Math-biblioteket gir tilnærmet verdi for 𝜋

![](assets/markdown-img-paste-20190817113526451.png)

### Oppgave B2 - Uttrykk og vekslepenger

Skriv et program som leser inn en pris og et beløp (begge heltall) som er betalt og beregner hvor mange 10 og 1-kr kunden skal ha igjen i vekslepenger slik kunden får færrest mulig antall mynter tilbake.

**Hint:** Operatoren `%` (modulo) gir rest ved heltalldivisjon.

### Oppgave B3 - Valgsetninger

Se på koden for inntasting av brukernavn og passord via dialogvinduer:

https://github.com/dat100hib/dat100public/blob/master/undervisning/U02SetningerUttrykk/src/no/hvl/dat100/Login.java

Legg till to `String`-variable som inneholder korrekt brukernavn og passord. Bruk en if-setning til å sjekke om der er gitt korrekt login informasjon. For en tekststreng (String) `s1` kan `s1.equals(s2)` (se https://docs.oracle.com/en/java/javase/16/docs/api/java.base/java/lang/String.html) brukes til å sjekke om to strenger er lik (se etter `equals`-metoden på siden).

I praksis vil en aldri legge inn brukernavn og passord i selve programmet da det utgjør en sikkerhetsrisiko - men vi gjør det slik inntil vi har lært mer om programmering.

### <a name="jp2b4"></a> Oppgave B4 - Blir en del av obligatoriske innlevering 2

En trinnskatt er en progressiv skatt på bruttolønn som beregnes når inntekten er
høyere enn 164 100kr.

![](assets/markdown-img-paste-20190821100958296.png)

Se https://www.skatteetaten.no/satser/trinnskatt/?year=2022#rateShowYear for aktuelle satser.

Lag et program som leser inn bruttoinntekt, beregner og skriver ut trinnskatten.

### <a name="jp2b5"></a> Oppgave B5 - Blir en del av obligatoriske innlevering 2

#### a)

Lag et program som leser inn en poengsum (heltall) som en student har oppnådd på en prøve, og finn
og skriv ut den karakteren A-F dette tilsvarer. Grenser for de ulike karakterene skal være:

![](assets/markdown-img-paste-20190821101128267.png)

Skriv ut feilmelding ved ugyldig poengsum (negativ verdi eller over 100).

#### b)

Utvid programmet i pkt. a) slik at det kan lese inn poengsummer fra 10 studenter og skrive ut karakteren (eller feilmelding) etter hver innlesing. **HINT:** hvordan kan du bruke en for-løkke til dette.

#### c)

Legg inn kontroll på innlesinga i programmet i pkt. b) slik at ugyldige poengsummer (negativ verdi eller over 100) må leses inn på nytt.

## Valgfrie oppgaver

### Oppgave V1 - Valgsetninger

Du skal lage et program som leser inn tre heltall fra brukeren, og skriver ut igjen tallene sortert i stigende rekkefølge.

1. Løs oppgaven ved bare å bruke if-setninger.

2. Løs oppgaven ved å bruke if-else-setninger.

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
