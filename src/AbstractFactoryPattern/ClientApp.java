package AbstractFactoryPattern;

import FactoryDesignPattern.Computer;

public class ClientApp {
	
	public static void main(String[] args) {
		
		Computer pc = ComputerFactory.getComputer(new PCFactory("1GB", "500GB", "AMD"));
		Computer server = ComputerFactory.getComputer(new ServerFactory("8GB", "800GB", "INTEL"));
		
		System.out.println(pc);
		System.out.println(server);
		
	}

}
