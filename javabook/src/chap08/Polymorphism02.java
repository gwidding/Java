package chap08;

public class Polymorphism02 {
	public static void main(String[] args) {
		Animal myAnimal = new Animal();
		Animal myPig = new Pig();
		Animal myDog = new Dog();
		// 메서드 오버라이딩
		myAnimal.animalSound();
		myPig.animalSound();
		myDog.animalSound();
	}
}
