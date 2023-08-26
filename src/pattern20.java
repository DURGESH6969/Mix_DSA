public class pattern20 {
    static void printTriangle(int n) {
        // code here
        for (int i = 1; i < 2*n; i++) {
            int spaces = 2*i;
            for (int j = 1; j <=i; j++) {
                if(j>n)
                    break;
                System.out.print("*");
            }
                for (int k = 2*n-i ; k >=0; k--) {
                    System.out.print("_");
                }
            for (int j = 1; j <=i; j++) {
                if(j>n)
                    break;
                System.out.print("*");
            }
            System.out.println();
        }

        }


    public static void main(String[] args) {
        int n=5;
        printTriangle(n);
    }
}
