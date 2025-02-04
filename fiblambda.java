@FunctionalInterface
interface kk {
    void fun();
}

public class fiblambda {

    public static void main(String[] args) {
        int n = 10;

        // Define the lambda expression for generating the next Fibonacci number
        kk nextFib = (int a, int b) -> System.out.print(a + " ");

        // Initialize starting values
        int a = 0;
        int b = 1;

        // Iterate and print Fibonacci numbers
        for (int i = 0; i < n; i++) {
            nextFib.fun(a, b);
            int temp = a;
            a = b;
            b = temp + b;
        }
    }
}
