import java.io.FileWriter;
import java.io.IOException;
public class Main {
    public static void main(String[] args) {
        try{
            FileWriter myWriter=new FileWriter("example.txt");
            myWriter.write("Files might be tricky but is fun!");
            myWriter.close();
            System.out.println("Successfully wrote to the file.");


        } catch (IOException e){
            System.out.println("an error occured");
            e.printStackTrace();
        }


    }
}