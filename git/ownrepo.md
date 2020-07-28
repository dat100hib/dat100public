### Opprette egen github oppbevaringsplass

De som ønsker kan opprette en egen oppbevaringsplass på github til bruk for java-koden som utvikles i faget:

1.	Login på <https://www.github.com> og velg New Repository
2.	Under *Create new repository* velg *initialize this repository with a README*
3.	Under *Add .gitignore* velg *Java* og trykk *Create*
4.	Sjekk ut den nye tomme oppbevaringsplassen på PC’en ved å bruke Eclipse *File | Import… | Git | Projects from Git | Clone URI* som dere gjorde i oppgave 3 første lab (https://github.com/dat100hib/dat100public/blob/master/programmering/jplab1-onsdag/JP1.md) men nå med addressen på den nye oppbevaringsplassen som du finner under *Clone or Download* på github.
5.	I dialogboksen *Import Projects* velg *Cancel* siden der ennå ikke er noen Eclipse-prosjeketer i den nye oppbevaringsplassen.

Der kan være flere Eclipse-prosjekter i den samme oppbevaringsplassen så du trenger kun å gjenta punkt 1-2 ovenfor om du ønsker å opprette en helt ny oppbevaringsplass.  

Hvis du allerede har Eclipse-prosjekter som du ønsker å legge til opbevaringsplassen kan du gjøre slik:

1.	Høyre-klikk på prosjektet i Eclipse og velg *File | Share Project…*
2.	I dialog-boksen *Configure Git Repository* velg den nye oppbevaringsplassen under punktet *Repository* og trykk *Finish*

Du kan nå legge filer inn i oppbevaringsplassen ved å bruke *Team | Add to Index* og *Team | Commit … | Commit and Push*

Hvis du holder på å opprette et nytt Eclipse-prosjekt du ønsker skal inn i oppbearingsplassen, så velg å opprette projektet i en undermappe av mappen der du sjekket ut oppvearingsplassen på PC'en din. Etterpå kan du bruke *Team | Add to Index* og *Team | Commit … | Commit and Push* til å legge filer inn i oppbevaringsplassen.

Om du ønsker at andre studenter som du er i gruppe med skal kunne oppdatere filene på oppbevaringsplassen, da må du legge de til inne på github under *Settings* og *Collaborators & Teams*
