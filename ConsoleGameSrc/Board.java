public class Board
{
    public static final int ROWS = 3;
    public static final int COLS = 3;

    Cell[][] cells;
    int currentRow, currentCol;

    public Board()
    {
        cells = new Cell[ROWS][COLS];

        for (int row = 0; row < ROWS; row++) {
            for (int col = 0; col < COLS; col++) {
                cells[row][col] = new Cell(row, col);
            }
        }
    }

    public void initialize()
    {
        for (int row = 0; row < ROWS; row++) {
            for (int col = 0; col < COLS; col++) {
                cells[row][col].clear();
            }
        }
    }

    public boolean isDraw()
    {
        for (int row = 0; row < ROWS; row++) {
            for (int col = 0; col < COLS; col++) {
                if (cells[row][col].getContent() == CellState.EMPTY) {
                    return false;
                }
            }
        }
        return true;
    }

    public boolean hasWon(CellState theState)
    {
        return (
                cells[currentRow][0].getContent() == theState       // Current row has a win
                    && cells[currentRow][1].getContent() == theState
                    && cells[currentRow][2].getContent() == theState
                || cells[0][currentCol].getContent() == theState    // Current col has a win
                    && cells[1][currentCol].getContent() == theState
                    && cells[2][currentCol].getContent() == theState
                || cells[0][0].getContent() == theState             // Main diagonal has a win
                    && cells[1][1].getContent() == theState
                    && cells[2][2].getContent() == theState
                || cells[0][2].getContent() == theState             // Off diagonal has a win
                    && cells[1][1].getContent() == theState
                    && cells[2][0].getContent() == theState
                );
    }

    public void paint()
    {
        for (int row = 0; row < ROWS; row++){
            for (int col = 0; col < COLS; col++){
                cells[row][col].paint();
                if (col < COLS - 1)
                {
                    System.out.print("|");
                }
            }
            System.out.println();
            if (row < ROWS -1)
            {
                System.out.println("-----------");
            }
        }
    }
}
