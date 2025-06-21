public class pattern8 {
    public static void main(String[] args) {
        int n=5;
        for(int i=0;i<n;i++)
        {
            int num=i+1;
            for(int j=0;j<=i&&i+j<=n-1;j++)
            {
                System.out.printf("%3s",num);
                num+=n-(j*2+1);
            }
            System.out.println();
        }
    }
}
