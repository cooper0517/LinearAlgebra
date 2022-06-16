public class Calculation {

    public int i = 1;

    public static void main(String[] args) {
        int[][] A={{1,2,3},{3,4,5}};
        int[][] B={{5,6,7},{4,5,9}};
        print(add(A,B));
    }


    public static int[][] multiply(int[][] a,int[][]b){
        for (int i = 0; i < a.length; i++) {
            
        }
        int[][] arr = new int [3][3];
        return arr;
    }

    public static void hello() {

    }

    public static int[][] add(int[][] a, int[][] b){
        int[][] result = new int[a.length][a[0].length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                result[i][j]=a[i][j]+b[i][j];
            }
        }
        return result;
    }
    public static void print(int[][] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.printf("%d ",arr[i][j]);
            }
            System.out.println();
        }
    }
}
