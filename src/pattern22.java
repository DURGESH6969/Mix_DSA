public class pattern22 {
    static void printSquare(int n) {
        // code here
        for (int i = 0; i < 2*n; i++) {
            for (int j = 0; j <2*n ; j++) {
                if((i==0)||(i==(2*n-1))||(j==0)||(j==(2*n-1)))
                    System.out.print(n);
                else System.out.print(n-1);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n=4;
        printSquare(n);
    }
}
