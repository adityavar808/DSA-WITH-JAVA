public class sudukoSolver {
    public static void main(String[] args) {
        int[][] grid = { { 3, 0, 6, 5, 0, 8, 4, 0, 0 },
                { 5, 2, 0, 0, 0, 0, 0, 0, 0 },
                { 0, 8, 7, 0, 0, 0, 0, 3, 1 },
                { 0, 0, 3, 0, 1, 0, 0, 8, 0 },
                { 9, 0, 0, 8, 6, 3, 0, 0, 5 },
                { 0, 5, 0, 0, 9, 0, 6, 0, 0 },
                { 1, 3, 0, 0, 0, 0, 2, 5, 0 },
                { 0, 0, 0, 0, 0, 0, 0, 7, 4 },
                { 0, 0, 5, 2, 0, 6, 3, 0, 0 } };

        solver(grid, 0, 0);
    }

    public static void solver(int[][] grid, int row, int col) {
        if (col == 9) {
            col = 0;
            row++;
        }
        if (row == 9) {
            Display(grid);
            return;
        }
        if (grid[row][col] != 0) {
            solver(grid, row, col + 1);
        } else {
            for (int val = 1; val <= 9; val++) {
                if (isItSafe(grid, row, col, val)) {
                    grid[row][col] = val;
                    solver(grid, row, col + 1);
                    grid[row][col] = 0;
                }
            }
        }
    }

    public static boolean isItSafe(int[][] grid, int row, int col, int val) {
        // col
        for (int i = 0; i <= 9; i++) {
            if (grid[i][col] == val) {
                return false;
            }
        }
        // row
        for (int i = 0; i <= 9; i++) {
            if (grid[row][i] == val) {
                return false;
            }
        }

        // Check 3x3 subgrid
        int startRow = row - row % 3;
        int startCol = col - col % 3;

        for (int i = startRow; i < startRow + 3; i++) {
            for (int j = startCol; j < startCol + 3; j++) {
                if (grid[i][j] == val) {
                    return false;
                }
            }
        }

        return true;
    }

    public static void Display(int[][] grid) {
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                System.out.print(grid[i][j] + " ");
            }
            System.out.println();
        }
    }
}
