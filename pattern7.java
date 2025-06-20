public class pattern7 {
     public static void main(String[] args) {
        int n=3,num=1;
        for(int i=0;i<n*2-1;i++)
        {
            int limit;
            if(i<n)
            {
            
            limit =i+1;
           }
        
        else
        {
            limit =2*n-1-i;
        }
        for(int j=0;j<limit;j++)
            {
                
                System.out.print(num+  " ");
                num++;
            }
             System.out.println();
        }
     }
}
