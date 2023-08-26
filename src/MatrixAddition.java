import java.util.Scanner;

public class MatrixAddition {
    static int[][] add(int[][] arr,int[][] arr2){

        if((arr.length!=arr2.length) ||(arr[0].length!=arr2[0].length)) {
            System.out.println("Addition not possible");
            return null;
        }

        int[][] ans= new int[arr.length][];

        for (int i = 0; i <arr.length ; i++) {
            ans[i] = new int[arr[i].length];
            for (int j = 0; j <arr[i].length ; j++)
                ans[i][j] = arr[i][j] + arr2[i][j];
        }
        return ans;
    }
    static void printMatrix(int[][] arr){

        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j <arr[i].length ; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the rows & col");
        int row = sc.nextInt();
        int col = sc.nextInt();

        int[][] arr = new int[row][col];

        System.out.println("Enter the elements into the array");
        for (int i = 0; i <row ; i++) {
            for (int j = 0; j <col ; j++)
                arr[i][j] = sc.nextInt();
        }

        System.out.println("Enter the rows & col of second matrix");
        int row2 = sc.nextInt();
        int col2 = sc.nextInt();

        int[][] arr2 = new int[row2][col2];

        System.out.println("Enter the elements into the array");
        for (int i = 0; i <row2 ; i++) {
            for (int j = 0; j <col2 ; j++)
                arr2[i][j] = sc.nextInt();
        }

        int[][] res = add(arr,arr2);
        printMatrix(res);
    }
}
