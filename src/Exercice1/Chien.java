package Exercice1;

public class Chien {
    String nom;

    public Chien(String nom) {
        this.nom = nom;
    }

    //The Methods includs exercice 1 and 2 ;)

    public void Aboyer(String sens){
        if (sens.equalsIgnoreCase("Angry")){
            System.out.print("Je suis en colère. Ghhhhhhhhhh !!! WWWWOARF !! WWWWOARF !!");
        }else if (sens.equalsIgnoreCase("Cool")){
            System.out.print("Je ne suis pas du tout en colère. Iwiw !! awaw !!");
        }else {
            System.out.print(nom + " dit wwaaaarf,");
        }
    }

    public void Manger(String food){
        if (food.equalsIgnoreCase("Fish")){
            System.out.print(" Je mange du poisson");
        }else {
            System.out.println(" Je mange de la viande");
        }

    }



}

