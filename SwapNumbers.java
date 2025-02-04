// class Main {

//     public static void main(String[] args) {
      
//       int first = 10;
//       int second = 20;
  
//       // add two numbers
//       int sum = first + second;
//       System.out.println(first + " + " + second + " = "  + sum);
//     }
//   }

public class SwapNumbers {

    public static void main(String[] args) {

        float first = 1.20f, second = 2.45f;

        System.out.println("--Before swap--");
        System.out.println("First number = " + first);
        System.out.println("Second number = " + second);

        // Value of first is assigned to temporary
        float temporary = first;

        // Value of second is assigned to first
        first = second;

        // Value of temporary (which contains the initial value of first) is assigned to second
        second = temporary;

        System.out.println("--After swap--");
        System.out.println("First number = " + first);
        System.out.println("Second number = " + second);
    }
}