package AbstractFactoryPattern;

import FactoryDesignPattern.Computer;

public class ComputerFactory {
	
	public static Computer getComputer(ComputerAbstractFactory factory) {
		return factory.createComputer();
	}

}
