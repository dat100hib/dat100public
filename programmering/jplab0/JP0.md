# DAT100: Java Programmering 0 - uke 33

## Java programmering og utviklingsmiljø

Formålet med denne programmeringslab/øving er å sikre at du har en fungerende installasjon av Java Development Kit (JDK) og Eclipse på egen PC.

- [x] Oppgave 2,4 og 5 utgjør første obligatoriske innlevering der du må demonstrere at du har fått Java programmene til å fungere.

**Deadline/Frist**: se Canvas for faget

Du kan levere inn / få godkjennt oppgavene på to måter

1. Demonsterere programmene til labassistent eller underviser på programmeringslaben eller alternativt via Zoom.
2. Laste opp skjermdump i oppgaven *Demonstrere kjørende Java programmer* på Canvas som viser: Eclipse-vindue etter programmet er kjørt (oppgave 2); Eclipse-vindue etter at enhetstester er kjørt (oppgave 4);  programkode og easygraphics vindu etter program er kjørt (oppgave 5).

Det er veldig viktig at alle får dette til - så om du har problemer med dette så ta kontakt med undervisere eller labassistenter for å få hjelp.

### Oppgave 1: Nedlasting og installasjon av JDK, Eclipse IDE og Git

Les installasjonsveiledningen

https://github.com/dat100hib/dat100public/blob/master/README.md

og installer JDK, Eclipse og Git ved å gå igjennom de steg som er beskrevet i veiledningen.

### Oppgave 2: Første JAVA Eclipse-prosjekt

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

### Oppgave 3: Sjekke ut kode fra github

Vi skal bruke https://www.github.com til å distribuere kodeeksempler fra forelesninger og startkode for programmeringsoppgaver. Til dette formålet er der opprettet en oppbevaringsplass (repository) med navnet `dat100public` på github som vil inneholde Eclipse-prosjekter for eksemplene.

#### 3a - Opprette en github konto

For å få tilgang til oppbevaringsplassene som skal brukes i faget må du opprette en brukerkonto på https://www.github.com og angi et brukernavn, epost og passord.

**VIKTIGT**: Bruk studentnummeret dit som brukernavn (username)  Eksempelvis h428400 om du har studentnummer 428400.

Du skal *ikke* opprette noen repositories nå - kun en brukerkonto. Du vil få en e-post fra github der du blir bedt om å verifisere at e-post addressen er gyldig.

#### 3b - Opprette lokal kopi av oppbevaringsplassen

Du kan nå sjekke ut Eclipse-prosjekter med kodeeksempler på egen PC via Eclipse:

1.	Velg *File | Import… | Git | Projects from Git | Clone URI*
2.	I dialogboksen limer du inn følgende https://github.com/dat100hib/dat100public.git i feltet URI. Dette angir lokasjon av oppbevaringsplassen for eksempelkode på github.

    ![Problem med bilde](assets/gitimport.png)

3.	Under *Authentication* legger du inn brukernavn og passord for github-kontoen din og trykker *Next*.
4.	I dialogboksen *Branch Selection* velg *master* og trykk *Next*.
5.	I dialogboksen *Local Destination* må du under *Directory* velge en mappe på PC’en der du ønsker å lagre den lokale kopien av oppbevaringsplassen.
6.	I dialogboksen *Select a wizard* to use for importing projects velg *Import existing Eclipse Projects* og trykk *Next*.
7.	I dialogboksen *Import Projects* velg *F01Introduksjon* og *F01Kaukulator* trykk *Finish*. Da vil de to Eclipse-prosjektene med eksempelkode fra første forelesning være tilgjengelig.

#### 3c - Tilgang til nye og oppdaterte prosjekt

Etterhvert i faget oppdaterer vi eksempelprosjektene og du får også bruk for å få tilgang til eksempler for de neste forelesninger. For å få tilgang til de må du oppdatere den lokale oppbevaringsplassen på PC’en din:

1.	Velg et av eksempelprosjektene i Eclipse, høyre-klikk og velg *Team | Pull*.   Dette oppdaterer oppbevaringsplassen for eksempler på din PC.
2.	Velg *File | Import… | Git | Projects from Git | Existing local repository* og trykk *Next*.
3.	I dialogboksen *Select a Git Repository* velg *dat100public* og trykk *Next*.
4.	I dialogboksen *Select a wizard to use for importing projects* velg *Import existing Eclipse Projects*, vælg mappen *forelesninger* og trykk *Next*
5.	I dialogboksen *Import Projects* kan du nå velge de nye Eclipse-prosjekter du ønsker å importere inn i Eclipse

