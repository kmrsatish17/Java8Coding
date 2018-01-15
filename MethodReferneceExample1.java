package com.javabrain.labda.unit3;

public class MethodReferneceExample1 {

	public static void main(String[] args) {

		printMessage();
		
		//Thread th = new Thread( () -> printMessage() );// No input argumnent, executing method with no paratemetrs Or if the input argumanr and method execution parametrs matches then we can use method references. 
		
		Thread th = new Thread( MethodReferneceExample1::printMessage );
		th.start();
		// MethodReferneceExample1::printMessage ==== () -> printMessage()
		// () -> method() ==== MethodReferneceExample1::printMessage
	}
	
	
	public static void printMessage (){
		
		System.out.println("Hello MR");
	}

}
