package Pattern_Program;

/*
 *      1 
 *      23
 *      456
 *      78910
*
 */
    
public class sixth_pattern {

    public static void main(String[] args) {
        
        int n= 5; int k=1;
        for (int i = 1; i <= n-1; i++) {
           

            for (int j = 1; j <=i; j++) {
                System.err.print(k++);
                  
            }
            System.out.println();
        }
        
    }}

