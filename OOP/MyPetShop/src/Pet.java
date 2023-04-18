public abstract class Pet {
//abstract class can be enstancated
    private String name;
    private int age;
    private float weight;
    private String colour;

    public Pet(String name, int age, float weight, String colour) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.colour = colour;
    }

    public String getColour() {
        return colour;
    }

    public String getInfo() {
        return (name + " is " + age + " years old and is " + weight + "kgs in weight.");
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

//    public String getSpecies() {
//        return species;
//    }

    public float getWeight() {
        return weight;
    }

    public void setName(String name) {
        this.name = name;
    }

    void getsOlder(){
        age++;
    }

    void eats(){
        System.out.println("Nom nom nom!");
    }

//    void poops(){
//        System.out.println("Phmmmp!");
//    }
//    public abstract void poops();
    void sleeps(){
        System.out.println("zzzzzzzzz!");
    }

    void makesNoise(){
        System.out.println("");
    }
}