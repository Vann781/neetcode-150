class Solution {

    int compare(int targ, int k) {
        return targ - k;
    }

    public boolean searchMatrix(int[][] matrix, int target) {

        int row = matrix.length;
        int column = matrix[0].length;

        int target_row = -1;

        // Find target row
        for (int i = 0; i < row; i++) {

            if (matrix[i][0] == target) {
                return true;
            }

            // Handle last row separately
            if (i == row - 1) {
                if (target >= matrix[i][0]) {
                    target_row = i;
                }
            }
            // Check if target lies between current row and next row
            else if ((target >= matrix[i][0]) &&
                     (target < matrix[i + 1][0])) {
                target_row = i;
                break;
            }
        }

        // Target cannot exist
        if (target_row == -1) {
            return false;
        }

        // Search inside the identified row
        for (int itr = 0; itr < column; itr++) {

            if (matrix[target_row][itr] == target) {
                return true;
            }
        }

        return false;
    }
}