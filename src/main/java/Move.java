public enum Move {
    ROCK, PAPER, SCISSORS;

    public boolean beats(Move compM){
        return (this == ROCK && compM == SCISSORS) ||
                (this == PAPER && compM == ROCK) ||
                (this == SCISSORS && compM == PAPER);
    }
}
