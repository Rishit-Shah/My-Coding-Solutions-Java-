 class Solution {
    public void setZeroes(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        boolean[][] visited = new boolean[rows][cols];  // To keep track of visited cells

        // Traverse the matrix to find zeros
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] == 0 && !visited[i][j]) {
                    // Start DFS from the zero found
                    helperDFS(matrix, visited, i, j);
                }
            }
        }
    }

    // Helper DFS method to propagate zeroes
    public void helperDFS(int[][] matrix, boolean[][] visited, int i, int j) {
        if (i < 0 || i >= matrix.length || j < 0 || j >= matrix[0].length) {
            return;  // Return if out of bounds
        }

        // If the current cell is zero, propagate to its row and column
        for (int k = 0; k < matrix.length; k++) {
            if (matrix[k][j] != 0) {
                visited[k][j] = true;
                matrix[k][j] = 0;  // Zero out column
            }
        }

        for (int k = 0; k < matrix[0].length; k++) {
            if (matrix[i][k] != 0) {
                visited[i][k] = true;
                matrix[i][k] = 0;  // Zero out row
            }
        }
    }
}
