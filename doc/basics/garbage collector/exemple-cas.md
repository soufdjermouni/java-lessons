# Object to null 
How many objects are eligible for garbage collection after line 4?  

    Car car1 = new Car(); // line 1
    Car car2 = new Car(); // line 2
    car1 = car2; // line 3
    car2 = null; // line 4

Réponse : 1 object  
1. car1 pointe vers l’adresse mémoire # ff1 (new Car())
2. car2 pointe vers l’adresse mémoire # ff2 (new Car())
3. car1 est fait pour pointer vers l’adresse mémoire # ff2
4. CAR2 pointe à null
5. L’o*bjet car2 peut être collecté et l’adresse mémoire # ff1 réutilisée.