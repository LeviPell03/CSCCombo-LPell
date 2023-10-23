
public class Battle {

	public static void main(String[] args) {
		//Character name, health, strength, speed
		Character myCharacter = new Character("Levi", 100, 100, 100);
		Character monster = new Character("monster", 110, 50, 100);
		
		myCharacter.setWeapon("Dagger", 3);
		monster.setWeapon("Beast Claws", 10);
		
		
		System.out.println(myCharacter);
		System.out.println(monster);
		System.out.println(myCharacter);
		System.out.println(monster);
	}

}
