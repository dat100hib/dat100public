# DAT100: Java Programmering 3 - uke 36

Oppgavene på denne programmeringslab er vanlig oppdelt i *grunnleggende oppgaver* (G oppgaver), **basis oppgaver** (B oppgaver), samt *valgfrie oppgaver* (V oppgaver).

I tillegg er der denne gangen en gruppe med **obligatoriske oppgaver** (O oppgaver) som skal leveres inn. O oppgavene er individuelle oppgaver som den enkelte skal levere inn, men det er lov å diskutere programmeringsoppgavene med andre studenter i gruppene for å komme frem til en løsning.

## Grunnleggende oppgaver

### Oppgave G1

#### a)

Start med å lage et Java program som har deklarasjon av en variabel `n` of typen heltall (`int`) i main-metoden.

#### b)

Legg til en for-løkke som skriver ut tallene fra `1` opptil `10`. Kjør programmet å se at det fungerer.

#### c)

Modifiser for-løkken slik den skriver tallene fra `1` til (men ikke med) verdien av variabelen `n`. Kjør programmet der du en gir `n` forskjellige verdier og se at programmet gir korrekt utskrift. Hva skjer om `n` settes til en negativ verdi?

### Oppgave G2

Skriv et Java-program som bruker en while-løkke til å skrive ut tallene fra `20` ned til `1`.

### Oppgave G3

#### a)

Skriv et Java program som bruker en for-løkke med en tellevaribel `i` som starter på `1` og løper opp til og med `20`

#### b)

Legg til en switch-setning inne i for-løkken slik programmet skriver ut `A` hvis `i` har verdien, `1` og `B` om i har verdien `2`, og `C` ellers.

#### c)

Modifiser programmet fra b) slik det bruker en valgsetning (if-else if ... else) i stedet for en switch-setning.

### Oppgave G4

Nedenfor ser du et lite program. Studer programkoden og prøv å finne ut hva som vil skje når programmet blir kjørt.

```java
public class OppgaveG4 {

  public static void main(String[] args) {

    int i;

    System.out.println("Test av repetisjonssetning.");
    System.out.println("***************************");

    i = 1;

    while (i <= 10) {
      System.out.println("Dette er linje nr. " + i);

      if (i == 4) {
        System.out.println();
      }

      if (i == 8) {
        System.out.println();
      }

      i = i + 1;
    }
  }
}
```

#### b)

Lag et nytt JDoodle prosjekt med en klasse der du limer inn koden ovenfor. Sjekk om du får forventet resultat.

## Basic oppgaver

### Oppgave B1

Oppgavene nedenfor er tatt fra tidligere eksamener i faget. Prøv først å finne ut hva som blir skrevet ut uten å kjøre programmet i JDoodle. Når du er kommet frem til et svar kan du sjekke svaret ved å kjøre programme i JDoodle.

#### a)

Hva bli skrevet ut når main-metoden nedenfor blir utført?

```java
public static void main(String[] args) {

	int i = 5;
	int j = 10;
	String s = "dat100";
	boolean b = true;

	System.out.println(i * j + i);
	System.out.println(b && i > 5);
	System.out.println(!b || j == 10);
	System.out.println(s.substring(3, 5));
}
```

##### b)

Hva bli skrevet ut når main-metoden nedenfor blir utført?

```java

public static void main(String[] args) {

	System.out.println(5 + 3 * 2);
	System.out.println(9 % 5);
	System.out.println(9 / 5);
	int i = 3;
	int j = 7;

	System.out.println( (i < 3) && (j >= 5) );
	System.out.println( (j != 3) || (i < j) );
}
```

##### c)

Hva bli skrevet ut når main-metoden nedenfor blir utført?

```java
public static int b(int x, int y) {

	while (x != y) {
		System.out.println("x = " + x + ", y = " + y);
		if (x > y) {
			x = x - y;
		} else {
			y = y - x;
		}
	}

	return x;
}

public static void main(String[] args) {
	System.out.println(b(28, 12));
}
```

### Oppgave B2 - Input og for-løkker

#### a)

Skriv et program som leser et tall inn fra brukeren ved å bruke en `Scanner` og skriver tallet ut på skjermen via `System.out.println`-metoden.

#### b)

Utvid programmet ovenfor med en `for`-løkke slik programmet leser inn fem (5) tall og for hver gang et tall er lest inn skrives dette ut på skjermen.

### B3 - Lese Java kode (Gruppearbeid)

#### a)
Programmet nedenfor inneheld fire deler. Først studerer kvar student programmet nøye for å finne ut kva som blir skrive ut. Deretter diskuterer gruppen kva som blir skrive ut. Til slutt utfører de programmet og ser om de har rett svar.

```java
public class Oppgave5 {

	public static void main(String[] args) {

		System.out.println("Del 1");
		int i = 1;
		while (i < 1) {
			System.out.println("Nr 1, i = " + i);
		}

		System.out.println("Del 2");
		for (int j = 1; j < 8; j = j * 2) {
			System.out.println("Nr 2, j = " + j);
		}

		System.out.println("Del 3");
		String s = "Test";
		for (int k = s.length() - 1; k > 0; k = k - 1) {
			System.out.println("Nr 3, k = " + s.charAt(k));
		}

		System.out.println("Del 4");
		int tall = 7569;
		int hjelp = tall;
		int aS = 0;
		do {
			hjelp = hjelp / 10;
			aS = aS + 1;
		} while (hjelp > 0);

		System.out.println(tall + " <fyll inn> " + aS + " <fyll inn>");
	}
}
```

