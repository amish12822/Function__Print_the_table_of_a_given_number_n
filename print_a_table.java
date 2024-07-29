import java.util.Scanner;

/**
 * print_a_table
 */
public class print_a_table {

    public static void table(int n){

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