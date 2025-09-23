# DAT100: Java Programmering 7 - uke 40

I tillegg til oppgavene nedenfor skal dere også jobbe med obligatorisk innlevering 2: https://hvl.instructure.com/courses/31932/assignments/90950

## Grunnleggende oppgaver

### Oppgave G1 - Klasser

Oppgave 6.2 i Java-boken

### Oppgave G2 - Klasser

Oppgave 6.3 i Java-boken

## Basisoppgaver 

### Oppgave B1 - Klasser

Start denne oppgaven med å opprette et nytt prosjekt i IntelliJ og legg inn en pakke `no.hvl.dat100` i prosjektet.

##### a) Objektvariable og konstruktør

Opprette en klasse `Vare.java` og skriv kode slik klassen får tre objektvariable:

-	varenr (heltall)
-	navn (streng)
-	pris (desimaltall)

som alle skal være `private` dvs. kun synlige innenfor klassen.

Videre skal klassen ha en *konstruktør*

```java
public Vare(int varenr, String navn, double pris)
```

som kan gi verdi til alle objektvariable.

Test implementasjonen din ved å opprette en ny klasse `Main.java` med en `main`-metode som oppretter et objekt av klassen `Vare`.

##### b) get/set-metoder

Implementer get/set metoder for alle objekt-variable og skriv kode i `main`-metoden fra oppgaven ovenfor slik get/set metodene blir testet.

##### c) Objektmetoder

Implementer følgende metoder i klassen `Vare` som alle er `public` dvs. synlige utenfor klassen:

- `public double beregnMoms()` – som beregner og returnerer moms svarende til 20% av prisen som er gitt ved objektvariabelen `pris`. **Eksempel:** Dersom pris er 100.0 kr, skal moms være 20.0 kr.
- `boolean erBilligereEnn(Vare v)` – som sammenligner prisen på en vare med en annen vare `v` gitt som parameter og returnerer `true` om prisen på varen `v` er billigere.
- `String toString()` –  som returnerer en strengrepresentasjon av objektvariablene på formen: `Vare [varenr=1, navn=ostepops, pris=200.0]`

Test implementasjonen ved å skrive kode i `Main.java` som bruker metodene ovenfor og sjekk at de gir forventet resultat.

## Valgfrie oppgaver

### Oppgave V1 - Nut of the week

Sålangt har vi brukt en nøstet-løkke om vi skal skrive ut en to-dimensjonell tabell.

Skriv en metode

```java
public void skrivUt(int[][] tabell)
```

som kan skrive ut en to-dimensjonell tabell av heltall men som kun bruker en løkke.

### Oppgave V2 - Tabeller («arrays») og strenger

Før du løser oppgavene nedenfor anbefales det å se igjennom dokumentasjon for String-klassen tilgjengelig via:
https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html

Gitt en streng `s` kan en metode fra String-klassen kalles ved å bruke `s.<metodenavn>`. Eksempelvis kan metoden `length()` kalles ved å bruke `s.length()`

Metodane i d) - f) nedanfor skal vere klassemetodar (static). Plasser dei ein eigen klasse og lag eit main-program som testar metodane.

##### a)

Lag en klasse med en main-metode som leser antall ord og oppretter en strengtabell (String-array) med den gitte størrelsen. Les deretter ordene fra brukeren og plasser dem i tabellen. Skriv ut tabellen for å se at ordene er kommet inn.

##### b)

Utvid main-metoden så den leser inn et mønster (streng). Tell hvor mange ord i tabellen fra pkt. a) som inneholder mønsteret og skriv ut svaret.

Se om der finnes en metode for å teste om en streng inneholder en gitt sekvens av tegn (char).

##### c)

Gå gjennom tabellen og skriv ut de midterste tegnene i hver streng der du bruker følgende regler. Dersom strengen inneholder bare ett tegn, skrives hele strengen ut. Dersom lengden er partall, skal de to midterste tegnene skrives ut. Dersom strengen har odde lengde (odde antall tegn), skal de 3 midterste tegnene skrives ut om strengen inneholder 3 tegn eller mer.

##### d)

Lag ein metode som skriv ut ein streng baklengs.

##### e)

Lag ein metode som gitt ein tabell av tekststrengar, returnerer den strengen i tabellen som kjem først i (Unikode) alfabetet. Hint: Du skal bruke en løkke og `compareTo`-metoden for strenger.

##### f)

Implementer sjølv en metode:

```java
public static int compareTo(String str1, String str2) 
```

svarande til metoden frå String-klassen brukt i e). **Hint:** du skal bruke løkke.

