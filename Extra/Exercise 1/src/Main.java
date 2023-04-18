import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
//
//        // Press Shift+F10 or click the green arrow button in the gutter to run the code.
        Scanner reader = new Scanner(System.in);

        System.out.print("Please enter your Username: ");
        String UserName= reader.nextLine();
        System.out.print("Please enter your password: ");
        String Password= reader.nextLine();
        System.out.print("Confirm Password: ");
        String ConfirmPassword= reader.nextLine();
        try{

             if(Password.equals(ConfirmPassword)){
                 System.out.println("Password okay");
                 System.out.println("User created");


            };
        }
        catch(Exception e){
            System.out.print("Passwords do not match");

        }
        boolean login =false;
        while(!login) {
            System.out.print("Please enter your Username: ");
            String inputUsername = reader.nextLine();
            System.out.print("Please enter your password: ");
            String inputPassword = reader.nextLine();
            try {

                if (inputPassword.equals(Password) && inputUsername.equals(UserName)) {
                    System.out.println("Password okay");
                    System.out.println("Logged in");
                    login = true;

                }else{
                    System.out.println("Incorrect Details");
                    System.out.println("Try again");
                }
                ;
            } catch (Exception e) {
                System.out.print("Please use correct datatype");

            }
        }
        System.out.printf("Your Username is: %s , nice to meet you!%n",UserName);





    }
}