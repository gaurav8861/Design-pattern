package SingletonDesignPattern;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class SingletonEagerInitializationRuleBreakAvoid extends MyClone implements Serializable{
	
private static SingletonEagerInitializationRuleBreakAvoid instance = new SingletonEagerInitializationRuleBreakAvoid();
	
	private SingletonEagerInitializationRuleBreakAvoid() {
		// This code prevents from breaking Singleton pattern which is used by Reflection.
		if (instance != null) {
			throw new IllegalStateException("object can't be create using reflection");
		}
	}
	
	// This code prevents from breaking Singleton pattern which is used by Clone.
	@Override
	protected Object clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException();
	}
	
	// This code prevents from breaking Singleton pattern which is used by Serialization.
	protected Object readResolve() {
		return instance;
	}
	
	public static SingletonEagerInitializationRuleBreakAvoid getInstance() {
		return instance;
	}
	
	
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, CloneNotSupportedException {

		/**
		 * 1. Prevents singleton pattern break rule from Serialization
		 */
		
//		SingletonEagerInitializationRuleBreakAvoid instance1 = SingletonEagerInitializationRuleBreakAvoid.getInstance();
//		//System.out.println(instance1.hashCode());
//
//		// Serialize singleton object to a file.
//		ObjectOutput out = new ObjectOutputStream(new FileOutputStream("singleton.ser"));
//		out.writeObject(instance1);
//		out.close();
//
//		// Deserialize singleton object from the file
//		ObjectInput in = new ObjectInputStream(new FileInputStream("singleton.ser"));
//		SingletonEagerInitializationRuleBreakAvoid instance2 = (SingletonEagerInitializationRuleBreakAvoid) in.readObject();
//		in.close();
//
//		System.out.println("instance1 hashCode: " + instance1.hashCode());
//		System.out.println("instance2 hashCode: " + instance2.hashCode());

		
		/**
		 * 2. Prevents singleton pattern break rule from Reflection
		 */		
//		SingletonEagerInitializationRuleBreakAvoid instance1 = SingletonEagerInitializationRuleBreakAvoid.getInstance();
//		SingletonEagerInitializationRuleBreakAvoid reflectionInstance = null;
//
//		Constructor[] constructors = SingletonEagerInitializationRuleBreakAvoid.class.getDeclaredConstructors();
//		for (Constructor constructor : constructors) {
//			constructor.setAccessible(true);
//			reflectionInstance = (SingletonEagerInitializationRuleBreakAvoid) constructor.newInstance();
//		}
//		System.out.println(instance1.hashCode());
//		System.out.println(reflectionInstance.hashCode());

		
		
		
		/**
		 * 3. Prevents singleton pattern break rule from Clone
		 */	
		SingletonEagerInitializationRuleBreakAvoid instance1 = SingletonEagerInitializationRuleBreakAvoid.getInstance();
		SingletonEagerInitializationRuleBreakAvoid instance2 = (SingletonEagerInitializationRuleBreakAvoid) instance1.clone();
		
		System.out.println(instance1.hashCode());
		System.out.println(instance2.hashCode());
		 
	}

}
