package beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DriverClass {

	public static void main(String[] args) {
	ApplicationContext ap=new ClassPathXmlApplicationContext("/resource/spring.xml");
	ModelTest mt=(ModelTest)ap.getBean("mt");
	mt.printCarsEngines();
	mt.printCollections();
	}
}
