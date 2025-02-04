import java.io.Console;


class filehhandling {
    public static void main(String[] args) {
        Console c = System.console();
        System.out.println("Enter password: ");
        char[] pass1 = c.readPassword();
        String pass=String.valueOf(pass1);
        System.out.println("Password is: "+pass);
    }
}
