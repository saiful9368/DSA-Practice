public class excep {
    public static void main(String[] args) {
        System.out.println("Hello class");
        int a=10,b=0,c;
        // try{
        // c=a/b;
        // }
        // catch(Exception e){
        //     System.out.println("Division by zero is not allowed.");
        // }
        // System.out.println(b);
        // System.out.println("bye");

        // int[] a1={1,2,3,4};
        // try{
        // System.out.println(a1[5]); //ArrayIndexOutOfBoundsException
        // }
        // catch(Exception e1){
        //     System.out.println("The given index is out of the array range.");
        // }
        // try{
        //     c=a/b;
        //     System.out.println("this s ty");
        //     int arr[]={1,2,3,4,5};
        //     int v=arr[6];
        //     System.out.println(v);
        //     }    
        // catch(ArithmeticException e){
        //     System.out.println(e);
        // }
        // catch(ArrayIndexOutOfBoundsException e2){
        //     System.out.println(e2);}
        // try{
        //     c=a/b;
        //     System.out.println("this s ty");
        //     int arr[]={1,2,3,4,5};
        //     int v=arr[6];
        //     System.out.println(v);
        //     String aa=null;
        //     System.out.println(aa.length());
        //     String bb="mmmmmm";
        //     int  cc = Integer.parseInt(bb); 
        //     }
        //     // catch(ArithmeticException e){
        //     //         System.out.println(e);
        //     //     }        
        // catch(NumberFormatException m){
        //     System.out.println(m);
        //     System.out.println("Wrong Number Entered");
        // }

        // catch(NullPointerException s){
        //     System.out.println(s);
        //     System.out.println( " Null Pointer Exception Caught" );  
        // }
        // System.out.println(b);
        // System.out.println("bye"); 
        
        //throw keyword
        try{
            c=a/b;
            if (c==1){
                throw  new ArithmeticException ("_______");
            }
        }catch(Exception e){
            System.out.println ("Caught an exception ");
        }
    }
}
