package com.craftsmanship.solid.dip;

public class Service {

    private Repository repository;

    public Service(Repository repository) {
        this.repository = repository;
    }
}


// Dependency Inversion Principle (DIP)
interface Repository {
    void save();
}

class DatabaseRepository implements Repository {
    @Override
    public void save() {
        // Logique de sauvegarde dans la base de données
    }
}