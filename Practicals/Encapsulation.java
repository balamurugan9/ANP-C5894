package oops;
//POJO- Plain old java object
class Encapsulation 
{
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



	public void setRollno(int i) {
		// TODO Auto-generated method stub
		
	}

}
class EncapsulationMain
{

	public static void main(String[] args) 
	{
		Encapsulation e=new Encapsulation();
	
		//set values
		e.setName("Bala");
		e.setAge(23);
		
		//get/print values
		System.out.println("Name is:" +  e.getName());
		System.out.println("Age is:" +  e.getAge());
	}

}
