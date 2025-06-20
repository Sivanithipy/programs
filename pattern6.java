public class pattern6 {
     public static void main(String[] args) {
        int n=5;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                int num=Math.max(Math.max(i,j),Math.max(n-i-1,n-j-1));
                System.out.print(num+1);
            }
            System.out.println();
        }
        
     }
}
