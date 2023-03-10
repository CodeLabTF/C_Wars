package Array2D;

public class Array2D {

    public static void main(String[] args) {
        int[][] arr = fillArray(8, 8);
        for (int x = 0; x < arr.length; x++){
            for(int y = 0; y < arr[0].length; y++){
                System.out.print(arr[x][y] + " ");
            }
            System.out.println();
        }
    }

    public static int[][] fillArray(int m, int n) {
        int[][] arr = new int[m][n];

        for (int x = 0; x < m; x++) {
            for (int y = 0; y < n; y++) {
                if (x == 0 || y == 0 || x == m - 1 || y == n - 1) {  // first and last row and column
                    arr[x][y] = 1;
                } else if (x == 1 || y == 1 || x == m - 2 || y == n - 2) {  // second and second-last row and column
                    arr[x][y] = 2;
                } else if (x == 2 || y == 2 || x == m - 3 || y == n - 3) {  // third and third-last row and column
                    arr[x][y] = 3;
                } else if (x == 3 || y == 3 || x == m - 4 || y == n - 4) {  // fourth and fourth-last row and column
                    arr[x][y] = 4;
                } else if (x == 4 || y == 4 || x == m - 5 || y == n - 5) {  // fifth and fifth-last row and column
                    arr[x][y] = 5;
                } else {  // all other elements
                    arr[x][y] = 0;
                }
            }
        }
        return arr;
    }
}