// interface A{
//     void even(int n){
// if (n % 2 ==0) {System.out.println("Even number is  : " + n);}
// else System.out.println("Odd        " + n);
//      }
// }
// class B{
//     void  even(int n){
//         if (n % 2 ==0) {System.out.println("Even  : " + n);}
//         else System.out.println("Odd  is      " + n); 
//     }
// }

// class C implements A,B{
//     C(){
//         System.out.println( "Inside  of class C");
//     }
// }



// public class inter {
//     public static void main(String[] args) {
        
//         C c = new C();
//         c.even(12);

//     }
// }


// interface A {
//     void even(int n);
// }

// class B {
//     void even(int n) {
        
//     }
// }

// class C extends B implements A {
//     C() {
//         System.out.println("Inside of class C");
//     }

//     public void even(int n) {
//         if (n % 2 == 0) {
//             System.out.println("Even number is: " + n);
//         } else {
//             System.out.println("Odd: " + n);
//         }
//     }
// }

// public class inter {
//     public static void main(String[] args) {
//         C c = new C();
//         c.even(12);
//     }
// }


interface A {
    void prime(int n);
}

class B {
    void prime(int n) {
        
    }
}

class C extends B implements A {
    C() {
        System.out.println("Inside of class C");
    }

    public void prime(int n) {
        if (isPrime(n)) {
            System.out.println(n + " is a prime number.");
        } else {
            System.out.println(n + " is not a prime number.");
        }
    }

    private boolean isPrime(int num) {
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

public class inter {
    public static void main(String[] args) {
        C c = new C();
        c.prime(13);
    }
}
