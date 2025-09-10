# IntelliJ

IntelliJ er et integrert utviklingsmiljø (Integrated Development Environment) som gjør det enklere å skrive, kjøre og utføre feilfinning i Java programmer.

## Nedlasting

IntelliJ UDEA kan lastes ned via: https://www.jetbrains.com/idea/download/ og finnes i to ulike versjoner:

- Ultimate (betaling, men mulig å få en studentlisens: https://www.jetbrains.com/academy/student-pack/) 
- Community (gratis)

Begge versjoner kan fungere i DAT100 da vi ikke bruker noen av de spesifikke funksjoner som er i Ultimate versjonen.

## Installasjon

Før IntelliJ installeres er det **VIKTIG** at du har installert [Java Development Kit](https://github.com/dat100hib/dat100public/blob/master/installasjon/jdk.md) 

Double-klikk på filen som er lastet ned for å installere. Standard valgene skal fungere for DAT100.

## Test av installasjon

1. Start IntelliJ
2. Velg `File -> New Project` for å opprette et Java prosjekt. Gi prosjektet navnet `HelloWorld` og plaser det via `Location` et passende sted på datamaskinen. Trykk på `Create` for å opprettet prosjektet.
3. Høyre-klikk på `src` i Project explorer og velg `New .. -> Package`. Gi pakken navnet `no.hvl.dat100`
3. Høyre-klikk på pakken `no.hvl.dat100`og velg `New .. -> Java Class`. Gi klassen navnet `HelloWorld`
4. Skriv koden nedenfor inn i klassen:

```java
package no.hvl.dat100;

public class HelloWorld {

    public static void main(String[] args) {
        System.out.println("IntelliJ Hello World");
    }

```

5. Kjør Java-programmet ved eks. å velge en av de grønne play-ikoner ved siden av linje-numrene i filen `HelloWorld.java`
6. Se at der åpnes en vindue nederst i IntelliJ med teksten `IntelliJ Hello World`.

## Inline Code Completion

IntelliJ er et avansert verktøy som kan gi mye hjelp når en skriver Java kode. I en del tilfeller kan dette jobbe mot at en blir stødig i de grunnleggende konstruksjoner i programmeringsspråket - hvilket er viktig for eksamen.

Det kan derfor være lurt å slå fra eks. inline completion som automatisk vil komme med forslag til hvordan koden skal fortsette. Dette kan slås fra ved å gå til menuen `IntelliJ IDEA` og velge `Settings -> Editor -> General -> Inline Completions` for så å fjerne valget *Enable local Full Line completion suggestions*.