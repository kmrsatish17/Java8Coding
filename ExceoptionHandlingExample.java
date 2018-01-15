package com.javabrain.lambda.unit2;

import java.util.function.BiConsumer;

public class ExceoptionHandlingExample {

	public static void main(String[] args) {

		int [] someNumbers = {1, 2, 3, 4};
		int key = 0;
		
		/*process(someNumbers, key, (v, k) -> 
		{
			try{
		System.out.println(v / k);
			}catch (ArithmeticException ee){
				
				System.out.println("Aruthmatic Exception occurs");
			}
		
		});*/
		
		process (someNumbers, key, wrapperLambda((v,k) -> System.out.println(v/k)));
		
	}

	private static BiConsumer<Integer, Integer> wrapperLambda(BiConsumer<Integer, Integer> biconsumer) {
		
		
		return (v,k) -> 
		{
			try{
		biconsumer.accept(v, k);
			}catch(ArithmeticException ae){
				
				System.out.println("Arithmatic exception happens");
			}
		
		};
	}

	private static void process(int[] someNumbers, int key, BiConsumer<Integer, Integer> consumer) {

		for (int i : someNumbers){
			
			consumer.accept(i, key);
		}
		
	}
	
	

}
