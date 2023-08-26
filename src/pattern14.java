public class pattern14 {
    static void printTriangle(int n) {
        // code here
        char ans='A';
        for (int i = 0; i < n ; i++) {

            for (int j = 0; j <=i ; j++) {
                char val= (char) (ans+j);
                System.out.print(val);
            }
            System.out.println();

        }

    }

    public static void main(String[] args) {
        int n =5;
        printTriangle(n);
    }
}
