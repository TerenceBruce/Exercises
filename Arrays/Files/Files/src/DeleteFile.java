import java.io.File;
import java.util.Scanner;

public class DeleteFile {
    public static void main(String[] args){
        String confDel="no";
        File f = new File("example.txt");

        System.out.print("are you sure you wan to delete the file ");
        Scanner scan =new Scanner(System.in);
        confDel= scan.nextLine;
        if(confDel == "yes") {
            if (f.delete()) {
                System.out.println("Deleted the file: " + f.getName());
            } else {
                System.out.println("Failed to delete the files.");
            }
        }
    }
}
