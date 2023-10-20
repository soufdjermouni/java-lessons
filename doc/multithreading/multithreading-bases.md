# Les bases  

## Thread 
Un `thread` c'est une suite d'instructions que nous allons exécuter au sein même d'un processus.    
  Le fait d'avoir plusieurs threads, nous permet par exemple d'exécuter plusisuer tâches ne parallèlles.  

La JVM lance 2 threads :   
  + un Thread dédié pour GC : Garbage Collectors 
  + Un thread est réservé pour le main   : nom de thread est `main`  

  >System.out.println(Thread.currentThread().getName());//main   

## Thread Sceduler 
Quand le nombre de thread en parrallèles est supérieur au nombre de thread alloués dans la machine, il y a une entité
dans la JVM qui s'appelle le `Thread Scheduler`. il va essayer d'assigner à chaque thread un moment bien précis pour qu'il
soit exécuté par le processuer. cela se fait selon les priorités par exemple ... 

Java fournit une interface de programmation (API) pour la gestion des threads, notamment la classe java.lang.Thread et 
les classes du package java.util.concurrent, qui permettent aux développeurs de créer et de contrôler les threads dans 
leurs applications. Cependant, l'ordonnanceur de threads réel qui décide de l'ordre d'exécution des threads est géré par
le système d'exploitation sous-jacent.

Le rôle de l'ordonnanceur (Thread Sceduler ) de threads est essentiel pour garantir une utilisation efficace du 
processeur, la gestion des priorités et la prévention des conflits. Les développeurs Java peuvent spécifier des 
priorités pour les threads en utilisant la méthode setPriority() de la classe Thread, mais l'ordonnanceur du système 
d'exploitation a le dernier mot sur la manière dont ces priorités sont gérées.

## Thread Adhesion 
Permet de join les threrad.   
> Ne jamais joindre aucun Thread au Threa main : main.

```java
public static void main(String[] args) {
  System.out.println(Thread.currentThread().getName());//main 
  Thread thread = new Thread(new Task1());
  thread.start();
  thread.join(); //peremt de dire au thread main d'attendre la fin de Thread thread-0 
```

## Arrêter un thread   
Pour arrêter un thread, on envoie un signale (ou une requête) au Thread. Le thread que on désire arrêter, va vérifier 
avec la méthode isInterrupted() si il doit s'arrêter, puis il s'arrête 

```java 
if (Thread.currentThread().isInterrupted()) {//Si le thread a reçu une requête pour se stopper
break;
}
```

## Concurrence   
Le fait que plusieurs thread manipule la même ressources.  
### `Race condition` :     
  Une situation de compétition (ou situation de concurrence, accès concurrent, concurrence critique, course critique, 
séquencement critique1 ; race condition en anglais, littéralement « situation de course »), est une situation 
caractérisée par un résultat différent selon l'ordre dans lequel agissent les acteurs du système
Une situation de compétition peut survenir dès que plusieurs acteurs tentent d'accéder au même moment à une ressource 
partagée
La "race condition" (condition de concurrence) est un problème qui survient lorsque deux ou plusieurs threads d'un
programme concurrent accèdent simultanément à des ressources partagées ou modifient des données partagées sans une 
synchronisation appropriée. Cela peut entraîner des résultats inattendus, des erreurs de données et des comportements 
indéterminés dans une application.
Pour résoudre les race conditions en Java, vous pouvez utiliser divers mécanismes de synchronisation, tels que :

 + `Mots-clés synchronized` : Vous pouvez utiliser le mot-clé synchronized pour protéger les sections critiques de 
 + code en les rendant accessibles à un seul thread à la fois.

 + `Objets de verrouillage (Lock)` : Vous pouvez utiliser l'interface java.util.concurrent.locks.Lock pour créer des 
 + sections critiques de code synchronisées.

 + `Méthodes atomiques` : Java fournit des méthodes atomiques dans les classes du package java.util.concurrent.atomic 
 + pour effectuer des opérations telles que l'incrémentation de manière atomique.

 + `Utilisation de la classe java.util.concurrent` : Java propose de nombreuses classes du package java.util.concurrent
 + pour gérer les threads de manière sécurisée, notamment Semaphore, CountDownLatch, CyclicBarrier, etc.


### `Vibility Probleme` :    
Le problème de visibilité en Java est un concept lié à la programmation multithread et concerne la façon dont les 
modifications apportées à une variable dans un thread sont visibles pour d'autres threads. En Java, en raison de
l'optimisation de la mémoire et de la mise en cache, il existe des cas où les modifications effectuées par un thread 
ne sont pas immédiatement visibles par d'autres threads, ce qui peut entraîner des comportements inattendus.
Le problème de visibilité est principalement causé par le fait que chaque thread peut conserver sa propre copie en 
cache des variables au lieu d'accéder directement à la mémoire principale. Par conséquent, si un thread modifie une 
variable, ces modifications peuvent rester dans la mémoire cache du thread et ne pas être immédiatement propagées à 
la mémoire principale. Cela signifie que d'autres threads qui tentent d'accéder à la même variable peuvent ne pas 
voir les modifications

```java 
  public void increment (){
    //load variable
    // Increment variable
    // save variable
    total++;//n'est pas une variable atomique
  }
```

Solutions pour gérer la concurentiel :  

1. `Confinement`     
Utilisation de ThreadLocal.  Pour chaque thread, on lui associé une ressource propore à lui, une fois il a fini on 
synchronise vers la mémoire principale partagée par les threads.   

2. `Synchronisation` : peut engndrer des interblocage (`Deadlock`)  
Permet d'ordonnancer les threads.    

```java 
private Lock lock = new ReentrantLock();
public void increment (){
    lock.lock();
    total++;
    lock.unlock();
}
```

3. `Immutabilité`    

4. `Objects atomiques`   
Exemple: AtomicInteger 

5. `Partitionnement`   
Plusieurs threads peuvent accéder à plusieurs segments, par exemple d'une collection.


### Concurrence des collections 
Exemple :   

```java
public class SynchronisationCollection {
    public static void main(String[] args) {
         // Collection<Integer> myCollection = new ArrayList<>();
          Collection<Integer> myCollection = Collections.synchronizedCollection(new ArrayList<>());
          Thread thread1 = new Thread(() -> myCollection.addAll(List.of(1,2,3)));
          Thread thread2 = new Thread(() -> myCollection.addAll(List.of(4,5,6)));
    
          thread1.start();
          thread2.start();
    
          try {
              thread1.join();
          } catch (InterruptedException e) {
              throw new RuntimeException(e);
          }
          try {
              thread2.join();
          } catch (InterruptedException e) {
              throw new RuntimeException(e);
          }
    
          System.out.println(myCollection);//exemple d'affichage aletoire : [4, 5, 6]  , car il peut qu'un seul thread pourra
          //rajouter la liste
    
          //Solution : au lieu d'utiliser new ArrayList<>(), utilsier Collections.synchronizedCollection(new ArrayList<>());
      }
}
```





