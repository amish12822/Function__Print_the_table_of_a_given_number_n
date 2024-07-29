import java.util.Scanner;

/**
 * print_a_table
 */
public class print_a_table {

    public static void table(int n){

        if ( n == 0){
            System.out.println("Can't print 0 table");

            return;
        }

        for (int i=1; i<=10; i++){

            System.out.println(n + " * " + i + " = " + n*i);
        }
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n value = ");int n = sc.nextInt();

        table(n);
    }
    
}