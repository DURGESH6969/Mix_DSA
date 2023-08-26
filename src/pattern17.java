public class pattern17 {
    static void printTriangle(int n) {
        // code here
        char ans='A';
        for (int i = 0; i < n; i++) {
            for (int j = n-i-1; j > 0; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                char val = (char)(ans+j);
                System.out.print(val);
            }
            for (int j = i-1; j >=0; j--) {
                char val = (char)(ans+j);
                System.out.print(val);
            }
            System.out.println();
        }


    }

    public static void main(String[] args) {
        int n =4;
        printTriangle(n);
    }
}
