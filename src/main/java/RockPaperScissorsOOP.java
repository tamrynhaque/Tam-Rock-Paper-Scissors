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
                rounds = Integer.parseInt(Game.sc.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Dude just pick a number");
            }
        }
        Game game = new Game(name, rounds);
        game.playGame();
    }

    public static void quitOrContinue(){
        System.out.println("Would you like to try again?");
        System.out.print("Type \"Yes\" to restart or anything else to quit: ");
        String answer = Game.sc.next().toUpperCase();
        if (answer.equals("YES")){
            start();
        } else {
            System.exit(67);
        }
    }
}
