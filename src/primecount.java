public class primecount {
    static int count(int n)
    {
        int count2=0;
        for(int i=1;i<=n;i++)
        {
            int count=0;
            for(int j=1;j<=i;j++)
            {
                if(i%j==0) count++;
            }
            if(count==2) count2++;
        }
        return count2;
    }

    public static void main(String[] args) {
        int n=50;
        int ans = count(n);
        System.out.println(ans);
    }
}
