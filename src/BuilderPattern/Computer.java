package BuilderPattern;
/**
 * 
 * There are three major issues with Factory and Abstract Factory design patterns when the Object contains a lot of attributes.
 * 1).	Too Many arguments to pass from client program to the Factory class that can be error prone because most of the time, 
 * 		the type of arguments are same and from client side its hard to maintain the order of the argument.
 * 2).	Some of the parameters might be optional but in Factory pattern, 
 * 		we are forced to send all the parameters and optional parameters need to send as NULL.
 * 3).	If the object is heavy and its creation is complex, then all that complexity will be part of Factory classes that is confusing.
 * 
 * We can solve the issues with large number of parameters by providing a constructor with required parameters and 
 * then different setter methods to set the optional parameters. 
 * The problem with this approach is that the Object state will be inconsistent until unless all the attributes are set explicitly.
 * 
 * Builder pattern solves the issue with large number of optional parameters and 
 * inconsistent state by providing a way to build the object step-by-step and provide a method that will actually return the final Object.
 *
 */
public class Computer {
	
	// Required
	private String ram;
	private String hdd;
	private String cpu;

	// Optional
	private boolean isGraphicsEnabled;
	private boolean isBluetoothEnabled;

	private Computer(ComputerBuilder computerBuilder) {
		this.ram = computerBuilder.ram;
		this.cpu = computerBuilder.cpu;
		this.hdd = computerBuilder.hdd;
		this.isBluetoothEnabled = computerBuilder.isBluetoothEnabled;
		this.isGraphicsEnabled = computerBuilder.isGraphicsEnabled;
	}

	public void setGraphicsEnabled(boolean isGraphicsEnabled) {
		this.isGraphicsEnabled = isGraphicsEnabled;
	}

	public void setBluetoothEnabled(boolean isBluetoothEnabled) {
		this.isBluetoothEnabled = isBluetoothEnabled;
	}
	
	@Override
	public String toString() {
		return "Computer [ram=" + ram + ", hdd=" + hdd + ", cpu=" + cpu + ", isGraphicsEnabled=" + isGraphicsEnabled
				+ ", isBluetoothEnabled=" + isBluetoothEnabled + "]";
	}



	public static class ComputerBuilder{
		// Required
		private String ram;
		private String hdd;
		private String cpu;

		// Optional
		private boolean isGraphicsEnabled;
		private boolean isBluetoothEnabled;
		

		public ComputerBuilder(String ram, String hdd, String cpu) {
			this.ram = ram;
			this.hdd = hdd;
			this.cpu = cpu;
		}

		public ComputerBuilder setGraphicsEnabled(boolean isGraphicsEnabled) {
			this.isGraphicsEnabled = isGraphicsEnabled;
			return this;
		}

		public ComputerBuilder setBluetoothEnabled(boolean isBluetoothEnabled) {
			this.isBluetoothEnabled = isBluetoothEnabled;
			return this;
		}
		
		public Computer build() {
			
			return new Computer(this);
		}
	}
}
