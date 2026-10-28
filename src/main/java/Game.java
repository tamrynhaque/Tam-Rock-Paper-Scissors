import java.util.Scanner;

class Game {
    private Human human;
    private Computer computer;
    private int rounds;
    public static Scanner sc = new Scanner(System.in);

    public Game(String humanName, int rounds){
        this.human = new Human(humanName);
        this.computer = new Computer();
        this.rounds = rounds;
    }

    public void playGame(){

        for (int i = 1; i<(rounds+1); i++){
            System.out.println("Round "+i);
            human.makeMove();
            computer.makeMove();

            Move humanMove = human.getCurrentMove();
            Move computerMove = computer.getCurrentMove();

            if (humanMove == computerMove){
                System.out.println("Draw");
            } else if (humanMove.beats(computerMove)){
                System.out.println(human.getName()+" won this round...");
                human.incrementScore();
            } else {
                System.out.println("Computer won this round... :(");
                computer.incrementScore();
            }

            System.out.println("Current scores -> "+human.getName()+": "+human.getScore()+" | Computer: "+computer.getScore());
        }

        System.out.println("After round "+rounds+": "+calculateWinner(human, computer));
        RockPaperScissorsOOP.quitOrContinue();
    }

    public String calculateWinner(Human human, Computer computer){
        if (human.getScore() == computer.getScore()){
            return "It's a draw...";
        } else if (human.getScore() < computer.getScore()){
            return "The Computer has defeated you :(";
        } else {
            return (human.getName().toUpperCase()+" HAS WON! Congratulations RNG has favoured you!");
        }
    }
}