#### b)

Kva berekning gjer løkka i Del 4? Prøv gjerne med andre tal enn i eksemplet. Fyll inn i print-setningen slik at utskrifta gir meining.

### Oppgave B4

For å regne ut verdien x<sup>n</sup>, der *n* er et positivt heltall og *x* har en reell (double) verdi, kan du bruke funksjonen `Math.pow(x,n)` i Math-klassen. Dokumentasjon for Math-klassen finnes via https://docs.oracle.com/en/java/javase/16/docs/api/java.base/java/lang/Math.html

Men du kan også lage en program-løkke vha. en while-setning der du regner ut x<sup>n</sup> direkte ved å starte med å sette en variabel til `1.0`, og deretter multipliserer den med *x* så mange ganger som *n*-verdien er.

Lag en klasse der du i main-metoden regner ut x<sup>n</sup> på begge måter. Verdier til *x* og *n* skal leses inn fra tastaturet (dialogboks). Skriv ut resultatet med forklarende tekst.

Kjør programmet flere ganger med ulike inndata inkludert tilfeller der talet `x` har desimaler. Får du alltid det samme resultatet på begge måter?

## Individuelle obligatoriske oppgaver 

Oppgavene nedenfor er individuelle obligatoriske oppgaver som skal leveres inn. Se oppgave O4 og Canvas for hvordan oppgaven skal leveres.

### Oppgave O1 - Trinnskat

En trinnskatt er en progressiv skatt på bruttolønn som beregnes når inntekten er høyere enn 217 400 kr.

Se https://www.skatteetaten.no/satser/trinnskatt/?year=2025#rateShowYear for aktuelle satser.

Lag et program som leser inn bruttoinntekt, beregner og skriver ut trinnskatten dvs. det beløpet som personen skal betale i trinnskatt.

### Oppgave O2 - Karakterskala

#### a)

Lag et program som leser inn en poengsum (heltall) som en student har oppnådd på en prøve, og finn og skriv ut den karakteren A-F dette tilsvarer. Grenser for de ulike karakterene skal være:

![](assets/markdown-img-paste-20190821101128267.png)

Skriv ut feilmelding ved ugyldig poengsum (negativ verdi eller over 100).

#### b)

Utvid programmet i pkt. a) slik at det kan lese inn poengsummer fra 10 studenter og skrive ut karakteren (eller feilmelding) etter hver innlesing. **HINT:** hvordan kan du bruke en for-løkke til dette?

#### c)

Legg inn kontroll på innlesinga i programmet i pkt. b) slik at ugyldige poengsummer (negativ verdi eller over 100) må leses inn på nytt.

### Oppgave O3 - Beregne Fakultet

Lag et program som leser inn et heltall `n > 0`, beregner verdien `n!` (n fakultet) og skriver verdien til `n!` ut på skjermen, der `n! = 1*2*3* … *(n-1)*n`.

### Oppgave O4 - Levere inn koden på GitHub

Når du er ferdig med koden i oppgave O1-O3 og har testet at det virker skal koden legges på oppbevaringsplassen `dat100-innleverig-1` på GitHub som du opprettet i punkt b) på den obligatoriske oppgaven på tidligere programmeringslab. 

For å laste opp kode må du gjøre følgende:

1. Last ned filene fra JDoodle til PC'en din.
2. Login på GitHub og gå til `dat100-innleverig-1` oppbevaringsplassen din. Du skal kunne finne den under `Your repositories`
3. Velg `Add file` etterfulgt av `Upload files` og du kan nå legge inn de tre Java-filer for oppgave O1, O2 og O3.
4. Velg "Commit changes" for å laste filene op.

**Husk** også å levere inn lenke til GitHub oppbevaringsplassen på Canvas.

### Oppgave V1 - Bruk av statisk import

Eksemplene i Java-boken bruker *statisk* import av klasser fra de biblioteker som brukes i programmet. Eksempelvis vil vi da bruke:

```java
import static java.lang.Math.*;
```

i programmet for beregning av sylindervolum: https://github.com/dat100hib/dat100public/blob/master/programmering/jplab1/JP1.md#oppgave-b1---uttrykk-og-kulevolum

for å få tilgang til konstanter og metoder i Math-bibliotek klassen.

Statisk import betyr at vi kan referere direkte til metoder og konstanter i klassen uten å legge klasse-navnet foran. Eks. kan vi med statisk import skrive:

```java
pow(x,y);
```

istedet for:

```java
Math.pow(x,y);
```

Statisk import er ikke anbefalt for større programmer da vi lett kan få sammenfald i navne om der eks. er metoder med samme navn i flere av de biblioteker som importeres.

#### a) 

Skriv programmet for beregning av sylindervolum ved å bruke statisk import. 

#### b)

Modifiser programmet slik det *ikke* bruker statisk import dvs. importerer Math-biblioteket via:

```java
import static java.lang.Math.*;
```

og gjør de endringer som trengs for å løse de kompileringsfeil som oppstod da du endret til vanlig (ikke statisk) import.