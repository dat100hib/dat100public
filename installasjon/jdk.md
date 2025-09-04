# Java Development Kit

Java Development Kit (JDK) inneholder alle verktøy som trengs for å oversette og kjøre Java programmer.

Fpr å kunne utvikle og kjøre Java programmer på egen PC må JDK installeres. JDK skal installeres før eventuell installasjon av et integrert utviklingsmiljø som IntelliJ, VSCode eller lignende. 

## Nedlasting

Java Development Kit lastes ned via:  
https://www.oracle.com/java/technologies/downloads/

**Husk** å laste ned filen for rett operativsystem (Windows, MacOS, Linux).

## Installasjon Windows

1. Last ned filen `jdk-24_windows-x64_bin.exe`
2.	Dobbeltklikk på filen `jdk-24_windows-x64_bin.exe`  
3.	Følg instruksjonene. Foreslåtte valg vil vanligvis fungere fint.
4. Test installasjon ved å starte en ledetekst (Command Prompt) og naviger til mappen `C:\Program Files\Java\jdk-24.0\bin` og utfør kommandoen `javac –version` som bør gi følgende (eller tilsvarende output): `javac "24.0.1"`

##### PATH miljøvariablen (valgfritt)

For å få enkel tilgang til Java kompilatoren kan miljøvariablen `PATH` endres slik den inneholder stien til `bin` mappen der JDK verktøyene er installert. Dette kan gjøres via *Control Panel → System → Advanced System Settings → Environment Variables…*

Stien til mappen er avhengige av hvor du valgte å installere JDK. Som standard vil den være: `C:\Program Files\Java\jdk-24.0.1\bin`.

**VIKTIG:** stien til JDK skal *tilføyes* til den eksisterende verdi av `PATH` dvs. ikke slett det eksisterende innholdet men tilføy følgende på enden (husk `;`` først):

```;C:\Program Files\Java\jdk-24.0.1\bin```

Stien vil også avhenge av hvilken versjon av JDK du evt. har lastet ned. Hvis du har downloaded en nyere versjon av JDK må stien endres tilsvarende.
Test installasjonen via en Command Prompt (ledetekst) og kommandoen:

```javac –version```

Dette bør gi følgende (eller tilsvarende) output:

```javac 24.0.1```

Om man endrer i PATH da må man starte en ny kommando prompt for å få effekt av endringen. Den aktuelle verdi av Path kan man se ved å skrive Path i kommando prompten.

## Installasjon MacOS

For nyere Mac med M1/M2/M3 Apple Chip last ned *ARM64 DMG Installer*. Eldre Mac har en x86 Chip og da skal du laste ned *x64 DMG Installer*.

1.	Dobbeltklikk på filen `jdk-24_macos-{aarch64,x64}_bin.dmg` og deretter på filen `JDK 24.0.1.pkg`
2.	Følg instruksjonene. Foreslåtte valg vil vanligvis fungere fint.
3.	Test installasjonen ved å utføre kommandoen:  `javac –version` i en terminal som bør gi følgende (eller tilsvarende output): `javac "24.0.1"`

## Installasjon Linux

Installasjon ved bruk av tar.gz filen

1.	Kopier tar.gz filen til den mappen hvor du ønsker å installere JDK.
2.	Pakk ut tar.gz filen med kommandoen

   ```tar -zxvf jdk-24.0.1-linux-x64_bin.tar.gz```

3. Tilføy bin mappen der JDK er installert til miljøvariablen PATH.  Dette er avhengig av Linux distribusjonen og shell. For bash shell kan det gjøres ved å tilføye:

   ```PATH=$HOME/Java/jdk-24.0.1:$PATH```

   til filen `~\.bash_profile`.

4. Test installasjonen ved å utføre kommandoen `javac –version` som bør gi følgende (eller tilsvarende) output: `javac "20.0.2"`

Installasjon via .rpm filen (krever RPM-basert Linux system) kan gjøres ved bruk av kommandoen

   ```rpm –ivh jdk-24.0.1_linux-x64_bin.rpm```
