import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] randArray={rand.nextInt(10)+1,rand.nextInt(10)+1,rand.nextInt(10)+1,rand.nextInt(10)+1,rand.nextInt(10)+1,rand.nextInt(10)+1,rand.nextInt(10)+1,rand.nextInt(10)+1};

//        int num =rand.nextInt(10)+1;

            System.out.println(randArray[0]);
        System.out.println(randArray[3]);



        double max = randArray[0];
        double min = randArray[0];
        for (int i = 1; i < randArray.length; i++) {
            System.out.println(randArray[i]);

            if (randArray[i] > max) max = randArray[i];
            if (randArray[i] < min) min = randArray[i];
        }
        System.out.println("Max is " + max);
        System.out.println("Min is " + min);



    }
}