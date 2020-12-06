public class Emplyees {
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
        System.out.println(

        );
    }

    public static void main(String[] args) {
        Emplyees Hassan = new Emplyees("El Alami Hassan","Safi",14765.8);
        Emplyees Khalid = new Emplyees("Karimi Khalid","Casablanca",7654.0);

        Hassan.infos();
        Khalid.infos();
    }

}
