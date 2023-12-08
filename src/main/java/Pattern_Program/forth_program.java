package Pattern_Program;

public class forth_program {

    public static void main(String[] args) {

        int n = 5;
        for (int i = 0; i <= n; i++) {
            // System.out.println("*");

            for (int j = n; j > i; j--) {
                System.err.print("*");
            }
            System.out.println(" ");
        }

    }
}
