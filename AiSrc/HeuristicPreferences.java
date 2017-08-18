public class HeuristicPreferences extends AiPlayer
{
    private int[][] prefferedMoves = {{1, 1}, {0, 0}, {0, 2}, {2, 0}, {2, 2}, {0, 1}, {1, 0}, {1, 2}, {2, 1}};

    public HeuristicPreferences(Board board)
    {
        super(board);
    }

    public int[] move()
    {
        for (int[] move: prefferedMoves)
        {
            if (cells[move[0]][move[1]].getContent() == CellState.EMPTY)
            {
                return move;
            }
        }
        assert false : "Bug! No empty cells???"; //Should NEVER trigger -- purely for bug catching
        return null;
    }

}
