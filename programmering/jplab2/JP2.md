# DAT100: Java Programmering 2 - uke 35

### Oppgave 1 - Vekslepenger

Skriv et program som leser inn en pris og et beløp (begge heltall) som er betalt og beregner hvor mange 10 og 1-kr kunden skal ha igjen i vekslepenger slik kunden får færrest mulig antall mønter tilbake.

**Hint:** Operatoren `%` (modulo) gir rest ved heltalldivisjon.

### Oppgave 2 - Kulevolum

Skriv program som beregner volum av en kule ved bruk av Math-biblioteket:

https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Math.html

Konstanten `Math.PI` gir tilnærmet verdi for 𝜋

![](assets/markdown-img-paste-20190817113526451.png)

### Oppgave 3 - Valgsetninger

Lag et program som leser inn to tall a og b, og skriver ut verdien av a/b hvis ikke b er 0, og en feilmelding ellers (siden det ikke går an å dele med 0).

### Oppgave 4 - Valgsetninger

Se på koden for inntasting av brukernavn og passord via dialogvinduer:

https://github.com/dat100hib/dat100public/blob/master/forelesninger/F03SetningerUttrykk/src/no/hvl/dat100/Login.java

Legg till to String variable som innholder korrekt brukernavne og passord. Bruk en if-setning til å sjekke om der er gitt korrekt login informasjon. For en tekststreng (String) `s1` kan `s1.equals(s2)` (se https://docs.oracle.com/en/java/javase/14/docs/api/java.base/java/lang/String.html) brukes til å sjekke om to strenger er lik (se etter equals metoden på siden).

I praksis vil en aldrig legge inn brukernavn og passord i selve programmet da det utgjør en sikkerhetsrisiko - men vi gjør det slik inntil vi har lært mer om programmering.

### Oppgave 5 - Valgsetninger

Du skal lage et program som leser inn tre heltall fra brukeren, og skriver ut igjen tallene sortert i stigende rekkefølge.

1. Løs oppgaven ved bare å bruke if-setninger.

2. Løs oppgaven ved å bruke if-else-setninger.

### <a name="jp26"></a> Oppgave 6 - del av obligatoriske innlevering 2

En trinnskatt (tidligere toppskatt) er en progressiv skatt på brutto lønn som beregnes når inntekten er
høyere enn 164 100kr.

![](assets/markdown-img-paste-20190821100958296.png)

Se https://www.skatteetaten.no/satser/trinnskatt/?year=2019#rateShowYear for aktuelle satser.

Lag et program som leser inn bruttoinntekt, beregner og skriver ut trinnskatten.

### <a name="jp27"></a> Oppgave 7 - del av obligatoriske innlevering 2

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
