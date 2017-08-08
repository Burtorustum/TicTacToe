public class Board
{
    /**
     * Declarations
     */

    private char[][] boardState;

    /**
     * Constructor(s)
     */

    //Default
    public Board()
    {
        boardState = new char[3][3];
    }

    /**
     * Functions
     */

    public void placePiece(int xCoord, int yCoord)
    {

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

    public char[][] getBoardState() {
        return boardState;
    }
}
