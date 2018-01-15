package com.javabrain.lambda;

public class Greater {
	
	public void greet(Greeting greeting){
		
		greeting.perform();
	}

	public static void main(String[] args) {
		Greater greater = new Greater();
		
		Greeting helloWorldGreating = new HelloWorldGreeting();
        
        Greeting lambdaGreeting = () -> System.out.println("Hello World Lambda");
        //MyAdd addFunction = (int a, int b) -> a+b;
        
        Greeting innerClassGreeting = new Greeting () {

			@Override
			public void perform() {

				System.out.println("Hello World Inner Class");
			}
        	
        	
        };
        
        greater.greet(helloWorldGreating);
        greater.greet(innerClassGreeting);
        greater.greet(lambdaGreeting);
        
        
	}

}

/*interface MyLambda {
	
	void foo(); // Same signature as the lambda expression. Name of the inteface and the method doesn't matter
}

interface MyAdd {
	
	int add(int x, int y);
}*/