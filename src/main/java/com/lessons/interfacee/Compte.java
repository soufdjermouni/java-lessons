package com.lessons.interfacee;

/**
 * Une interface permet de définir un ensemble de services qu’un client peut obtenir d’un objet. Une interface introduit
 * une abstraction pure qui permet un découplage maximal entre un service et son implémentation. On retrouve ainsi les
 * interfaces au cœur de l’implémentation de beaucoup de bibliothèques et de frameworks. Le mécanisme des interfaces
 * permet d’introduire également une forme simplifiée d’héritage multiple.
 */
public interface Compte {

    int PLAFOND_DEPOT = 1_000_000;
    //équivalent à : public static final int PLAFOND_DEPOT = 1_000_000;

    static int getBalanceTotale(Compte... comptes) throws OperationInterrompueException {
        int total = 0;
        for (Compte c : comptes) {
            total += c.getBalance();

        }
        return total;
    }

    abstract void deposer(int montant) throws OperationInterrompueException,
            CompteBloqueException;;
    public int retirer(int montant) throws OperationInterrompueException,
    CompteBloqueException;
    int getBalance() throws OperationInterrompueException;  //Private methods in interfaces should have a body
    //private int getBalance()

}
