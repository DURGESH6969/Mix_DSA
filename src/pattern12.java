public class pattern12 {
    static void printTriangle(int n) {
        // code here
        for (int i = 1 ; i <=n ; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print(j+" ");
            }
            for (int k = 4*(n-i); k>0  ; k--) {
                System.out.print(" ");
            }
            for (int j = i; j >= 1; j--) {
                System.out.print(j+" ");
            }
            System.out.println();

        }

    }

    public static void main(String[] args) {
        int n=5;
        printTriangle(n);
    }
}
