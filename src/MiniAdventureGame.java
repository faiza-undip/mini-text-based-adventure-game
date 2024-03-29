import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class MiniAdventureGame {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Welcome to the mini text-based adventure game!");
        wait(1000);
        System.out.println("You find yourself in a mysterious forest.");
        wait(1000);
        System.out.println("What will you do? ");
        wait(1000);

        exploreForest();
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
    public static void exploreForest() {
        wait(1000);
        System.out.println("1. Look around");
        System.out.println("2. Walk deeper into the forest");
        System.out.println("3. Quit");

        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.println("You look around and see a path to the north.");
                exploreForest();
                break;
            case 2:
                System.out.println("You walk deeper into the forest...");
                encounterEnemy();
                break;
            case 3:
                System.out.println("You quitted the game.");
                wait(1000);

                break;
            default:
                System.out.println("Invalid choice. Please try again.");
                exploreForest();
                break;
        }
    }

    public static void encounterEnemy() {
        wait(1000);
        System.out.println("When you're walking deeper into the forest...");
        wait(1000);

        System.out.println("A sudden chill fills the air, sending shivers down your spine.");
        wait(1000);

        System.out.println("The once tranquil ambiance is now cloaked in an eerie silence, broken only by the rustling of leaves underfoot.");
        wait(2000);

        System.out.println(".......");
        wait(3000); // longer time delay for dramatic effects

        System.out.println(".......!!!");
        wait(1000);

        System.out.println("Your heart quickens as you sense a presence lurking nearby.");
        wait(3000);

        System.out.println("Suddenly, a deafening roar echoes through the trees, causing birds to scatter from their perches.");
        wait(3000);

        System.out.println("You turn slowly, and there, before you, stands a behemoth of legend—a dragon, its scales a fiery hue of crimson, reflecting the dancing flames that flicker from its maw.");
        wait(3000);
        System.out.println("As you stand face to face with this formidable creature, a fight or flight instinct awakens within you.");
        wait(3000);
        System.out.println("Will you summon the courage to stand your ground and face the beast in battle, or will you heed the pounding of your heart and flee into the safety of the shadows?");
        wait(3000);
        System.out.println("The choice is yours, but remember—the fate of your adventure hangs in the balance.");

        System.out.println("What will you do? ");
        wait(1000);
        System.out.println("1. Fight");
        System.out.println("2. Run");

        int choice = scanner.nextInt();

        switch(choice) {
            case 1:
                System.out.println("You chose to engage in battle.");
                wait(3000);

                System.out.println("With a courage born of desperation, you square off against the towering beast, your weapon drawn and your resolve unyielding. ");
                wait(3000);

                System.out.println("The dragon's fiery breath engulfs you in searing heat, but you press on, determined to face the ultimate challenge.");
                wait(3000);

                System.out.println("Dodging and weaving through the inferno, you strike with precision, each blow landing with the force of destiny.");
                wait(3000);

                System.out.println("The dragon bellows in defiance, but you stand your ground, your determination unshakeable.");
                wait(5000);

                System.out.println("In a climactic clash of steel and scale, you deliver the decisive blow, your weapon finding its mark with a resounding impact.");
                wait(3000);

                System.out.println("With a deafening roar, the dragon staggers, its once-mighty form faltering before you.");
                wait(3000);

                System.out.println("As the dust settles and the smoke clears, you stand victorious, the vanquished dragon at your feet.");
                wait(3000);
                System.out.println("With a triumphant shout, you raise your weapon high, a beacon of hope amidst the chaos—a true hero, forged in the fires of battle.");
                wait(5000);

                System.out.println("\n");
                System.out.println("...Congratulations, hero! You have reached the true good ending by slaying the dragon.");
                wait(3000);
                System.out.println("Your bravery, determination, and your heart of a warrior have saved the forest and nearby village from a certain destruction.");
                wait(3000);
                System.out.println("Ending 1 Unlocked - A True Hero");

                break;
            case 2:
                System.out.println("You chose to run away from the fire-breathing monster.");
                wait(2000);

                System.out.println("You may not have the courage to face your greatest fear, but at least you are clever and quick on your feet.");
                wait(2000);

                System.out.println("Because of your quick thinking, you are saved from the wrath of the dragon.");
                wait(2000);

                System.out.println("And you may live another day, safe and sound.");
                wait(2000);
                System.out.println("Ending 2 Unlocked - A Sensible Traveller");

                break;
            default:
                System.out.println("Invalid choice. Please try again.");
                encounterEnemy();
                break;
        }
    }
}
