class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<Character> set = new HashSet<>();
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (set.contains(board[i][j])) {
                    return false;
                } else if (board[i][j] != '.') {
                    set.add(board[i][j]);
                }
            }
            set.clear();
        }

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (set.contains(board[j][i])) {
                    return false;
                } else if (board[j][i] != '.') {
                    set.add(board[j][i]);
                }
            }
            set.clear();
        }

        for (int boxRow = 0; boxRow < 9; boxRow =boxRow+ 3) {
            for (int boxColumn = 0; boxColumn < 9; boxColumn =boxColumn+ 3) {
                for (int i = boxRow; i < boxRow + 3; i++) {
                    for (int j = boxColumn; j < boxColumn + 3; j++) {
                        if (set.contains(board[i][j])) {
                            return false;
                        } else if (board[i][j] != '.') {
                            set.add(board[i][j]);
                        }
                    }
                }
                set.clear();
            }
        }
        return true;
    }
}

