public class Player
{
    /**
     * Declarations
     */

    private static int number = 0;
    private String name;
    private char boardPiece;

    /**
     * Constructor(s)
     */

    public Player(String name, char boardPiece)
    {
        this.name = name;
        this.boardPiece = boardPiece;
    }

    /**
     * Functions
     */

    public String getName()
    {
        return name;
    }

    public char getBoardPiece()
    {
        return boardPiece;
    }
}
