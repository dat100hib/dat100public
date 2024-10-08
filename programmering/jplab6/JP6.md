## DAT100: Java Programmering 6 - uke 40

Oppgave B1 og B2 på denne programmeringslab er viktig i forbindelse med programmeringsprosjektet som skal gjennomføres i uke 41 og 42.

## Grunnleggende oppgaver

### Oppgave G1 - Klasser

Oppgave 6.2 i Java-boken

### Oppgave G2 - Klasser

Oppgave 6.3 i Java-boken

## Basisoppgaver - viktige for programmeringsprosjektet!

### Oppgave B1 - Klasser

I denne og i neste oppgave skal vi se på en klasse `Vare` og referansetabeller.

I oppgavene du ta utgangspunkt i start-kode med enhetstester som finnes på følgende github oppbevaringsplass:

https://github.com/dat100hib/jplab7-startcode-varelager.git

Du kan gjøre en *Use this template* på denne oppbevaringsplassen (på github) etterfulgt av *klone* og importering inn i Eclipse tilsvarende som for Java Innlevering 2 (start-koden for oppgavene med tabeller og matriser).

Når du har gjort dette skal du ha tilgang til et prosjekt `jplab6-varelager-startkode` som inneholder to pakker:

- `no.hvl.dat100.varelager` med startkode for de klasser og metoder du skal implementere nedenfor.
- `no.hvl.dat100.varelager.tests` med en rekke enhetstest som du skal bruke til å teste koden etterhvert som du implementerer.

Du kjører enhetstestene på samme måte som på Java Innlevering 2.

##### a) Objektvariable og konstruktør

Se på start-koden for klassen `Vare.java`.

Skriv kode slik klassen får tre objektvariable:

-	varenr (heltall)
-	navn (streng)
-	pris (desimaltall)

som alle skal være `private` dvs. kun synlige innenfor klassen.

Videre skal klassen ha en *konstruktør*

```java
public Vare(int varenr, String navn, double pris)
```

som kan gi verdi til alle objektvariable.

Test implementasjonen din ved å kjøre testene i test-klassen `TestVare.java`

##### b) get/set-metoder

Gjør ferdig implementasjonen av get/set metoder og test de med enhetstestene.

##### c) Objektmetoder

Gjør ferdig implementasjonen av følgende metoder som alle er `public` dvs. synlige utenfor klassen:

- `public double beregnMoms()` – som beregner moms svarende til 20% av prisen som er gitt ved objektvariabelen pris. Dersom pris er 100 kr, skal moms være 20 kr.
- `erBilligereEnn(Vare v)` – skal sammenligne prisen på en vare med en annen vare `v` gitt som parameter.
- `toString()` –  som returnerer en strengrepresentasjon av objektvariablene på formen: `Vare [varenr=1, navn=ostepops, pris=200.0]`

Test implementasjonen ved å bruke enhetstestene.

### Oppgave B2 - Referansetabeller

I denne oppgaven skal vi bruke referanasetabeller dvs. tabeller der elementene som er lagret er pekere til objekt. I dette tilfelle skal vi bruke en tabell til å implementere et varelager dvs. elementene i tabellen er pekere til objekt av klassen `Vare`.

Starten på implementasjonen finnes i klassen `Varelager.java`:

```java
public class Varelager {

 protected Vare[] varer;
 protected int antall;

 [...]

```

Objektvariabelen `varer` skal brukes til å peke på referansetabellen av varar. Objektvariabelen `antall` skal brukes ifm. med innsettelse i tabellen til å holde kontroll på hvor (dvs. på hvilken posisjon/indeks) neste vare skal settes inn.

Variabelen `antall` vil til ethvert tidspunkt angi hvor mange varer som er satt inn i tabellen. Indeks der det ikke er satt inn noen vare vil ha verdien `null` (en null-peker).

De to objektvariable har modifikatoren `protected` for å gjøre det enklere å teste klassen. Testene for klassen finnes i klassen `TestVarelager.java`.

##### a)

Gjør ferdig implementasjonen av følgende metoder:

- `public Varelager(int n)` som er kontruktør for klassen. Konstruktøren skal opprettet en tabell av varer gitt ved parameteren `n` og sette `antall` lik `0` (siden første element skal inn på position 0).

- `public Vare[] getVarer()` som returnerer en referanse til tabellen `varer`

- `public boolean leggTilVare(Vare v)` som setter inn varen `v` i `varer`-tabellen på posisjonen angitt ved objektvariablen `antall`. Videre skal metoden inkrementere `antall` slik neste vare kommmer inn på neste posisjon. Metoden skal kun sette inn `v` hvis der er plass i tabellen dvs. hvis `antall` er strengt mindre enn `varer.length`. Metoden skal returnere `true` om varen blev satt inn og `false` ellers.

- `public boolean leggTil(int varenr, String navn, double pris)` som oppretter et nytt vare-objekt med varenummer, navn og pris gitt som parametre til metoden, og legger inn det nye vare-objekt i varelageret. Metoden skal returnere `true` om vare-objektet blev lagt til og `false` ellers. Metoden skal bruke `leggTilVare`-metoden som implementert ovenfor til å legge inn vare-objektet i varelageret.

- `public Vare finnVare(int varenr)` som gitt et `varenr` søker igjennom tabellen `varer` og ser om der finnes en vare i tabellen med dette varenummer. Om varen finnes skal metoden returnere en peker til varen som er funnet. Husk å avbryte søket hvis funnet. Hvis ikke vare finnes da skal metoden returnere `null`.  **Hint:** Bruk while-løkke eller vanlig for løkke.

- `public void printVarelager()` som skal skrive ut varelageret på følgende formen (**hint**: bruk løkke og `toString-metoden` på Vare-objekt)

```
=================================
Vare [varenr=0, navn=0, pris=1.0]
Vare [varenr=1, navn=1, pris=2.0]
Vare [varenr=2, navn=2, pris=3.0]
=================================
```

##### b)

I klassen `VarelagerUtils.java` skal du implementere metodene nedenfor. Enhetstester for metodene finnes i filen `TestUtils.java`. Du kan anta at tabellen som gis med som parameter er fyllt dvs. at alle elementer inneholder en referanse til et vare-objekt.

- `public static Vare finnBilligste(Vare[] varer)` som tar en (referanse)tabell med vare-objekt og returnerer en peker til et av de vare-objekt som er billigst.

- `public static double totalPris(Vare[] varer)` som finner den samlede pris på alle varer.

- `public static int[] finnVarenr(Vare[] varer)` som returnerer en tabell med varenumre for alle varer i lageret. **Hint:** metoden skal opprette en ny tabell av heltall og sette inn varenumrene for de varene som finnes i tabelle `varer`.

- `public static double[] finnPrisDifferanser(Vare[] varer)` beregner de successive differenser på prisene i tabellen. Metoden skal opprette en tabell av desimalltall som er en korterte enn tabellen `varer` og på posisjon `i` i denne tabellen skal der stå differensen på prisen mellom varen i posisjon `i+1` og posisjon `i`.

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
https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html

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

