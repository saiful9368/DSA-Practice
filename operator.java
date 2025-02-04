public class operator {
    public static void main(String[] ar){
        int a=10;
        int b=20;
        int c=5;
        int lar=(a>b)?(a>c?a:c):(b>c?b:c);
        //int result=(a>b)&&(b>c)?a:(b>a)&&(b>c)
        System.out.println(lar);
    }
}
