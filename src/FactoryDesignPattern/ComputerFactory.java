package FactoryDesignPattern;

public class ComputerFactory {
	
	public static Computer getComputer(ComputerType type, String ram, String hdd, String cpu) {
		Computer computer = null;
		switch (type) {
		case PC:
			computer = new PC(ram, hdd, cpu);
			break;
		case SERVER:
			computer = new Server(ram, hdd, cpu);
			break;
		default:
			break;
		}
		return computer;
	}

}
