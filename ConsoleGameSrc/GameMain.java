import java.util.Scanner;

public class GameMain
{
    private Board board;
    private GameState currentState;
    private CellState currentPlayer;

    private static Scanner reader = new Scanner(System.in);

    public GameMain()
    {
        board = new Board();

        initializeGame();

        do
        {
            playerMove(currentPlayer);
            board.paint();
            updateGame(currentPlayer);

            if (currentState == GameState.DRAW)
            {
                System.out.println("It's a Draw!");
            }
            else if (currentState == GameState.X_WIN)
            {
                System.out.println("X Wins!");
            }
            else if (currentState == GameState.O_WIN)
            {
                System.out.println("O Wins!");
            }

            currentPlayer = (currentPlayer == CellState.X) ? CellState.O : CellState.X;
        }
        while ( currentState == GameState.IN_PROGRESS);
    }

    public void initializeGame()
    {
        board.initialize();
        currentPlayer = CellState.X;
        currentState = GameState.IN_PROGRESS;
    }

    public void playerMove(CellState theState)
    {
        boolean isValidInput = false;
        do
        {
            if (theState == CellState.X)
            {
                System.out.println("X please input a move. (row[1-3] column[1-3]):");
            }
            else
            {
                System.out.println("O please input a move. (row[1-3] column[1-3]):");
            }
            int row = reader.nextInt() - 1;
            int col = reader.nextInt() - 1;

            if (row >= 0 && col >= 0 && row < Board.ROWS && col < Board.COLS && board.cells[row][col].getContent() == CellState.EMPTY)
            {
                board.cells[row][col].setContent(theState);
                board.currentCol = col;
                board.currentRow = row;
                isValidInput = true;
            }
            else
            {
                System.out.println("This move at (" + (row + 1) + "," + (col + 1) + ") is not valid. Try again...");
            }
        }
        while (isValidInput == false);
    }

    public void updateGame(CellState theState)
    {
        if (board.hasWon(theState))
        {
            currentState = (theState == CellState.X) ? GameState.X_WIN : GameState.O_WIN;
        }
        else if (board.isDraw())
        {
            currentState = GameState.DRAW;
        }
    }

    public static void main(String [] args)
    {
        new GameMain();
    }
}