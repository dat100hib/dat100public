# DAT100: Java Programmering 3 - uke 36

WARNING: Assignments under construction

## Obligatorisk innlevering / fremvisning

Oppgave 4, 5 og 6 utgjør en **obligatorisk innlevering** og skal demonstreres på lab’en for undervisere eller lab-assistenter.

Dere skal jobbe i *grupper* på 2-3 medlemmer med de obligatoriske programmeringsoppgavene.

**ALLE** i
gruppen må være tilstede for demonstrasjon av programkjøring for å få godkjent. Derfor bør dere ikke
jobbe i grupper på tvers av klassene. Koden skal ikke leveres inn.
**Tidsfrist** for demonstrasjon er på lab-tiden i uke 36.

### Oppgave 1

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

Lag et nytt Eclipse prosjekt med en klasse der du limer inn koden ovenfor (se tips sist i dokumentet om
automatisk kode formattering i Eclipse). Sjekk om du får forventet resultat.

### Oppgave 2

Lag et program for å finne alle oddetallene fra og med en nedre grense til og med en øvre grense. Grensene
skal leses inn ved hjelp av `showInputDialog` og resultatet vises ved bruk av
`showMessageDialog`.

**Hint** Avgjør først om den nedre grensen er et oddetall (bruk operatoren %).

**Eksempel**

```
Nedre grense 4
Øvre grense 11
Resultat: 5, 7, 9, 11
```

### Oppgave 3

For å regne ut verdien x<sup>n</sup>, der *n* er et positivt heltall og *x* har en reell (double) verdi, kan du bruke funksjonen `Math.pow(x,n)` i Math-klassen. Dokumentasjon for Math-klassen finnes via
http://docs.oracle.com/javase/8/docs/api/index.html og listen All Classes.

Men du kan også lage en program-løkke vha. en while-setninge der du regner ut x<sup>n</sup> direkte ved å starte med å sette en variabel til `1.0`, og deretter multipliserer den med *x* så mange ganger som *n*-verdien er.

Lag en klasse der du i main-metoden regner ut x<sup>n</sup> på begge måter. Verdier til *x* og *n* skal leses inn fra tastaturet (dialogboks). Skriv ut resultatet med forklarende tekst.

Kjør programmet flere ganger med ulike inndata. Får du alltid det samme resultatet på begge måter?

### <a name="jp24"></a> Oppgave 4

En trinnskatt (tidligere toppskatt) er en progressiv skatt på brutto lønn som beregnes når inntekten er
høyere enn 164 100kr.

![](assets/markdown-img-paste-20190821100958296.png)

Se https://www.skatteetaten.no/satser/trinnskatt/?year=2019#rateShowYear for aktuelle satser.

Lag et program som leser inn bruttoinntekt, beregner og skriver ut trinnskatten.

### <a name="jp25"></a> Oppgave 5

#### a)

Lag et program som leser inn en poengsum (heltall) som en student har oppnådd på en prøve, og finn
og skriv ut den karakteren A-F dette tilsvarer. Grenser for de ulike karakterene skal være:

![](assets/markdown-img-paste-20190821101128267.png)

Skriv ut feilmelding ved ugyldig poengsum (negativ verdi eller over 100).

#### b)

Utvid programmet i pkt. a) slik at det kan lese inn poengsummer fra 10 studenter og skrive ut karakteren
(eller feilmelding) etter hver innlesing. **HINT:** hvordan kan du bruke en for-løkke til dette.

#### c)

Legg inn kontroll på innlesinga i programmet i pkt. b) slik at ugyldige poengsummer (negativ verdi eller over 100) må leses inn på nytt.

### Oppgave 4 - Obligatorisk

**Oppgave 4** fra uke 2 / 35 https://github.com/dat100hib/dat100public/blob/master/programmering/jplab2/JP2-2.md#-oppgave-4

### Oppgave 5 - Obligatorisk

Lag et program som leser inn et heltall n > 0, beregner verdien n! (n fakultet) og skriver verdien til n! der
n! = 1\*2\*3\*…\*(n-1)\*n.

### Oppgave 6 - Obligatorisk

**Oppgave 5** fra uke 2 / 35 https://github.com/dat100hib/dat100public/blob/master/programmering/jplab2/JP2-2.md#-oppgave-5


### Oppgave 7

**Oppgave 18 Kap. 2 i Java-boken:** Denne oppgaven blir relevant for programmeringsprosjektet som kommer senere i faget.

Lag et program ved bruk av EasyGraphics som presenterer kjønnsfordeling i tre skoleklasser som delte linjediagram:

![Problem med bilde](assets/markdown-img-paste-20190815114443618.png)

Andelen av gutter i A-klassen er 28 %, i B-klassen er den 38 % og i C klassen er den 46 %.

Fyll et rektangel som er 28 % av bredden til det grafiske vinduet med grønt og fortsett horisontalt mot høyre med at fyllt et rektangel med resten (72 %) av vindusbredden med rødt. Tegn et svart rektangel rundt de to fargefylte rektanglene. Gjenta slik uttegning for de to gjenstående klasser.

#### Oppgave 6 - Debugging

Som beskrevet i læreboken innebærer «Debugging» - eller feilfjerning – å kjøre et program steg for steg for å finne og fjerne feil. Utviklingsverktøy som Eclipse støtter dette og gjør det mulig bla. å inspisere tilstanden av programmet dvs. verdier av variable underveis.

I tillegg til feilfinning og feilfjerning kan stegvis utførsel også være nyttig for å forstå hvordan de ulike konstruksjoner i Java fungerer (semantikken).

Les først og gjør stegene:

https://github.com/dat100hib/dat100public/blob/master/eclipse/debugging.md

som gir en introduksjon til debugging i Eclipse.

Se på JAVA programmet nedenfor som har til oppgave å beregne volum av en boks utefra høyde, bredde og dybde.

Legg programmet inn i et Eclipse prosjekt og test ved å kjøre programmet om det gir riktig resultat. Prøv eks. med høyde 2, bredde 4 og dybde 8. Forventet resultat er 2 * 4 * 8 = 64.

Bruk debugging som beskrevet i oppgave a) ovenfor til å finne og rette feilen.

```java
import javax.swing.JOptionPane;

public class BoksVolum {

  public static void main(String[] args) {

    int b, h, d;
    String btext, htext, dtext;

    // les inn høyde, bredde, dybde
    htext = JOptionPane.showInputDialog("Angi høyde:");
    btext = JOptionPane.showInputDialog("Angi bredde:");
    dtext = JOptionPane.showInputDialog("Angi dybde:");

    // konverter fra tekst til heltal

    h = Integer.parseInt(htext);
    b = Integer.parseInt(btext);
    d = Integer.parseInt(htext);

    int volum = b * h * d;

    String respons =
        "Volum [" + htext + "," + btext + "," + dtext + "] = " + volum;

        JOptionPane.showMessageDialog(null, respons);
      }
}
```
