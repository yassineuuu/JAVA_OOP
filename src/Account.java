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
