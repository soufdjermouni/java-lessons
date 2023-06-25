# AtomicInteger vs Integer 
En Java, les opérations atomiques sont vues comme des méthodes que l'on peut exécuter
sur un champ volatile.  

Le choix entre les deux types se résume sur le besoin d'être en thread safety.   
- Integer : n'est pas thread safety
- AtomicInteger  : il est thread safety    
  AtomicInteger encapsule un champ volatile (ici integer) et fournit des méthodes atomiques
  La classe fournit des opérations thread-safe sur un compteur d'entiers auquel différents threads accèdent simultanément,
  sans utiliser la synchronisation ni avoir un impact important sur les performances

AtomicInteger classe a de nombreuses méthodes utilitaires qui sont toutes thread-safe.  
AtomicInteger fonctionne mieux qu'un int synchronisé.

# volatile vs synchronized ?
Le mot clé **volatile** permet de signifier à la JVM qu’une variable sera modifiée par plusieurs Threads.  
En déclarant une variable volatile, sa valeur ne sera jamais placée dans le cache local à la Thread courante d’exécution.   
Chaque lecture et chaque écriture passeront forcément par la mémoire partagée entre les Threads. De fait, l’accès à la 
variable elle-même devient implicitement synchronisé.

- Le mot clé volatile ne rend pas l’**accès bloquant** pour une Thread, comme le fait synchronized. Ce n’est donc pas une 
solution pour faire un **sémaphore**, une barrière, bref des patterns d’inter-lockages de Threads
- Le mot synchronized s’applique uniquement à des Objets alors que volatile peut s’utiliser aussi sur des types primitifs.

Au quotidien vous ne verrez que très rarement finalement le mot clé volatile. Ce que l’on voit dans les APis par contre,
c’est des types comme AtomicInteger ou sinon des décorateurs complexes comme AtomicReference.
