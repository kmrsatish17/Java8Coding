package com.javabrain.lambda.unit2;

public class ClosuresExamples {

	public static void main(String[] args) {

		int a = 10;
		int b = 20; // b is coming from closure
		
		/*doProcess(a, new Process() {
			// b = 40; b is final in java 8
			@Override
			public void process(int i) {

				System.out.println(i +b );
			}
		});*/
		
		doProcess(a, (i) -> System.out.println(i + b));
		
	}
	
	
	public static void doProcess (int i, Process pro){
		
		pro.process(i);
	}

}


interface Process {
	
	void process (int i);
	
}