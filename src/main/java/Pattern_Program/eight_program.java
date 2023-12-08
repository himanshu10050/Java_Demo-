package Pattern_Program;
/*
    55555 
    4444  
    333   
    22    
    1 
 */
public class eight_program {
    
    public static void main(String[] args) {
        
        int n= 5; 
        for (int i = n; i >= 1; i--) {
            // System.out.println("*");

            for (int j = 1; j <=i; j++) {
                System.err.print(i);
            }
            System.out.println(" ");
        }
        
    }
}


