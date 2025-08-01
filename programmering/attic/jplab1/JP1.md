# DAT100: Java Programmering 1 - uke 34

Formålet med denne programmeringslab er å bli bedre kjent med Java utviklingsmiljøet, dvs. skrive, lagre, kompilere, kjøre og rette feil i enkle Java-programmer. JDoodle skal brukes til å skrive Java kode.

Programmeringslab'ene inneholder flere oppgaver end de fleste vil klare å løse på de 2 timer som står i timeplanen. Det er derfor viktig at du forsøker å løse en god del av oppgavene før programmeringslab. Da kan du få hjelp på programmeringslab til de deler som du finner vanskelig. 

I alle oppgavene er det meningen at dere skal jobbe på egen hånd men det er lov å diskutere og hjelpe hverandre, gjerne i grupper på 2-3 personer. Dette gir den beste læringseffekten og gjør det lettere å komme gjennom alle oppgavene. 

## Gjennomføring

Oppgavene nedenfor er oppdelt i tre kategorier

- **Grunnleggende oppgaver (G oppgaver):** disse oppgavene har til formål å sjekke at dere har forstått de fundamentale elementer og begrep innen Java programmering som gjennomgått så langt på forelesning og beskrevet i Java-boken.

- **Basis oppgaver (B oppgaver):** dette er oppgaver med middels vanskelighetsgrad. Klarer du å løse disse oppgaven da indikerer det at du er godt med i faget.

- **Valgfrie oppgaver (V oppgaver):** dette er mer krevende oppgaver for de som ønsker flere utfordringer. Har du løst basisoppgavene da bør du gjøre et forsøk på å løse de valgfrie oppgavene.

Om du finner de grunnleggende- eller basisoppgavene vanskelig, så les Kap. 2 i Java-boken en gang til og se igjennom videoene og slides fra forelesninger. 

Husk å ta kontakt med undervisere eller lab-assistenter om du sitter fast med programmeringsoppgavene og trenger hjelp for å komme videre.  

## Grunnleggende oppgaver

Vi skal i første omgang lage enkle Java-programmer som bare inneholder en enkelt `main()`– metode som utfører det vi vil ha gjort. Vi skriver programmene ved bruk av JDoodle. Koden i oppgave G1-G4 nedenfor skrives inn i `main`-metoden for klassen for programmet 

TODO: Fikse dette med multi-file. Et prosjekt for hele lab'en?

### Oppgave G0 - Opprett et multi-file? JDoodle prosjekt

 Opprett et nytt multi-file JDoodle prosjekt med navn `DAT100Lab1` for denne programmeringslab og legg de java-filer som utvikles som en del av dette prosjektet. Lag en file for hver oppgave med et navn som svarer til oppgaven, eks. `OppgaveG1` og skriv koden inn i main-metoden. 
 
 Eksempel for Oppgave G1 er gitt nedenfor. Koden skrives inn ved `TODO`-kommentaren.

```java
public class OppgaveG1 {

	public static void main(String[] args) {
		
      // TODO: sett inn koden for oppgave her - i dette tilfelle Oppgave G1

	}
}
```

### Oppgave G1 - Variable og tilordninger

#### a)

Skriv inn *deklarasjon* av to variable `a` og `b` av typen `int` (heltall) i `main`-metoden.

#### b)

Legg til to tilordningssetninger etter deklarasjonen i a) som gir variablen `a` verdien `5` og `b` verdien `7`.

#### c)

Skriv ut verdien av variablene `a` og `b` på slutten av programmet ved å bruke `System.out.println`-metoden. Kjør programmet og se at verdiene `5` og `7` blir skrevet ut i TODO: *Console* nederst i Eclipse-vinduet.

#### d)

Prøv å endre typen på variablen `a` fra `int` til `boolean`. Dette skal gi en feilmelding. Hvorfor?

### Oppgave G2 - Variable og uttrykk

Husk: Make this Start file

#### a)

Modifiser programmet fra oppgave G1 ved å legge til en deklarasjon av en variabel `c`.

#### b)

Legg til en tilordningssetning som setter verdien for variablen `c` lik summen av verdiene tildelt til `a` og `b`. Skriv verdien av variablen `c` ut i slutten av programmet. Kjør programmet og se at der `12` blir skrevet ut.

#### c)

Modifiser verdien av `a` fra `5` til `8` og sjekk at `c` nå har verdien `15` når den skrives ut.

