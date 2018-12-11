package poly;

public class DriverEX {

	public static void main(String[] args) {

		Driver driver = new Driver();
		
		Bus bus = new Bus();
		Taxi taxi = new Taxi();
		
		driver.drive(bus);	// Override했기 때문에 bus의 run()이 실행됨
		driver.drive(taxi);		

	}

}
