public class Calculation {

    public int i = 1;

    public static void main(String[] args) {
        hello();
        int[][] A = {{1, 2, 3}, {3, 4, 5}};
        int[][] B = {{5, 6, 7}, {4, 5, 9}};
        int[][] C = {{5, 6, 7}, {4, 5, 9}};
        int[][] D = {{5, 6,}, {4, 5,}, {2, 3}};
        print(A);
        print(B);
        print(C);
        print(D);
        print(add(A, B));
        print(multiply(A, B));
        print(multiply(C, D));

    }

    public static int[][] multiply(int[][] a, int[][] b) {
        int[][] arr = new int[a.length][b[0].length];
        if (a.length != b[0].length) {
            System.out.println("A and B can't be multiplied.");
            arr = null;
        } else {
            for (int i = 0; i < a.length; i++) {
                for (int j = 0; j < b[0].length; j++) {
                    for (int k = 0; k < b.length; k++) {
                        arr[i][j] += a[i][k] * b[k][j];
                    }
                }
            }
        }
        return arr;
    }

    public static void hello() {
        System.out.println("Welcome to Linear Algebra!");

    }

    public static int[][] add(int[][] a, int[][] b) {
        int[][] result = new int[a.length][a[0].length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                result[i][j] = a[i][j] + b[i][j];
            }
        }
        return result;
    }

    public static void print(int[][] arr) {
        if (arr != null) {
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[0].length; j++) {
                    System.out.printf("%d ", arr[i][j]);
                }
                System.out.println();
            }
        }
        System.out.println();
    }
}
