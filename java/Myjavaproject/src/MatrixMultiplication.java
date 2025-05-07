public class MatrixMultiplication {
    public static void main(String[] args) {

        int[][] num = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] num1 = {{3, 4, 2,}, {4, 3, 2}, {7, 6, 5}};
        int[][] Result = new int[3][3];

        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num1.length; j++) {
                for (int k = 0; k < 3; k++) {
                    Result[i][j] += num[i][k] * num1[k][j];
                }
            }
        }
        System.out.println("Product of 2 matrices : ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {

                System.out.print(Result[i][j] + " ");
            }
            System.out.println();

        }
    }
}
