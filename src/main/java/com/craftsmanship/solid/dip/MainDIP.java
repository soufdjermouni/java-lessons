package com.craftsmanship.solid.dip;

public class MainDIP {
    public static void main(String[] args) {

        // Dependency Injection (DI)
        Repository repository = new DatabaseRepository();
        Service service = new Service(repository);
    }
}
