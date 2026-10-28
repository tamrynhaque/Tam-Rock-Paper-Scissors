import java.util.Scanner;

class Human extends Player{

    private String name;

    public Human(String name){
        this.name = name;
    }

    public String getName(){return name;}

    public void makeMove(){
        while (true){
            System.out.print("Enter your move (ROCK, PAPER, SCISSORS): ");
            String input = Game.sc.next().trim().toUpperCase();
            try {
                setCurrentMove(Move.valueOf(input));
                System.out.println(name+" chose "+Move.valueOf(input));
                break;
            } catch (IllegalArgumentException e) {
                System.out.println("Bad input! Try again.");
            }
        }
    }
}
