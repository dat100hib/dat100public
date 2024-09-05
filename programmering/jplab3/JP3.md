# DAT100: Java Programmering 3 - uke 37

Oppgavene på denne programmeringslab er vanlig oppdelt i *grunnleggende oppgaver* (G oppgaver), **basis oppgaver** (B oppgaver), samt *valgfrie oppgaver* (V oppgaver).

I tillegg er der denne gangen en gruppe med **obligatoriske oppgaver** (O oppgaver) som skal leveres inn. O oppgavene er individuelle oppgaver som den enkelte skal levere inn, men det er lov å diskutere programmeringsoppgavene med andre studenter i gruppene for å komme frem til en løsning.

**Viktig** Se Canvas og instruksjoner for hvordan dere skal levere inn finnes i oppgave **O0** nedenfor.


## Grunnleggende oppgaver

### Oppgave G1

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

### Oppgave G2

Oppgavene nedenfor er tatt fra tidligere eksamener i faget. Prøv først å finne ut hva som blir skrevet ut uten å kjøre programmet i Eclipse. Når du er kommet frem til et svar kan du sjekke svaret ved å kjøre programme i Eclipse.

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

### Oppgave G3

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

## Basis oppgaver

### B1 - Debugging

Som beskrevet i læreboken og vist på forelesning innebærer «Debugging» (feilfjerning) å kjøre et program steg for steg for å finne og fjerne feil. Utviklingsverktøy som Eclipse støtter dette og gjør det mulig bla. å inspisere tilstanden av programmet dvs. verdier av variable underveis.

I tillegg til feilfinning og feilfjerning kan stegvis utførsel også være nyttig for å forstå hvordan de ulike konstruksjoner i Java fungerer (semantikken).

#### a)

Les først og gjør stegene:

https://github.com/dat100hib/dat100public/blob/master/eclipse/debugging.md

som gir en introduksjon til debugging i Eclipse.

#### b)

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

### B2 - Lese Java kode (Gruppearbeid)

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

### Oppgave B3

For å regne ut verdien x<sup>n</sup>, der *n* er et positivt heltall og *x* har en reell (double) verdi, kan du bruke funksjonen `Math.pow(x,n)` i Math-klassen. Dokumentasjon for Math-klassen finnes via https://docs.oracle.com/en/java/javase/16/docs/api/java.base/java/lang/Math.html

Men du kan også lage en program-løkke vha. en while-setning der du regner ut x<sup>n</sup> direkte ved å starte med å sette en variabel til `1.0`, og deretter multipliserer den med *x* så mange ganger som *n*-verdien er.

Lag en klasse der du i main-metoden regner ut x<sup>n</sup> på begge måter. Verdier til *x* og *n* skal leses inn fra tastaturet (dialogboks). Skriv ut resultatet med forklarende tekst.

Kjør programmet flere ganger med ulike inndata inkludert tilfeller der talet `x` har desimaler. Får du alltid det samme resultatet på begge måter?

## Individuelle obligatoriske oppgaver 

### Oppgave O0 - Opprette GitHub repository 

Koden som du skriver i oppgave O1-O3 nedenfor skal du levere inn ved å legge dem inn på en oppbevaringsplass under kontoen din på GitHub.

Første steg er derfor å opprette en oppbevaringsplass (et repository) på GitHub, klone ned en lokal kopi av oppbevaringsplassen på PC'en din, o opprette et Eclipse-prosjekt inne under den lokale oppbevaringsplassen.

#### Opprette repository på GitHub

1. Login på Github - du skal nå komme inn på dashboard-siden din
2. Velg *New* for å opprette et nytt repository. Gi det navnet `dat100-innlevering-1`, velg *Add a README file* og velg *Java* under *Add .gitignore*
3. Trykk på *Create Repository* og du har nå opprettet et repository

#### Klone repository ned på PC'en

4. Velg *Code* på repository siden og kopier URL'en som står i dialogboksen
5. Gå til GitHub Desktop og velg *File -> Clone repository* og velg *URL* alternativet i dialoboksen som kommer opp. Legg inn URL'en du kopierte i Steg 4, velg en *Local Path* på PC'en som ikke er under OneDrive eller lignende skytjeneste. Trykk på *Clone*. Du har nå fått en lokal kopi av den nye oppbevaringsplassen på PC'en. 

#### Opprette Eclipse prosjekt 

6. Opprett et nytt Eclipse Java prosjekt for koden til oppgave O1-O3. Gi det navne "DAT100Innlevering1". Prosjektet må legges under den *Local Path* som du valgte i Steg 5. Du må derfor fravelge *Use default location* når du oppretter prosjektet og via *Browse...* navigere ned til mappen svarende til *Local Path*. Trykk på *Finish* for å opprettet prosjektet

7. Opprett klassene `O1`, `O2` og `O3` med pakke `no.hvl.dat100` inne i prosjektene som du kan bruke til å legge in koden for oppgavene.

Stegene for å legge opp Java-koden er beskrevet i opphave O4 nedenfor.

### Oppgave O1 - Trinnskatt

**Oppgave B5** (karakterskala) fra uke 36 https://github.com/dat100hib/dat100public/blob/master/programmering/jplab2/JP2.md#oppgave-b5---blir-en-del-av-obligatoriske-innlevering-neste-uke

Legg inn koden i klassen `O1` i Eclipse-prosjektet.

### Oppgave O2 - Karakterskala

**Oppgave B6** (trinnskatt) fra uke 36 https://github.com/dat100hib/dat100public/blob/master/programmering/jplab2/JP2.md#oppgave-b6---blir-en-del-av-obligatoriske-innlevering-neste-uke

Legg inn koden i klassen `O2` i Eclipse-prosjektet.

### Oppgave O3 - Fakultet

Lag et program som leser inn et heltall `n > 0`, beregner verdien `n!` (n fakultet) og skriver verdien til `n!` ut på skjermen, der `n! = 1*2*3* … *(n-1)*n`.

Legg inn koden i klassen `O3` i Eclipse-prosjektet.

### Oppgave O4 - Levere inn koden på GitHub

Når du er ferdig med koden i oppgave O1-O3 og har testet at det virker skal koden legges opp (pushes) på oppbevaringsplassen på GitHub.

8. Gå til GitHub Desktop og sjekk at *Current repository* er `dat100-innlevering-1`. DU skal nå se en del filer inkl. `O1.java`, `O2.java` og `O3.java`
9. Skriv en en kort melding under *Summary (required)* - eksempelvis *leverer inn* to trykke på *Commit to main*.
10. I vinduet som kommer frem velg *Push origin*. Gå inn på siden for oppbevaringsplassen på GitHub og sjekk at koden er kommet inn.

**Husk** også å levere inn lenke til GitHub oppbevaringsplassen på Canvas.


