import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Welcome, traveller. Please enter your name: ");
        String inputName = scanner.nextLine();

        wait(2000);
        // Return type string function
        String greeting = getUserGreeting(inputName);
        System.out.println(greeting);
        wait(2000);

        startGame(args);
    }

    public static void wait(int ms)
    {
        try
        {
            Thread.sleep(ms);
        }
        catch(InterruptedException ex)
        {
            Thread.currentThread().interrupt();
        }
    }

    public static String getUserGreeting(String name) {
        return "Welcome, " + name + ", let's get you started with your adventure.";
    }

    public static void startGame(String[] args) {
        boolean playAgain = true;
        MiniAdventureGame game = new MiniAdventureGame();

        while (playAgain) {
            game.main(args);

            System.out.println("Would you like to play again? (yes/no)");
            String playChoice = scanner.next();

            if (playChoice.equalsIgnoreCase("no")) {
                playAgain = false;
            }
        }

        System.out.println("May we meet again in another adventure, dear adventurer.");
        wait(2000);
        System.out.println("Thank you for playing!");
    }

}