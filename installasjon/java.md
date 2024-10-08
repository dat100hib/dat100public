# Java Development Kit

Java Development Kit (JDK) inneholder alle verktøy som trengs for å oversette og kjøre Java programmer.

## Nedlasting

Java Development Kit lastes ned via:  
https://www.oracle.com/java/technologies/downloads/

**Husk** å laste ned filen for rett operativsystem (Windows, MacOS, Linux).

## Installasjon Windows

1. Last ned filen `jdk-22_windows-x64_bin.exe`
2.	Dobbeltklikk på filen `jdk-20_windows-x64_bin.exe`  
3.	Følg instruksjonene. Foreslåtte valg vil vanligvis fungere fint.
4. Test installasjon ved å starte en ledetekst (Command Prompt) og naviger til mappen `C:\Program Files\Java\jdk-22.0\bin` og utfør kommandoen `javac –version` som bør gi følgende (eller tilsvarende output): `javac "22.0.1"`

5. Prøv også å utføre kommandoen `jshell` som starter et program som muliggjør interaktiv kjøring av Java-kode. Når programmet starter gir det følgende (eller tilsvarende output):

 ```
 |  Welcome to JShell -- Version 22.0.x
 |  For an introduction type: /help intro

 jshell>
 ```
Du kan avslutte ved å trykke `Ctrl + D`

##### PATH miljøvariablen (valgfritt)

For å få enkel tilgang til Java kompilatoren og *jshell* kan miljøvariablen `PATH` endres slik den inneholder stien til `bin` mappen der JDK verktøyene er installert. Dette kan gjøres via *Control Panel → System → Advanced System Settings → Environment Variables…*

Stien til mappen er avhengige av hvor du valgte å installere JDK. Som standard vil den være: `C:\Program Files\Java\jdk-22.0.1\bin`.

**VIKTIG:** stien til JDK skal *tilføyes* til den eksisterende verdi av `PATH` dvs. ikke slett det eksisterende innholdet men tilføy følgende på enden (husk `;`` først):

```;C:\Program Files\Java\jdk-22.0.1\bin```

Stien vil også avhenge av hvilken versjon av JDK du evt. har lastet ned. Hvis du har downloaded en nyere versjon av JDK må stien endres tilsvarende.
Test installasjonen via en Command Prompt (ledetekst) og kommandoen:

```javac –version```

Dette bør gi følgende (eller tilsvarende) output:

```javac 22.0.1```

Om man endrer i PATH da må man starte en ny kommando prompt for å få effekt av endringen. Den aktuelle verdi av Path kan man se ved å skrive Path i kommando prompten.

#### Konflikt med andre JVM installasjoner

På noen Windows-plattformer kan det forekomme at en versjon av java’s virtuelle maskin (JVM) er installert som forhindrer Eclipse i å starte. Da må man endre i oppstarts-filen `eclipse.ini` som finnes i eclipse-mappen ved å tilføye:

```-vm C:/Program Files/Java/jdk-22.0.1/bin/javaw.exe```

før linjen som begynner med `–vmargs`. Husk å rette i linjen ovenfor om man har valgt å installere JDK i en annen folder eller har installert en annen versjon av JDK.

En endret versjon av [eclipse.ini](https://github.com/dat100hib/dat100public/blob/master/eclipse/eclipse.ini) er tilgjengelig.

## Installasjon MacOS

For nyere Mac med M1/M2 Apple Chip last ned *ARM64 DMG Installer*. Eldre Mac har en x86 Chip og da skal du laste ned *x64 DMG Installer*.

1.	Dobbeltklikk på filen `jdk-22_macos-{aarch64,x64}_bin.dmg` og deretter på filen `JDK 22.0.1.pkg`
2.	Følg instruksjonene. Foreslåtte valg vil vanligvis fungere fint.
3.	Test installasjonen ved å utføre kommandoen:  `javac –version` i en terminal som bør gi følgende (eller tilsvarende output): `javac "22.0.1"`

## Installasjon Linux

Installasjon ved bruk av tar.gz filen

1.	Kopier tar.gz filen til den mappen hvor du ønsker å installere JDK.
2.	Pakk ut tar.gz filen med kommandoen

   ```tar -zxvf jdk-22.0.1-linux-x64_bin.tar.gz```

3. Tilføy bin mappen der JDK er installert til miljøvariablen PATH.  Dette er avhengig av Linux distribusjonen og shell. For bash shell kan det gjøres ved å tilføye:

   ```PATH=$HOME/Java/jdk-22.0.1:$PATH```

   til filen `~\.bash_profile`.

4. Test installasjonen ved å utføre kommandoen `javac –version` som bør gi følgende (eller tilsvarende) output: `javac "20.0.2"`

Installasjon via .rpm filen (krever RPM-basert Linux system) kan gjøres ved bruk av kommandoen

   ```rpm –ivh jdk-22.0.1_linux-x64_bin.rpm```
