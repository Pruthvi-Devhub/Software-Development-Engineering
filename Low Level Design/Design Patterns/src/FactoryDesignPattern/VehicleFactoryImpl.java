package FactoryDesignPattern;

import java.util.HashMap;

public class VehicleFactoryImpl implements VehicleFactory {

	HashMap<String,Vehicle> vehicleFactory;
	public VehicleFactoryImpl() {
		vehicleFactory=new HashMap<>();
		vehicleFactory.put("Car",new Car());
		vehicleFactory.put("AirPlane",new AirPlane());
		vehicleFactory.put("Bus",new Bus());
		vehicleFactory.put("Scooty",new AirPlane());
	}
	@Override
	public Vehicle getVehicle(String vehicleName) {
		// TODO Auto-generated method stub
		return vehicleFactory.get(vehicleName);
	}

}

