public class App {
    public static void main(String[] args) throws Exception {

        // Create object from pet class
        Huskador myPet = new Huskador();

        myPet.Dog();
        System.out.println("Size: " + myPet.size);
        System.out.println("Hair Colors: " + myPet.hairColors);
    }
}