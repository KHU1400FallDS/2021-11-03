public class TwoDimensionalArray {
    public static void main(String[] args) {
        int[][] byRow = new int[][]{{8, 5, 6, 4},
                                    {3, 2, 10, 6},
                                    {3, 5, 1, 8}};

        int[][] byColumn = new int[][]{{8, 3, 3},
                                       {5, 2, 5},
                                       {6, 10, 1},
                                       {4, 6, 8}};

        for (int column = 0; column < 4; column++) {
            for (int row = 0; row < 3; row++) {
                System.out.print(byRow[row][column] + "\t");
            }

            System.out.println();
        }
    }
}
