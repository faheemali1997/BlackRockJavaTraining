public class MercEngine implements Engine{

	public String operate(Car c) {
		String s = " "+c.name+"is using Mercedes Engine";
		return s;
	}
}
