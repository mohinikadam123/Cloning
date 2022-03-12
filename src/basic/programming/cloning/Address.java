package basic.programming.cloning;

public class Address {
	int pin;
	String city;
	String country;
	public Address() {

	}
	public Address(int pin, String city, String country) {
		super();
		this.pin = pin;
		this.city = city;
		this.country = country;
	}
	@Override
	public String toString() {
		return "Address [pin=" + pin + ", city=" + city + ", country=" + country + "]";
	}
	
	
	

}