### Oppgave 4: Enhetstesting og JUnit

For noen programmeringsoppgaver skal vi bruke [JUnit](https://junit.org/junit5/) til å teste java-koden som dere skriver. Formålet med denne oppgaven er å bli kjent med JUnit.

Eksempelkoden fra første forelesning du sjekket ut i oppgave 3 inneholder et Eclipse-prosjekt `U01Kalkulator` som implementerer en enkel kalkulator med enkelt brukergrensesnitt.

1.	Kjør applikasjonen ved å velge `Grensesnitt.java` etterfulgt av *Run | Run*
2.	Kjør JUnit enhetstestene i prosjektet ved å velge filen `TestKalkulator.java` etterfulgt av  *Run | Run As | JUnit Test*

Enhetstestene i punkt 2 ovenfor feiler fordi ikke alt er implementert i filen `Kalkulator.java`:

1.	Åpn filen `Kalkulator.java` i editoren ved å dobbel-klikke på den.
2.	Implementer metodene `add`, `sub`, `mul` og `div` som vist på første forelesning.

Kjør enhets-testene igjen og prøv applikasjonen via grensesnittet. Sjekk at alt fungerer som ønsket.

### Oppgave 5: Bruk av EasyGraphics

I forbindelse med forelesninger og programmeringsoppgaver skal vi bruke biblioteket [EasyGraphics](https://github.com/dat100hib/dat100public/blob/master/installasjon/easygraphics.md) til å illustrere en del begreper innen programmering. Formålet med denne oppgaven er å vise hvordan man bruker easygraphics biblioteket i egne programmer.

For å kunne bruke easygraphics biblioteket i egen kode må Eclipse-prosjektet ha en referanse til en jar-fil som inneholder java-koden for biblioteket. Jar-filen `easygraphics.jar` finnes i mappen `easygraphics/lib` på PC'en din der du sjekket ut koden fra github i oppgave 3.

1.	Opprett et nytt Eclipse-prosjekt som i oppgave 2 med navnet *EasyGraphicsTest*. Det er **VIKTIG** at du svarer nei til å oprette module-info filen.

2. Lag en pakke `no.hvl.dat100` i prosjektet
3.	Legg inn en ny Java-klasse *Grafikk* i pakken `no.hvl.dat100` med følgende innhold:

```java
package no.hvl.dat100;

import easygraphics.*;

public class Grafikk extends EasyGraphics {

	public static void main(String[] args) {
		launch(args);
	}

	public void run() {
		makeWindow("Grafikk", 350, 150);
		drawCircle(150, 70, 60);
	}
}
```

Koden ovenfor gir i første omgang en rekke feilmeldinger siden vi ikke har fortalt hvor easygraphics biblioteket finnes.

4. Høyreklikk på prosjektet *EasyGraphicsTest* og velg *Import ... | General | File System | Browse ...* og naviger til mappen `easygraphics/lib` der `easygraphics.jar` filen legger. Velg `lib`og `easygraphics.jar` filen.

5.	Høyreklikk på prosjektet *EasyGraphicsTest* og velg *Properties | Java Build Path | Libraries | Classpath | Add JARs...*

6. Velg *EasyGraphicsTest*  og `easygraphics.jar` filen. Trykk *OK* og *Apply and Close*. Jar-filen er da lagt til prosjektet under *Referenced Libraries* og feilmeldinger skulle nå forsvinne.
7.	Kjør programmet og se at det gir forventet resultat.
8.	Modifiser programmet så det tegner to forskjellige sirkler på to ulike steder på skjermen.
9.	Skriv et program som tegner et åttetall (to sirkler).

### Oppgave 6: Jshell - Interaktivt Java verktøy

JShell er et interaktivt verktøy som er nyttig for å lære Java, men også for rask testing av mindre kodebiter. Gå igjennom siden:

https://dbsys.info/programmering/fagstoff/jshell.html

som viser hvordan en kommer i gang med å bruke jshell.

### Mer informasjon

For de som ønsker mer informasjon om Eclipse og Git:

-	Eclipse og Java: Velg  Help | Help Contents og Java development user guide
-	Bruk av Git i Eclipse: http://eclipsesource.com/blogs/tutorials/egit-tutorial/  
-	Git Reference: http://gitref.org/
