package com.javabrain.lambda;

public class TypeInferenceExample {

	public static void main(String[] args) {

		
		//StringLengthLamds myLambda = (String s) -> s.length();
		
		//StringLengthLamds myLambda = s -> s.length(); // Once we have only 1 input argument then we don't need () or the input type. Lambda expression which takes String as input and return int as output as inferred from the interface.
		//System.out.println( myLambda.getLength("Hello Lambda"));
		
		printLambda(s -> s.length());
		
		
		
	}
	
	public static void printLambda (StringLengthLamds l){
		
		
		System.out.println(l.getLength("Hello Lambdaaa")); 
	}
	
	
	interface StringLengthLamds {
		
		int getLength(String s);
		
	}

}
