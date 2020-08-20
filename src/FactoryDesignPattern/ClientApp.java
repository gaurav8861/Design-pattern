package FactoryDesignPattern;

/**
 * The factory design pattern is used when we have a superclass with multiple sub-classes and 
 * based on input, we need to return one of the sub-class. This pattern takes out the 
 * responsibility of the instantiation of a class from the client program to the factory class. 
 * We can apply a Singleton pattern on the Factory class or make the factory method static.
 * 
 * 
 * https://www.journaldev.com/1827/java-design-patterns-example-tutorial#factory-pattern
 */
public class ClientApp {
	
	public static void main(String[] args) {
		
		Computer pc = ComputerFactory.getComputer(ComputerType.PC, "1GB", "500GB", "AMD");
		Computer server = ComputerFactory.getComputer(ComputerType.SERVER, "8GB", "8TB", "INTEL");
		
		System.out.println(pc);
		System.out.println(server);
	}

}
