import java.util.Scanner;

class Human extends Player{

    private String name;

    public Human(String name){
        if (name.isEmpty()){
            this.name = "Player";
        } else {
            this.name = name;
        }
    }

    public String getName(){return name;}

    public void makeMove(){
        String input;
        while (true){
            System.out.print("Enter your move (ROCK, PAPER, SCISSORS): ");
            input = Game.sc.nextLine().trim().toUpperCase();
            try {
                System.out.println(name+" chose "+Move.valueOf(input));
                setCurrentMove(Move.valueOf(input));
                break;
            } catch (IllegalArgumentException e) {
                System.out.println("Bad input! Try again.");
            }
        }

    }
}
