package FactoryDesignPattern;

public class FactoryMain {

	public static void main(String[] args) {
		//here with the help of Factory Design pattern we made implenation of main class very 
		//simple we can get any object dynamically as per user input with minimal complexity
		//here we have avoided having multiple conditional statements
		VehicleFactoryImpl ride=new VehicleFactoryImpl();
		Vehicle vehicle=ride.getVehicle("Car");
		vehicle.ride();

	}

}
