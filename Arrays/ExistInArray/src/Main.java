import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int[] numbers ={1,2,3,4,5,6,7,8,9,10};
        Scanner Search = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter integer value");
        int num = Search.nextInt();
        boolean SearchFound=false;

        for (int i=0; i<numbers.length; i++){
            if(num == numbers[i]){
                SearchFound=true;

            }
        }
        if (SearchFound){
        System.out.println("Value "+num+ " found in array");}
        else{System.out.println("Value was not found in array");}
    }
}