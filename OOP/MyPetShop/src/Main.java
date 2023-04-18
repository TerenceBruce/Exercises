public class Main {
    public static void main(String[] args) {
        Mouse fred = new Mouse("Fred",3,0.1f, "white", true);
        Dog fido = new Dog("Fido", 2,  15, "black and white", "brown", true, "ball");
//        Pet barney = new Pet("barney",9,25,"black");
        fred.setName("Jerry");
        System.out.println(fred.getAge());
        System.out.println(fred.getInfo());
        System.out.println(fred.getName());

        fred.getsOlder();
        System.out.println(fred.getAge());
        fred.poops();
        fred.makesNoise();

        fido.plays();
    }
}