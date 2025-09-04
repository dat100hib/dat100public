## Git

Git er et distribuert revisjonkontrollsystem som bla. gjør det mulig å oppbevare og dele på kode mellom utviklere samt holde kontroll på ulike versjoner av en kode-base.

Git bygger på en *klient-tjener* (client-server) programvarearkitektur der tjener-siden tilbyr oppbevaringsplasser med kode som sky-tjeneste. Klient-siden er applikasjoner som kan hente ned kode fra oppbevaringsplasser på tjener-siden og laste opp nye versjoner av koden til oppbevaringsplassene på tjener-siden. 

[GitHub](https://github.com) er et eksempel på en sky-tjeneste som tilbyr kode oppbevaringsplasser basert på [Git](https://git-scm.com). Der finnes også andre git-baserte sky-tjenester som eks. [Bitbucket](https://bitbucket.org) og [GitLab](https://about.gitlab.com). Det er også mulig for organisasjoner og bedrifter og installere/drifte dere egen Git-tjener.

For å bruke en Git-tjenester som eks. Github fra egen PC er det nødvendig å installere et Git-klient applikasjon. Her finnes ulike alternativer - både med grafiske grensesnitt og med tekst-baserte grensesnitt. Installation av to alternativer er beskrevet nedenfor.

Integrerte utviklingsmiljø som eks. IntelliJ har også som oftest en innbygget git-klient som kan brukes til å laste ned og laste opp kode direkte. Dette skal vi komme tilbake til.

### GitHub Desktop - Git-klient med grafisk grensesnitt

For Windows og Mac OS kan GitHub Desktop applikasjonen lastes ned via: https://desktop.github.com

#### Windows

1. Dobbelklikk på den *.exe*-filen som er lastet ned for å installere.
2. Start GitHub Desktop programmet og velg *Sign in to GitHub.com*. 

#### MacOS

Applikasjonen ligger i en zip-fil i Download-mappen

1. Flyt zip-filen fra *Download* mappen til en mappe på PC'en der du ønsker å installere fra. **Ikke** installer programmet fra en OneDrive mappe eller lignende mappe som blir synkronisert med en skytjeneste.
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

som vil gi output `git version 2.51` eller tilsvarende.

Om git ikke allerede er installert vil du få valg om å installere.

#### Test installasjonen

For å teste git-klienten du har installert ovenfor kan du prøve å *klone* oppbevaringsplassen som vi bruker i DAT100.

#### GitHub Desktop

1. Velg File -> Clone Repository
2. Gå til URL fanen og lim inn: https://github.com/dat100hib/dat100public
3. Velg via `Local Path` hvor på PC'en din du ønsker å lagre din lokale kopi av oppbeveringsplasen. Ikke velg en OneDrive mappe eller lignende som blir synkronisert med en sky-tjeneste.
4. Nu skal alle filer fra DAT100 oppbevaringsplassen finnes i mappen som du valgte i steg 3 ovenfor

#### Git kommando-linje klient

1. Bruk terminal (Mac OS) eller Git Bash for å gå til den mappen der du ønsker å lagre oppbevaringsplassen
2. Utfør kommandoen `git clone https://github.com/dat100hib/dat100public`
3. Nu skal alle filer fra DAT100 oppbevaringsplassen finnes i mappen som du valgte i steg 3 ovenfor

### Mer informasjon

Der finnes mange ressurser på nett om virkemåte og bruk av Git. I DAT100 skal vi fokusere på de mest grunnleggende element av Git. 

- GitHub nettstedet: <https://github.com/>
- Dokumentasjon: <https://git-scm.com/documentation> (inklusiv noen introduserende videoer)
- Fler ressurser for å lære om Git: https://git-scm.com/doc/ext




