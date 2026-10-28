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

            if (human.getCurrentMove() == computer.getCurrentMove()){
                System.out.println("Draw");
            } else if (human.getCurrentMove().beats(computer.getCurrentMove())){
                System.out.println(human.getName()+" won this round...");
                human.incrementScore();
            } else {
                System.out.println("Computer won this round... :(");
                computer.incrementScore();
            }

            System.out.println("Current scores -> "+human.getName()+": "+human.getScore()+" | Computer: "+computer.getScore());
        }

        System.out.println("After round "+rounds+": "+calculateWinner(human, computer));
        quitOrContinue();
    }

    static int getRounds(){
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
        return rounds;
    }

    static String getName(){
        System.out.print("Enter your name: ");
        return Game.sc.nextLine();
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

    public static void quitOrContinue(){
        System.out.println("Would you like to try again?");
        System.out.print("Type \"Yes\" to restart or anything else to quit: ");
        String answer = Game.sc.nextLine().toUpperCase();
        if (answer.equals("YES")){
            System.out.println("Let's goooooo");
            RockPaperScissorsOOP.start();
        } else {
            System.exit(67);
        }
    }
}
