class Player {

    private int score;
    private Move currentMove;

    public Player(){
        this.score = 0;
    }

    public int getScore(){return score;}
    public void incrementScore(){score++;}

    public void setCurrentMove(Move move){
        this.currentMove = move;
    }
    public Move getCurrentMove(){
        return currentMove;
    }
}
