package SingletonDesignPattern;

import java.lang.reflect.Constructor;
/**
 * Break Singleton design pattern using Reflection.
 *
 */
public class BreakSingletonPatternUsingReflection {
	
	public static void main(String[] args) {
		//Below code will destroy the singleton pattern using Reflection
		SingletonEagerInitialization instanceOne = SingletonEagerInitialization.getInstance();
		SingletonEagerInitialization instanceTwo = null;
        try {
            Constructor[] constructors = SingletonEagerInitialization.class.getDeclaredConstructors();
            for (Constructor constructor : constructors) {
                //Below code will destroy the singleton pattern
                constructor.setAccessible(true);
                instanceTwo = (SingletonEagerInitialization) constructor.newInstance();
                break;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(instanceOne.hashCode());
        System.out.println(instanceTwo.hashCode());
	}

}
