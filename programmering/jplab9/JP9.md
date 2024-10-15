## DAT100: Java Programmering 9 - Uke 43

Java-koden som skal brukes i oppgavene nedenfor finnes på den vanlige github-oppbevaringsplassen for faget: https://github.com/dat100hib/dat100public

Gjør en *Repository -> Pull* i GitHub desktop på `dat100public`-oppvebaringsplassen slik du er sikker på at du har den nyeste versjon av koden.

Start med å importere JPLab9-prosjektet inn i Eclipse om du ikke allerede har gjort dette.

### Oppgave 1: Utvidet for-løkke og oppdatering av tabeller

Koden for denne oppgaven finnes i pakken `no.hvl.dat100.oppgave1` i JPLab9 Eclipse-prosjektet

Vi ønsker å skrive et program som oppdaterer en tabell `tab` av heltall ved å legge 1 til hvert element i tabellen.

Et første forsøk er koden nedenfor som først skriver ut elementer i tabellen `tab`, så forsøker å oppdatere tabellen ved å bruke en utvidet for-løkke, og til slutt skriver tabellen `tab` igjen.

```java
public class Oppdatering {

  public static void main(String[] args) {

  int[] tab = {1,2,3,4,5,6};

  // skriv ut
    System.out.print("[ ");

  for (int x : tab) {
    System.out.print(x + " ");
  }

  System.out.println("]");

  // oppdater
  for (int x : tab) {
    x = x + 1;
  }

  // skriv ut
  System.out.print("[ ");

  for (int x : tab) {
    System.out.print(x + " ");
  }

  System.out.println("]");
  }

}

```

##### a)

Kjør programmet ovenfor. Blir resultatet som ønsket dvs. blir tabellen oppdatert?

##### b)

Skriv om programmet ovenfor slik tabellen blir korrekt oppdatert dvs. der blir lagt en (1) til hvert heltall i tabellen.

##### c)

Se på klassen `Data` implementeret nedenfor:

```java
public class Data {

	private int data;

	public Data(int d) {
		data = d;
	}
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	public String toString() {
		return "" + data;
	}
}
```

samt programmet nedenfor som oppretter en tabell med referanser til tre `Data`-objekt og bruker en utvidet for-løkke til å oppdatere alle Data-objekt ved bruk av get og set-metodern på objektene.

```java
public class DataTabell {

	public static void main(String[] args) {

		Data[] tab = new Data[3];

		tab[0] = new Data(1);
		tab[1] = new Data(2);
		tab[2] = new Data(3);

		for (Data d : tab) {
			System.out.print(d + " ");
		}
		System.out.println();

		for (Data d : tab) {
			d.setData(d.getData() + 1);
		}


		for (Data d : tab) {
			System.out.print(d + " ");
		}
		System.out.println();

	}
}
```

Kjør programmet. Oppdateres objektene som ønskes i utvidet for-løkke? Hvorfor virker en utvidet for-løkke her mens den ikke virket for oppdatering i deloppgave a)?

### Oppgave 2 - Flerdimensjonale tabeller

Denne oppgaven er relatert til miniExcel-eksempler fra undervisning 10 om Flerdimensjonale tabeller. Det kan være lurt å se på skissene som finnes i slides fra denne forelesnigen.

Koden nedenfor finnes i klassen `MiniExcel.java`, pakken `no.hvl.dat100.jplab10.oppgave2` i Eclipse-prosjektet JPLab10.

Programmet inneholder en to-dimensjonal tabell svarende til et Excel-ark med 4 rekker og 3 søyler med heltall.

```java
package no.hvl.dat100.miniexcel;

public class MiniExcel {

  private static int[][] data =
{ { 1, 2, 0 }, { 3, 4, 0 }, { 5, 6, 0 }, { 0, 0, 0 } };

  public static void skrivUt() {

  System.out.println("---------------");

  // TODO - START

  // iterer igjennom tabellen og skriv ut - utvidet for-løkke

  // TODO _END

  System.out.println("---------------");
  }

  public static void beregnSum() {

  // TODO - START

  // summer hver rad og skriv summen i siste element

  // TODO - END


  // TODO - START

  // summer hver kolonne og skrive summen i siste element

  // TODO - END

  }

  public static void main(String args[]) {

    skrivUt();

    beregnSum();

    skrivUt();
  }
}
```

##### a)

Implementer metoden `skrivUt()` som skriver ut tabellen på formen

