public class Main {
    public static void main(String[] args) {
        System.out.println("Bienvenue dans Harry Potter at Home, le RPG des sorciers. Avez-vous l’étoffe des plus grands sorciers ? Saurez-vous relever tous les défis qui vous attendent ? C’est parti !\n" +
                "Votre objectif est de valider votre scolarité à Poudlard, mais attention chaque année sera parsemée d’embuches.\n");
        GameLogic.printHeading("Testing helper methods!");
        GameLogic.anythingToContinue();
        GameLogic.clearConsole();
        int input = GameLogic.reading("Enter 1, 2 or 3;", 3);
        System.out.println("You chose number " + input);
    }
}