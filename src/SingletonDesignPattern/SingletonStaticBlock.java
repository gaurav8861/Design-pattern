package SingletonDesignPattern;

public class SingletonStaticBlock {
	
	private static SingletonStaticBlock instance;
	
	private SingletonStaticBlock() {
	}
	
	static {
		instance = new SingletonStaticBlock();
	}
	
	public static SingletonStaticBlock getInstance() {
		return instance;
	}
	
	public static void main(String[] args) {
		System.out.println(SingletonStaticBlock.getInstance());
		System.out.println(SingletonStaticBlock.getInstance());
		System.out.println(SingletonStaticBlock.getInstance());
	}

}
