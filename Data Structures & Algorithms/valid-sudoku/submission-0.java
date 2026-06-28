class Solution {

    public boolean isValidSudoku(char[][] board) {

        HashSet<String> set = new HashSet<>();

        for (int row = 0; row < 9; row++) {

            for (int col = 0; col < 9; col++) {

                if (board[row][col] == '.') {
                    continue;
                }

                char digit = board[row][col];

                String rowKey = digit + "row" + row;
                String colKey = digit + "col" + col;
                String boxKey = digit + "box" + (row / 3) + (col / 3);

                if (set.contains(rowKey) ||
                    set.contains(colKey) ||
                    set.contains(boxKey)) {

                    return false;
                }

                set.add(rowKey);
                set.add(colKey);
                set.add(boxKey);
            }
        }

        return true;
    }
}