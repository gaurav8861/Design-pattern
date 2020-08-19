package SingletonDesignPattern;

public class SingletonThrreadSafe {
	
	private static SingletonThrreadSafe instance;
	
	private SingletonThrreadSafe() {
	}
	
	private static synchronized SingletonThrreadSafe getInstance() {
		if(instance == null) {
			synchronized(SingletonThrreadSafe.class){
				instance = new SingletonThrreadSafe();
			    }
			return instance;
		}
		return instance;
	}
	
	public static void main(String[] args) {
		System.out.println(SingletonThrreadSafe.getInstance());
		System.out.println(SingletonThrreadSafe.getInstance());
		System.out.println(SingletonThrreadSafe.getInstance());
	}
}