```
-----
1 2 0
3 4 0
5 6 0
0 0 0
-----
```

##### b)

Implementer metoden `beregnSum()` som summerer rekker og søyler og skriver summen i siste posisjon. Dvs. utskrift etter sum er beregnet skal bli:

```
------
1 2 3
3 4 7
5 6 11
9 12 0
------
```

De to metodene i a) og b) skal fungere generelt – dvs. ikke kun for en tabell med størrelse 4x3.

### Oppgave 3 - Simulere terningkast: Random-klassen og tabeller

I denne oppgaven skal vi simulere terningkast. Et alternativ til å bruke `Math.random()` er å bruke `Random`-klassen. Denne klassen inneholder en metode `nextInt(int grense)` som returnerer et tilfeldig heltall fra og med 0 til (men ikke med) grense. Dette er en objekt-metode, så det må lages et Random-objekt før metoden kan brukes. Samme objektet kan brukes for å generere flere tilfeldige tall.

Få å løse denne oppgaven anbefales det å se på Eksempel 5.2, side 176 i java-boken. Skisse:

##### a)

Du skal lage et program som kaster en terning 100 ganger og viser diverse resultater på skjermen. Skjermbildet skal se ut omtrent som nedenfor der det skrives ut 20 kast pr. linje i den første delen

```
TERNINGKASTSIMULATOR

3   2   6   1 ..	.. 1   6
5   2   1   6 ..	.. 5   6
.
.
6   3 ..	.. 3   1   1   4

Antall kast  : 100
Antall 6-ere :  14
Antall 5-ere :  16
.
.
Antall 1-ere :  20

Gjennomsnittskast : 3.56

Antall kast for å få den første 6-eren : 3

Terningverdien det var flest av : 1

```

Programmet skal organiseres i tre klasser:

- En klasse `Terning.java` som representerer terninger i programmet. Se nedenfor.

- En klasse `Simulering.java` som representerer resultater fra én simulering. Verdiene/kastene legges inn i en tabell med plass til 100 elementer . Metodene i klassen skal finne ut hvor mange kast det ble av hver verdi og legge de i en tabell med plass til seks elementer. **Nøtt:** Prøv å få til det siste uten å bruke if eller switch.

- En klasse `Utskrift.java` som har ansvar for utskrift av en simulering. Svarene skrives ut på skjermen slik det er indikert ovenfor. En viktig design beslutning er i hvilken klasse statistikken skal beregnes.

Begynnelsen på klassen `Terning.java` finnes nedenfor og i pakken `no.hvl.dat100.oppgaveb4`.

```java
public class Terning {

  // aktuell verdi for terningen
  private int oyne;

  public Terning() {
  // TODO
  }

  public int getOyne() {

  return 0; // TODO
  }

  public void trill() {
  // TODO
  }
}
```

##### b)

Utvid programmet slik utskriften bruker symboler for terningene. Et eksempel er gitt nedenfor

```
TERNINGKASTSIMULATOR

[:::] [...] [: :] [:.:] [ : ] [:.:] [ . ] [:::] [ : ] [ . ]
[:.:] [: :] [:.:] [ : ] [ : ] [:::] [:.:] [: :] [ . ] [...]
[ : ] [ . ] [: :] [:::] [: :] [...] [:.:] [:.:] [...] [ . ]
[ : ] [: :] [:.:] [: :] [:.:] [:::] [...] [: :] [...] [: :]
[:::] [:::] [ : ] [: :] [:.:] [...] [:::] [:.:] [: :] [...]
[: :] [...] [:::] [ . ] [:::] [...] [:.:] [...] [: :] [ . ]
[: :] [ : ] [ : ] [:.:] [ . ] [ . ] [:.:] [ . ] [...] [ . ]
[...] [: :] [ : ] [:::] [:::] [ : ] [:.:] [:.:] [...] [:::]
[ . ] [:.:] [:::] [: :] [:.:] [: :] [ . ] [:.:] [:::] [:.:]
[...] [: :] [...] [:::] [: :] [ : ] [:::] [:.:] [...] [ : ]

Antall kast : 100
Antall [:::]-ere:  17
Antall [:.:]-ere:  21
Antall [: :]-ere:  19
Antall [...]-ere:  17
Antall [ : ]-ere:  13
Antall [ . ]-ere:  13

Gjennomsnittskast : 3,730

Antall kast for å få den første [:::]-eren: 1

Terningverdien det var flest av : [:.:]
```