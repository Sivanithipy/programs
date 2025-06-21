public class pattern11 {
    public static void main(String[] args) {
        int num=1,n=5;
        int odd=n*2-1;
        int even=1;
        for(int i=0;i<n;i++)
        {
            int temp=num;
            for(int j=0;j<n;j++)
            {
                System.out.printf("%3s",temp);
                if(j%2==0)
                {
                    temp=temp+odd;
                }
                else{
                    temp=temp+even;
                }
            }
            odd-=2;
            even+=2;
            num++;
            System.out.println();
        }
    }
}
