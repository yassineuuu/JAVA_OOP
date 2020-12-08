package Exercice3;

public class Emplyees {

    //exercice3
    String nom;
    String adresse;
    double solde;

    public Emplyees(String nom, String adresse, double solde){
        this.nom = nom;
        this.adresse = adresse;
        this.solde = solde;
    }

    public void infos(){
        System.out.println("The employee name is: " + nom );
        System.out.println("The employee Adresse is: " + adresse );
        System.out.println("The employee Solde is: " + solde +"DH");
        System.out.println();
        System.out.println("#############################################");
        System.out.println();
    }

}
