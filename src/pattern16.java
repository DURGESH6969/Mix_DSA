public class pattern16 {
    static void printTriangle(int n) {
        // code here
        char ans='A';
        for (int i = 0; i <n ; i++) {
            for (int j = 0; j <=i ; j++) {
                System.out.print((char)(ans+i));
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        int n =5;
        printTriangle(n);
    }
}
