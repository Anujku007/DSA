
import java.util.Scanner;

public class Factorial_rec{
    static int Factorial(int n){
        if (n==0){
            return 1;
        }
        return n*Factorial(n-1);
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num =scanner.nextInt();
        int factorial_num = Factorial(num);
        System.out.println("factrial of "+ num +" is : " + factorial_num);
        
    }
}