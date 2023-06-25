# Les expression Lambda 
C'est un raccourci syntaxique qui permet de définir une méthode directement à l'endroit où elle est utilisée. En d'autres termes,
Une expression lambda permet d'encapsuler un traitement pour être passé à d'autres traitements.

## L'annotation FunctionalInterface 
Quand une interface contient une seule méthode abstraite (sans implementation), dans ce cas on peut mettre 
l'annotation **FunctionalInterface** .  
Nous pouvons définir une seule method abstraite d"une interface fonctionnelle.  
Exemple message d'erreur quand  on définit deux method abstraite dans une interface fonctionnelle    
``
Multiple non-overriding abstract methods found in interface com.lessons.lambda.lambdaex1.Printable
``