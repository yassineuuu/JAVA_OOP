import java.util.Scanner;

public class Account2 {
    //exercice6

    private String nom;
    private String adresse;
    private double solde;

    //Getters
        public String getNom(){
            return nom;
        }
        public String getAdresse(){
            return adresse;
        }
        public double getSolde(){
            return solde;
        }

    //Setters
        public void setNom(String newNom){
            if (newNom != "" || newNom != " "){
                this.nom = newNom;
            }else {
                this.nom = "nom invalid";
            }

        }
        public void setAdresse(String newAdresse){
            if (newAdresse != "" || newAdresse != " "){
                this.adresse = newAdresse;
            }else {
                this.adresse = "adresse invalid";
            }

        }
        public void setSolde(double newSolde){
            this.solde = newSolde;
        }


    //Methode retiree

    public void retirer(){
        Scanner montantRetire = new Scanner(System.in);
        System.out.println("Combien voulez-vous retirer:");
        double argent = montantRetire.nextDouble();
        if (argent<=solde){
            solde = solde - argent;
            System.out.println("Vous avez retirer " + argent + "DH");
            System.out.println("Il vous rest: " + solde + "DH");
        }else {
            System.out.println("La somme que vous avez entre est invalid");
        }


    }

    //Output
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
