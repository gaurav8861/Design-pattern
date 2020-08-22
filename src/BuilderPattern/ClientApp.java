package BuilderPattern;

public class ClientApp {

	public static void main(String[] args) {

		Computer comp = new Computer.ComputerBuilder("1GB", "1TB", "AMD").build();
		System.out.println(comp);

		Computer comp1 = new Computer.ComputerBuilder("1GB", "1TB", "AMD").setBluetoothEnabled(true).build();
		System.out.println(comp1);
	}

}
