package Matrix;

public class Addition {
    public static void main(String[] args) {
        int arr[][] = { { 2, 2 }, { 2, 2 } };
        int arr2[][] = { { 3, 3 }, { 3, 3 } };
        int arr3[][] = sum(arr, arr2);

        for (int i = 0; i < arr3.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {

                System.out.print(arr3[i][j] + " ");
            }
            System.out.println();
        }

        // System.out.println();

        // for (int[] i : arr3) {
        // for (int j : i) {
        // System.out.print(j + " ");
        // }
        // System.out.println();
        // }

    }

    static int[][] sum(int arr[][], int arr2[][]) {

        int row = arr.length;
        int col = arr[0].length;

        int arr3[][] = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {

                arr3[i][j] = arr[i][j] + arr2[i][j];
            }
        }

        return arr3;
    }
}
