public abstract class AiPlayer
{
    protected int ROWS = Board.ROWS;
    protected int COLS = Board.COLS;

    protected Cell[][] cells;
    protected CellState myState;
    protected CellState oppState;

    public AiPlayer(Board board)
    {
        cells = board.cells;
    }

    public void setMyState(CellState state)
    {
        this.myState = state;
        oppState = (myState == CellState.X) ? CellState.O : CellState.X;
    }

    /**
     * movement function to be implemented by subclasses
     * @return an int array of (row, col)
     */
    abstract int[] move();
}
