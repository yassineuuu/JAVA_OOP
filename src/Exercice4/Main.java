package Exercice4;


public class Main {
    public static void main(String[] args) {
        System.out.println("#############################################");
        System.out.println();
        Account Hassan = new Account("El Alami Hassan","Safi",14765.8);

        Hassan.afficherInfosSolde();
        Hassan.calculerInterer();

        System.out.println();
        System.out.println("#############################################");
        System.out.println();

        Account Khalid = new Account("Karimi Khalid","Casablanca",7654.0);

        Khalid.afficherInfosSolde();
        Khalid.calculerInterer();


    }
}
