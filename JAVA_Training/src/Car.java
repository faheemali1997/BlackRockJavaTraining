public class Car {
	String name;
	String colour;
	int age;
	Engine e;
	
	static{
		System.out.println("Static Init 1");
	}
	
	static{
		System.out.println("Static Init 2");
	}
	
	{
		System.out.println("Instance Init");
	}
	
	public Car(String name, String colour, int age)
	{
		this.name = name;
		this.colour = colour;
		this.age = age;
	}
	
	public Car(Engine e){
		 this.e = e;
	 }
	
	public String getName()
	{
		return name;
	}
	
	public String getColour()
	{
		return colour;
	}
	public int getAge()
	{
		return age;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public void setColour(String colour)
	{
		this.colour = colour;
	}
	public void setAge(int age)
	{
		this.age = age;
	}
	
	 @Override
	  public String toString() 
	    { 
	        return("Car name is "+ this.getName() + 
	               " and its colour,age is " + 
	               this.getColour()+"," + this.getAge()); 
	    }
	 
	

}
