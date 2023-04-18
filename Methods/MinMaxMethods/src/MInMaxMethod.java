public class MInMaxMethod {
    private int num1;
    private int num2;
    private int num3;

    public MInMaxMethod(int num1, int num2,int num3) {
        this.num1 = num1;
        this.num2 = num2;
        this.num3 = num3;
    }

    public int getNum1() {
        return num1;
    }

    public int getNum2() {
        return num2;
    }

    public int getNum3() {
        return num3;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public void setNum3(int num3) {
        this.num3 = num3;
    }
    public void min(){
        int[]array={num1,num2,num3};
        double min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) min = array[i];

        }
        System.out.println("Min is " + min);

    }
    public void max(){
        int[]array={num1,num2,num3};
        double max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) max = array[i];
        }
        System.out.println("Max is " + max);

    }

}
