### Pushe kode til egen github oppbevaringsplass

Hvis du ønsker å ha din egen kopi på github av en oppbevaringsplass du har klonet (eks. startkode) og som du ønsker å kunne pushe kode til da kan du gjøre følgende:

1. Opprett en ny oppvbevaringsplass på github *uten* README fil og *uten* en .gitignore fil.
- Start git bash programmet som du instalerte på første programmeringslab (https://github.com/dat100hib/dat100public/blob/master/installasjon/git.md) og utfør følgende kommandoer

```
git remote remove origin

git remote add origin <url-to-new-empty-repository>

git push -u origin master
```

der du må erstatte `<url-to-new-empty-repository>` med URL'en til den oppbevaringsplass du opprettet i steg 1.
