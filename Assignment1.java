
class Assignment1 {
    static void transpose(int[][] mat) {
        int rows = mat.length;
        int cols = mat[0].length;

        System.out.println("Transposed");
        
        for (int i = 0; i < cols; i++) {
            for (int j = 0; j < rows; j++) {
                System.out.print(mat[j][i] + " ");
            }
            System.out.println();
        }
    }

    static void rotate(int[][] mat) {
        System.out.println("Clockwise Rotate");

        for (int j = 0; j < 2; j++) {
            for (int i = 1; i >= 0; i--) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void multiply(int[][] A, int[][] B) {
        int[][] result = new int[3][4];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                for (int k = 0; k < 2; k++) {
                    result[i][j] += A[i][k] * B[k][j];
                }
            }
        }

        System.out.println("Multi");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void flip(int[][] mat) {
        System.out.println("Fliped");
        for (int i = 0; i < mat.length; i++) {
            for (int j = mat[0].length-1; j >= 0; j--) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        int[][] mat = {
                {1, 2},
                {3, 4}
        };

        transpose(mat);
        rotate(mat);
        flip(mat);

        int[][] A = {
                {1, 2},
                {3, 4},
                {5, 6}
        };
        int[][] B = {
                {1, 2, 3, 4},
                {5, 6, 7, 8}
        };
        multiply(A, B);
    }
}
