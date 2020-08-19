package SingletonDesignPattern;

/**
 * Note : This will break singleton pattern using Serialization and Deserialize.
 */
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class BreakSingletonPatternUsingSerialization implements Serializable{

    private static final long serialVersionUID = -7604766932017737115L;

    private BreakSingletonPatternUsingSerialization(){}
    
    private static class SingletonHelper{
        private static final BreakSingletonPatternUsingSerialization instance = new BreakSingletonPatternUsingSerialization();
    }
    
    public static BreakSingletonPatternUsingSerialization getInstance(){
        return SingletonHelper.instance;
    }
    
    
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
    	BreakSingletonPatternUsingSerialization instanceOne = BreakSingletonPatternUsingSerialization.getInstance();
    	
        ObjectOutput out = new ObjectOutputStream(new FileOutputStream("filename.ser"));
        out.writeObject(instanceOne);
        out.close();
        
        //deserailize from file to object
        ObjectInput in = new ObjectInputStream(new FileInputStream("filename.ser"));
        BreakSingletonPatternUsingSerialization instanceTwo = (BreakSingletonPatternUsingSerialization) in.readObject();
        in.close();
        
        System.out.println("instanceOne hashCode="+instanceOne.hashCode());
        System.out.println("instanceTwo hashCode="+instanceTwo.hashCode());
	}
}