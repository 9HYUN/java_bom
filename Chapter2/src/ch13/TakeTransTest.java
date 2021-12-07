package ch13;

public class TakeTransTest {

	public static void main(String[] args) {
		
		Student studentJ = new Student("James", 5000); 
		Student studentT = new Student("Tomas", 7500);
		
		Bus bus100 = new Bus(100);
		Bus bus500 = new Bus(500);
		studentJ.takeBus(bus100);
		
		Subway greenSubway = new Subway(2);
		Subway blueSubway = new Subway(3);
		
		studentT.takeSubway(greenSubway);
		studentJ.showInfo();
		studentT.showInfo();
		bus100.showBusInfo();
		bus500.showBusInfo();
		greenSubway.showSubwayInfo();
		
	}

}
