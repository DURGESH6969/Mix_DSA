import java.util.Scanner;

public class MatrixMultiplication {

   static void multiply(int[][] arr , int[][] arr2 ,int row,int col,int row2,int col2){

       if(col!=row2) {
           System.out.println("Matrix not possible");
           return;
       }

       int[][] ans= new int[row][col2];

       for(int i=0;i<row;i++){
           for (int j = 0; j < col2; j++) {
               for (int k = 0; k < col; k++) {
                   ans[i][j]+= arr[i][k] * arr2[k][j];
               }
           }
       }

       printMatrix(ans);
    }

    static void printMatrix(int[][] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j]+ " ");
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
        multiply(arr,arr2,row,col,row2,col2);

    }
}
