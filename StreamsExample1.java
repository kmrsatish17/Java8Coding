package com.javabrain.labda.unit3;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import com.javabrain.lambda.Person;

public class StreamsExample1 {

	public static void main(String[] args) {

		List<Person> people = Arrays.asList(

				new Person("Satish", "Kumar", 26), new Person("Charles", "Dickens", 60),
				new Person("Charlotte", "Bronte", 45), new Person("Matthew", "Arnold", 39),
				new Person("Lewis", "Carol", 42), new Person("Hooper", "Carl", 42)

		);
		
		// Stream parts -> source, operation, terminal  
		people.stream()
		.filter(p -> p.getLastName().startsWith("C"))
		.forEach(p -> System.out.println(p.getFirstName()));
		
		
		Stream<Person> perStream =  people.stream(); // Nothing happened without operation
		
		long count = people.stream()
		.filter(p -> p.getLastName().startsWith("D"))
		.count();
		
		System.out.println(count);
		
		long count2 = people.parallelStream()
				.filter(p -> p.getLastName().startsWith("D"))
				.count();
		
		// parallelStream() --> returns possibly parallel stream and facilitates the parallel processing if possible
		// Can split the collection into multiple streams for parallel processing
	}

}
