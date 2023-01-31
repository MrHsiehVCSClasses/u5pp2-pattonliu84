package u5pp;

public class Knight extends ChessPiece {
    public Knight(ChessPiece[][] board, int row, int col, boolean isWhite) {
        super(board, row, col, isWhite);
    }

    public boolean canMoveTo(int row, int col) {
        if (row < 0 || row >= board.length || col < 0 || col >= board[0].length || (row == this.row && col == this.col)) {
            return false;
        }
        int rowDiff = Math.abs(this.row - row);
        int colDiff = Math.abs(this.col - col);
        if ((rowDiff == 2 && colDiff == 1) || (rowDiff == 1 && colDiff == 2)) {
            if (board[row][col] == null || board[row][col].isWhite != this.isWhite) {
                return true;
            }
        }
        return false;
    }

    public String toString() {
        if (isWhite == false) {
            return "n";
        } else {
            return "N";
        }
    }
}
