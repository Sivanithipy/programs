public class secondlarele {
    public static void main(String[] args) {
     int[] arr1={4,6,5,3,2,1};
     int[] arr2={3,5,4};
     System.out.println(findSecondLargestElement(arr1));
     System.out.println(findSecondLargestElement(arr2));
    }
        private static int findSecondLargestElement(int[] arr)
        { 
        if(arr.length==0||arr.length==1) return -1;
        int max=Integer.MIN_VALUE;
        int secmax=Integer.MIN_VALUE;
        for(int num:arr)
        {
            if(num>max)
            {
                secmax=max;
                max=num;
            }
            else if(secmax<num)
            {
               secmax=num;
            }
        }
        return secmax;
    }
}
