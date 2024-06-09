package oops.casting;

class Animal {

	public void makeSound() {
		System.out.println("Animal is making a sound");
	}
}

class Dog extends Animal {

	@Override
	public void makeSound() {
		System.out.println("Dog is barking");
	}

	public void fetch() {
		System.out.println("Dog is fetching");
	}
}

public class TypeCasting {
	public static void main(String[] args) {
		
		Animal myAnimal = new Animal();
		myAnimal.makeSound(); //Animal is making a sound
		
		Dog myDog = new Dog();
		myDog.makeSound(); // Dog is barking
		myDog.fetch(); // Dog is fetching
		
		
		// upcasting
		Animal animal = new Dog(); 
		animal.makeSound(); // Dog is barking
		
		
		// downcasting (only upcasted object should be downcasted)
		Dog dog = (Dog) animal; 
		dog.makeSound(); // Dog is barking
		dog.fetch(); // Dog is fetching
		
		
//		Dog dog2 = (Dog) new Animal(); // ClasCastException
//		dog2 .fetch();
//		dog2 .makeSound();
		
	}
}
