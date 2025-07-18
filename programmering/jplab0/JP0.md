# DAT100: Java Programmering 0 - uke 33

I de første uke av emner skal vi bruke det web-baserte utviklingsmiljø JDoodle: https://www.jdoodle.com/

Formålet med oppgavene på denne programmeringslab er å sikre at du

1. har en brukerkonto slik du har tilgang til JDoodle
2. kan skrive Java-kode i JDoodle og få programmene til å kjøre
3. vet hvor du kan finne eksempelkoden som brukes i undervisningen 
4. blir litt kjent med JDoodle utviklingsmiljøet 

har en fungerende installasjon av Java Development Kit (JDK) og Eclipse på egen PC.

Det er **veldig viktig** at alle får dette til - så om du har problemer med dette så ta kontakt med undervisere eller labassistenter for å få hjelp.

Oppgave **TODO** nedenfor utgjør første obligatoriske innlevering der du må demonstrere at du har fått Java programmene til å fungere.

På Canvas skal du laste opp skjermbilder i oppgaven *Demonstrere kjørende Java programmer* på Canvas som viser: 

1. **TODO**
2. **TODO**

Les de enkelte oppgaver nedenfor igjennom før du begynner.

**Deadline/Frist**: se Canvas for faget

### Oppgave 1: Opprette en brukerkonto på JDoodle

TODO

### Oppgave 2: Første Java Program i JDoodle

I denne oppgaven skal du opprette et programmeringsprosjekt i Eclipse, skrive og kjøre et enkelt Java program.

1.	Start Eclipse
2.	Velg *File | New | Java Project* og skriv inn `Velkommen` som prosjektnavn.
3. 	Under *Module* fjern tick i *Create module-info.java* siden vi ikke i dette programmet skal bruke modulsystemet i Java
4.  Trykk *Finish*
5.  Åpne *Velkommen* i *Package Explorer* og velg *src*
5.	Velg *File | New | Class* og skriv inn `no.hvl.dat100` som pakkenavn og `Velkommen` som klassenavn. Kryss av for å generere `public static void main` automatisk. Trykk *Finish*

    Skriv inn:

```java
System.out.println("Nå virker det!");
```

så at hele filen ser slik ut:

```java
package no.hvl.dat100;

public class Velkommen {
    public static void main(String[] args){
    	System.out.println("Nå virker det!");
    }
}
```

4.	Velg *Run | Run* for å utføre programmet.
5.	Du vil nå få utskriften i konsoll-vinduet (nederst i Eclipse vinduet).
6.	Modifiser programmet slik det skriver ut en linje med 10 stjerner (`*`) før og etter selve teksten.

### Oppgave 3: Finne kodeeksempler fra forelesninger

### Oppgave 4: Bli litt kjent med JDoodle