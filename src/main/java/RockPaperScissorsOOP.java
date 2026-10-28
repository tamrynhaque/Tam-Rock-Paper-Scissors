import java.util.InputMismatchException;

public class RockPaperScissorsOOP {

    public static void main(String[] args) {
        System.out.println("---Welcome to ROCK-PAPER-SCISSORS---");
        start();
    }

    public static void start(){
        System.out.print("Enter you name: ");
        String name = Game.sc.nextLine();
        int rounds;
        while (true){
            System.out.print("How many rounds would you like to play? ");
            try {
                rounds = Integer.parseInt(Game.sc.nextLine().trim());
                if (rounds <= 0){
                    System.out.println("Alright bye...");
                    System.exit(67);
                }
                break;
            } catch (NumberFormatException e) {
                System.out.println("Dude just pick a normal number..");
            }
        }
        Game game = new Game(name, rounds);
        game.playGame();
    }

    public static void quitOrContinue(){
        System.out.println("Would you like to try again?");
        System.out.print("Type \"Yes\" to restart or anything else to quit: ");
        String answer = Game.sc.nextLine().toUpperCase();
        if (answer.equals("YES")){
            System.out.println("Let's goooooo");
            start();
        } else {
            System.exit(67);
        }
    }
}