### Oppgave G3 - Valgsetninger - FIX: Flytt til neste lab

#### a)

Lag et program som leser inn to heltall `a` og `b`, og skriver ut verdien av `a/b` hvis ikke `b` er `0`, og en feilmelding ellers (siden det ikke går an å dele med `0`).

#### b)

Test programmet med ulike verdier for (`a`,`b`) = `(10,2)`, `(9,2)` og `(8,0)`

## Basis oppgaver

TODO: legge inn en oppgave med input/output via Scanner og input/output via args og main metoden

### Oppgave B1 - Uttrykk og kulevolum

Skriv et program som beregner volum av en kule ved bruk av `Math`-biblioteket:

https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Math.html

Konstanten `PI` i Math-biblioteket gir tilnærmet verdi for 𝜋

![](assets/markdown-img-paste-20190817113526451.png)

### Oppgave B2 - Valgsetninger - FIX: på neste lab.

Se på koden for inntasting av brukernavn og passord via dialogvinduer:

https://github.com/dat100hib/dat100public/blob/master/undervisning/U02SetningerUttrykk/src/no/hvl/dat100/Login.java

Legg till to `String`-variable som inneholder korrekt brukernavn og passord. Bruk en if-setning til å sjekke om der er gitt korrekt login informasjon. For en tekststreng (String) `s1` kan `s1.equals(s2)` (se https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html) brukes til å sjekke om to strenger er lik (se etter `equals`-metoden på siden).

I praksis vil en aldri legge inn brukernavn og passord i selve programmet da det utgjør en sikkerhetsrisiko - men vi gjør det slik inntil vi har lært mer om programmering.

### Oppgave B3 - Uttrykk

Vi skal lage et program som regner en tid gitt i hele sekunder om til timer, minutter og sekunder. Antall sekunder leses inn fra dialogboks.

**Eksempel:** 3690 sekunder skal gi som svar 1 timer, 1 minutter og 30 sekunder.

**Hint:** Bruk heltallsdivisjon og restdivisjon (%) i Java. Eksempel: 13 % 10 gir 3 som svar.

Legg merke til at i første del av denne oppgaven tillater vi å bruke flertall selv om vi om vi strengt tatt skulle brukt entall når det gjelder antall timer, minutter og sekunder. 

Før dere skriver programmet i Java, lag en algoritme for hvordan beregningene utføres. Algoritmen kan du foreløpig skrive inn først på filen i kommentarblokk `/* <algoritmebeskrivelse> */` over koden.

Svaret skal skrives på formatet: 1 timer, 1 minutter, 30 sekunder (alt skrives på samme linje).

For innlesing og utskrift brukes dialogvindu. FIX.

Modifiser programmet slik det bruker entall i utskriften (time, minutt, sekund) i det tilfelle der vi har bare en time, eller 1 minutt, eller 1 sekund. 

**Hint:** tenk på bruk av valgsetning.

## Valgfrie oppgaver - FIX: neste lab

### Oppgave V1 - Valgsetning: if versus switch

Så på eksemplene fra forelesning om valgsetninger:

https://github.com/dat100hib/dat100public/tree/master/undervisning/U03Valgsetninger/src/no/hvl/dat100

#### a)

Prøv å skrive om programmet som bruker switch-setning:

https://github.com/dat100hib/dat100public/blob/master/undervisning/U03Valgsetninger/src/no/hvl/dat100/SwitchEksempel.java

slik det bruker en `if-then-else`-valgsetning istedet for. Prøv også å skrive programmet slik the bruker `if-else if-else ... else`

#### b)

Prøv å skrive om programmer som bruker if-valgsetning:

https://github.com/dat100hib/dat100public/blob/master/undervisning/U03Valgsetninger/src/no/hvl/dat100/IfEksempel.java

slik det bruker en `switch`-valgsetning istedet for. Utvid programmet slik den skrive ut en gul-sirkel hvis co2-nivå er mellem 500 og 700. Kan switch-setning brukes da?

### Oppgave V3 - Ulike valgsetninger - FIX: neste lab

Du skal lage et program som leser inn tre heltall fra brukeren, og skriver de ut igjen tallene sortert i stigende rekkefølge.

#### a)

Løs oppgaven ved bare å bruke if-setninger.

#### b)

Løs oppgaven ved å bruke if-then-else-setninger.






