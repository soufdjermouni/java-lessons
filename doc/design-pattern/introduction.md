# c'est quoi ?
Le design pattern est un arrangement de modules qui répond à un problème de conception d’un logiciel en programmation
orienté objet.  Il décrit grossièrement la solution qui pourra être adaptée en

Il existe trois types de design pattern : les créateurs, les structuraux et les comportementaux.  

- créateurs : 
Les créateurs définissent l’instanciation et la configuration des objets et classes. 
    - Singleton 
    - Prototype
    - Fabrique 

- structuraux 
Les structuraux aident à résoudre les problèmes de structure des classes et de leur interface. 
  - Façade 
  - Adaptateur 
  - Proxy 
  - décorateur 

- comportementaux
Les comportementaux définissent l’organisation des objets afin que les responsabilités soient réparties entre eux.
  - Commande
  - Itérateur 
  - Observateur 
  - Stratégie 

# Les **patrons de création

## Prototype 
Plutôt que de créer un objet de A à Z c'est à dire en appelant un constructeur, puis en configurant la valeur de ses 
attributs, ce patron permet de créer un nouvel objet par recopie d'un objet existant.