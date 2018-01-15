package com.javabrain.lambda.unit2;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

import com.javabrain.lambda.Person;

public class ExerciseSolnLambda2 {

	public static void printList(List<Person> peopleList) {

		for (Person indPerson : peopleList) {

			System.out.println("printList : " + indPerson.toString());
		}

	}

	public static void printListWithCondition(List<Person> peopleList, Predicate<Person> predicate, Consumer<Person> consume) {
		

		for (Person indPerson : peopleList) {
			
			if (predicate.test(indPerson)){
				
				consume.accept(indPerson);;
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
		Collections.sort(people, (Person p1 , Person p2) -> p1.getLastName().compareTo(p2.getLastName()));

		// Step 2: Create a method that prints all elements in the list
		System.out.println("Person without condition");
		printListWithCondition(people, p -> true, p -> System.out.println(p));
		
		// Step 3: Create a method that prints all people that have last name
		System.out.println("Person with last name condition");
		printListWithCondition(people , p1 -> p1.getLastName().startsWith("C"), p -> System.out.println(p));
		
		
		System.out.println("Person with first name condition");
		printListWithCondition(people, p -> p.getFirstName().startsWith("C"), p -> System.out.println(p.getFirstName()));

	}

}

