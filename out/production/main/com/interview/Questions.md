# Java Interview Questions

## c'est un Stream? 
Streams nous permettent d’effectuer des traitements sur des collections d’une manière simple et performante.
Les Streams sont souvent utilisés avec les Lambda.
C’est une séquence d’éléments sur laquelle on peut effectuer un groupe d’opérations de manière séquentielle ou parallèle.

À la manière du SQL sur une table , C’est une séquence d’éléments sur laquelle on peut effectuer un groupe d’opérations
de manière séquentielle ou parallèle.


## Where are parameters and local variables stored?
   Answer: The local variables and the parameters are always stored in stack segment whereas the references are created
   at heap segment
   
## Is an object garbage collected even after an exception is occurred in the program?
 - Any object not referenced anymore, staying in the memory will be garbage collected.
 - GC fait partie de JVM, pas un programme. Donc, même si une exception est levée, même si le programme s'arrête, 
GC le fait fonctionner

## Which component is used to compile, debug and execute the java programs?   
JDK, because JDK has the debugging tools, and compiler i.e. javac along with the JRE, and JRE is itself the execution 
environment that consists of JVM and libraries.

## Which collection is thread safe in JAVA?  ArrayList, LinkedList, HashMap and Vector 
Vector

## Which of the following data types option switch accepts ?
A switch works with the byte , short , char , and int primitive data types.

## Identify the modifier which cannot be used for constructor ?  
  "static", because constructer will call automaticaly when creation of object is done
  The static modifier is used to create class-level variables 

## 1. What is the difference between Collection and Stream? (answer)
The main difference between a Collection and a Stream is that Collection contains its elements, but a Stream doesn't

## What does the filter() method do? when you use it? (answer)
The filter method is used to filter elements that satisfy a certain condition that is specified using a Predicate function.
A predicate function is nothing but a function that takes an Object and returns a boolean. For example, if you have a List of 
Integer and you want a list of even integers.

## C’est quoi une classe abstraite?
Est une classe qu'on peut pas l'instancier. Pour l’exploiter il faut absolument passer par l’héritage.

## C’est quoi une interface?
 C’est une classe abstraite, qui permet de regrouper un certain nombre de méthodes sans qu’elle
 soit instanciée. Pour l’exploiter il faut l’implémenter

 ## 3.7 How do you ensure that N threads can access N resources without deadlock ?
A very simple way to avoid deadlock while using N threads is to impose an ordering on the locks and force each thread
to follow that ordering. Thus, if all threads lock and unlock the mutexes in the same order, no deadlocks can arise.

## What’s a deadlock ?
A condition that occurs when two processes are waiting for each other to complete, before proceeding. The result is that both
processes wait endlessly

## Explain different ways of creating a thread. Which one would you prefer and why ?
There are three ways that can be used in order for a Thread to be created:
    • A class may extend the Thread class.
    • A class may implement the Runnable interface.
    • An application can use the Executor framework, in order to create a thread pool.
    The Runnable interface is preferred, as it does not require an object to inherit the Thread class. In case your application design
    requires multiple i

## What is the difference between processes and threads ?
   A process is an execution of a program, while a Thread is a single execution sequence within a process. A process can contain
   multiple threads. A Thread is sometimes called a lightweight process
