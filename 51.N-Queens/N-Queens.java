
//51. N-Queens
//Time Complexity: O(N!), where N is the number of queens. In the worst case, we have to explore all possible arrangements of queens on the board.
//Space Complexity: O(N^2) for the board and O(N) for the recursionn stack, resulting in O(N^2) overall.        

class N-Queens{

    public List<List<String>> solveNQueens(int n) {
        List<List<String>> res = new ArrayList<>();
        // List<String>temp=new ArrayList<>();
        char[][] board = new char[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = '.';
            }
        }

        nQueens(board, 0, res);
        return res;
    }

    public void nQueens(char[][] board, int row, List<List<String>> res) {
        if (row == board.length) {
            res.add(convert(board));
            return;
        }
        for (int j = 0; j < board.length; j++) {
            if (isSafe(board, row, j)) {
                board[row][j] = 'Q';
                nQueens(board, row + 1, res);
                board[row][j] = '.';
            }
        }

    }

    public boolean isSafe(char[][] board, int row, int col) {
        //verticle up
        for (int i = row - 1; i >= 0; i--) {
            if (board[i][col] == 'Q') {
                return false;
            }
        }

        //left up diagonal
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }

        //right up diagonal
        for (int i = row - 1, j = col + 1; i >= 0 && j < board.length; i--, j++) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }
        return true;
    }

    // Function to convert the board to a list of strings
    public List<String> convert(char[][] board) {
        List<String> temp = new ArrayList<>();
        for (int i = 0; i < board.length; i++) {
            temp.add(new String(board[i]));
        }
        return temp;
    }
}