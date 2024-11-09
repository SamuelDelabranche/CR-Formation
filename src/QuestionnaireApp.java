import Logic.GestionnaireDossiers;

import java.util.InputMismatchException;
import java.util.Scanner;

public class QuestionnaireApp {
    public static void main(String[] args) {
        GestionnaireDossiers _gestionnaireDossiers = new GestionnaireDossiers();
        Scanner scanner = new Scanner(System.in);

        System.out.println("--GESTIONNAIRE-- \n -1- Créer un projet\n -2- Filtrer un projet\n -3- Filtrer tous les projets\n -4|Entrer- Quitter\n ");
        boolean end = false;
        do {
                System.out.print("Votre choix : ");

                try{
                    int choix = scanner.nextInt();
                    switch (choix) {
                    case 1:
                        break;
                    case 2:
                        break;
                    case 3:
                        break;
                    case 4:
                        System.out.println("Vous avez quitté l'application");
                        end = true;
                        break;
                    default:
                        System.out.println("Votre choix est invalide");
                        break;
                }
            }
            catch (InputMismatchException e) { System.out.println("Votre choix est invalide"); scanner.next();}

        } while(!end);
        scanner.close();
    }
}
