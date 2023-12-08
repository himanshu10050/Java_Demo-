package Pattern_Program;

public class third_program {
    public static void main(String[] args) {

        int n = 5;
        /*
         * *
         * **
         * ***
         * ****
         * *****
         */
        for (int i = 1; i <= n; i++) {
            // System.out.println("*");

            for (int j = 1; j <= i; j++) {
                System.err.print("*");
            }
            System.out.println(" ");
        }
        System.out.println("_________________________________________________");
        /*
         * *****
         * ****
         * ***
         * **
         * *
         */
        for (int i = 1; i <= n; i++) {
            // System.out.println("*");

            for (int j = n; j >= i; j--) {
                System.err.print("*");
            }
            System.out.println(" ");
        }
        System.out.println("_________________________________________________");

        // *
        // **
        // ***
        // *****
        // ****
        // ***
        // **
        // *
        for (int i = 1; i <= n; i++) {
            // System.out.println("*");

            for (int j = 1; j <= i; j++) {
                System.err.print("*");
            }
            System.out.println(" ");
        }
        for (int i = 1; i <= n; i++) {
            // System.out.println("*");

            for (int j = n; j > i; j--) {
                System.err.print("*");
            }
            System.out.println(" ");
        }
    }
}
