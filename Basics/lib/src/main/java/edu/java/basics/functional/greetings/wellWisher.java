package edu.java.basics.functional.greetings;

//https://www.educative.io/courses/java-8-lambdas-stream-api-beyond/JP2PrpzzjoK
public class wellWisher {

	public static void wish(Greeting greeting) {
		greeting.greet();
	}
	
	public static void wish2(String str) {
		str.length();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		wish(() -> System.out.println("Namaste!"));
		//ERROR:The target type of this expression must be a functional interface
		//wish2(() -> System.out.println("Namaste!"));
	}

}
