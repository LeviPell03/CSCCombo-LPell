
public class Main {
    public static void main(String[] args) {
        AdoptableAnimal[] animals = new AdoptableAnimal[] {
                new Cat("Pyro", "They run around the house and scratch at all of your furniture. The devil itself. Fear the :3 and fear the claws.", 200000),
                new Cat("OwO", "They'll stick to you like glue. They're very, very affectionate.", 2),
                new GoldenRetriever("Conduit", "They run around the house and moonwalk whenever you have your back turned. They summon monsters into your home at night that seek to take your soul.", 200),
                new Pitbull("Proto 6000", "The best boi", 20)
        };

        for (AdoptableAnimal animal : animals) {
            String animalType;
            if (animal instanceof Cat) {
                animalType = "cat";
            } else {
                animalType = "dog";
            }
            System.out.println("Adopting out a " + animalType
                    + "\nTheir name is " + animal.getName()
                    + "\nThey cost " + animal.getPrice()
                    + "\nOur staff describes them thusly: " + animal.getDescription());

            if (animal instanceof Dog) {
                System.out.println("The dog's breed is " + ((Dog) animal).getBreed());
            }
        }
    }
}


