package test;
import jeujava.*;
public class test {
	
	
	public static void main(String[] args) {
		
		Individual owner = new Individual("Sophia");
		
		System.out.println("My name is "+owner.getName());
		//owner.speak();
		
		Individual owner2 = new Individual("Truc");
		System.out.println("My name is "+owner2.getName());
	}

}
