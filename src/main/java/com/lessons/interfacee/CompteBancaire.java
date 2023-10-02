package com.lessons.interfacee;

public class CompteBancaire implements  Compte{

    private final String numero;
    private int balance;

    public CompteBancaire(String numero) {
        this.numero = numero;
    }

    @Override
    public void deposer(int montant) {
        this.balance += montant;
    }

    @Override
    public int retirer(int montant) throws OperationInterrompueException {
        if (balance < montant) {
            throw new OperationInterrompueException();
        }
        return this.balance -= montant;
    }

    @Override
    public int getBalance() {
        return this.balance;
    }

    public String getNumero() {
        return numero;
    }
}
