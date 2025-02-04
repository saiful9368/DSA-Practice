// interface Shapes {
//     void circle();
//     void triangle();
//     void rectangle();
//     void parallelogram();
// }

// public class anonycl {
//     public static void main(String[] args) {
//         Shapes obj = new Shapes() {
//             @Override
//             public void circle() {
//                 System.out.println("this is circle");
//             }

//             @Override
//             public void triangle() {
//                 System.out.println("This is Triangle");
//             }

//             @Override
//             public void rectangle() {
//                 System.out.println("This is Rectangle");
//             }
//         };

//         obj.circle();
//         obj.triangle();
//         obj.rectangle();
//     }
// }



interface Animal{
    void Dog();
    void Cat();
    void Cow();
}

public class anonycl{
    public static void main(String[] args) {
        Animal obj = new Animal(){
            @Override
            public void Dog() {
                System.out.println("This is Dog");
            }

            @Override
            public void Cat() {
                System.out.println("This is Cat");
        }
        @Override
            public void Cow() {
                System.out.println("This is Cow");
            }
        };
        obj.Dog();
        obj.Cat();
        obj.Cow();
    }
}