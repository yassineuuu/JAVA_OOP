package Exercice6;

public class Main {

    public static void main(String[] args) {
        Account2 yacine = new Account2();
        yacine.setNom("Yassine MAKHLOUK");
        yacine.setAdresse("Casablanca");
        yacine.setSolde(8000);
        //Output
        System.out.println("Nom: " + yacine.getNom());
        System.out.println("Adresse: " + yacine.getAdresse());
        System.out.println("Solde: " + yacine.getSolde() + "DH");
        yacine.retirer();
    }
}
