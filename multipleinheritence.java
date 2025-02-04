import java.util.*;
class RBI{
    public void roi(){
        System.out.println("head of all banks ");
    }
}

class SBI extends RBI{
    public void roi(){
        System.out.println("Govt bank ");
    }
}

class PNB extends RBI{
    public void ROI(){
        System.out.println("punjab ka ");
    }
}

class HDFC extends RBI{
    public void ROI(){
        System.out.println("discount ka bss");
    }
}
public class multipleinheritence {
    public static void main(String[] args) {
            Scanner sc= new Scanner(System.in);
            System.out.println("enter the bank you want to check ROI");
            String x = sc.nextLine();
            SBI sbi = new SBI();
            PNB pnb = new PNB();
            HDFC hdfc = new HDFC();
            switch (x) {
                 case "SBI":
                    sbi.roi();
                    break;
                case "PNB":
                pnb.ROI();
                break;

                case "HDFC":
                hdfc.ROI();
                    break;
                default:
                System.out.println("Bank doesn't exist ");
        }
    }
}









    

