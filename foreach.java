public class foreach {
    public static void main(String[] args) {
        int num[]={1,2,3,4,5,6,6,7,8,9,10};
        for(int i:num){
            if(i%2==0){
                System.out.println("Value is even: "+i);
            }
            else{
                System.out.println("Value is odd: "+i);
            }
        }
    }
}
