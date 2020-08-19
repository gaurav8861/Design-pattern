package SingletonDesignPattern;
/**
 * Creational design pattern
 * Lazy initialization
 */
public class SingletonLazyInitialization {
	
	public static SingletonLazyInitialization instance;
	
	private SingletonLazyInitialization() {
		
	}
	public static SingletonLazyInitialization getInstance() {
		
		if(instance == null) {
			instance = new SingletonLazyInitialization();
			return instance;
		}
		return instance;
	}
	
	public static void main(String[] args) {
		System.out.println(SingletonLazyInitialization.getInstance());
		System.out.println(SingletonLazyInitialization.getInstance());
		
	}

}
