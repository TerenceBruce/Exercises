public class Dog extends Pet{
    private String eyeColour;
    private boolean hasTail;
    private String favouriteToy;

    public Dog(String name, int age, float weight, String colour,
               String eyeColour, boolean hasTail, String favouriteToy) {
        super(name, age, weight, colour);
        this.eyeColour = eyeColour;
        this.hasTail = hasTail;
        this.favouriteToy = favouriteToy;
    }

    public String getEyeColour() {
        return eyeColour;
    }

    public void setEyeColour(String eyeColour) {
        this.eyeColour = eyeColour;
    }

    public boolean isHasTail() {
        return hasTail;
    }

    public String getFavouriteToy() {
        return favouriteToy;
    }

    public void setFavouriteToy(String favouriteToy) {
        this.favouriteToy = favouriteToy;
    }

    public void setHasTail(boolean hasTail) {
        this.hasTail = hasTail;
    }

    void makesNoise(){
        System.out.println("Woof woof!");
    }

    void plays(){
        System.out.println(" plays with a " + favouriteToy);
    }
//    void poops(){
//        System.out.println("flopppppp!");
//    }

}