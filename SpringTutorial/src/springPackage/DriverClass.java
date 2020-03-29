package springPackage;


import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;


public class DriverClass{

	
public static void main(String[] args){
//	Resource r=new ClassPathResource("resource/Spring.xml");
//	BeanFactory b=new XmlBeanFactory(r);
//	ApplicationContext ap=new ClassPathXmlApplicationContext("resource/Spring.xml");
String[] str=new String[] {"resource/Spring.xml","resource/web.xml"};	
Resource r=new ClassPathResource(str);
BeanFactory ap=new XmlBeanFactory(r);
//ApplicationContext ap=new ClassPathXmlApplicationContext("resource/*");	
//	Test t=(Test) b.getBean("t");	
//	Test t1=(Test)b.getBean("t");	
//	Test t2=(Test)b.getBean("t");

	Test t4=(Test)ap.getBean("t");
	t4.sayhello();
	Test t5=(Test)ap.getBean("t");
	t5.sayhello();
	Test t6=(Test)ap.getBean("t");
	t6.sayhello();
	
	}
}