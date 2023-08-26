public class gcd {
    static int gcdOf2Numbers(int n,int m){

        while (n>0 && m>0){
            if(n>m) n=n%m;
            else m=m%n;
        }
        if(n==0) return m;
        return n;

    }

    public static void main(String[] args) {
        int n=52;
        int m=26;
        System.out.println(gcdOf2Numbers(n,m));
    }
}
