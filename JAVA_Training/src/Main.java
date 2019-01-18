public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car = new Car("Superb","Silver",5);
		Engine merc = new MercEngine();
		Car car1 = new Car(merc);
		System.out.println(car.toString());
		CarInsurance c = new CarInsurance("Superb","Silver",5);
		c.costOfInsuarance(7);
		
	}

}
