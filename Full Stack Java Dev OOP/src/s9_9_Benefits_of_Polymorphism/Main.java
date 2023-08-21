package s9_9_Benefits_of_Polymorphism;

import com.sun.tools.javac.util.List;

import java.util.*;

public class Main {

	public static void main(String[] args) {

		// parent class object
		Animal animal = new Animal();
		System.out.println(animal.showInfo());

		//subclass
		// change access modifier(Reptile) and declare variable(reptile)
		Animal reptile = new Reptile();
		System.out.println(reptile.showInfo());
		
		Animal croc = new Crocodile();
		System.out.println(croc.showInfo());
		
		// benefit of polymorphism
		List<Animal> animals = new ArrayList<>();
		
		animals.add(reptile);
		animals.add(croc);
		
		public static void listAnimals(List<Animal)> animals) {
			for(Animal animal : animals) {
				System.out.println(animal.showInfo());
			}
		}
		
	}

}
