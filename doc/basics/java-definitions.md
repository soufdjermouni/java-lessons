# Architecture de Java
- Heap (le tas) :  
  c'est là que l'on instancie tous les objets.
- Stack (pile) :  
  on essaye de n'y placer que les types de base, ainsi que des pointeurs ... d'où l'utilisation de new
  L'adressage dans la JVM se fait sur 32 bits permettant l'accès à 4 GB de mémoire. Chaque registre peut contenir une 
  adresse 32 bits. Chaque méthode est limitée à 32 KB.
- Garbage-Collection Heap
  Le heap est la portion de mémoire dans laquelle sont allouées les instances de classe. L'environnement runtime garde 
  une trace des références à chaque objet et libère automatiquement la mémoire associée à un objet qui n'est plus 
  référencé. Le garbage collector tourne comme thread en tâche de fond et s'active pendant les périodes d'inactivité 
  du processeur.
- Suer class : java.lang.Object  
- @override : est utilisé pour définir une méthode qui est héritée de la classe parente. Utilisé que dans le cas de l 
  'Héritage.
- Interpreté :
  Strictement parlant, Java est un langage interprété bien que nous venons d'évoquer son aspect compilé. En effet, 
  tout les opcodes de la JVM doivent être interprétés par chacune des plates-formes. L'interprétation s'opère via un
  navigateur World Wide Web ou un environnement runtime spécial.

- Robuste
  Pour garantir la robustesse de Java, celui-ci a été débarrassé des pointeurs : il est impossible de référencer
  une adresse mémoire, d'utiliser l'arithmétique de pointeurs pour se déplacer dans des tableaux. 
  De plus, Java vérifie toujours lors de l'utilisation de tableaux que le programmeur ne cherche pas à utiliser 
  des portions non allouées.

   La gestion de la mémoire, sa désallocation automatique via un garbage collector sont les garants d'une meilleure  
   stabilité des applications. 
   Le garbage collector fonctionne comme un thread séparé tournant en tâche de fond avec une basse priorité. 
   Il désalloue des pans de mémoire lorsque l'utilisation du CPu est faible ou lorsqu'un besoin de mémoire se fait 
   sentir pour l'application.   

