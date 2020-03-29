package beans;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class ModelTest {

	String[] cars;
	Engine[] engines;
	List vegetables;
	public List getVegetables() {
		return vegetables;
	}
	public void setVegetables(List vegetables) {
		this.vegetables = vegetables;
	}
	public Set getValues() {
		return values;
	}
	public void setValues(Set values) {
		this.values = values;
	}
	public Map getKeyvalue() {
		return keyvalue;
	}
	public void setKeyvalue(Map keyvalue) {
		this.keyvalue = keyvalue;
	}

	Set values;
	Map keyvalue;
	
	public String[] getCars() {
		return cars;
	}
	public void setCars(String[] cars) {
		this.cars = cars;
	}
	public Engine[] getEngines() {
		return engines;
	}
	public void setEngines(Engine[] engines) {
		this.engines = engines;
	}
	
	public void printCarsEngines() 
	{
		System.out.println("cars are as under -----");
		for(String car:cars) {System.out.println(car);}
		System.out.println("engines are as under -----");
		for(Engine e:engines) {System.out.println(e.model+"  "+e.year);}
		}
	
	public void printCollections() 
	{
		System.out.println("Colections of general design are as under:  ");
		for(Object o:vegetables) {System.out.println(o);}
		for(Object o:values) {System.out.println(o);}
		for(Object o:keyvalue.keySet()){System.out.println(keyvalue.get(o));}
	}
	
}
