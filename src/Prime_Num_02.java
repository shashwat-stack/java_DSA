import java.util.Scanner;

public class Prime_Num_02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int n = in.nextInt();
        if(n <= 1) {
            System.out.println("Neither prime nor composite");
            return;
        }
        for(int i = 2;i*i<=n;i++){
            if(n%i==0){
                System.out.println("is not Prime");
                return;
            }

        }
        System.out.println("IsPrime");



    }
}