package leetcode;

import java.util.HashMap;

/**
 * Created by ray on 1/3/17.
 */
public class Q36ValidSudoku {
    public class Solution {
        public boolean isValidSudoku(char[][] board) {

            int len = board.length;
            for(int i=0;i<board.length;i++) {
                HashMap<Character, Integer> hashcol = new HashMap<>();
                for(int j=0;j<board[i].length;j++) {
                    if(board[i][j] != '.') {
                        if(!hashcol.containsKey(board[i][j])) {
                            hashcol.put(board[i][j], 1);
                        } else {
                            return false;
                        }
                    }
                }
            }

            for(int j=0;j<board[0].length;j++) {
                HashMap<Character, Integer> hashcol = new HashMap<>();
                for(int i=0;i<board.length;i++) {
                    if(board[i][j] != '.') {
                        if(!hashcol.containsKey(board[i][j])) {
                            hashcol.put(board[i][j], 1);
                        } else {
                            return false;
                        }
                    }
                }
            }

            for(int k=0;k<3;k++) {
                for(int z=0;z<3;z++) {
                    HashMap<Character, Integer> hashcol = new HashMap<>();
                    for (int i = 0; i < 3; i++) {
                        for (int j = 0; j < 3; j++) {
                            if (board[i + k * 3][j + z * 3] != '.') {
                                if (!hashcol.containsKey(board[i + k * 3][j +z * 3])) {
                                    hashcol.put(board[i + k * 3][j + z * 3], 1);
                                } else {
                                    return false;
                                }
                            }
                        }

                    }
                }
            }
            return true;
        }
    }
}
