# DAT100: Java Programmering 3 - uke 37

### Obligatorisk innlevering

Oppgave O1, O2 og O3 nedenfor utgjør en **individuell obligatorisk innlevering**, men der er lov å jobbe sammen for å diskutere programmeringsoppgavene i grupper med opptil 3 personer.

**Viktig** Se Canvas for informasjon om hvordan Java-koden for oppgavene skal leveres inn.

## Grunnleggende oppgaver

Koden i oppgavene nedenfor skrives inn i `main`-metoden i klassen (ved **TODO** kommentaren):

```java
public class OppgaveG {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
}
```

### Oppgave G1

#### a)

Legg til en deklarasjon av en variabel `n` of typen heltall (`int`) i main-metoden.

#### b)

Legg til en for-løkke som skriver ut tallene fra `1` opptil `10`. Kjør programmet å se at det fungerer.

#### c)

Modifiser for-løkken slik den skriver tallene fra `1` til (men ikke med) verdien av variabelen `n`. Kjør programmet der du en gir `n` forskjellige verdier og se at programmet gir korrekt utskrift. Hva skjer om `n` settes til en negativ verdi?

### Oppgave G2

Bruk en while-løkke til å skrive ut tallene fra `20` ned til `1`.

### Oppgave G3

#### a)

Skriv et Java program som bruker en for-løkke med en tellevaribel `i` som starter på `1` og løper opp til og med `20`

#### b)

Legg til set switch-setning inne i for-løkken slik programmet skriver ut `A` hvis `i` har verdien, `1` og `B` om i har verdien `2`, og `C` ellers.

#### c)

Modifiser programmet fra b) slik det bruker en valgsetning (if-then-else) i stedet for en switch-setning.

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

Lag et nytt Eclipse prosjekt med en klasse der du limer inn koden ovenfor. Sjekk om du får forventet resultat.

**HUSK** at i Java må ha samme navn på klasse og fil.

## Basisoppgaver

### Oppgave B1

Lag et program for å finne alle oddetallene fra og med en nedre grense til og med en øvre grense.

Grensene skal leses inn ved hjelp av `showInputDialog` og resultatet vises ved bruk av
`showMessageDialog`.

**Hint** Avgjør først om den nedre grensen er et oddetall (bruk operatoren %).

**Eksempel**

```
Nedre grense 4
Øvre grense 11
Resultat: 5, 7, 9, 11
```

### Oppgave B2

For å regne ut verdien x<sup>n</sup>, der *n* er et positivt heltall og *x* har en reell (double) verdi, kan du bruke funksjonen `Math.pow(x,n)` i Math-klassen. Dokumentasjon for Math-klassen finnes via https://docs.oracle.com/en/java/javase/16/docs/api/java.base/java/lang/Math.html

Men du kan også lage en program-løkke vha. en while-setning der du regner ut x<sup>n</sup> direkte ved å starte med å sette en variabel til `1.0`, og deretter multipliserer den med *x* så mange ganger som *n*-verdien er.

Lag en klasse der du i main-metoden regner ut x<sup>n</sup> på begge måter. Verdier til *x* og *n* skal leses inn fra tastaturet (dialogboks). Skriv ut resultatet med forklarende tekst.

Kjør programmet flere ganger med ulike inndata inkludert tilfeller der talet `x` har desimaler. Får du alltid det samme resultatet på begge måter?

## Obligatoriske oppgaver - skal leveres inn (se Canvas)

### Oppgave O1 - Obligatorisk innlevering

**Oppgave B4** (trinnskatt) fra uke 2 / 35 https://github.com/dat100hib/dat100public/blob/master/programmering/jplab2/JP2.md#-oppgave-b4---blir-en-del-av-obligatoriske-innlevering-2

### Oppgave O2 - Obligatorisk innlevering

**Oppgave B5** (karakterskala) fra uke 2 / 35 https://github.com/dat100hib/dat100public/blob/master/programmering/jplab2/JP2.md#-oppgave-b5---blir-en-del-av-obligatoriske-innlevering-2

### Oppgave O3 - Obligatorisk innlevering

Lag et program som leser inn et heltall `n > 0`, beregner verdien `n!` (n fakultet) og skriver verdien til `n!` ut på skjermen, der `n! = 1*2*3* … *(n-1)*n`.
