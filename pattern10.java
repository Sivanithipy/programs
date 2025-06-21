public class pattern10 {
    public static void main(String[] args) {
        int n=5;
        int num=n;
        for(int i=0;i<n;i++)
        {
            int temp=num;
            
            for(int j=0;j<n;j++)
            {
                if(i+j>=n-1)
                {
                  System.out.printf("%3s",temp);
                  temp=temp-(j+2);
                }
                else
                {
                  System.out.printf("%3s"," ");
                }
            }
            num=num+(n-i-1);
            System.out.println();

        }
    }
}
