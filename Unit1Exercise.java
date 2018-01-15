package com.javabrain.lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Unit1Exercise {

	public static void printList(List<Person> peopleList) {

		for (Person indPerson : peopleList) {

			System.out.println("printList : " + indPerson.toString());
		}

	}

	public static void printListWithCondition(List<Person> peopleList, Condition cond) {
		

		for (Person indPerson : peopleList) {
			
			if (cond.test(indPerson)){
				
				System.out.println("printListWithCondition" + indPerson);
			}
		}
	}

	public static void main(String[] args) {

		List<Person> people = Arrays.asList(

				new Person("Satish", "Kumar", 26), new Person("Charles", "Dickens", 60),
				new Person("Charlotte", "Bronte", 45), new Person("Matthew", "Arnold", 39),
				new Person("Lewis", "Carol", 42), new Person("Hooper", "Carl", 42)

		);

		// Step 1: Sort list by last Name
		Person person = new Person();
		Unit1Exercise exer = new Unit1Exercise();

		Collections.sort(people, new Comparator<Person>() {

			@Override
			public int compare(Person o1, Person o2) {

				return o1.getLastName().compareTo(o2.getLastName());
			}
		});

		System.out.println(people);

		// Step 2: Create a method that prints all elements in the list
		printList(people);
		
		// PrintListLambda printListLambda = (perSonList) -> for (Pesron pers : perSonList) { System.out.println("printList : " + pers.toString())};

		// Step 3: Create a method that prints all people that have last name
		// begning with C
		printListWithCondition(people , new Condition() {
			
			@Override
			public boolean test(Person person) {

				return person.getLastName().startsWith("C");
			}
		});
		
		
		System.out.println("Person with first name condition");
		printListWithCondition(people, new Condition() {
			
			@Override
			public boolean test(Person person) {

				return person.getFirstName().startsWith("C");
			}
		});

	}

}
