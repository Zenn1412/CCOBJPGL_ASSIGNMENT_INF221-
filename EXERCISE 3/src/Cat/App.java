public class App {
    public static void main(String[] args) throws Exception {

        // Create object from pet class
        Pet myPet = new Pet();

        myPet.Cat();
        System.out.println("Eye Color: " + myPet.eyeColor);
        System.out.println("Hair Color: " + myPet.haircolor);
    }
}