package Assignment03;

import java.util.Set;
import java.util.TreeSet;

class Person implements Comparable<Person> {
	int weight, height;
	String name;
	
	public Person(String name, int weight, int height) {
		this.name = name;
		this.weight = weight;
		this.height = height;
	}
	
	public String toString() {
		return "Person{" + "name: " + name + ", weight_kg: " + weight + ", height_ft: " + height + "}";
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int compareTo(Person o) {
		if(this.weight>o.weight) {
			return -1;
		} else if(this.weight==o.weight) {
			if(this.height>o.height) {
				return -1;
			} else if(this.height<o.height) {
				return 1;
			} else {
				return 0;
			}
		} else {
			return 1;
		}
	}
	
}

public class solution01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Person p2 = new Person("Sam", 59, 6);
		Person p1 = new Person("Mary", 50, 4);
		Person p3 = new Person("Jack", 45, 5);
		Person p4 = new Person("Mike", 39, 3);
		Person p5 = new Person("Harry", 39, 5);
		
		Set<Person> personSet = new TreeSet<Person>();
		
		personSet.add(p1);
		personSet.add(p2);
		personSet.add(p3);
		personSet.add(p4);
		personSet.add(p5);
			
		System.out.println(personSet);
		
		for(Person n: personSet) {
			System.out.println(n);
		}
	}

}
