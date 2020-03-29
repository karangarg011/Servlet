import java.lang.reflect.Constructor;

public class DriverClass {
	
	public static void main(String args[]) {
	try {
	Class c=Class.forName("TestModel");
	Constructor con[]=c.getDeclaredConstructors();
	con[0].setAccessible(true);
	con[0].newInstance(null);
 System.out.println("constructor called");
	}
	
catch(Exception e) 
	{}
	}
}