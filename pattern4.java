public class pattern4 {
    public static void main(String[] args) {
        int n=5;
        for(int i=0;i<n;i++)
        {
        for(int j=0;j<n;j++)
        {
            if(i==j||j==0||i+j==n-1||j==n-1)
            {
                System.out.printf("*");
            }
            else{
                System.out.printf(" ");
            }
        }
        System.out.println();
        }
    }

}
