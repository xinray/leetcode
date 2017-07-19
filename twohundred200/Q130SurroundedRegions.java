package leetcode.twohundred200;

/**
 * Created by ray on 7/19/17.
 */
public class Q130SurroundedRegions {
    public void solve(char[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if ((i == 0 || i == board.length-1 || j == 0 || j == board[i].length-1) && (board[i][j] == 'O')) {
                    board[i][j] = 'M';
                    connected(i, j, board);
                }
            }
        }
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] == 'O'){
                    board[i][j] = 'X';
                }
                if (board[i][j] == 'M'){
                    board[i][j] = 'O';
                }
            }
        }
    }

    public void connected(int i,int j, char[][] board) {
        if (i-1 > 0 && board[i-1][j] == 'O') {
            board[i-1][j] = 'M';
            connected(i-1, j, board);
        }

        if (i+1 <board.length-1 && board[i+1][j] == 'O') {
            board[i+1][j] = 'M';
            connected(i+1, j, board);
        }
        if (j+1 <board[i].length-1 && board[i][j+1] == 'O') {
            board[i][j+1] = 'M';
            connected(i, j+1, board);
        }
        if (j-1 >0 && board[i][j-1] == 'O') {
            board[i][j-1] = 'M';
            connected(i, j-1, board);
        }
    }
}
