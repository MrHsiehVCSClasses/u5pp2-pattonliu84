package u5pp;

public class Rook extends ChessPiece {
    public Rook(ChessPiece[][] board, int row, int col, boolean isWhite) {
        super(board, row, col, isWhite);
    }

    public boolean canMoveTo(int row, int col) {
        if (row < 0 || row >= board.length || col < 0 || col >= board[0].length || (row == this.row && col == this.col)) {
            return false;
        }

        // Check if the rook is moving vertically
        if (this.col == col) {
            int rowInc = (row - this.row) / Math.abs(row - this.row);
            int currRow = this.row + rowInc;

            while (currRow != row) {
                if (board[currRow][col] != null) {
                    return false;
                }
                currRow += rowInc;
            }
        }

        // Check if the rook is moving horizontally
        else if (this.row == row) {
            int colInc = (col - this.col) / Math.abs(col - this.col);
            int currCol = this.col + colInc;

            while (currCol != col) {
                if (board[row][currCol] != null) {
                    return false;
                }
                currCol += colInc;
            }
        }

        // Rook can only move vertically or horizontally
        else {
            return false;
        }

        if (board[row][col] == null || board[row][col].isWhite != this.isWhite) {
            return true;
        }
        return false;
    }

    public String toString() {
        if (isWhite == false) {
            return "r";
        } else {
            return "R";
        }
    }
}
