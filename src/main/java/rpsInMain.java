import java.util.HashMap;
import java.util.Scanner;

public class rpsInMain {

    static Scanner sc = new Scanner(System.in);
    static HashMap<Integer, String> moveMap = new HashMap<>();

    public static void main(String[] args){
        moveMap.put(1, "rock");
        moveMap.put(2, "paper");
        moveMap.put(3, "scissors");
        System.out.println("Welcome to Rock Paper Scissors!");
        playGame();
    }

    public static void playGame(){
        System.out.println("Please enter your move (rock, paper, scissors): ");
        String humanMove;
        int computerMove;
        humanMove = sc.next().toLowerCase();
        computerMove = (int)((Math.random() * 3)+1);
        scoreGame(humanMove, computerMove);
    }

    public static void scoreGame(String hM, int cM){
        if (hM.equals(moveMap.get(cM))){
            System.out.println("Draw, run again");
            playGame();
        } else if (hM.equals("rock")) {
            if (moveMap.get(cM).equals("paper")){
                System.out.println("You lose. Do you wish to replay?");
                continueOrQuitGame();
            } else {
                System.out.println("You win! Do you wish to replay?");
                continueOrQuitGame();
            }
        } else if (hM.equals("paper")) {
            if (moveMap.get(cM).equals("scissors")) {
                System.out.println("You lose. Do you wish to replay?");
                continueOrQuitGame();
            } else {
                System.out.println("You win! Do you wish to replay?");
                continueOrQuitGame();
            }
        } else if (hM.equals("scissors")) {
            if (moveMap.get(cM).equals("rock")) {
                System.out.println("You lose. Do you wish to replay?");
                continueOrQuitGame();
            } else {
                System.out.println("You win! Do you wish to replay?");
                continueOrQuitGame();
            }
        }
    }

    public static void continueOrQuitGame(){
        System.out.println("Y/N to replay or quit");
        String choice = sc.next().toUpperCase();
        if (choice.equals("Y")){
            playGame();
        } else {
            System.exit(67);
        }
    }
}
