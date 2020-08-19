package SingletonDesignPattern;

public class BreakSingletonPatternUsingClone {

	public static void main(String[] args) throws CloneNotSupportedException {

		SingletonEagerInitializationRuleBreakAvoid instance1 = SingletonEagerInitializationRuleBreakAvoid.getInstance();
		SingletonEagerInitializationRuleBreakAvoid instance2 = (SingletonEagerInitializationRuleBreakAvoid) instance1.clone();

		System.out.println(instance1.hashCode());
		System.out.println(instance2.hashCode());

	}

}
