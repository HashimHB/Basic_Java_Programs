import java.util.*;
public class Fibonacci {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of fibonacci series you want:");
        int n  = scan.nextInt();    
        int f1 = 0;
        int f2 = 1;
        System.out.print(f1+" "+f2);
        for(int i=1;i<=n;i++){
            int f3 = f1+f2;
            System.out.print(" "+f3);
            f1 =f2;
            f2 =f3;
        }
    }
}
