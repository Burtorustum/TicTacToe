public class Board
{
    /**
     * Declarations
     */

    private enum State {Blank, X, O};
    private State[][] boardState;

    /**
     * Constructor(s)
     */

    //Default
    public Board()
    {
        boardState = new State[3][3];
    }

    /**
     * Functions
     */

    public void initialize()
    {

    }

    public void placePiece(int xCoord, int yCoord, State piece)
    {
        boardState[xCoord][yCoord] = piece;
    }

    /**
     * Coordinate Reference
     * |-----------------|
     * |(0,0)|(0,1)|(0,2)|
     * |-----------------|
     * |(1,0)|(1,1)|(1,2)|
     * |-----------------|
     * |(2,0)|(2,1)|(2,2)|
     * |-----------------|
     */

    public State[][] getBoardState()
    {
        return boardState;
    }
}
