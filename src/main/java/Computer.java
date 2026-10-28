class Computer extends Player{

    public void makeMove(){
        Move[] moves = Move.values();
        Move randomMove = moves[(int) ((Math.random()*3))];
        System.out.println("The Computer chose "+randomMove);
        setCurrentMove(randomMove);
    }
}
