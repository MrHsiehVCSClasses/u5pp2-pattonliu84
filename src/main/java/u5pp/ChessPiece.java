package u5pp;

public class ChessPiece {

    ChessPiece[][] board; 
    int row;
    int col;
    boolean isWhite;
    boolean hasMoved;

    public ChessPiece(ChessPiece[][] board, int row, int col, boolean isWhite){
        this.board = board;
        this.row = row;
        this.col = col;
        this.isWhite = isWhite;
    }


    public ChessPiece[][] getBoard(){
        return board;
    }
    public int getRow(){
        return row;
    }
    public int getColumn(){
        return col;
    }
    public boolean getIsWhite(){
        return isWhite;
    }

    public boolean canMoveTo(int row, int col){
        return true;
    }
    //moves to the specified space
    public void moveTo(int row, int col){
        board[row][col] = board[this.row][this.col];
        board[this.row][this.col] = null;
        this.row = row;
        this.col = col;
    }
    
    public String toString(){
        return "Row:" + row + "column: " + col;
    }
}
