class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set<Character> seen;
        for(int i = 0; i < 9; i++){
            seen = new HashSet<>();
            for(int j = 0; j < 9; j++){
                if(board[i][j] == '.') continue;
                int num_to_check = board[i][j] - '0';
                if(seen.contains(board[i][j])) return false;
                seen.add(board[i][j]);
            }
        }

        for(int i = 0; i < 9; i++){
            seen = new HashSet<>();
            for(int j = 0; j < 9; j++){
                if(board[j][i] == '.') continue;
                if(seen.contains(board[j][i])) return false;
                seen.add(board[j][i]);
            }
        }

        for(int i = 0; i < 9; i++){
            seen = new HashSet<>();
            for(int j = 0; j < 3; j++){
                for(int k = 0; k < 3; k++){
                    int row = (i / 3) * 3 + j;
                    int col = (i % 3) * 3 + k;
                    if(board[row][col] == '.') continue;
                    if(seen.contains(board[row][col])) return false;
                    seen.add(board[row][col]);
                }
            }
        }
        return true;
    }
}
