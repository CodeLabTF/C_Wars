package Array2D;

public class Array2D {

    public static void main(String[] args) {
        int[][] arr = fillArray(5, 8);
        for (int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[][] fillArray(int m, int n) {
        int[][] arr = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || j == 0 || i == m - 1 || j == n - 1) {  // first and last row and column
                    arr[i][j] = 1;
                } else if (i == 1 || j == 1 || i == m - 2 || j == n - 2) {  // second and second-last row and column
                    arr[i][j] = 2;
                } else if (i == 2 || j == 2 || i == m - 3 || j == n - 3) {  // third and third-last row and column
                    arr[i][j] = 3;
                } else if (i == 3 || j == 3 || i == m - 4 || j == n - 4) {  // fourth and fourth-last row and column
                    arr[i][j] = 4;
                } else if (i == 4 || j == 4 || i == m - 5 || j == n - 5) {  // fifth and fifth-last row and column
                    arr[i][j] = 5;
                } else {  // all other elements
                    arr[i][j] = 0;
                }
            }
        }
        return arr;
    }
}