import java.util.*;
public class factNum{
    public static void printFact(int n){
        if(n<0){
            System.out.println("ERROR!");
            return;
        }
        int factorial = 1;
        for(int i=n; i>=1; i--){
            factorial=factorial*i;
        }
        System.out.print("Factorial of given numbers is: "); 
        System.out.println(factorial);
        return;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        
        printFact(n);
    }
}