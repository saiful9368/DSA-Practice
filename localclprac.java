import java.util.*;

class localclprac {
    void fun() {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        class PrimeChecker {
            boolean isPrime(int num) {
                if (num <= 1) {
                    return false;
                }
                for (int i = 2; i <= Math.sqrt(num); i++) {
                    if (num % i == 0) {
                        return false;
                    }
                }
                return true;
            }
        }

        PrimeChecker checker = new PrimeChecker();
        if (checker.isPrime(x)) {
            System.out.println("n is prime");
        } else {
            System.out.println("n is not prime");
        }

        sc.close();
    }

    public static void main(String[] args) {
        localclprac obj = new localclprac();
        obj.fun();
    }
}
