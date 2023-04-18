// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
       int sum =0;
       int[] numbers ={1,2,3,4,5,6,7,8,9,10};

       for (int i =0; i< numbers.length; i++){
           sum=sum+numbers[i];
           System.out.println(sum);
        }
       double average=(sum/numbers.length);
       System.out.println(average);
    }
}