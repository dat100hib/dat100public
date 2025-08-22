### Oppgave B3 - Om tall i Java

Fra matematikken vet vi at tall ikke har en øvre grense og at når vi regner med desimaltall så får vi nøyaktige svar. Det trenger ikke være riktig når vi programmerer. Det er to ting som er *spesielt viktig* å være klar over:

-	Heltall har en øvre og nedre grense.
-	Det har for så vidt også flyttallene (desimaltallene), men det er sjelden et problem.  For disse kan beregninger bli litt unøyaktige.  

I denne oppgaven skal vi se på eksempler på dette.

#### a) 

Koden nedenfor beregner toerpotenser der eksponenten er 0, 1, …, 5.

```java
int n = 5;
int tall = 1;

for (int i = 0; i <= n; i++) {
    System.out.println(tall);
    tall = tall * 2;
}
```

Kjør koden og sjekk at det stemmer. Deretter endrer du `n` til 32 og utfører koden på nytt. Hva skjer på slutten? (Forklaring til slutt i oppgaven)

#### b) 

Fra matematikken vet vi at når vi summerer en rekke med tall, så har det ikke betydning i hvilken rekkefølge vi utfører addisjonene. Det kan det ha når vi programmerer. 

**Eksempel:**

Vi ønsker å finne summen nedenfor.

![](assets/sum.png)

For `n = 5` blir dette

![](assets/rekkevenstre.png)

Dette kan gjøres slik i Java:

```java
int n = 5;
double fraVenstre = 0;
    
for (int i = 1; i <= n; i++) {
    fraVenstre = fraVenstre + (1.0 / i);
}
```

Fra matematikken vet vi at det ikke har betydning i hvilken rekkefølge addisjonene blir utført i. Dvs. vi vil få samme resultatet og vi summerer fra høgre mot venstre som vist nedenfor

![](assets/rekkehogre.png)

Lag en ny løkke som beregner denne summen. Når du sammenligner svarene vil du se at de er litt ulike.

**Det som er viktig for oss:** Når vi regner med flyttall, så kan vi få unøyaktige svar. Det betyr at vi skal være forsiktige å sjekke om to flyttall er like (`==`), men heller sjekke om avstanden er svært liten.
I DAT100 blir ikke dette et problem, men det er viktig å være klar over dette for senere emner.

**Forklaring på hva som skjer i a):** Typen `int` har en øvre grense. På et tidspunkt blir tall større enn grensen. Vi får det som kalles overflyt (overflow). I den aktuelle oppgaven med `n=32`, kan vi unngå problemet ved å bruke typen `long` i stedet for int.  Denne kan inneholde større heltall, men etter hvert som vi dobler tall vil vi få samme problem (igjen). 