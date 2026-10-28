public class RockPaperScissorsOOP {

    public static void main(String[] args) {
        System.out.println("---Welcome to ROCK-PAPER-SCISSORS---");
        start();
    }

    public static void start(){
        Game game = new Game(Game.getName(), Game.getRounds());
        game.playGame();
    }

}
