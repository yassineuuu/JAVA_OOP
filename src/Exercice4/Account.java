package Exercice4;

public class Account {

    //exercice4
    String nom;
    String adresse;
    double solde;

    public Account(String nom, String adresse, double solde){
        this.nom = nom;
        this.adresse = adresse;
        this.solde = solde;
    }


    public void afficherInfosSolde(){
        System.out.println("The employee name is: " + nom );
        System.out.println("The employee Adresse is: " + adresse );
        System.out.println("The employee Solde is: " + solde +"DH");


    }

    public void calculerInterer(){
        double interer = solde * 0.07;
        System.out.println("The employee interer is: " + interer +"DH");


    }



}
