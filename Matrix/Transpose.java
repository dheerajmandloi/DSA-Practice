package Matrix;

public class Transpose {
    public static void main(String[] args) {
        int arr[][] = { { 1, 2 }, { 3, 4 } };

        int arr3[][] = sum(arr);

        for (int i = 0; i < arr3.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {

                System.out.print(arr3[i][j] + " ");
            }
            System.out.println();
        }
    }

    static int[][] sum(int arr[][]) {

        int row = arr.length;
        int col = arr[0].length;

        for (int i = 0; i < row; i++) {
            for (int j = i + 1; j < col; j++) {

                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;

            }

        }

        return arr;
    }
}
