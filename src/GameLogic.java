import java.util.Scanner;


public class GameLogic {
    static Scanner scanner = new Scanner(System.in);
    //method to get user input from console
    public static int reading (String prompt, int userChoices){
        int input;
        do{
            System.out.println(prompt);
            try{
                input = Integer.parseInt(scanner.next());
            }catch(Exception e){
                input = -1;
                System.out.println("Please enter an integer!");
            }
        }while(input < 1 || input > userChoices);
        return input;
    }
    //method to stimulate clearing out the console
    public static void clearConsole(){
        for(int i = 0; i < 100; i++)
            System.out.println();
    }
    //method to print a seperator with length n
    public static void printSeperator(int n){
        for(int i = 0; i < n; i++)
            System.out.print("-");
        System.out.println();
    }
    //method to print a heading
    public static void printHeading(String title){
        printSeperator(30);
        System.out.println(title);
        printSeperator(30);
    }
    //method to stop the game until user enters anything
    public static void anythingToContinue(){
        System.out.println("\nEnter anything to continue...");
    }

}
