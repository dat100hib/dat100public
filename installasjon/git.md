## Git

Git er et distribuert revisjonkontrollsystem som bla. gjør det mulig å oppbevare og dele på kode mellom utviklere samt holde kontroll på ulike versjoner av en kode-base.

Git bygger på en klient-tjener (client-server) programvarearkitektur der tjener-siden tilbyr oppbevaringsplasser med kode som sky-tjeneste. Klient-siden er applikasjoner som kan hente ned kode fra oppbevaringsplasser på tjener-siden og laste opp nye versjoner av koden til oppbevaringsplassene på tjener-siden. 

GitHub er et eksempel på en sky-tjeneste som tilbyr kode oppbevaringsplasser basert på Git. Der finnes også andre git-baserte sky-tjenester som eks. BitBucket og GitLab, og det er også mulig for organisasjoner og bedrifter og installere/drifte dere egen Git-tjener.

For å bruke en Git-tjenester som eks. Github fra egen PC er det nødvendig å installere et Git-klient applikasjon. Her finnes ulike alternativer med grafiske grensesnitt og med tekst-baserte grensesnitt. Installation av to alternativer er beskrevet nedenfor.

Integrerte utviklingsmiljø som eks. IntelliJ har også som oftest en innbygget git-klient som kan brukes til å laste ned og last opp kode direkte. Dette skal vi komme tilbake til.

### GitHub Desktop - Git-klient med grafisk grensesnitt

For Windows og Mac OS kan GitHub Desktop applikasjonen lastes ned via: https://desktop.github.com

#### Windows

1. Dobbelklikk på den *.exe*-filen som er lastet ned for å installere.
2. Start GitHub Desktop programmet og velg *Sign in to GitHub.com*. 

#### MacOS

Applikasjonen ligger i en zip-fil i Download-mappen

1. Flyt zip-filen fra *Download* mappen til en mappe på PC'en der du ønsker å installere. **Ikke** installer programmet i en OneDrive mappe eller lignende mappe som blir synkronisert med en skytjeneste.
2. Dobbelklikk (Mac) på zip-filen for å pakke den ut. 
3. Start GitHub Desktop programmet og velg *Sign in to GitHub.com*. 
4. Etter du har logget inn vil du få valg om å flytte applikasjonen inn i *Applications* mappen hvilket er fornuftig å gjøre.

#### Test installasjonen

### Git kommandolinje klient med tekst-grensesnitt

#### Windows

1. Last ned git-klienten fra https://git-scm.com/downloads

2. Double-klikk på .exe filen som du lastet ned i forrige steg. Foreslåtte valg vil vanligvis fungere fint.

3. Test installasjonen ved å start programmet Git Bash og kjør kommandoen

   `git --version`

  som vil gi output `git version 2.39` eller tilsvarende.

#### MacOS og Linux

Git vil i de fleste tilfelle allerede være installert på MacOS eller Linux. Dette kan sjekkes ved å åpne en terminal og skrive kommandoen

`git --version`

som vil gi output `git version 2.32` eller tilsvarende.

Om git ikke allerede er installert vil du få valg om å installere.

#### Test installasjonen

### Mer informasjon

Der finnes mange ressurser på nett om virkemåte og bruk av Git. I DAT100 skal vi fokusere på de mest grunnleggende element av Git. 

- GitHub nettstedet: <https://github.com/>
- Dokumentasjon: <https://git-scm.com/documentation>
- ??




