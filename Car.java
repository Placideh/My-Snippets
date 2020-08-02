public class Car{
	private Vin vehicleIdentificationNumber;/*this class needs to be created*/
	private Manufacturer manufacturer;/* this also need to be created*/
	private Engine engine;/*this also the same as aboce*/
	private Color color;/*same as above*/
	private int numberOfWheels;
/* This is for hashcode and it is more complicated I will learning it after .*/

	@Override
	public boolean equals(Object obj){
		if(this==obj){
			return true;
		}
		if (obj==null) {
			return  false;
			
		}
		if (getClass()!=obj.getClass()) {
			return false;
			
		}
		Car other =(Car)obj;
		if (!manufacturer.equals(other.manufacturer)) {
			return false;
			
		}
		if (!engine.equals(other.engine)) {
			return false;
			
		}
		if (!color.equals(other.color)) {
			return false;
			
		}
		return true;
	}
	@Override
	public int hashCode(){
		int result=1;
		result=31* result+manufacturer.hashCode();
		result=31* result+engine.hashCode();
		result=31* result+color.hashCode();
	}

}