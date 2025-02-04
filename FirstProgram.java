public class FirstProgram {
        static int c=30;
        int b=20;
        void fun(){
            int a=10;
            System.out.println(a+" "+b+" "+c);
            a++;
            b++;
            c++;
        }
        public static void main(String[] args){
            FirstProgram m=new FirstProgram();
            m.fun();
            m.fun();
            m.fun();
        }
    
}
