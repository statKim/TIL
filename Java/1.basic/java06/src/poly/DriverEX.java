package poly;

public class DriverEX {

	public static void main(String[] args) {

		Driver driver = new Driver();
		
		Bus bus = new Bus();
		Taxi taxi = new Taxi();
		
		driver.drive(bus);	// Override�߱� ������ bus�� run()�� �����
		driver.drive(taxi);		

	}

}
