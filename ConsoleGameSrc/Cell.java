public class Cell
{
    private int row, col;
    private CellState content;

    public Cell(int row, int col)
    {
        this.row = row;
        this.col = col;
        clear();
    }

    public void clear()
    {
        content = CellState.EMPTY;
    }

    public void paint()
    {
        switch (content)
        {
            case EMPTY:
                System.out.print("   ");
                break;

            case O:
                System.out.print(" O ");
                break;

            case X:
                System.out.print(" X ");
                break;
        }
    }

    public CellState getContent()
    {
        return content;
    }
    public void setContent(CellState in)
    {
        content = in;
    }
}
