public class pattern2 {
     public static void main(String[] args) {
        int number = 1,n=5;
        for (int i = 0; i < n; i++) {
            int temp = number;
            int dec = n;
            for (int j = 0; j < n; j++) {
                if (i+j < n-1) {
                    System.out.printf("%4s",temp);
                    temp = temp + (i+j+2);
                }
                else{
                    System.out.printf("%4s",temp);
                    temp = temp + dec;
                    dec--;
                }
            }
            System.out.println();
            number = number + (i + 1);

        }
    }
}
