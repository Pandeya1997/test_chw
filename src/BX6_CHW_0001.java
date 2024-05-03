import java.util.Scanner;

public class BX6_CHW_0001 {
    public static void main(String[] args) {
      // Prime number or no
      /*

          num >1 ;
          if(n%2 == 0 || n%3 == 0) {
          sout ("not prime number")
          }else if (n = 1 || n = 2 || n%n == 0)
          {
          sout("prime number")

          if (num%num ==0){

          }
          }

       */
        

        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = s.nextInt();
        if (isPrime(n)) {
            System.out.println(n + " is a prime number");
        } else {
            System.out.println(n + " is not a prime number");
        }
    }
    public static boolean isPrime(int n) {
            if (n <= 1) {
                return false;
            }
            for (int i = 2; i < Math.sqrt(n); i++) {
                if (n % i == 0) {
                    return false;
                }
            }
            return true;

        }
}


