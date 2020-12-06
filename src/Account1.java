public class Account1 {

    //exercice5

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
            this.nom = newNom;
        }
        public void setAdresse(String newAdresse){
            this.adresse = newAdresse;
        }
        public void setSolde(double newSolde){
            this.solde = newSolde;
        }


    public static void main(String[] args) {
        Account1 yacine = new Account1();
        yacine.setNom("Yassine MAKHLOUK");
        yacine.setAdresse("Casablanca");
        yacine.setSolde(8000);
        //Output
        System.out.println("Nom: " + yacine.getNom());
        System.out.println("Adresse: " + yacine.getAdresse());
        System.out.println("Solde: " + yacine.getSolde());
    }


}
