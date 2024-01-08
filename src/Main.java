public class Main {
    public static void main(String[] args) {

        Dog dog1 = new Dog("Buddy", "Golden Retriever");
        Dog dog2 = new Dog("Max", "Labrador");

        System.out.println("Starea inițială:");
        displayDogInfo(dog1);
        displayDogInfo(dog2);

        dog1.setName("Charlie");
        dog1.setBreed("German Shepherd");

        dog2.setName("Rocky");
        dog2.setBreed("Beagle");

        System.out.println("\nStarea după modificări:");
        displayDogInfo(dog1);
        displayDogInfo(dog2);
    }

    private static void displayDogInfo(Dog dog) {
        System.out.println("Nume: " + dog.getName() + ", Rasă: " + dog.getBreed());
    }

}
