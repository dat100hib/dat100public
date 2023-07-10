
## Eclipse

Eclipse er et integrert utviklingsmiljø (Integrated Development Environment) som gjør det enklere å skrive, kjøre og utføre feilfinning i Java programmer.

### Nedlasting

Eclipse IDE for Java Developers lastes ned via:

https://www.eclipse.org/downloads/packages/release/2023-06/r/eclipse-ide-java-developers

Last ned filen under *Download Links* for rett operativsystem. For nyere Mac med M1/M2 Apple Chip velg Aarch64 produktet. Eldre Mac har en x86 Chip og da skal du velge x86 produktet.

### Installasjon av Eclipse IDE

**Husk:** det er viktig at JDK er installert først

1.	Pakk ut den filen som inneholder Eclipse (zip,dmg,tar.gz)
   - **Windows** Om du lastet ned en .exe-fil da kan du dobbelklikke på denne for installasjon. Om du lastet ned en .zip-fil må du flytte zip-filen til den mappen der du ønsker å installere Eclipse. Høyre-klikk på .zip filen og velg *Pakk ut alle …*
   - **MacOS** Dobbel-klikk på .dmg filen og etter dette dobbelklikk på Eclipse Installer og velg mappene der du ønsker å installere. Standard valg fungerer vanligvis bra. I *eclipseinstaller* skal du velge **Eclipse IDE for Java Developers**
   - **Linux** Flyt .tar.gz filen til den mappen der du ønsker å installere Eclipse. Pakk ut tar.gz filen ved bruk av `tar`-kommandoen.
2.	Nå kan man starte Eclipse ved å åpne mappen du valgte for å pakke ut filene. Der finner du en programfil som heter `Eclipse`. Start denne ved å dobbelklikke.
3.	Når du får spørsmål om workspace, oppretter du et workspace som heter DAT100 (det er praktisk med ett workspace pr. fag og det er mulig å opprette flere workspaces senere).

### Problem med å starte Eclipse Windows

På noen Windows-plattformer kan det forekomme at en versjon av java’s virtuelle maskin (JVM) er installert som forhindrer Eclipse i å starte. Feilmeldingen ser ut lignende bildet nedenfor

![](assets/markdown-img-paste-20200403205632439.png)

Da må man endre i oppstarts-filen eclipse.ini som finnes i eclipse-mappen ved å tilføye:

```
-vm C:/Program Files/Java/jdk20.0.2/bin/javaw.exe
```

før linjen som begynner med –vmargs.

Se [eclipse.ini](https://github.com/dat100hib/dat100public/blob/master/eclipse/eclipse.ini) som eksempel der rettelsen er gjort.

**Husk** å endre i linjen ovenfor om man har valgt å installere JDK i en annen folder eller har installert en annen versjon av JDK.

### Problem med å starte Eclipse MacOS

På noen versjon av MacOS kan der være/oppstå problemer med å kjøre Eclipse pga. digital signatur på Eclipse App'en.

Dette kan løses ved å started en terminal og utføre kommandoen

```
sudo codesign --force --deep --sign - /Applications/Eclipse.app
```

Kilde:

- https://stackoverflow.com/questions/70725347/the-application-eclipse-can-t-be-opened-macos-monterey

Noen har også problemer med rettigheter for å starte Eclipse. Her kan denne videon hjelpe:

- https://www.youtube.com/watch?v=sWSySXfR17c
