import java.io.File;
import java.io.IOException;
public class createfile {
    public static void main(String[] args) {
        
    //try{
    File obj=new File("C:/Users/HP/OneDrive/Documents/saifjava.txt");
//     if(obj.createNewFile()){
//         System.out.println("File "+obj.getName()+" is created successfully");
//     } else{
//         System.out.println("File is already exist");
//     }
// }catch(IOException exception){
//     System.out.println("An unexpected error");
//     exception.printStackTrace();
// }

    if(obj.exists()){
        System.out.println("The name of file is "+obj.getName());
        System.out.println("The absolute path of the file is: "+obj.getAbsolutePath());
        System.out.println("Is the file writeable?: "+obj.canWrite());
        System.out.println("is file readable: "+obj.canRead());
        System.out.println("The size of the file in bytes is: "+obj.length());
    }else{
        System.out.println("The file doesn;t exist");
    }
}}