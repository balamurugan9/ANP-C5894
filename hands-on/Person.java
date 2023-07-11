package oops;


class Person {
	
	private String name;
	private int age;
	
	
	

	public String getName() {
		return name;
	}




	public void setName(String name) {
		this.name = name;
	}




	public int getAge() {
		return age;
	}




	public void setAge(int age) {
		this.age = age;
	}

class Personmain{
	
public static void main(String[] args) {
	Person e=new Person();
	e.setName("Bala");
	e.setAge(23);
	System.out.println("Name is:" +  e.getName());
	System.out.println("Age is:" +  e.getAge());

}
	

	}

}

