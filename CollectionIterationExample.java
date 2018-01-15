package com.javabrain.labda.unit3;

import java.util.Arrays;
import java.util.List;

import com.javabrain.lambda.Person;

public class CollectionIterationExample {

	public static void main(String[] args) {

		
		List<Person> people = Arrays.asList(

				new Person("Satish", "Kumar", 26), new Person("Charles", "Dickens", 60),
				new Person("Charlotte", "Bronte", 45), new Person("Matthew", "Arnold", 39),
				new Person("Lewis", "Carol", 42), new Person("Hooper", "Carl", 42)

		);
		
		System.out.println("For loop result");
		for (int i =0; i < people.size() ; i++){
			
			System.out.println(people.get(i));
			
		}
		
		System.out.println("For enhanced loop result");
		for (Person person : people){
			
			System.out.println(person); // Sequential
		}
		
		System.out.println("For each lambda result");
		people.forEach( (p) -> System.out.println(p) );
		
		System.out.println("For each lambda method refrenece result");
		people.forEach( System.out::println ); // Run in multiple threads. Run in parallel 
		
	}

}
