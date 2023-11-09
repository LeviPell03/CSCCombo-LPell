import java.util.ArrayList;
import java.util.List;

public class Farm {

	public static void main(String[] args) {
		// Main (Driver)
//		 Cat myCat = new Cat(2.0, 3.0, "Orange");
//		 System.out.println(myCat.makeSound());
//
//		 Cat oCat = new Cat(2.0, 3.0, "Orange");
//
//		 Horse myHorse = new Horse();
//		 System.out.println(myHorse.makeSound());
//
//		 if (myCat.equals(oCat)) {
//			 System.out.println("The cats are the same.");
//		 } else {
//		 System.out.println("The cats are different.");

		

	
		Animal[] animals = new Animal[5];
		

			animals[0] = new Horse();
			animals[1] = new Cat(2.0, 3.0, "Orange");
			animals[2] = new Cat(1.5, 2.5, "Grey");
			animals[3] = new Horse();
			animals[4] = new Horse();
		
	

			for (int i = 0; i < animals.length; i++) {
				System.out.println(animals[i].makeSound());
			}

			for (Animal anim : animals) {
				System.out.println(anim.makeSound());
			}
			List<Animal> beings = new ArrayList<>();
			beings.add(new Horse());
	}

	public static void printAnimalType(Animal[] anims) {
		for (Animal anim : anims) {
			if (anim instanceof Horse) {
				System.out.println("This is a horse.");
			} else if (anim instanceof Cat) {
				System.out.println("This is a " + ((Cat)anim).getColor()    + " cat.");
			}
			

		}

	}
}
