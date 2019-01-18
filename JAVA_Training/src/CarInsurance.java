import java.util.Scanner;
import java.util.Random;


public class CarInsurance extends Car{
	int insuranceId;
	int time;
	public CarInsurance(String name,String colour, int age)
	{
		super(name, colour, age);
	}
	
	Scanner sc = new Scanner(System.in);
	
	public int getInsuranceId() {
		return insuranceId;
	}

	public void setInsuranceId() {
		Random rand = new Random();
		int n = rand.nextInt(100) + 1;
		this.insuranceId = n;
	}

	public void getDuration()
	{
		System.out.println("Please enter the duration for insuarance:");
		int time = sc.nextInt();
		this.time = time;
	}
	
	public void costOfInsuarance(int time)
	{
		if(time>0 && time<5)
		{
			System.out.println("Your insuaranceid "+insuranceId+" value for time"+time+"is 5000"); 
		}else
		{
			System.out.println("Your insuaranceid "+insuranceId+" value for time"+time+"is 10000"); 
		}
	}
}
