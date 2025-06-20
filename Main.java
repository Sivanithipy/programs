public class Main {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 0; i < 2 * n - 1; i++) {
            if (i < n) {
                
                for (int j = 0; j <= i; j++) {
                    System.out.print("* ");
                }
            } else {
                
                for (int s = 0; s < i - n + 1; s++) {
                    System.out.print("  "); 
                }
                for (int k = 0; k < 2 * n - 1 - i; k++) {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }
}
