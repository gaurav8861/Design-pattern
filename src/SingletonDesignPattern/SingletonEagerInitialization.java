package SingletonDesignPattern;

/**
 * Creational design pattern
 * Eager initialization
 */

/**
 * Important note : Reflection can be used to destroy all the above singleton implementation approaches.
 */
public class SingletonEagerInitialization{
	
	private static SingletonEagerInitialization instance = new SingletonEagerInitialization();
	
	private SingletonEagerInitialization() {
		
	}
	public static SingletonEagerInitialization getInstance() {
		return instance;
	}

	public static void main(String[] args) {
		System.out.println(SingletonEagerInitialization.getInstance());
		System.out.println(SingletonEagerInitialization.getInstance());
		System.out.println(SingletonEagerInitialization.getInstance());

	}
}
