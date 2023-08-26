public class pattern11 {
    static void printTriangle(int n) {
        // code here
        int ans=0;
        for (int i = 0; i < n; i++) {
            if(i%2==0)
                ans = 1;
            else ans=0;
            for (int j = 0; j <=i ; j++) {
                System.out.print(ans+" ");
                ans=1-ans;

            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int n=5;
        
        printTriangle(n);
    }
}
