// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int a =4;
        int b =6;

        int c = sumMethod(a,b);
        display(c);

        }
        public static int sumMethod(int n, int m){
        int sum=0;
        sum= n+m;
        return sum;
        }
        public static void display(int sum){
        System.out.println("this method prints the variable");
        System.out.println("The Sum is = " + sum);
        }
    }
