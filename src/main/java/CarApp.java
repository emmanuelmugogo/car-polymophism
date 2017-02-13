
public class CarApp {

	public static void main(String[] args) {
		Car car = new Car();
		car.speed();
		
//		Car mySedan = new Sedan();
//		mySedan.speed();
		
		car = new Sedan();
		car.speed();
		
		car = new Suv();
		car.speed();
		
		car = new Sports();
		car.speed();

	}

}
