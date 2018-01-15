package com.javabrain.lambda.unit2;

public class ThisReferenceExample {
	
	public String toString(){
		
		return "This is ThisReferenceExample class";
	}
	
	
	public void doProcess(int i , Process pro){
		
		pro.process(i);
	}
	
	
	public void execute (){
		
		// 
		doProcess(10, i -> {
			
			System.out.println("Value of i " + i);
			System.out.println(this); // this reference is same as ousdie the lambda expression
		});
		
	}
	
	public static void main (String[] args ){
		
		ThisReferenceExample thisRefExample = new ThisReferenceExample(); 
		//System.out.println(this); // Can't access this refrence in static method in Java
		/*thisRefExample.doProcess(10, new Process() {
			
			@Override
			public void process(int i) {

				System.out.println("Value of i is " + i);
				System.out.println(this); // Since working on anonymous class instance, so can access this refrence
			}
			
			public String toString(){
				
				return "This is annonimous inner class";
			}
		});*/
		
		thisRefExample.doProcess(10,  i -> {
			
			System.out.println("Value of i is " + i);
			// System.out.println(this); // lambda treat this in different way. when this is used inside a lambda expression then its same as used outside the refrence, (under static method)
		    // this is not overriden by lambda expression
		
		});
		
		thisRefExample.execute();
	}
	
	
	

}
