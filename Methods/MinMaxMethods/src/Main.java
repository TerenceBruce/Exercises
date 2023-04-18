import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        MInMaxMethod MMM = new MInMaxMethod(0,0,0);

        Scanner num1 =new Scanner(System.in);
        System.out.print("Enter new number (num1): ");
        MMM.setNum1(num1.nextInt());


        Scanner num2 =new Scanner(System.in);
        System.out.print("Enter new number (num2): ");
        MMM.setNum2(num2.nextInt());

        Scanner num3 =new Scanner(System.in);
        System.out.print("Enter new number (num3): ");
        MMM.setNum3(num3.nextInt());

        MMM.min();
        MMM.max();
    }
}