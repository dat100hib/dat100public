# DAT100: Java Programmering 3 - uke 36

### Obligatorisk innlevering

Oppgave 4, 5 og 6 utgjør en **individuell obligatorisk innlevering**, men der er lov å jobbe sammen for å diskutere programmeringsoppgavene i grupper med opptil 3 personer.

Oppgavene skal leveres via GitHub. Se Canvas for informasjon om hvordan Java-koden for oppgavene skal leveres inn.

### Oppgave 1



#### a)

Nedenfor ser du et lite program. Studer programkoden og prøv å finne ut hva som vil skje når programmet blir kjørt.

```java
public class Oppg1 {

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

### Oppgave 2

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

### Oppgave 3

For å regne ut verdien x<sup>n</sup>, der *n* er et positivt heltall og *x* har en reell (double) verdi, kan du bruke funksjonen `Math.pow(x,n)` i Math-klassen. Dokumentasjon for Math-klassen finnes via https://docs.oracle.com/en/java/javase/14/docs/api/java.base/java/lang/Math.html

Men du kan også lage en program-løkke vha. en while-setninge der du regner ut x<sup>n</sup> direkte ved å starte med å sette en variabel til `1.0`, og deretter multipliserer den med *x* så mange ganger som *n*-verdien er.

Lag en klasse der du i main-metoden regner ut x<sup>n</sup> på begge måter. Verdier til *x* og *n* skal leses inn fra tastaturet (dialogboks). Skriv ut resultatet med forklarende tekst.

Kjør programmet flere ganger med ulike inndata. Får du alltid det samme resultatet på begge måter?

### Oppgave 4 - Obligatorisk innlevering

**Oppgave 6** (trinnskatt) fra uke 2 / 35 https://github.com/dat100hib/dat100public/blob/master/programmering/jplab2/JP2.md#-oppgave-6---del-av-obligatoriske-innlevering-2

### Oppgave 5 - Obligatorisk innlevering

**Oppgave 7** (karakterskala) fra uke 2 / 35 https://github.com/dat100hib/dat100public/blob/master/programmering/jplab2/JP2.md#-oppgave-7---del-av-obligatoriske-innlevering-2

### Oppgave 6 - Obligatorisk innlevering

Lag et program som leser inn et heltall n > 0, beregner verdien n! (n fakultet) og skriver verdien til n! der `n! = 1\*2\*3\*…\*(n-1)\*n`.
