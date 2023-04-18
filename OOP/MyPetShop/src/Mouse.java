public class Mouse extends Pet{

    private int legs;
    private boolean hasTail;

    public Mouse(String name, int age, float weight, String colour, boolean hasTail) {
        super(name, age, weight, colour);
        this.hasTail = hasTail;
        this.legs = 4;
    }

    public int getLegs() {
        return legs;
    }

    public String isHasTail() {
        if (hasTail) {
            return ("This mouse has a tail");
        }
        else {
            return ("This mouse doesn't have a tail");
        }
    }

    public void setLegs(int legs) {
        this.legs = legs;
    }

    public void setHasTail(boolean hasTail) {
        this.hasTail = hasTail;
    }


    void makesNoise() {
        System.out.println("Squeak!");
    }

//    void poops(){
//        System.out.println("asdasdads");
//    }
}