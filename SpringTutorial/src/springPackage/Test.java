package springPackage;

public class Test{

	InnerBean ib;
	public InnerBean getIb() {
		return ib;
	}

	public void setIb(InnerBean ib) {
		this.ib = ib;
	}

	String name;
	String lastname;
	int age;
	String gender;
	public String getName() {
		return name;
	}

	public String getLastname() {
		return lastname;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public void setName(String name) {
		this.name = name;
	}

//	private Test()
//	{
//			 System.out.println("test is called");
//	}
//	
	
//	private Test(String name, String lastname, int age, String gender)
//	{
//		this.name=name;
//		this.lastname=lastname;
//		this.age=age;
//		this.gender=gender;
//		System.out.println(" my details are "+name+" "+lastname+" age "+age+" "+gender);
//	}
	public void sayhello() 
	{
		System.out.println("Hello "+name+"  "+lastname+" "+age+" "+gender+" ineer bean "+ib.name);
	}
}