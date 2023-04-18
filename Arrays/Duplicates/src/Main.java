import java.util.Random;




public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        int[][] randArray = {{rand.nextInt(20) + 1, rand.nextInt(20) + 1, rand.nextInt(20) + 1}, {rand.nextInt(20) + 1, rand.nextInt(20) + 1,}};


        for(int j = 0; j < randArray[0].length; ++j) {
            System.out.print(randArray[0][j]+" ");

            }
        System.out.println(" ");
        for(int j = 0; j < randArray[1].length; ++j) {
            System.out.print(randArray[1][j]+" ");

        }
        System.out.println("");

        int Duplicate;


        for(int j = 0; j < randArray[0].length; ++j) {
            for(int k = 0; k < randArray[1].length; ++k) {
                if(randArray[1][k]==randArray[0][j]){
                    Duplicate=(randArray[1][k]);
                    System.out.println("this is a Duplicate "+Duplicate);
                }
            }
        }




    }
}

